/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments.adjustments

import play.api.libs.json.{Json, OFormat}

case class Expenses(premisesRunningCosts: Option[BigDecimal],
                    repairsAndMaintenance: Option[BigDecimal],
                    financialCosts: Option[BigDecimal],
                    professionalFees: Option[BigDecimal],
                    travelCosts: Option[BigDecimal],
                    costOfServices: Option[BigDecimal],
                    residentialFinancialCost: Option[BigDecimal],
                    other: Option[BigDecimal],
                    consolidatedExpenses: Option[BigDecimal])

object Expenses {
  implicit val format: OFormat[Expenses] = Json.format[Expenses]
}
