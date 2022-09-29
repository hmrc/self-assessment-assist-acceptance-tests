/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class EoyEstimateMandatoryV2(summary: EoyEstimateSummaryV2, detail: EoyEstimateDetailV2, links: Seq[HateoasLink])

object EoyEstimateMandatoryV2 {
  implicit val format: OFormat[EoyEstimateMandatoryV2] = Json.format[EoyEstimateMandatoryV2]
}
