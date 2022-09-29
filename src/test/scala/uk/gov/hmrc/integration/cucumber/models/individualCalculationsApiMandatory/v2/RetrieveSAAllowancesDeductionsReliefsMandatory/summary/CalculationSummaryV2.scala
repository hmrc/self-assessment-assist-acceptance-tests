/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.summary

import play.api.libs.json.{Json, OFormat}

case class CalculationSummaryV2(totalAllowancesAndDeductions: BigInt, totalReliefs: BigDecimal)

object CalculationSummaryV2 {
  implicit val format: OFormat[CalculationSummaryV2] = Json.format[CalculationSummaryV2]
}
