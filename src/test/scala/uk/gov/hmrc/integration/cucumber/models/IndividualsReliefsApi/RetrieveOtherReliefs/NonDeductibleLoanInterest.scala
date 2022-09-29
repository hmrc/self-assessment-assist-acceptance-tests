/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs

import play.api.libs.json.{Json, OFormat}

case class NonDeductibleLoanInterest(customerReference: Option[String], reliefClaimed: BigDecimal)

object NonDeductibleLoanInterest {
  implicit val format: OFormat[NonDeductibleLoanInterest] = Json.format[NonDeductibleLoanInterest]
}
