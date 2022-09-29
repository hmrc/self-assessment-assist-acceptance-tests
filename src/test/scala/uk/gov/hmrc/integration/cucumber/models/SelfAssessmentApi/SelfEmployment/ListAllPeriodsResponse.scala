/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentApi.SelfEmployment

import play.api.libs.json.{Json, OFormat}

case class ListAllPeriodsResponse(id: String, from: String, to: String)

object ListAllPeriodsResponse {
  implicit val format: OFormat[ListAllPeriodsResponse] = Json.format[ListAllPeriodsResponse]
}
