/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.selfEmployment

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.BsasV2

case class SelfEmploymentBusinessV2(selfEmploymentId: String,
                                    totalIncome: BigDecimal,
                                    totalExpenses: BigDecimal,
                                    netProfit: BigDecimal,
                                    netLoss: BigDecimal,
                                    class4Loss: BigInt,
                                    totalAdditions: BigDecimal,
                                    totalDeductions: BigDecimal,
                                    accountingAdjustments: BigDecimal,
                                    adjustedIncomeTaxLoss: BigDecimal,
                                    taxableProfit: BigInt,
                                    taxableProfitAfterIncomeTaxLossesDeduction: BigInt,
                                    bsas: BsasV2,
                                    lossClaimsSummary: LossClaimsSummaryV2,
                                    lossClaimsDetail: LossClaimsDetailV2)

object SelfEmploymentBusinessV2 {
  implicit val format: OFormat[SelfEmploymentBusinessV2] = Json.format[SelfEmploymentBusinessV2]
}
