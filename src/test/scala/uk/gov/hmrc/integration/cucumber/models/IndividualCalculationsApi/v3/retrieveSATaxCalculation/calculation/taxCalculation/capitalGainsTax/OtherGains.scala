/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.capitalGainsTax

import play.api.libs.json.{Json, OFormat}

case class OtherGains(gainsIncome: Option[BigDecimal],
                      lossesBroughtForward: Option[BigDecimal],
                      lossesArisingThisYear: Option[BigDecimal],
                      gainsAfterLosses: Option[BigDecimal],
                      attributedGains: Option[BigDecimal],
                      netGains: Option[BigDecimal],
                      annualExemptionAmount: Option[BigDecimal],
                      taxableGains: Option[BigDecimal],
                      cgtTaxBands: Option[Seq[CgtTaxBands]],
                      totalTaxAmount: Option[BigDecimal])

object OtherGains {
  implicit val format: OFormat[OtherGains] = Json.format[OtherGains]
}