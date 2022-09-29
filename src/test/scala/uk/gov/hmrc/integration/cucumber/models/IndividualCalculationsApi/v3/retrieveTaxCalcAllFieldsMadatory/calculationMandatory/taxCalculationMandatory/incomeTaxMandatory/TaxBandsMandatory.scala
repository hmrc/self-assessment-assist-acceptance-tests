/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.incomeTaxMandatory

import play.api.libs.json.{Json, OFormat}

case class TaxBandsMandatory(name: String,
                             rate: BigDecimal,
                             bandLimit: BigInt,
                             apportionedBandLimit: BigInt,
                             income: BigInt,
                             taxAmount: BigDecimal)

object TaxBandsMandatory {
  implicit val format: OFormat[TaxBandsMandatory] = Json.format[TaxBandsMandatory]
}