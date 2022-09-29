/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Enums

import cats.Show
import play.api.libs.json._
import Values.MkValues
import scala.reflect.ClassTag

object Shows {
  implicit def toStringShow[E]: Show[E] = Show.show(_.toString)
}

object Enums {
  private def typeName[E: ClassTag]: String = implicitly[ClassTag[E]].runtimeClass.getSimpleName

  def parser[E: MkValues](implicit ev: Show[E] = Shows.toStringShow[E]): PartialFunction[String, E] =
    implicitly[MkValues[E]].values.map(e => ev.show(e) -> e).toMap

  def reads[E: MkValues: ClassTag](implicit ev: Show[E] = Shows.toStringShow[E]): Reads[E] =
    implicitly[Reads[String]].collect(JsonValidationError(s"error.expected.$typeName"))(parser)

  def writes[E: MkValues](implicit ev: Show[E] = Shows.toStringShow[E]): Writes[E] = Writes[E](e => JsString(ev.show(e)))

  def format[E: MkValues: ClassTag](implicit ev: Show[E] = Shows.toStringShow[E]): Format[E] =
    Format(reads, writes)

}
