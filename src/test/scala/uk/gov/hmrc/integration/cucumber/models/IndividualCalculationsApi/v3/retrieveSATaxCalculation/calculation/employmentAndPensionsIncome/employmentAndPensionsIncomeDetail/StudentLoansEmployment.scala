/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail

import play.api.libs.json.{Json, OFormat}

case class StudentLoansEmployment(uglDeductionAmount: Option[BigDecimal],
                                  pglDeductionAmount: Option[BigDecimal])

object StudentLoansEmployment {
  implicit val format: OFormat[StudentLoansEmployment] = Json.format[StudentLoansEmployment]
}