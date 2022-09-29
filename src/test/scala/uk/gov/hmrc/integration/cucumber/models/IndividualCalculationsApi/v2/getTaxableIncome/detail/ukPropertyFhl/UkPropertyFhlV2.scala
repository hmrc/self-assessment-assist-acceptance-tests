/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyFhl

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.BsasV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyFhl.detail.LossClaimsDetailV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyFhl.summary.LossClaimsSummaryV2

case class UkPropertyFhlV2(totalIncome: Option[BigDecimal],
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

object UkPropertyFhlV2 {
  implicit val formats: OFormat[UkPropertyFhlV2] = Json.format[UkPropertyFhlV2]
}
