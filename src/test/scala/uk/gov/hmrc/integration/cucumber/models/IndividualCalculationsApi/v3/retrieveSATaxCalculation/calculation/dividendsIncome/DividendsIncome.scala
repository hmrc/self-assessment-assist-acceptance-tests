/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.dividendsIncome

import play.api.libs.json.{Json, OFormat}

case class DividendsIncome(totalChargeableDividends: Option[BigInt],
                           totalUkDividends: Option[BigInt],
                           ukDividends: Option[UkDividends],
                           otherDividends: Option[Seq[OtherDividends]],
                           chargeableForeignDividends: Option[BigInt],
                           foreignDividends: Option[Seq[ForeignDividends]],
                           dividendIncomeReceivedWhilstAbroad: Option[Seq[DividendIncomeReceivedWhilstAbroad]])

object DividendsIncome {
  implicit val format: OFormat[DividendsIncome] = Json.format[DividendsIncome]
}