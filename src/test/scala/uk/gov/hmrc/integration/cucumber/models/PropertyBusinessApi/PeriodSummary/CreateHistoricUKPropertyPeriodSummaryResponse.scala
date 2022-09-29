/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.PeriodSummary

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class CreateHistoricUKPropertyPeriodSummaryResponse(periodId: String, links: Seq[HateoasLink])

object CreateHistoricUKPropertyPeriodSummaryResponse {
  implicit val format: OFormat[CreateHistoricUKPropertyPeriodSummaryResponse] = Json.format
}

