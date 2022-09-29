/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.studentLoans

import play.api.libs.json.{Json, OFormat}

case class StudentLoans(planType: String,
                        studentLoanTotalIncomeAmount: BigDecimal,
                        studentLoanChargeableIncomeAmount: BigDecimal,
                        studentLoanRepaymentAmount: BigDecimal,
                        studentLoanDeductionsFromEmployment: Option[BigDecimal],
                        studentLoanRepaymentAmountNetOfDeductions: BigDecimal,
                        studentLoanApportionedIncomeThreshold: BigInt,
                        studentLoanRate: BigDecimal,
                        payeIncomeForStudentLoan: BigDecimal,
                        nonPayeIncomeForStudentLoan: BigDecimal)

object StudentLoans {
  implicit val format: OFormat[StudentLoans] = Json.format[StudentLoans]
}