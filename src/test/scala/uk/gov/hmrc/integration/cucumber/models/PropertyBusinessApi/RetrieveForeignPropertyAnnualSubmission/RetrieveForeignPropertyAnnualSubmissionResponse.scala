/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveForeignPropertyAnnualSubmissionResponse(foreignFhlEea: ForeignFhlEea,
                                                           foreignProperty: Seq[ForeignPropertyEntry],
                                                           links: Seq[HateoasLink])

object RetrieveForeignPropertyAnnualSubmissionResponse {
  implicit val format: OFormat[RetrieveForeignPropertyAnnualSubmissionResponse] = Json.format[RetrieveForeignPropertyAnnualSubmissionResponse]
}
