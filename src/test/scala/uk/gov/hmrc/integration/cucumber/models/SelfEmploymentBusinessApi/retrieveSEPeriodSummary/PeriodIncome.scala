/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEPeriodSummary

import play.api.libs.json.{Json, OFormat}

case class PeriodIncome(turnover: Option[BigDecimal], other: Option[BigDecimal])

object PeriodIncome {
  implicit val format: OFormat[PeriodIncome] = Json.format[PeriodIncome]
}
