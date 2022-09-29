/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class AdjustableSummaryCalculation(totalIncome: Option[BigDecimal],
                                        income: Option[SummaryCalculationIncome],
                                        totalExpenses: Option[BigDecimal],
                                        expenses: Option[SummaryCalculationExpenses],
                                        netProfit: Option[BigDecimal],
                                        netLoss: Option[BigDecimal],
                                        totalAdditions: Option[BigDecimal],
                                        additions: Option[SummaryCalculationAdditions],
                                        totalDeductions: Option[BigDecimal],
                                        deductions: Option[SummaryCalculationDeductions],
                                        totalAccountingAdjustments: Option[BigDecimal],
                                        accountingAdjustments: Option[SummaryCalculationAccountingAdjustments],
                                        taxableProfit: Option[BigDecimal],
                                        adjustedIncomeTaxLoss: Option[BigDecimal])

object AdjustableSummaryCalculation {
  implicit val format: OFormat[AdjustableSummaryCalculation] = Json.format[AdjustableSummaryCalculation]
}
