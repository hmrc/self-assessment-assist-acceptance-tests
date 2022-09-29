/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.summary

import play.api.libs.json._

case class CalculationSummaryV2(totalIncomeReceivedFromAllSources: BigInt, totalTaxableIncome: BigInt)

object CalculationSummaryV2 {
  implicit val format: OFormat[CalculationSummaryV2] = Json.format[CalculationSummaryV2]
}
