/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.capitalGainsTaxMandatory

import play.api.libs.json.{Json, OFormat}

case class ResidentialPropertyAndCarriedInterestMandatory(gainsIncome: BigDecimal,
                                                          lossesBroughtForward: BigDecimal,
                                                          lossesArisingThisYear: BigDecimal,
                                                          gainsAfterLosses: BigDecimal,
                                                          annualExemptionAmount: BigDecimal,
                                                          taxableGains: BigDecimal,
                                                          cgtTaxBands: Seq[CgtTaxBandsMandatory],
                                                          totalTaxAmount: BigDecimal)

object ResidentialPropertyAndCarriedInterestMandatory {
  implicit val format: OFormat[ResidentialPropertyAndCarriedInterestMandatory] = Json.format[ResidentialPropertyAndCarriedInterestMandatory]
}