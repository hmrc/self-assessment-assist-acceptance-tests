/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails

import play.api.libs.json.{Json, OFormat}

case class CustomerEstimatedPay(amount: Option[BigDecimal])

object CustomerEstimatedPay {
  implicit val format: OFormat[CustomerEstimatedPay] = Json.format[CustomerEstimatedPay]
}
