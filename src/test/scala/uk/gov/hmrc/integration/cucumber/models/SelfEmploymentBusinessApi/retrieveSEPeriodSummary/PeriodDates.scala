/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEPeriodSummary

import play.api.libs.json.{Json, OFormat}

case class PeriodDates(periodStartDate: String, periodEndDate: String)

object PeriodDates {
  implicit val format: OFormat[PeriodDates] = Json.format[PeriodDates]
}
