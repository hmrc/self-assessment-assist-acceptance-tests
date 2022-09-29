/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.selfEmployment

import play.api.libs.json._

case class UnclaimedLossV2(taxYearLossIncurred: String, currentLossValue: BigInt, lossType: String)

object UnclaimedLossV2 {
  implicit val format: OFormat[UnclaimedLossV2] = Json.format[UnclaimedLossV2]
}
