/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.inputs

import play.api.libs.json.{Json, OFormat}

case class SubmissionPeriod(periodId: Option[String], submissionId: Option[String], startDate: String, endDate: String, receivedDateTime: String)

object SubmissionPeriod {
  implicit val format: OFormat[SubmissionPeriod] = Json.format[SubmissionPeriod]
}
