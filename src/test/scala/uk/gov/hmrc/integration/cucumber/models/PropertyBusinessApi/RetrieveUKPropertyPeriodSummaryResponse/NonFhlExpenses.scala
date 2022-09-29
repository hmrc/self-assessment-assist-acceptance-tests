/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class NonFhlExpenses(premisesRunningCosts: Option[BigDecimal],
                          repairsAndMaintenance: Option[BigDecimal],
                          financialCosts: Option[BigDecimal],
                          professionalFees: Option[BigDecimal],
                          costOfServices: Option[BigDecimal],
                          other: Option[BigDecimal],
                          residentialFinancialCost: Option[BigDecimal],
                          travelCosts: Option[BigDecimal],
                          residentialFinancialCostsCarriedForward: Option[BigDecimal],
                          rentARoom: Option[NonFhlExpensesRentARoom],
                          consolidatedExpenses: Option[BigDecimal])

object NonFhlExpenses {
  implicit val format: OFormat[NonFhlExpenses] = Json.format[NonFhlExpenses]
}
