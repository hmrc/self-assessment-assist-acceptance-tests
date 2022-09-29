/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.summary

import play.api.libs.json.{Json, OFormat}

case class CalculationSummaryV2(totalAllowancesAndDeductions: Option[BigInt], totalReliefs: Option[BigDecimal])

object CalculationSummaryV2 {
  implicit val format: OFormat[CalculationSummaryV2] = Json.format[CalculationSummaryV2]
}
