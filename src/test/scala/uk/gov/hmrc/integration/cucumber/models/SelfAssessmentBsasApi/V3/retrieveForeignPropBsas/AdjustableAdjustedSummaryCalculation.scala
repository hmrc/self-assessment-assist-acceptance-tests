/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class AdjustableAdjustedSummaryCalculation(totalIncome: Option[BigDecimal],
                                                income: Option[SummaryCalculationIncome],
                                                totalExpenses: Option[BigDecimal],
                                                expenses: Option[SummaryCalculationExpenses],
                                                netProfit: Option[BigDecimal],
                                                netLoss: Option[BigDecimal],
                                                totalAdditions: Option[BigDecimal],
                                                additions: Option[SummaryCalculationAdditions],
                                                totalDeductions: Option[BigDecimal],
                                                deductions: Option[SummaryCalculationDeductions],
                                                taxableProfit: Option[BigDecimal],
                                                adjustedIncomeTaxLoss: Option[BigDecimal],
                                                countryLevelDetail: Option[Seq[CountryLevelDetail]])

object AdjustableAdjustedSummaryCalculation {
  implicit val format: OFormat[AdjustableAdjustedSummaryCalculation] = Json.format[AdjustableAdjustedSummaryCalculation]
}
