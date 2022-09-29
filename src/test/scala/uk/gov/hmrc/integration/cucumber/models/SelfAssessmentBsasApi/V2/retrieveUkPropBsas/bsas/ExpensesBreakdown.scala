/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsas.v2.bsas

import play.api.libs.json.{Json, OFormat}

case class ExpensesBreakdown(premisesRunningCosts: Option[BigDecimal],
                             repairsAndMaintenance: Option[BigDecimal],
                             financialCosts: Option[BigDecimal],
                             professionalFees: Option[BigDecimal],
                             travelCosts: Option[BigDecimal],
                             costOfServices: Option[BigDecimal],
                             residentialFinancialCost: Option[BigDecimal],
                             broughtFwdResidentialFinancialCost: Option[BigDecimal],
                             other: Option[BigDecimal],
                             consolidatedExpenses: Option[BigDecimal])

object ExpensesBreakdown {
  implicit val format: OFormat[ExpensesBreakdown] = Json.format[ExpensesBreakdown]
}
