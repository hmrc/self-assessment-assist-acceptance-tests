/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.studentLoansMandatory

import play.api.libs.json.{Json, OFormat}

case class StudentLoansMandatory(planType: String,
                                 studentLoanTotalIncomeAmount: BigDecimal,
                                 studentLoanChargeableIncomeAmount: BigDecimal,
                                 studentLoanRepaymentAmount: BigDecimal,
                                 studentLoanDeductionsFromEmployment: BigDecimal,
                                 studentLoanRepaymentAmountNetOfDeductions: BigDecimal,
                                 studentLoanApportionedIncomeThreshold: BigInt,
                                 studentLoanRate: BigDecimal,
                                 payeIncomeForStudentLoan: BigDecimal,
                                 nonPayeIncomeForStudentLoan: BigDecimal)

object StudentLoansMandatory {
  implicit val format: OFormat[StudentLoansMandatory] = Json.format[StudentLoansMandatory]
}