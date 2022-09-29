/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveCodingOutUnderpayments

import play.api.libs.json.{Json, OFormat}

case class UnmatchedCustomerSubmissionsObject(selfAssessmentUnderpayment: Seq[UnmatchedCustomerSubmissions],
                                              payeUnderpayment: Seq[UnmatchedCustomerSubmissions],
                                              debt: Seq[UnmatchedCustomerSubmissions],
                                              inYearAdjustment: UnmatchedCustomerSubmissions)

object UnmatchedCustomerSubmissionsObject {
  implicit val format: OFormat[UnmatchedCustomerSubmissionsObject] = Json.format[UnmatchedCustomerSubmissionsObject]
}
