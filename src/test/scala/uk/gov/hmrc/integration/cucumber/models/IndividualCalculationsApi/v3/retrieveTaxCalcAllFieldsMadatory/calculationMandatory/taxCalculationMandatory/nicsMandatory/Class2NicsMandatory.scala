/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.nicsMandatory

import play.api.libs.json.{Json, OFormat}

case class Class2NicsMandatory(amount: BigDecimal,
                               weeklyRate: BigDecimal,
                               weeks: BigInt,
                               limit: BigInt,
                               apportionedLimit: BigInt,
                               underSmallProfitThreshold: Boolean,
                               actualClass2Nic: Boolean)

object Class2NicsMandatory {
  implicit val format: OFormat[Class2NicsMandatory] = Json.format[Class2NicsMandatory]
}