/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class SubmissionPeriods(periodId: Option[String],
                             startDate: String,
                             endDate: String,
                             receivedDateTime: String)

object SubmissionPeriods {
  implicit val format: OFormat[SubmissionPeriods] = Json.format[SubmissionPeriods]
}