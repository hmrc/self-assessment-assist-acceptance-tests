/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.eeaPropertyFhl

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.BsasV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.eeaPropertyFhl.detail.LossClaimsDetailV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.eeaPropertyFhl.summary.LossClaimsSummaryV2

case class EeaPropertyFhlV2(totalIncome: Option[BigDecimal],
                            totalExpenses: Option[BigDecimal],
                            netProfit: Option[BigDecimal],
                            netLoss: Option[BigDecimal],
                            totalAdditions: Option[BigDecimal],
                            totalDeductions: Option[BigDecimal],
                            adjustedIncomeTaxLoss: Option[BigInt],
                            taxableProfit: Option[BigInt],
                            taxableProfitAfterIncomeTaxLossesDeduction: Option[BigInt],
                            bsas: Option[BsasV2],
                            lossClaimsSummary: Option[LossClaimsSummaryV2],
                            lossClaimsDetail: Option[LossClaimsDetailV2])

object EeaPropertyFhlV2 {
  implicit val formats: OFormat[EeaPropertyFhlV2] = Json.format[EeaPropertyFhlV2]
}
