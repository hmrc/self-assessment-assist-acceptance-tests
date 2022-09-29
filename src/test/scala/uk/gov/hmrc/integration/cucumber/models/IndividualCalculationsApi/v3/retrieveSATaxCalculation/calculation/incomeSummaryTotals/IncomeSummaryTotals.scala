/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.incomeSummaryTotals

import play.api.libs.json.{Json, OFormat}

case class IncomeSummaryTotals(totalSelfEmploymentProfit: Option[BigInt],
                               totalPropertyProfit: Option[BigInt],
                               totalFHLPropertyProfit: Option[BigInt],
                               totalUKOtherPropertyProfit: Option[BigInt],
                               totalForeignPropertyProfit: Option[BigInt],
                               totalEeaFhlProfit: Option[BigInt],
                               totalEmploymentIncome: Option[BigInt])

object IncomeSummaryTotals {
  implicit val format: OFormat[IncomeSummaryTotals] = Json.format[IncomeSummaryTotals]
}