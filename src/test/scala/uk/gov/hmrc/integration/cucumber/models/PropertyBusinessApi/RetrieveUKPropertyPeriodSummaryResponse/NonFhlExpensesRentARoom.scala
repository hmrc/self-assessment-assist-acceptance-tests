/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class NonFhlExpensesRentARoom(amountClaimed: Option[BigDecimal])

object NonFhlExpensesRentARoom {
  implicit val format: OFormat[NonFhlExpensesRentARoom] = Json.format[NonFhlExpensesRentARoom]
}
