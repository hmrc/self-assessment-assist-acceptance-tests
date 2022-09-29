/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory

import play.api.libs.json.{Json, OFormat}

case class TaxCalculationMandatory(incomeTax: IncomeTaxMandatory,
                                   nics: NicsMandatory,
                                   totalTaxDeductedBeforeCodingOut: BigDecimal,
                                   saUnderpaymentsCodedOut: BigDecimal,
                                   totalIncomeTaxNicsCharged: BigDecimal,
                                   totalStudentLoansRepaymentAmount: BigDecimal,
                                   totalAnnuityPaymentsTaxCharged: BigInt,
                                   totalRoyaltyPaymentsTaxCharged: BigDecimal,
                                   totalTaxDeducted: BigDecimal,
                                   totalIncomeTaxAndNicsDue: BigDecimal,
                                   capitalGainsTax: CapitalGainsTaxMandatory,
                                   totalIncomeTaxAndNicsAndCgt: BigDecimal)

object TaxCalculationMandatory {
  implicit val format: OFormat[TaxCalculationMandatory] = Json.format[TaxCalculationMandatory]
}