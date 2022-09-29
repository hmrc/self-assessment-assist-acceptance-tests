/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEPeriodSummary

import play.api.libs.json.{Json, OFormat}

case class RetrieveSEPeriodSummaryBody(periodDates: PeriodDates,
                                       periodIncome: Option[PeriodIncome],
                                       periodAllowableExpenses: Option[PeriodAllowableExpenses],
                                       periodDisallowableExpenses: Option[PeriodDisallowableExpenses])

object RetrieveSEPeriodSummaryBody {
  implicit val format: OFormat[RetrieveSEPeriodSummaryBody] = Json.format[RetrieveSEPeriodSummaryBody]
}
