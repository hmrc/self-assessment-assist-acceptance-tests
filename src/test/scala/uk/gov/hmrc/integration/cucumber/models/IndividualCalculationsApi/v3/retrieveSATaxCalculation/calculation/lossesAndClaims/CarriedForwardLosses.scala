/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.lossesAndClaims

import play.api.libs.json.{Json, OFormat}

case class CarriedForwardLosses(claimId: Option[String],
                                originatingClaimId: Option[String],
                                incomeSourceId: String,
                                incomeSourceType: String,
                                claimType: String,
                                taxYearClaimMade: Option[String],
                                taxYearLossIncurred: String,
                                currentLossValue: BigInt,
                                lossType: Option[String])

object CarriedForwardLosses {
  implicit val format: OFormat[CarriedForwardLosses] = Json.format[CarriedForwardLosses]
}