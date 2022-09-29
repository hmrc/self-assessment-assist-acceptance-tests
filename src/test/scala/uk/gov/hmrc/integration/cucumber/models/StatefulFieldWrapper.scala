/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models

import play.api.libs.json._

case class StatefulFieldWrapper[A: Format](field: A)

object StatefulFieldWrapper {

  implicit def format[A: Format]: Format[StatefulFieldWrapper[A]] = new Format[StatefulFieldWrapper[A]] {
    def writes(statefulFieldWrapper: StatefulFieldWrapper[A]): JsValue = Json.toJson("UNCHECKED")
    def reads(json: JsValue): JsResult[StatefulFieldWrapper[A]]        = json.validate[A].map(StatefulFieldWrapper(_))
  }

}
