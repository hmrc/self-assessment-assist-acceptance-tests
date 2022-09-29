/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.utils.json

import org.scalatest.matchers.should.Matchers
import play.api.libs.json.{JsArray, JsObject, JsValue, Json}

trait JsonTools extends Matchers {

  /** Method for comparing actual response bodies to expected response bodies.
    *
    * @param actual
    *   The actual JSON body returned from an API service.
    * @param expected
    *   The JSON body which is expected to be returned from an API service.
    * @return
    *   Unit - When the actual, and expected JSON bodies match each other.
    * @throws TestFailedException
    *   The actual, and expected bodies do not match each other.
    * @throws JsResultException
    *   Either of the JSON bodies is formatted incorrectly.
    * @throws IOException
    *   An error occurs while trying to parse JSON.
    * @throws JsonMappingException
    *   An error occurs while trying to parse JSON.
    * @throws JsonParseException
    *   An error occurs while trying to parse JSON.
    */
  def compareResponseAsJson(actual: String, expected: String): Unit = {
    val actualJson: JsValue = Json.parse(actual)

    // Checks to see if a certain top-level field exists in the 'actual' response JSON.
    def checkActualFieldExists(field: String): Boolean = (actualJson \ field).isDefined

    // Extracts the 'paths' array from some JSON, and converts it into a Set.
    def getPathsSet(responseObj: JsObject): Set[String] = (responseObj \ "paths")
      .validate[Set[String]]
      .getOrElse(Set.empty[String])

    // Removes the 'paths' array from some JSON, converts it into a Set, and zips it with the remaining JSON.
    def zipJsonWithPathsSet(response: String): (JsValue, Set[String]) = {
      val responseObj: JsObject = Json.parse(response).as[JsObject]
      (responseObj - "paths", getPathsSet(responseObj))
    }

    // Compares two JSON bodies which have a top-level 'paths' array.
    def compareJsonWithPaths(actual: String, expected: String): Unit = {
      zipJsonWithPathsSet(actual) shouldBe zipJsonWithPathsSet(expected)
    }

    /* Extracts the 'errors' array from some JSON, and converts it into a Set. For each item in the 'errors' Set
    also extracts 'paths' array and converts into sub-Set. */
    def getErrorsSet(responseObj: JsObject): Set[(JsValue, Set[String])] = (responseObj \ "errors").toOption
      .fold(Set.empty[(JsValue, Set[String])])(errors => errors.as[Set[JsValue]].map(a => zipJsonWithPathsSet(a.toString())))

    // Compares two JSON bodies which have a top-level 'errors' array.
    def compareJsonWithSubErrors(actual: String, expected: String): Unit = {
      def zipJsonWithErrorsSet(response: String): (JsValue, Set[(JsValue, Set[String])]) = {
        val responseObj: JsObject = Json.parse(response).as[JsObject]
        (responseObj - "errors", getErrorsSet(responseObj))
      }

      zipJsonWithErrorsSet(actual) shouldBe zipJsonWithErrorsSet(expected)
    }

    // Compares two JSON bodies which have both a top-level 'errors', and 'paths' array.
    def compareJsonWithPathsAndSubErrors(actual: String, expected: String): Unit = {
      def zipJsonWithPathsAndErrorsSets(response: String): (JsValue, Set[String], Set[(JsValue, Set[String])]) = {
        val responseObj: JsObject = Json.parse(response).as[JsObject]
        ((responseObj - "errors") - "paths", getPathsSet(responseObj), getErrorsSet(responseObj))
      }

      zipJsonWithPathsAndErrorsSets(actual) shouldBe zipJsonWithPathsAndErrorsSets(expected)
    }

    (checkActualFieldExists(field = "paths"), checkActualFieldExists(field = "errors")) match {
      case (false, false) => actualJson shouldBe Json.parse(expected)
      case (true, false)  => compareJsonWithPaths(actual, expected)
      case (false, true)  => compareJsonWithSubErrors(actual, expected)
      case (true, true)   => compareJsonWithPathsAndSubErrors(actual, expected)
    }
  }

  def retrieveJsonValue(body: String, key: String): String = {
    (Json.parse(body) \\ s"$key").head.toString.replace("\"", "")
  }

  def pathsFor(jsObject: JsObject): Seq[String] = {
    def loop(path: String, jsValue: JsValue): Seq[String] =
      jsValue match {
        case JsObject(fields) =>
          fields.foldLeft(Seq.empty[String]) { case (acc, (name, jsValue)) =>
            acc ++ loop(s"$path/$name", jsValue)
          }
        case JsArray(elements) => elements.flatMap(elem => loop(path + "[]", elem))
        case _                 => List(path)
      }

    loop("", jsObject)
  }

}

object JsonTools extends JsonTools
