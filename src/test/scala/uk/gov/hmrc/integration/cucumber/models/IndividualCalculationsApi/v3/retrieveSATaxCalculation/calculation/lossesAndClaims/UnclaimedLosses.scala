/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.lossesAndClaims

import play.api.libs.json.{Json, OFormat}

case class UnclaimedLosses(incomeSourceId: Option[String],
                           incomeSourceType: String,
                           taxYearLossIncurred: String,
                           currentLossValue: BigInt,
                           lossType: Option[String])

object UnclaimedLosses {
  implicit val format: OFormat[UnclaimedLosses] = Json.format[UnclaimedLosses]
}