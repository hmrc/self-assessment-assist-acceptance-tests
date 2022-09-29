/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsasAdjustments

import play.api.libs.json.{Json, OFormat}

case class ExpensesBreakdown(costOfGoodsBought: Option[BigDecimal],
                             cisPaymentsToSubcontractors: Option[BigDecimal],
                             staffCosts: Option[BigDecimal],
                             travelCosts: Option[BigDecimal],
                             premisesRunningCosts: Option[BigDecimal],
                             maintenanceCosts: Option[BigDecimal],
                             adminCosts: Option[BigDecimal],
                             advertisingCosts: Option[BigDecimal],
                             businessEntertainmentCosts: Option[BigDecimal],
                             interest: Option[BigDecimal],
                             financialCharges: Option[BigDecimal],
                             badDebt: Option[BigDecimal],
                             professionalFees: Option[BigDecimal],
                             depreciation: Option[BigDecimal],
                             other: Option[BigDecimal],
                             consolidatedExpenses: Option[BigDecimal])

object ExpensesBreakdown {
  implicit val format: OFormat[ExpensesBreakdown] = Json.format[ExpensesBreakdown]
}
