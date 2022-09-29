/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class RentARoom(jointlyLet: Boolean)

object RentARoom {
  implicit val format: OFormat[RentARoom] = Json.format[RentARoom]
}
