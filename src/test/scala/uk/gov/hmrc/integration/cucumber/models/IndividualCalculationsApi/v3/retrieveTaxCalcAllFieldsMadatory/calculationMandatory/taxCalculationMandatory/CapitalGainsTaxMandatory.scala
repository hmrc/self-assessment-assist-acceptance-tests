/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.capitalGainsTaxMandatory._

case class CapitalGainsTaxMandatory(totalCapitalGainsIncome: BigDecimal,
                                    annualExemptionAmount: BigDecimal,
                                    totalTaxableGains: BigDecimal,
                                    businessAssetsDisposalsAndInvestorsRel: BusinessAssetsDisposalsAndInvestorsRelMandatory,
                                    residentialPropertyAndCarriedInterest: ResidentialPropertyAndCarriedInterestMandatory,
                                    otherGains: OtherGainsMandatory,
                                    capitalGainsTaxAmount: BigDecimal,
                                    adjustments: BigDecimal,
                                    adjustedCapitalGainsTax: BigDecimal,
                                    foreignTaxCreditRelief: BigDecimal,
                                    capitalGainsTaxAfterFTCR: BigDecimal,
                                    taxOnGainsAlreadyPaid: BigDecimal,
                                    capitalGainsTaxDue: BigDecimal,
                                    capitalGainsOverpaid: BigDecimal)

object CapitalGainsTaxMandatory {
  implicit val format: OFormat[CapitalGainsTaxMandatory] = Json.format[CapitalGainsTaxMandatory]
}