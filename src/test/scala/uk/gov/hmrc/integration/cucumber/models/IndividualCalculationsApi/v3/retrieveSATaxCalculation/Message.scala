/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation

import play.api.libs.json.{Json, OFormat}

case class Message(id: String,
                   text: String)

object Message {
  implicit val format: OFormat[Message] = Json.format[Message]
}