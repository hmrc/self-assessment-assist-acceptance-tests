/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Obligations.RetrievePeriodicObligations

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Obligations.Business

case class RetrievePeriodicObligationsResponse(obligations: Seq[Business])

object RetrievePeriodicObligationsResponse {
  implicit val format: OFormat[RetrievePeriodicObligationsResponse] = Json.format[RetrievePeriodicObligationsResponse]

}
