/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class SubmissionPeriods(periodId: Option[String], submissionId: Option[String], startDate: String, endDate: String, receivedDateTime: String)

object SubmissionPeriods {
  implicit val format: OFormat[SubmissionPeriods] = Json.format[SubmissionPeriods]
}
