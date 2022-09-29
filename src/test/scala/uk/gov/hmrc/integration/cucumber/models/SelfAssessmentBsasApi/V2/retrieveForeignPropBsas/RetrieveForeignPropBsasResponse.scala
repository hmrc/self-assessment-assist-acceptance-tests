/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveForeignPropBsas.metadata.Metadata
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveForeignPropBsas.bsas.Bsas
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveForeignPropBsasResponse(metadata: Metadata, bsas: Option[Bsas], links: Seq[HateoasLink])

object RetrieveForeignPropBsasResponse {
  implicit val format: OFormat[RetrieveForeignPropBsasResponse] = Json.format[RetrieveForeignPropBsasResponse]
}
