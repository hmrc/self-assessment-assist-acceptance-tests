/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class FhlExpenses(premisesRunningCosts: Option[BigDecimal],
                       repairsAndMaintenance: Option[BigDecimal],
                       financialCosts: Option[BigDecimal],
                       professionalFees: Option[BigDecimal],
                       costOfServices: Option[BigDecimal],
                       other: Option[BigDecimal],
                       travelCosts: Option[BigDecimal],
                       rentARoom: Option[FhlExpensesRentARoom],
                       consolidatedExpenses: Option[BigDecimal])

object FhlExpenses {
  implicit val format: OFormat[FhlExpenses] = Json.format[FhlExpenses]
}
