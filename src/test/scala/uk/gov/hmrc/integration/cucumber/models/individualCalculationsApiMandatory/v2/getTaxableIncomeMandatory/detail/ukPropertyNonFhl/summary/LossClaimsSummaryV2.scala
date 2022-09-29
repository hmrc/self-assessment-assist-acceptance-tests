/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyNonFhl.summary

import play.api.libs.json._

case class LossClaimsSummaryV2(totalBroughtForwardIncomeTaxLosses: BigInt,
                               broughtForwardIncomeTaxLossesUsed: BigInt,
                               carrySidewaysIncomeTaxLossesUsed: BigInt,
                               totalIncomeTaxLossesCarriedForward: BigInt,
                               broughtForwardCarrySidewaysIncomeTaxLossesUsed: BigInt)

object LossClaimsSummaryV2 {
  implicit val format: OFormat[LossClaimsSummaryV2] = Json.format[LossClaimsSummaryV2]
}
