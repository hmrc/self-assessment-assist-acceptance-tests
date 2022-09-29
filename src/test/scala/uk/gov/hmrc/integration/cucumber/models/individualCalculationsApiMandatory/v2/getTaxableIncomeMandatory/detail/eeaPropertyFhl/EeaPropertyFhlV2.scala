/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.eeaPropertyFhl

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.BsasV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.eeaPropertyFhl.detail.LossClaimsDetailV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.eeaPropertyFhl.summary.LossClaimsSummaryV2

case class EeaPropertyFhlV2(totalIncome: BigDecimal,
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

object EeaPropertyFhlV2 {
  implicit val format: OFormat[EeaPropertyFhlV2] = Json.format[EeaPropertyFhlV2]
}
