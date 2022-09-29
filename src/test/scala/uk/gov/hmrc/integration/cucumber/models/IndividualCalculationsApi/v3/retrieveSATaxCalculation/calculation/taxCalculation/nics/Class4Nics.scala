/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.nics

import play.api.libs.json.{Json, OFormat}

case class Class4Nics(totalIncomeLiableToClass4Charge: Option[BigInt],
                      totalClass4LossesAvailable: Option[BigInt],
                      totalClass4LossesUsed: Option[BigInt],
                      totalClass4LossesCarriedForward: Option[BigInt],
                      totalIncomeChargeableToClass4: Option[BigInt],
                      totalAmount: BigDecimal,
                      nic4Bands: Option[Seq[Nic4Bands]])

object Class4Nics {
  implicit val format: OFormat[Class4Nics] = Json.format[Class4Nics]
}