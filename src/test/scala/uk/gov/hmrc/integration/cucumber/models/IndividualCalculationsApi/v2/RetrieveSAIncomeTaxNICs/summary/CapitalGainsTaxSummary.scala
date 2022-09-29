/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.summary

import play.api.libs.json.{Json, OFormat}

case class CapitalGainsTaxSummary(totalCapitalGainsIncome: BigDecimal,
                                  annualExemptionAmount: BigDecimal,
                                  totalTaxableGains: BigDecimal,
                                  capitalGainsTaxAmount: Option[BigDecimal],
                                  adjustments: Option[BigDecimal],
                                  adjustedCapitalGainsTax: Option[BigDecimal],
                                  foreignTaxCreditRelief: Option[BigDecimal],
                                  capitalGainsTaxAfterFTCR: Option[BigDecimal],
                                  taxOnGainsAlreadyPaid: Option[BigDecimal],
                                  capitalGainsTaxDue: BigDecimal,
                                  capitalGainsOverpaid: Option[BigDecimal])

object CapitalGainsTaxSummary {
  implicit val format: OFormat[CapitalGainsTaxSummary] = Json.format[CapitalGainsTaxSummary]
}
