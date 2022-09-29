/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.nicsMandatory

import play.api.libs.json.{Json, OFormat}

case class Nic4BandsMandatory(name: String,
                              rate: BigDecimal,
                              threshold: BigInt,
                              apportionedThreshold: BigInt,
                              income: BigInt,
                              amount: BigDecimal)

object Nic4BandsMandatory {
  implicit val format: OFormat[Nic4BandsMandatory] = Json.format[Nic4BandsMandatory]
}