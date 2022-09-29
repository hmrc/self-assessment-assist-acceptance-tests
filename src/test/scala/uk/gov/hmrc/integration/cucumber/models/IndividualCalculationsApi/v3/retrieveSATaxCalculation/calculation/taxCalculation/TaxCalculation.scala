/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation

import play.api.libs.json.{Json, OFormat}

case class TaxCalculation(incomeTax: IncomeTax,
                          nics: Option[Nics],
                          totalTaxDeductedBeforeCodingOut: Option[BigDecimal],
                          saUnderpaymentsCodedOut: Option[BigDecimal],
                          totalIncomeTaxNicsCharged: Option[BigDecimal],
                          totalStudentLoansRepaymentAmount: Option[BigDecimal],
                          totalAnnuityPaymentsTaxCharged: Option[BigInt],
                          totalRoyaltyPaymentsTaxCharged: Option[BigDecimal],
                          totalTaxDeducted: Option[BigDecimal],
                          totalIncomeTaxAndNicsDue: BigDecimal,
                          capitalGainsTax: Option[CapitalGainsTax],
                          totalIncomeTaxAndNicsAndCgt: Option[BigDecimal])

object TaxCalculation {
  implicit val format: OFormat[TaxCalculation] = Json.format[TaxCalculation]
}