/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.summary._

case class CalculationSummaryV2(incomeTax: IncomeTaxSummaryV2,
                                nics: NicSummaryV2,
                                totalStudentLoansRepaymentAmount: BigDecimal,
                                totalAnnualPaymentsTaxCharged: BigDecimal,
                                totalRoyaltyPaymentsTaxCharged: BigDecimal,
                                totalIncomeTaxNicsCharged: BigDecimal,
                                totalTaxDeducted: BigDecimal,
                                totalIncomeTaxAndNicsDue: BigDecimal,
                                taxRegime: String,
                                totalTaxDeductedBeforeCodingOut: BigDecimal,
                                saUnderpaymentsCodedOut: BigDecimal)

object CalculationSummaryV2 {
  implicit val format: OFormat[CalculationSummaryV2] = Json.format[CalculationSummaryV2]
}
