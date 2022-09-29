/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.nicsMandatory

import play.api.libs.json.{Json, OFormat}

case class Class4NicsMandatory(totalIncomeLiableToClass4Charge: BigInt,
                               totalClass4LossesAvailable: BigInt,
                               totalClass4LossesUsed: BigInt,
                               totalClass4LossesCarriedForward: BigInt,
                               totalIncomeChargeableToClass4: BigInt,
                               totalAmount: BigDecimal,
                               nic4Bands: Seq[Nic4BandsMandatory])

object Class4NicsMandatory {
  implicit val format: OFormat[Class4NicsMandatory] = Json.format[Class4NicsMandatory]
}