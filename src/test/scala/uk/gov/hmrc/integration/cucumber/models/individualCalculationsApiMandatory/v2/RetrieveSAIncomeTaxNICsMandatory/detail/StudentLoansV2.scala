/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class StudentLoansV2(planType: String,
                          studentLoanTotalIncomeAmount: BigDecimal,
                          studentLoanChargeableIncomeAmount: BigDecimal,
                          studentLoanRepaymentAmount: BigDecimal,
                          studentLoanDeductionsFromEmployment: BigDecimal,
                          studentLoanRepaymentAmountNetOfDeductions: BigDecimal,
                          studentLoanApportionedIncomeThreshold: BigInt,
                          studentLoanRate: BigDecimal)

object StudentLoansV2 {
  implicit val format: OFormat[StudentLoansV2] = Json.format[StudentLoansV2]
}
