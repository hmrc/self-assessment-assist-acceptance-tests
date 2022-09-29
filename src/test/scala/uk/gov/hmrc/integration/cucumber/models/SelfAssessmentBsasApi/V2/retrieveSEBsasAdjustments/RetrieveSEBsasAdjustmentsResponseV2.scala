/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsasAdjustments

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveSEBsasAdjustmentsResponseV2(metadata: MetadataV2, adjustments: BsasDetail, links: Seq[HateoasLink])

object RetrieveSEBsasAdjustmentsResponseV2 {
  implicit val format: OFormat[RetrieveSEBsasAdjustmentsResponseV2] = Json.format[RetrieveSEBsasAdjustmentsResponseV2]
}
