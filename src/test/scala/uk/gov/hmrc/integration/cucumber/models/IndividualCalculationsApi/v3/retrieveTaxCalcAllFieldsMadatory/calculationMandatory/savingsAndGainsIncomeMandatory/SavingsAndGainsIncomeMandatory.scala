/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.savingsAndGainsIncomeMandatory

import play.api.libs.json.{Json, OFormat}


case class SavingsAndGainsIncomeMandatory(totalChargeableSavingsAndGains: BigInt,
                                          totalUkSavingsAndGains: BigInt,
                                          ukSavingsAndGainsIncome: Seq[UkSavingsAndGainsIncomeMandatory],
                                          chargeableForeignSavingsAndGains: BigInt,
                                          foreignSavingsAndGainsIncome: Seq[ForeignSavingsAndGainsIncomeMandatory])

object SavingsAndGainsIncomeMandatory {
  implicit val format: OFormat[SavingsAndGainsIncomeMandatory] = Json.format[SavingsAndGainsIncomeMandatory]
}