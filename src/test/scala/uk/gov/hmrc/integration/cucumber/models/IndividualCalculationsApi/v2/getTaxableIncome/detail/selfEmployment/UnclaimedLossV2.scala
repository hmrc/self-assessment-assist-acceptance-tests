/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.selfEmployment

import play.api.libs.json._

case class UnclaimedLossV2(taxYearLossIncurred: String, currentLossValue: BigInt, lossType: String)

object UnclaimedLossV2 {
  implicit val formats: OFormat[UnclaimedLossV2] = Json.format[UnclaimedLossV2]
}
