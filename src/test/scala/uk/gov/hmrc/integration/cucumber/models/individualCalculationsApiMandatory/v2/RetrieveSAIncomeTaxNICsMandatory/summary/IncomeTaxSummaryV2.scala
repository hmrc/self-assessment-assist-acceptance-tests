/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.summary

import play.api.libs.json._

case class IncomeTaxSummaryV2(incomeTaxCharged: BigDecimal,
                              incomeTaxDueAfterReliefs: BigDecimal,
                              incomeTaxDueAfterGiftAid: BigDecimal,
                              totalNotionalTax: BigDecimal,
                              totalPensionSavingsTaxCharges: BigDecimal,
                              statePensionLumpSumCharges: BigDecimal,
                              incomeTaxDueAfterTaxReductions: BigDecimal,
                              totalIncomeTaxDue: BigDecimal,
                              payeUnderpaymentsCodedOut: BigDecimal)

object IncomeTaxSummaryV2 {
  implicit val format: OFormat[IncomeTaxSummaryV2] = Json.format[IncomeTaxSummaryV2]
}
