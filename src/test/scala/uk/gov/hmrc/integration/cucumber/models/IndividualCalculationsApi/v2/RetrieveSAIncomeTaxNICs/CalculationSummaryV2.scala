/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.summary._

case class CalculationSummaryV2(incomeTax: IncomeTaxSummaryV2,
                                nics: Option[NicSummaryV2],
                                totalStudentLoansRepaymentAmount: Option[BigDecimal],
                                totalAnnualPaymentsTaxCharged: Option[BigInt],
                                totalRoyaltyPaymentsTaxCharged: Option[BigDecimal],
                                totalIncomeTaxNicsCharged: Option[BigDecimal],
                                totalTaxDeducted: Option[BigDecimal],
                                totalIncomeTaxAndNicsDue: BigDecimal,
                                taxRegime: String,
                                totalTaxDeductedBeforeCodingOut: Option[BigDecimal],
                                saUnderpaymentsCodedOut: Option[BigDecimal],
                                totalIncomeTaxAndNicsAndCgt: Option[BigDecimal],
                                capitalGainsTax: Option[CapitalGainsTaxSummary])

object CalculationSummaryV2 {
  implicit val format: OFormat[CalculationSummaryV2] = Json.format[CalculationSummaryV2]
}
