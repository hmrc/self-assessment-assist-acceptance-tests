/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentExpenses

import play.api.libs.json.{Json, OFormat}

case class EmploymentExpenses(totalEmploymentExpenses: Option[BigDecimal],
                              employmentExpensesDetail: Option[EmploymentExpensesDetail])

object EmploymentExpenses {
  implicit val format: OFormat[EmploymentExpenses] = Json.format[EmploymentExpenses]
}