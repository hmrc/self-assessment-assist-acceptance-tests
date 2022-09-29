/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.triggerBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class TriggerBsasResponse(calculationId: String, links: Seq[HateoasLink])

object TriggerBsasResponse {
  implicit val format: OFormat[TriggerBsasResponse] = Json.format[TriggerBsasResponse]
}
