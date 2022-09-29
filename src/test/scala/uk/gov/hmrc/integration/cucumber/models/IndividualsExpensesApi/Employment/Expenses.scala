/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsExpensesApi.Employment

import play.api.libs.json.{Json, OFormat}

case class Expenses(businessTravelCosts: Option[BigDecimal],
                    jobExpenses: Option[BigDecimal],
                    flatRateJobExpenses: Option[BigDecimal],
                    professionalSubscriptions: Option[BigDecimal],
                    hotelAndMealExpenses: Option[BigDecimal],
                    otherAndCapitalAllowances: Option[BigDecimal],
                    vehicleExpenses: Option[BigDecimal],
                    mileageAllowanceRelief: Option[BigDecimal])

object Expenses {
  implicit val format: OFormat[Expenses] = Json.format[Expenses]
}
