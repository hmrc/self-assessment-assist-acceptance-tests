/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.PeriodSummary

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListPropertyPeriodSummariesResponse(submissions: Seq[Submission], links: Seq[HateoasLink])

object ListPropertyPeriodSummariesResponse {
  implicit val format: OFormat[ListPropertyPeriodSummariesResponse] = Json.format[ListPropertyPeriodSummariesResponse]
}

case class Submission(submissionId: String, fromDate: String, toDate: String, links: Option[Seq[HateoasLink]])

object Submission {
  implicit val format: OFormat[Submission] = Json.format[Submission]
}