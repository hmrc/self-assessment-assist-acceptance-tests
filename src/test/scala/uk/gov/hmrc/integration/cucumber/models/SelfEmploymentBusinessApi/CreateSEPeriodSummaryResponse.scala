/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class CreateSEPeriodSummaryResponse(periodId: String, links: Seq[HateoasLink])

object CreateSEPeriodSummaryResponse {
  implicit val format: OFormat[CreateSEPeriodSummaryResponse] = Json.format[CreateSEPeriodSummaryResponse]
}
