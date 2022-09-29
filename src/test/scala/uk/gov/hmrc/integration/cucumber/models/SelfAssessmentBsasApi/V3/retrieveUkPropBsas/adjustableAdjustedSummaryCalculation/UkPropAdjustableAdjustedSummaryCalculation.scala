/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustableAdjustedSummaryCalculation

import play.api.libs.json.{Json, OFormat}

case class UkPropAdjustableAdjustedSummaryCalculation(totalIncome: Option[BigDecimal],
                                                      income: Option[UkPropSummaryCalculationIncome],
                                                      totalExpenses: Option[BigDecimal],
                                                      expenses: Option[UkPropSummaryCalculationExpenses],
                                                      netProfit: Option[BigDecimal],
                                                      netLoss: Option[BigDecimal],
                                                      totalAdditions: Option[BigDecimal],
                                                      additions: Option[UkPropSummaryCalculationAdditions],
                                                      totalDeductions: Option[BigDecimal],
                                                      deductions: Option[UkPropSummaryCalculationDeductions],
                                                      taxableProfit: Option[BigDecimal],
                                                      adjustedIncomeTaxLoss: Option[BigDecimal])

object UkPropAdjustableAdjustedSummaryCalculation {
  implicit val format: OFormat[UkPropAdjustableAdjustedSummaryCalculation] = Json.format[UkPropAdjustableAdjustedSummaryCalculation]
}
