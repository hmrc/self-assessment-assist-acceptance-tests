/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.PeriodSummary

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListHistoricUKPropertyPeriodSummariesResponse(submissions: Seq[HistoricSubmission], links: Seq[HateoasLink])

object ListHistoricUKPropertyPeriodSummariesResponse {
  implicit val format: OFormat[ListHistoricUKPropertyPeriodSummariesResponse] = Json.format
}

case class HistoricSubmission(periodId: String, fromDate: String, toDate: String, links: Option[Seq[HateoasLink]])

object HistoricSubmission {
  implicit val format: OFormat[HistoricSubmission] = Json.format
}
