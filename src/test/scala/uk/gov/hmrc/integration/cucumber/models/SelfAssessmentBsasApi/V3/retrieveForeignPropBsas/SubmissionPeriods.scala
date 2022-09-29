/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class SubmissionPeriods(submissionId: String, startDate: String, endDate: String, receivedDateTime: String)

object SubmissionPeriods {
  implicit val format: OFormat[SubmissionPeriods] = Json.format[SubmissionPeriods]
}
