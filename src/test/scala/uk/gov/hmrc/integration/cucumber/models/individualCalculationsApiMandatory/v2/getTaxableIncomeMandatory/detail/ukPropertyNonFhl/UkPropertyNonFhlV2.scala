/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyNonFhl

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.BsasV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyNonFhl.detail.LossClaimsDetailV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyNonFhl.summary.LossClaimsSummaryV2

case class UkPropertyNonFhlV2(totalIncome: BigDecimal,
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

object UkPropertyNonFhlV2 {
  implicit val format: OFormat[UkPropertyNonFhlV2] = Json.format[UkPropertyNonFhlV2]
}
