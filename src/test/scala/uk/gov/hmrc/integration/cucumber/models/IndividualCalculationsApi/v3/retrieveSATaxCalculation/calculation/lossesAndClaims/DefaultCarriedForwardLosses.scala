/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.lossesAndClaims

import play.api.libs.json.{Json, OFormat}

case class DefaultCarriedForwardLosses(incomeSourceId: Option[String],
                                       incomeSourceType: String,
                                       taxYearLossIncurred: String,
                                       currentLossValue: BigInt)

object DefaultCarriedForwardLosses {
  implicit val format: OFormat[DefaultCarriedForwardLosses] = Json.format[DefaultCarriedForwardLosses]
}