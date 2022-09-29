/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.listBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class BsasEntry(bsasId: String, requestedDateTime: String, summaryStatus: String, adjustedSummary: Boolean, links: Seq[HateoasLink])

object BsasEntry {
  implicit val format: OFormat[BsasEntry] = Json.format[BsasEntry]
}
