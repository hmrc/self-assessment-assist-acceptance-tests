/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class FhlExpensesRentARoom(amountClaimed: Option[BigDecimal])

object FhlExpensesRentARoom {
  implicit val format: OFormat[FhlExpensesRentARoom] = Json.format[FhlExpensesRentARoom]
}
