/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.capitalGainsTaxMandatory

import play.api.libs.json.{Json, OFormat}

case class CgtTaxBandsMandatory(name: String,
                                rate:BigDecimal,
                                income: BigDecimal,
                                taxAmount: BigDecimal)

object CgtTaxBandsMandatory {
  implicit val format: OFormat[CgtTaxBandsMandatory] = Json.format[CgtTaxBandsMandatory]
}