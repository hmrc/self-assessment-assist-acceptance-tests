/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsas.v2.bsas.Bsas
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsas.v2.metadata.Metadata
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveUkPropBsasResponseV2(metadata: Metadata, bsas: Option[Bsas], links: Seq[HateoasLink])

object RetrieveUkPropBsasResponseV2 {
  implicit val format: OFormat[RetrieveUkPropBsasResponseV2] = Json.format[RetrieveUkPropBsasResponseV2]
}
