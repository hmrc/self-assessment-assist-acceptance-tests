/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.selfEmployment

import play.api.libs.json._

case class CarriedForwardLossV2(claimId: String,
                                claimType: String,
                                taxYearClaimMade: String,
                                taxYearLossIncurred: String,
                                currentLossValue: BigInt,
                                lossType: String)

object CarriedForwardLossV2 {
  implicit val format: OFormat[CarriedForwardLossV2] = Json.format[CarriedForwardLossV2]
}
