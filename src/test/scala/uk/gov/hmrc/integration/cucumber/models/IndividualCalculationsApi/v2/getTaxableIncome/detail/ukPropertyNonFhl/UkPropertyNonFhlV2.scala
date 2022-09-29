/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyNonFhl

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.BsasV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyNonFhl.detail.LossClaimsDetailV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyNonFhl.summary.LossClaimsSummaryV2
import uk.gov.hmrc.integration.cucumber.utils.json.NestedJsonReads

case class UkPropertyNonFhlV2(totalIncome: Option[BigDecimal],
                              totalExpenses: Option[BigDecimal],
                              netProfit: Option[BigDecimal],
                              netLoss: Option[BigDecimal],
                              totalAdditions: Option[BigDecimal],
                              totalDeductions: Option[BigDecimal],
                              accountingAdjustments: Option[BigDecimal],
                              adjustedIncomeTaxLoss: Option[BigInt],
                              taxableProfit: Option[BigInt],
                              taxableProfitAfterIncomeTaxLossesDeduction: Option[BigInt],
                              bsas: Option[BsasV2],
                              lossClaimsSummary: Option[LossClaimsSummaryV2],
                              lossClaimsDetail: Option[LossClaimsDetailV2])

object UkPropertyNonFhlV2 extends NestedJsonReads {
  implicit val formats: OFormat[UkPropertyNonFhlV2] = Json.format[UkPropertyNonFhlV2]
}
