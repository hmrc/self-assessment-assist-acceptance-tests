/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignNonFhlProperty

import play.api.libs.json.{Json, OFormat}

case class ForeignNonFhlPropertyExpenses(premisesRunningCosts: Option[BigDecimal],
                                         repairsAndMaintenance: Option[BigDecimal],
                                         financialCosts: Option[BigDecimal],
                                         professionalFees: Option[BigDecimal],
                                         costOfServices: Option[BigDecimal],
                                         travelCosts: Option[BigDecimal],
                                         residentialFinancialCost: Option[BigDecimal],
                                         broughtFwdResidentialFinancialCost: Option[BigDecimal],
                                         other: Option[BigDecimal],
                                         consolidatedExpenses: Option[BigDecimal])

object ForeignNonFhlPropertyExpenses {
  implicit val format: OFormat[ForeignNonFhlPropertyExpenses] = Json.format[ForeignNonFhlPropertyExpenses]
}
