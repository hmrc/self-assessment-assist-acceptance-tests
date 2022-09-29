/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentExpensesMandatory

import play.api.libs.json.{Json, OFormat}

case class EmploymentExpensesMandatory(totalEmploymentExpenses: BigDecimal,
                                       employmentExpensesDetail: EmploymentExpensesDetailMandatory)

object EmploymentExpensesMandatory {
  implicit val format: OFormat[EmploymentExpensesMandatory] = Json.format[EmploymentExpensesMandatory]
}