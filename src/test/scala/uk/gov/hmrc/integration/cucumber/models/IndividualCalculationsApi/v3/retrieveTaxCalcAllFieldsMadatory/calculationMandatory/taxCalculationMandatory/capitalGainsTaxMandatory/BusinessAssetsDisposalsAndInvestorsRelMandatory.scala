/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.capitalGainsTaxMandatory

import play.api.libs.json.{Json, OFormat}

case class BusinessAssetsDisposalsAndInvestorsRelMandatory(gainsIncome: BigDecimal,
                                                           lossesBroughtForward: BigDecimal,
                                                           lossesArisingThisYear: BigDecimal,
                                                           gainsAfterLosses: BigDecimal,
                                                           annualExemptionAmount: BigDecimal,
                                                           taxableGains: BigDecimal,
                                                           rate: BigDecimal,
                                                           taxAmount: BigDecimal)

object BusinessAssetsDisposalsAndInvestorsRelMandatory {
  implicit val format: OFormat[BusinessAssetsDisposalsAndInvestorsRelMandatory] = Json.format[BusinessAssetsDisposalsAndInvestorsRelMandatory]
}