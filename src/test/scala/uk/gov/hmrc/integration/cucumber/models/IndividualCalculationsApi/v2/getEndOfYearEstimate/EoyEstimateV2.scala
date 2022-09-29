/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class EoyEstimateV2(summary: EoyEstimateSummaryV2, detail: EoyEstimateDetailV2, links: Seq[HateoasLink])

object EoyEstimateV2 {
  implicit val format: OFormat[EoyEstimateV2] = Json.format[EoyEstimateV2]
}
