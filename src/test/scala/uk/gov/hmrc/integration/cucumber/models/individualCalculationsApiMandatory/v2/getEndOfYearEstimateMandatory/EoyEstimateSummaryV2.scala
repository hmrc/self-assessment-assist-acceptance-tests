/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateSummaryV2(totalEstimatedIncome: BigInt,
                                totalTaxableIncome: BigInt,
                                incomeTaxAmount: BigDecimal,
                                nic2: BigDecimal,
                                nic4: BigDecimal,
                                totalNicAmount: BigDecimal,
                                totalStudentLoansRepaymentAmount: BigDecimal,
                                totalAnnualPaymentsTaxCharged: BigDecimal,
                                totalRoyaltyPaymentsTaxCharged: BigDecimal,
                                totalTaxDeducted: BigDecimal,
                                incomeTaxNicAmount: BigDecimal,
                                totalTaxDeductedBeforeCodingOut: BigDecimal,
                                saUnderpaymentsCodedOut: BigDecimal,
                                cgtAmount: BigDecimal,
                                incomeTaxNicAndCgtAmount: BigDecimal)

object EoyEstimateSummaryV2 {
  implicit val formats: OFormat[EoyEstimateSummaryV2] = Json.format[EoyEstimateSummaryV2]
}
