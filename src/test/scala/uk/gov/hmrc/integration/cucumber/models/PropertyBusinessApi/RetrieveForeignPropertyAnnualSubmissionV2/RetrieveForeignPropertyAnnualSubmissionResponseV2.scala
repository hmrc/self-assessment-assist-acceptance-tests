/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmissionV2

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveForeignPropertyAnnualSubmissionResponseV2(submittedOn: String,
                                                             foreignFhlEea: Option[ForeignFhlEea],
                                                             foreignNonFhlProperty: Option[Seq[ForeignNonFhlPropertyEntry]],
                                                             links: Seq[HateoasLink])

object RetrieveForeignPropertyAnnualSubmissionResponseV2 {
  implicit val format: OFormat[RetrieveForeignPropertyAnnualSubmissionResponseV2] = Json.format[RetrieveForeignPropertyAnnualSubmissionResponseV2]
}
