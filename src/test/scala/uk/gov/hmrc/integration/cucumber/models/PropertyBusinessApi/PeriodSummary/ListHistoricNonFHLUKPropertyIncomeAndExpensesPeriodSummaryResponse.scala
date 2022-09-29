/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.PeriodSummary

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponse(submissions: Seq[HistoricNonFHLSubmission], links: Seq[HateoasLink])

object ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponse{
  implicit val format: OFormat[ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponse] = Json.format
}

case class HistoricNonFHLSubmission(periodId: String, fromDate: String, toDate: String, links: Option[Seq[HateoasLink]])

object HistoricNonFHLSubmission {
  implicit val format: OFormat[HistoricNonFHLSubmission] = Json.format
}
