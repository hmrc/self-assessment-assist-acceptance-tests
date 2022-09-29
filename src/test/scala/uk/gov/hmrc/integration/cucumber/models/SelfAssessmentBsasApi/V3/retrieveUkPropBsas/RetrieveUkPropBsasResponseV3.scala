/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustableAdjustedSummaryCalculation.UkPropAdjustableAdjustedSummaryCalculation
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustments.UkPropAdjustments
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.inputs.Inputs
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveUkPropBsasResponseV3(metadata: MetadataV3,
                                        inputs: Inputs,
                                        adjustableSummaryCalculation: UkPropAdjustableAdjustedSummaryCalculation,
                                        adjustments: Option[UkPropAdjustments],
                                        adjustedSummaryCalculation: Option[UkPropAdjustableAdjustedSummaryCalculation],
                                        links: Seq[HateoasLink])

object RetrieveUkPropBsasResponseV3 {
  implicit val format: OFormat[RetrieveUkPropBsasResponseV3] = Json.format[RetrieveUkPropBsasResponseV3]
}
