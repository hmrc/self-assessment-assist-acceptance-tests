/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyFhl

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.BsasV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyFhl.detail.LossClaimsDetailV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyFhl.summary.LossClaimsSummaryV2

case class UkPropertyFhlV2(totalIncome: BigDecimal,
                           totalExpenses: BigDecimal,
                           netProfit: BigDecimal,
                           netLoss: BigDecimal,
                           totalAdditions: BigDecimal,
                           totalDeductions: BigDecimal,
                           adjustedIncomeTaxLoss: BigInt,
                           taxableProfit: BigInt,
                           taxableProfitAfterIncomeTaxLossesDeduction: BigInt,
                           bsas: BsasV2,
                           lossClaimsSummary: LossClaimsSummaryV2,
                           lossClaimsDetail: LossClaimsDetailV2)

object UkPropertyFhlV2 {
  implicit val format: OFormat[UkPropertyFhlV2] = Json.format[UkPropertyFhlV2]
}
