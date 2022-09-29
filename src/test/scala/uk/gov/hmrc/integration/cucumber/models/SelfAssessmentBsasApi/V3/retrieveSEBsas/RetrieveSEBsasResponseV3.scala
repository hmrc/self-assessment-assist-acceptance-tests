/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.MetadataV3
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveSEBsasResponseV3(metadata: MetadataV3,
                                    inputs: Inputs,
                                    adjustableSummaryCalculation: AdjustableSummaryCalculation,
                                    adjustments: Option[Adjustments],
                                    adjustedSummaryCalculation: Option[AdjustedSummaryCalculation],
                                    links: Seq[HateoasLink])

object RetrieveSEBsasResponseV3 {
  implicit val format: OFormat[RetrieveSEBsasResponseV3] = Json.format[RetrieveSEBsasResponseV3]
}
