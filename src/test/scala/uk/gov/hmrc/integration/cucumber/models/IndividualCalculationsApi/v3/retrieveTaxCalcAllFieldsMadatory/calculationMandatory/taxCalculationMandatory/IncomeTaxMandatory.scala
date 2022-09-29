/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.incomeTaxMandatory._

case class IncomeTaxMandatory(payPensionsProfit: PayPensionsProfitMandatory,
                              savingsAndGains: SavingsAndGainsMandatory,
                              dividends: DividendsMandatory,
                              lumpSums: LumpSumsMandatory,
                              gainsOnLifePolicies: GainsOnLifePoliciesMandatory,
                              incomeTaxCharged: BigDecimal,
                              totalReliefs: BigDecimal,
                              incomeTaxDueAfterReliefs: BigDecimal,
                              totalNotionalTax: BigDecimal,
                              marriageAllowanceRelief: BigDecimal,
                              incomeTaxDueAfterTaxReductions: BigDecimal,
                              incomeTaxDueAfterGiftAid: BigDecimal,
                              totalPensionSavingsTaxCharges: BigDecimal,
                              statePensionLumpSumCharges: BigDecimal,
                              payeUnderpaymentsCodedOut: BigDecimal,
                              totalIncomeTaxDue: BigDecimal)

object IncomeTaxMandatory {
  implicit val format: OFormat[IncomeTaxMandatory] = Json.format[IncomeTaxMandatory]
}