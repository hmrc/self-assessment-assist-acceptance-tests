/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.summary

import play.api.libs.json._

case class CalculationSummaryV2(totalIncomeReceivedFromAllSources: BigInt, totalTaxableIncome: BigInt)

object CalculationSummaryV2 {
  implicit val formats: OFormat[CalculationSummaryV2] = Json.format[CalculationSummaryV2]
}
