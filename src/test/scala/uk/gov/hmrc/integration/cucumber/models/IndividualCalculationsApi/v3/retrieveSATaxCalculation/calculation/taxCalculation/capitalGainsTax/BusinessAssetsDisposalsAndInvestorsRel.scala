/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.capitalGainsTax

import play.api.libs.json.{Json, OFormat}

case class BusinessAssetsDisposalsAndInvestorsRel(gainsIncome: Option[BigDecimal],
                                                  lossesBroughtForward: Option[BigDecimal],
                                                  lossesArisingThisYear: Option[BigDecimal],
                                                  gainsAfterLosses: Option[BigDecimal],
                                                  annualExemptionAmount: Option[BigDecimal],
                                                  taxableGains: Option[BigDecimal],
                                                  rate: Option[BigDecimal],
                                                  taxAmount: Option[BigDecimal])

object BusinessAssetsDisposalsAndInvestorsRel {
  implicit val format: OFormat[BusinessAssetsDisposalsAndInvestorsRel] = Json.format[BusinessAssetsDisposalsAndInvestorsRel]
}