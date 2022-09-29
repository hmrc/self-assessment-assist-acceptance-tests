/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Obligations.RetrieveEOPS

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Obligations.Business

case class RetrieveEOPSResponse(obligations: Seq[Business])

object RetrieveEOPSResponse {
  implicit val format: OFormat[RetrieveEOPSResponse] = Json.format[RetrieveEOPSResponse]
}
