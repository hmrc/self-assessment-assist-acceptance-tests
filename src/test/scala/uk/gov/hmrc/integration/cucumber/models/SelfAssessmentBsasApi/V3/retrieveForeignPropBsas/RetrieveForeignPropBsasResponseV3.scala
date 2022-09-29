/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.MetadataV3
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveForeignPropBsasResponseV3(metadata: MetadataV3,
                                             inputs: Inputs,
                                             adjustableSummaryCalculation: AdjustableAdjustedSummaryCalculation,
                                             adjustments: Option[Adjustments],
                                             adjustedSummaryCalculation: Option[AdjustableAdjustedSummaryCalculation],
                                             links: Seq[HateoasLink])

object RetrieveForeignPropBsasResponseV3 {
  implicit val format: OFormat[RetrieveForeignPropBsasResponseV3] = Json.format[RetrieveForeignPropBsasResponseV3]
}
