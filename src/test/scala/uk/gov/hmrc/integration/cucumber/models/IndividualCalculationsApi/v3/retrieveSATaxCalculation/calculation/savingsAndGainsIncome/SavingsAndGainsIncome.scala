/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.savingsAndGainsIncome

import play.api.libs.json.{Json, OFormat}


case class SavingsAndGainsIncome(totalChargeableSavingsAndGains: Option[BigInt],
                                 totalUkSavingsAndGains: Option[BigInt],
                                 ukSavingsAndGainsIncome: Option[Seq[UkSavingsAndGainsIncome]],
                                 chargeableForeignSavingsAndGains: Option[BigInt],
                                 foreignSavingsAndGainsIncome: Option[Seq[ForeignSavingsAndGainsIncome]])

object SavingsAndGainsIncome {
  implicit val format: OFormat[SavingsAndGainsIncome] = Json.format[SavingsAndGainsIncome]
}