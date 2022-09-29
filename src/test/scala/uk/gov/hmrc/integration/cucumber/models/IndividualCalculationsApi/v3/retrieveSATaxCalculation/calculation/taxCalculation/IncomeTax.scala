/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.incomeTax._

case class IncomeTax(payPensionsProfit: Option[PayPensionsProfit],
                     savingsAndGains: Option[SavingsAndGains],
                     dividends: Option[Dividends],
                     lumpSums: Option[LumpSums],
                     gainsOnLifePolicies: Option[GainsOnLifePolicies],
                     incomeTaxCharged: BigDecimal,
                     totalReliefs: Option[BigDecimal],
                     incomeTaxDueAfterReliefs: Option[BigDecimal],
                     totalNotionalTax: Option[BigDecimal],
                     marriageAllowanceRelief: Option[BigDecimal],
                     incomeTaxDueAfterTaxReductions: Option[BigDecimal],
                     incomeTaxDueAfterGiftAid: Option[BigDecimal],
                     totalPensionSavingsTaxCharges: Option[BigDecimal],
                     statePensionLumpSumCharges: Option[BigDecimal],
                     payeUnderpaymentsCodedOut: Option[BigDecimal],
                     totalIncomeTaxDue: Option[BigDecimal])

object IncomeTax {
  implicit val format: OFormat[IncomeTax] = Json.format[IncomeTax]
}