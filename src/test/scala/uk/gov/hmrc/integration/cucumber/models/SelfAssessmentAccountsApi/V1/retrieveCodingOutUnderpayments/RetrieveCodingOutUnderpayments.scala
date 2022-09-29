/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveCodingOutUnderpayments

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveCodingOutUnderpayments(taxCodeComponents: TaxCodeComponentsObject,
                                          unmatchedCustomerSubmissions: UnmatchedCustomerSubmissionsObject,
                                          links: Seq[HateoasLink])

object RetrieveCodingOutUnderpayments {
  implicit val format: OFormat[RetrieveCodingOutUnderpayments] = Json.format[RetrieveCodingOutUnderpayments]
}
