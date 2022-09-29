/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class IncomeBreakdown(turnover: Option[BigDecimal], other: Option[BigDecimal])

object IncomeBreakdown {
  implicit val format: OFormat[IncomeBreakdown] = Json.format[IncomeBreakdown]
}
