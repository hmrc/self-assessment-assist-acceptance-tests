/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json.{Json, OFormat}

case class ResidentialPropertyAndCarriedInterest(gainsIncome: Option[BigDecimal],
                                                 lossesBroughtForward: Option[BigDecimal],
                                                 lossesArisingThisYear: Option[BigDecimal],
                                                 gainsAfterLosses: Option[BigDecimal],
                                                 annualExemptionAmount: Option[BigDecimal],
                                                 taxableGains: Option[BigDecimal],
                                                 cgtTaxBand: Option[Seq[CgtTaxBand]],
                                                 totalTaxAmount: Option[BigDecimal])

object ResidentialPropertyAndCarriedInterest {
  implicit val format: OFormat[ResidentialPropertyAndCarriedInterest] = Json.format[ResidentialPropertyAndCarriedInterest]
}
