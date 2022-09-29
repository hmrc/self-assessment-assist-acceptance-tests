/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustments

import play.api.libs.json.{Json, OFormat}

case class UkPropAdjustmentsExpenses(consolidatedExpenses: Option[BigDecimal],
                                     premisesRunningCosts: Option[BigDecimal],
                                     repairsAndMaintenance: Option[BigDecimal],
                                     financialCosts: Option[BigDecimal],
                                     professionalFees: Option[BigDecimal],
                                     costOfServices: Option[BigDecimal],
                                     residentialFinancialCost: Option[BigDecimal],
                                     other: Option[BigDecimal],
                                     travelCosts: Option[BigDecimal])

object UkPropAdjustmentsExpenses {
  implicit val format: OFormat[UkPropAdjustmentsExpenses] = Json.format[UkPropAdjustmentsExpenses]
}
