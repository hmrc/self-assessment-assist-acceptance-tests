/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveUKPropertyAnnualSubmissionResponse(submittedOn: String,
                                                      ukFhlProperty: Option[UKFhlProperty],
                                                      ukNonFhlProperty: Option[UKNonFhlProperty],
                                                      links: Seq[HateoasLink])

object RetrieveUKPropertyAnnualSubmissionResponse {
  implicit val format: OFormat[RetrieveUKPropertyAnnualSubmissionResponse] = Json.format[RetrieveUKPropertyAnnualSubmissionResponse]
}
