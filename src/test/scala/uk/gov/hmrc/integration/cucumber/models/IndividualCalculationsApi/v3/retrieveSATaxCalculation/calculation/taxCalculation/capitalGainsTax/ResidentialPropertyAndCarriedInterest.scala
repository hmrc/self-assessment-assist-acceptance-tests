/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.capitalGainsTax

import play.api.libs.json.{Json, OFormat}

case class ResidentialPropertyAndCarriedInterest(gainsIncome: Option[BigDecimal],
                                                 lossesBroughtForward: Option[BigDecimal],
                                                 lossesArisingThisYear: Option[BigDecimal],
                                                 gainsAfterLosses: Option[BigDecimal],
                                                 annualExemptionAmount: Option[BigDecimal],
                                                 taxableGains: Option[BigDecimal],
                                                 cgtTaxBands: Option[Seq[CgtTaxBands]],
                                                 totalTaxAmount: Option[BigDecimal])

object ResidentialPropertyAndCarriedInterest {
  implicit val format: OFormat[ResidentialPropertyAndCarriedInterest] = Json.format[ResidentialPropertyAndCarriedInterest]
}