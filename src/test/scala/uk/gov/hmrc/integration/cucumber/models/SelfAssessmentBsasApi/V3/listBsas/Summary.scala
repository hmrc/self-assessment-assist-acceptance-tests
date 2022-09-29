/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.listBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class Summary(calculationId: String, requestedDateTime: String, summaryStatus: String, adjustedSummary: Boolean, links: Seq[HateoasLink])

object Summary {
  implicit val format: OFormat[Summary] = Json.format[Summary]
}
