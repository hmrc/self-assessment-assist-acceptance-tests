/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.endOfYearEstimate

import play.api.libs.json.{Json, OFormat}

case class EndOfYearEstimate(incomeSource: Option[Seq[IncomeSource]],
                             totalEstimatedIncome: Option[BigInt],
                             totalTaxableIncome: Option[BigInt],
                             incomeTaxAmount: Option[BigDecimal],
                             nic2: Option[BigDecimal],
                             nic4: Option[BigDecimal],
                             totalTaxDeductedBeforeCodingOut: Option[BigDecimal],
                             saUnderpaymentsCodedOut: Option[BigDecimal],
                             totalNicAmount: Option[BigDecimal],
                             totalStudentLoansRepaymentAmount: Option[BigDecimal],
                             totalAnnuityPaymentsTaxCharged: Option[BigDecimal],
                             totalRoyaltyPaymentsTaxCharged: Option[BigDecimal],
                             totalTaxDeducted: Option[BigDecimal],
                             incomeTaxNicAmount: Option[BigDecimal],
                             cgtAmount: Option[BigDecimal],
                             incomeTaxNicAndCgtAmount: Option[BigDecimal])

object EndOfYearEstimate {
  implicit val format: OFormat[EndOfYearEstimate] = Json.format[EndOfYearEstimate]
}