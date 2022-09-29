/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveSEBsasResponseV2(metadata: MetadataV2, bsas: Option[Bsas], links: Seq[HateoasLink])

object RetrieveSEBsasResponseV2 {
  implicit val format: OFormat[RetrieveSEBsasResponseV2] = Json.format[RetrieveSEBsasResponseV2]
}
