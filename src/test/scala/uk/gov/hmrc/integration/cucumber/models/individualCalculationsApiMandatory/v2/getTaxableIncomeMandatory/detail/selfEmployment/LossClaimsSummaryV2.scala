/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.selfEmployment

import play.api.libs.json._

case class LossClaimsSummaryV2(totalBroughtForwardIncomeTaxLosses: BigDecimal,
                               broughtForwardIncomeTaxLossesUsed: BigDecimal,
                               carrySidewaysIncomeTaxLossesUsed: BigInt,
                               totalIncomeTaxLossesCarriedForward: BigDecimal,
                               totalBroughtForwardClass4Losses: BigDecimal,
                               broughtForwardClass4LossesUsed: BigDecimal,
                               carrySidewaysClass4LossesUsed: BigDecimal,
                               totalClass4LossesCarriedForward: BigDecimal)

object LossClaimsSummaryV2 {
  implicit val format: OFormat[LossClaimsSummaryV2] = Json.format[LossClaimsSummaryV2]
}
