/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.selfEmployment

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.BsasV2
import uk.gov.hmrc.integration.cucumber.utils.json.NestedJsonReads

case class SelfEmploymentBusinessV2(selfEmploymentId: String,
                                    totalIncome: Option[BigDecimal],
                                    totalExpenses: Option[BigDecimal],
                                    netProfit: Option[BigDecimal],
                                    netLoss: Option[BigDecimal],
                                    class4Loss: Option[BigInt],
                                    totalAdditions: Option[BigDecimal],
                                    totalDeductions: Option[BigDecimal],
                                    accountingAdjustments: Option[BigDecimal],
                                    adjustedIncomeTaxLoss: Option[BigDecimal],
                                    taxableProfit: Option[BigInt],
                                    taxableProfitAfterIncomeTaxLossesDeduction: Option[BigInt],
                                    bsas: Option[BsasV2],
                                    lossClaimsSummary: Option[LossClaimsSummaryV2],
                                    lossClaimsDetail: Option[LossClaimsDetailV2])

object SelfEmploymentBusinessV2 extends NestedJsonReads {
  implicit val formats: OFormat[SelfEmploymentBusinessV2] = Json.format[SelfEmploymentBusinessV2]
}
