/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class AdjustmentsCountryLevelExpenses(premisesRunningCosts: Option[BigDecimal],
                                           repairsAndMaintenance: Option[BigDecimal],
                                           financialCosts: Option[BigDecimal],
                                           professionalFees: Option[BigDecimal],
                                           costOfServices: Option[BigDecimal],
                                           residentialFinancialCost: Option[BigDecimal],
                                           travelCosts: Option[BigDecimal],
                                           other: Option[BigDecimal],
                                           consolidatedExpenses: Option[BigDecimal])

object AdjustmentsCountryLevelExpenses {
  implicit val format: OFormat[AdjustmentsCountryLevelExpenses] = Json.format[AdjustmentsCountryLevelExpenses]
}
