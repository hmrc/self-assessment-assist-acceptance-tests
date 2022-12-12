/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.utils.json

import play.api.libs.json._

import scala.annotation.tailrec
import scala.concurrent.Future

trait NestedJsonReads {

  type ServiceResponse[T, E] = Future[Either[T, E]]

  implicit class JsPathOps(jsPath: JsPath) {

    def readNestedNullable[T](implicit rds: Reads[T]): Reads[Option[T]] = Reads[Option[T]] { json =>
      applyTillLastNested(json).fold(
        jsErr => jsErr,
        jsRes =>
          jsRes.fold(
            invalid = _ => JsSuccess(None),
            valid = {
              case JsNull => JsSuccess(None)
              case js     => rds.reads(js).repath(jsPath).map(Some(_))
            }
          )
      )
    }

    def readNestedNullableOpt[T](implicit rds: Reads[Option[T]]): Reads[Option[T]] = Reads[Option[T]] { json =>
      applyTillLastNested(json).fold(
        jsErr => jsErr,
        jsRes =>
          jsRes.fold(
            invalid = _ => JsSuccess(None),
            valid = {
              case JsNull => JsSuccess(None)
              case js     => rds.reads(js).repath(jsPath)
            }
          )
      )
    }

    def applyTillLastNested(json: JsValue): Either[JsError, JsResult[JsValue]] = {
      def singleJsError(msg: String) = JsError(Seq(jsPath -> Seq(JsonValidationError(msg))))
      @tailrec
      def step(pathNodes: List[PathNode], json: JsValue): Either[JsError, JsResult[JsValue]] = pathNodes match {
        case Nil => Left(singleJsError("error.path.empty"))
        case node :: Nil =>
          node(json) match {
            case Nil       => Right(singleJsError("error.path.missing"))
            case js :: Nil => Right(JsSuccess(js))
            case _ :: _    => Right(singleJsError("error.path.result.multiple"))
          }
        case head :: tail =>
          head(json) match {
            case Nil       => Right(singleJsError("error.path.missing"))
            case js :: Nil => step(tail, js)
            case _ :: _    => Left(singleJsError("error.path.result.multiple"))
          }
      }

      step(jsPath.path, json)
    }

  }

  /*  Json Reads that replaces the standard reads for a sequence of type T. Instead of immediately reading in the json
      this takes the raw json sequence and filters out all elements which do not include the required matching element.
      After the filter it executes the standard json reads for the type T to read in only the filtered values.
   */
  def filteredArrayReads[T](filterName: String, matching: String)(implicit rds: Reads[Seq[T]]): Reads[Seq[T]] = new Reads[Seq[T]] {

    override def reads(json: JsValue): JsResult[Seq[T]] = {
      json
        .validate[Seq[JsValue]]
        .flatMap(readJson =>
          Json
            .toJson(readJson.filter { element =>
              element.\(filterName).asOpt[String].contains(matching)
            })
            .validate[Seq[T]])
    }

  }

  /* Json Reads that replaces the standard reads for an optional value of type T from a sequence of json values. Instead
      of immediately reading in the value it first takes the array of json values and identifies which element, if any,
      contains the matching element provided to the function. It then attempts to read the json element as the type T
      as long as it exists otherwise it reads in a None value. This method can either read an individual element of the
      matching json object or all top level elements depending on whether a specific element is provided.
   */
  def filteredArrayValueReads[T](fieldName: Option[String], filterName: String, matching: String)(implicit rds: Reads[T]): Reads[Option[T]] =
    new Reads[Option[T]] {

      override def reads(json: JsValue): JsResult[Option[T]] = {
        json
          .validate[Seq[JsValue]]
          .flatMap(readJson =>
            Json
              .toJson(
                readJson
                  .find { element =>
                    element.\(filterName).asOpt[String].contains(matching)
                  }
                  .map { jsValue =>
                    fieldName match {
                      case Some(name) => jsValue.\(name).getOrElse(Json.obj())
                      case None       => jsValue
                    }
                  })
              .validateOpt[T])
      }

    }

  def emptySeqToNone[T](seq: Option[Seq[T]]): Option[Seq[T]] = {
    seq match {
      case Some(Nil) => None
      case _         => seq
    }
  }

}

object NestedJsonReads extends NestedJsonReads
