/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.endOfYearEstimateMandatory

import play.api.libs.json.{Json, OFormat}

case class EndOfYearEstimateMandatory(incomeSource: Seq[IncomeSourceMandatory],
                                      totalEstimatedIncome: BigInt,
                                      totalTaxableIncome: BigInt,
                                      incomeTaxAmount: BigDecimal,
                                      nic2: BigDecimal,
                                      nic4: BigDecimal,
                                      totalTaxDeductedBeforeCodingOut: BigDecimal,
                                      saUnderpaymentsCodedOut: BigDecimal,
                                      totalNicAmount: BigDecimal,
                                      totalStudentLoansRepaymentAmount: BigDecimal,
                                      totalAnnuityPaymentsTaxCharged: BigDecimal,
                                      totalRoyaltyPaymentsTaxCharged: BigDecimal,
                                      totalTaxDeducted: BigDecimal,
                                      incomeTaxNicAmount: BigDecimal,
                                      cgtAmount: BigDecimal,
                                      incomeTaxNicAndCgtAmount: BigDecimal)

object EndOfYearEstimateMandatory {
  implicit val format: OFormat[EndOfYearEstimateMandatory] = Json.format[EndOfYearEstimateMandatory]
}