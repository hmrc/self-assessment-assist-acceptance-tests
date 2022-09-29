/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrievePensionReliefs

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrievePensionReliefsResponse(submittedOn: String, pensionReliefs: PensionReliefs, links: Seq[HateoasLink])

object RetrievePensionReliefsResponse {
  implicit val format: OFormat[RetrievePensionReliefsResponse] = Json.format[RetrievePensionReliefsResponse]
}
