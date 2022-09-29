/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.foreignProperty

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.BsasV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.foreignProperty.detail.LossClaimsDetailV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.foreignProperty.summary.LossClaimsSummaryV2

case class ForeignPropertyV2(totalIncome: BigDecimal,
                             totalExpenses: BigDecimal,
                             netProfit: BigDecimal,
                             netLoss: BigDecimal,
                             totalAdditions: BigDecimal,
                             totalDeductions: BigDecimal,
                             accountingAdjustments: BigDecimal,
                             adjustedIncomeTaxLoss: BigInt,
                             taxableProfit: BigInt,
                             taxableProfitAfterIncomeTaxLossesDeduction: BigInt,
                             bsas: BsasV2,
                             lossClaimsSummary: LossClaimsSummaryV2,
                             lossClaimsDetail: LossClaimsDetailV2)

object ForeignPropertyV2 {
  implicit val format: OFormat[ForeignPropertyV2] = Json.format[ForeignPropertyV2]
}
