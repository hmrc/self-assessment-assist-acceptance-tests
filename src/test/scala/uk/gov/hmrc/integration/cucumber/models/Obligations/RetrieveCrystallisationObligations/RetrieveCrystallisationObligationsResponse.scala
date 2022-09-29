/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Obligations.RetrieveCrystallisationObligations

import play.api.libs.json.{Json, OFormat}

case class RetrieveCrystallisationObligationsResponse(periodStartDate: String,
                                                      periodEndDate: String,
                                                      dueDate: String,
                                                      status: String,
                                                      receivedDate: Option[String])

object RetrieveCrystallisationObligationsResponse {
  implicit val format: OFormat[RetrieveCrystallisationObligationsResponse] = Json.format[RetrieveCrystallisationObligationsResponse]
}
