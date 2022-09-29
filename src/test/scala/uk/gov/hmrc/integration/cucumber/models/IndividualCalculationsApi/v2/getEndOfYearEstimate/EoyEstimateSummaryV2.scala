/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateSummaryV2(totalEstimatedIncome: Option[BigInt],
                                totalTaxableIncome: Option[BigInt],
                                incomeTaxAmount: Option[BigDecimal],
                                nic2: Option[BigDecimal],
                                nic4: Option[BigDecimal],
                                totalNicAmount: Option[BigDecimal],
                                totalStudentLoansRepaymentAmount: Option[BigDecimal],
                                totalAnnualPaymentsTaxCharged: Option[BigDecimal],
                                totalRoyaltyPaymentsTaxCharged: Option[BigDecimal],
                                totalTaxDeducted: Option[BigDecimal],
                                incomeTaxNicAmount: Option[BigDecimal],
                                totalTaxDeductedBeforeCodingOut: Option[BigDecimal],
                                saUnderpaymentsCodedOut: Option[BigDecimal],
                                cgtAmount: Option[BigDecimal],
                                incomeTaxNicAndCgtAmount: Option[BigDecimal])

object EoyEstimateSummaryV2 {
  implicit val formats: OFormat[EoyEstimateSummaryV2] = Json.format[EoyEstimateSummaryV2]
}
