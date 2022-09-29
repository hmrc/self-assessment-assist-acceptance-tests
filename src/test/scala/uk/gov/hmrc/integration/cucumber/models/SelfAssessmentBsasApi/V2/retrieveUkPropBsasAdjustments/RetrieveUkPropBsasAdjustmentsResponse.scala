/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments.adjustments.Adjustments
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments.metadata.Metadata
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveUkPropBsasAdjustmentsResponse(metadata: Metadata, adjustments: Adjustments, links: Seq[HateoasLink])

object RetrieveUkPropBsasAdjustmentsResponse {
  implicit val format: OFormat[RetrieveUkPropBsasAdjustmentsResponse] = Json.format[RetrieveUkPropBsasAdjustmentsResponse]
}
