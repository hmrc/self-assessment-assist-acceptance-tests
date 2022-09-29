/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class SummaryCalculationIncome(turnover: Option[BigDecimal], other: Option[BigDecimal])

object SummaryCalculationIncome {
  implicit val format: OFormat[SummaryCalculationIncome] = Json.format[SummaryCalculationIncome]
}
