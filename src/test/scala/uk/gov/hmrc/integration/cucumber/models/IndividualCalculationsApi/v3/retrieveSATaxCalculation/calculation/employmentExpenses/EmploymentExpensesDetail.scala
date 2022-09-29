/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentExpenses

import play.api.libs.json.{Json, OFormat}

case class EmploymentExpensesDetail(businessTravelCosts: Option[BigDecimal],
                                    jobExpenses: Option[BigDecimal],
                                    flatRateJobExpenses: Option[BigDecimal],
                                    professionalSubscriptions: Option[BigDecimal],
                                    hotelAndMealExpenses: Option[BigDecimal],
                                    otherAndCapitalAllowances: Option[BigDecimal],
                                    vehicleExpenses: Option[BigDecimal],
                                    mileageAllowanceRelief: Option[BigDecimal])

object EmploymentExpensesDetail {
  implicit val format: OFormat[EmploymentExpensesDetail] = Json.format[EmploymentExpensesDetail]
}