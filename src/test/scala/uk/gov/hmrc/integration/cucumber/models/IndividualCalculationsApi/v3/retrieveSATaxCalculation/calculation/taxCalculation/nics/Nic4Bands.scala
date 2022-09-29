/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.nics

import play.api.libs.json.{Json, OFormat}

case class Nic4Bands(name: String,
                     rate: BigDecimal,
                     threshold: Option[BigInt],
                     apportionedThreshold: Option[BigInt],
                     income: BigInt,
                     amount: BigDecimal)

object Nic4Bands {
  implicit val format: OFormat[Nic4Bands] = Json.format[Nic4Bands]
}