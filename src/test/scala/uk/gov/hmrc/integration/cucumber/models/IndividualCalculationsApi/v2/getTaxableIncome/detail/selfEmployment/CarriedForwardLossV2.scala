/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.selfEmployment

import play.api.libs.json._

case class CarriedForwardLossV2(claimId: Option[String],
                                claimType: String,
                                taxYearClaimMade: Option[String],
                                taxYearLossIncurred: String,
                                currentLossValue: BigInt,
                                lossType: String)

object CarriedForwardLossV2 {
  implicit val formats: OFormat[CarriedForwardLossV2] = Json.format[CarriedForwardLossV2]
}
