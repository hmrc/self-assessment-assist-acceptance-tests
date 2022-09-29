/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class RetrieveUKPropertyPeriodSummaryResponse(submittedOn: String,
                                                   fromDate: String,
                                                   toDate: String,
                                                   ukFhlProperty: Option[UkFhlProperty],
                                                   ukNonFhlProperty: Option[UkNonFhlProperty])

object RetrieveUKPropertyPeriodSummaryResponse {
  implicit val format: OFormat[RetrieveUKPropertyPeriodSummaryResponse] = Json.format[RetrieveUKPropertyPeriodSummaryResponse]
}
