/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.OtherDeductionsApi

import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink
import play.api.libs.json.{Json, OFormat}

case class RetrieveOtherDeductionsResponse(submittedOn: String, seafarers: Option[Seq[Seafarers]], links: Seq[HateoasLink])

object RetrieveOtherDeductionsResponse {
  implicit val format: OFormat[RetrieveOtherDeductionsResponse] = Json.format[RetrieveOtherDeductionsResponse]
}
