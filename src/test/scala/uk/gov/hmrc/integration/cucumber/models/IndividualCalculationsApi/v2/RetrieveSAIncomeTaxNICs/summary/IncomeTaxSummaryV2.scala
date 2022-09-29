/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.summary

import play.api.libs.json._

case class IncomeTaxSummaryV2(incomeTaxCharged: BigDecimal,
                              incomeTaxDueAfterReliefs: Option[BigDecimal],
                              incomeTaxDueAfterGiftAid: Option[BigDecimal],
                              totalNotionalTax: Option[BigDecimal],
                              totalPensionSavingsTaxCharges: Option[BigDecimal],
                              statePensionLumpSumCharges: Option[BigDecimal],
                              incomeTaxDueAfterTaxReductions: Option[BigDecimal],
                              totalIncomeTaxDue: Option[BigDecimal],
                              payeUnderpaymentsCodedOut: Option[BigDecimal])

object IncomeTaxSummaryV2 {
  implicit val format: OFormat[IncomeTaxSummaryV2] = Json.format[IncomeTaxSummaryV2]
}
