/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs

import play.api.libs.json.{Json, OFormat}

case class QualifyingLoanInterestPayments(customerReference: String, lenderName: Option[String], reliefClaimed: BigDecimal)

object QualifyingLoanInterestPayments {
  implicit val format: OFormat[QualifyingLoanInterestPayments] = Json.format[QualifyingLoanInterestPayments]
}
