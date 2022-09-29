/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.selfEmployment

import play.api.libs.json.{Json, _}

case class LossClaimsSummaryV2(totalBroughtForwardIncomeTaxLosses: Option[BigDecimal],
                               broughtForwardIncomeTaxLossesUsed: Option[BigDecimal],
                               carrySidewaysIncomeTaxLossesUsed: Option[BigInt],
                               totalIncomeTaxLossesCarriedForward: Option[BigDecimal],
                               totalBroughtForwardClass4Losses: Option[BigDecimal],
                               broughtForwardClass4LossesUsed: Option[BigDecimal],
                               carrySidewaysClass4LossesUsed: Option[BigDecimal],
                               totalClass4LossesCarriedForward: Option[BigDecimal])

object LossClaimsSummaryV2 {
  implicit val formats: OFormat[LossClaimsSummaryV2] = Json.format[LossClaimsSummaryV2]
}
