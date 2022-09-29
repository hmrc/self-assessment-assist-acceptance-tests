/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentExpensesMandatory

import play.api.libs.json.{Json, OFormat}

case class EmploymentExpensesDetailMandatory(businessTravelCosts: BigDecimal,
                                             jobExpenses: BigDecimal,
                                             flatRateJobExpenses: BigDecimal,
                                             professionalSubscriptions: BigDecimal,
                                             hotelAndMealExpenses: BigDecimal,
                                             otherAndCapitalAllowances: BigDecimal,
                                             vehicleExpenses: BigDecimal,
                                             mileageAllowanceRelief: BigDecimal)

object EmploymentExpensesDetailMandatory {
  implicit val format: OFormat[EmploymentExpensesDetailMandatory] = Json.format[EmploymentExpensesDetailMandatory]
}