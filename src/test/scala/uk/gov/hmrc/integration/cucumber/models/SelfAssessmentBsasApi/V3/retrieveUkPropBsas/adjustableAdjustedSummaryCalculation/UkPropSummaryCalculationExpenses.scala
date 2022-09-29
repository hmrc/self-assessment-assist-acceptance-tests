/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustableAdjustedSummaryCalculation

import play.api.libs.json.{Json, OFormat}

case class UkPropSummaryCalculationExpenses(consolidatedExpenses: Option[BigDecimal],
                                            premisesRunningCosts: Option[BigDecimal],
                                            repairsAndMaintenance: Option[BigDecimal],
                                            financialCosts: Option[BigDecimal],
                                            professionalFees: Option[BigDecimal],
                                            costOfServices: Option[BigDecimal],
                                            residentialFinancialCost: Option[BigDecimal],
                                            broughtFwdResidentialFinancialCost: Option[BigDecimal],
                                            other: Option[BigDecimal],
                                            travelCosts: Option[BigDecimal])

object UkPropSummaryCalculationExpenses {
  implicit val format: OFormat[UkPropSummaryCalculationExpenses] = Json.format[UkPropSummaryCalculationExpenses]
}
