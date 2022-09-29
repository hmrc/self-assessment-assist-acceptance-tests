/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.incomeTaxMandatory

import play.api.libs.json.{Json, OFormat}

case class PayPensionsProfitMandatory(incomeReceived: BigInt,
                                      allowancesAllocated: BigInt,
                                      taxableIncome: BigInt,
                                      incomeTaxAmount: BigDecimal,
                                      taxBands: Seq[TaxBandsMandatory])

object PayPensionsProfitMandatory {
  implicit val format: OFormat[PayPensionsProfitMandatory] = Json.format[PayPensionsProfitMandatory]
}