/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.capitalGainsTax._

case class CapitalGainsTax(totalCapitalGainsIncome: BigDecimal,
                           annualExemptionAmount: BigDecimal,
                           totalTaxableGains: BigDecimal,
                           businessAssetsDisposalsAndInvestorsRel: Option[BusinessAssetsDisposalsAndInvestorsRel],
                           residentialPropertyAndCarriedInterest: Option[ResidentialPropertyAndCarriedInterest],
                           otherGains: Option[OtherGains],
                           capitalGainsTaxAmount: Option[BigDecimal],
                           adjustments: Option[BigDecimal],
                           adjustedCapitalGainsTax: Option[BigDecimal],
                           foreignTaxCreditRelief: Option[BigDecimal],
                           capitalGainsTaxAfterFTCR: Option[BigDecimal],
                           taxOnGainsAlreadyPaid: Option[BigDecimal],
                           capitalGainsTaxDue: Option[BigDecimal],
                           capitalGainsOverpaid: Option[BigDecimal])

object CapitalGainsTax {
  implicit val format: OFormat[CapitalGainsTax] = Json.format[CapitalGainsTax]
}