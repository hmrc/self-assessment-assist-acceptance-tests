/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.PeriodSummary

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class CreatePropertyPeriodSummaryResponse(submissionId: String, links: Seq[HateoasLink])

object CreatePropertyPeriodSummaryResponse {
  implicit val format: OFormat[CreatePropertyPeriodSummaryResponse] = Json.format[CreatePropertyPeriodSummaryResponse]
}
