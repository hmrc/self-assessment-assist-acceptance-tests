/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveCodingOutUnderpayments

import play.api.libs.json.{Json, OFormat}

case class UnmatchedCustomerSubmissions(id: BigInt, amount: BigDecimal, submittedOn: String)

object UnmatchedCustomerSubmissions {
  implicit val format: OFormat[UnmatchedCustomerSubmissions] = Json.format[UnmatchedCustomerSubmissions]
}
