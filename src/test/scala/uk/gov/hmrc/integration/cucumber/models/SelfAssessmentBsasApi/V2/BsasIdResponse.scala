/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class BsasIdResponse(id: String, links: Seq[HateoasLink])

object BsasIdResponse {
  implicit val format: OFormat[BsasIdResponse] = Json.format[BsasIdResponse]
}
