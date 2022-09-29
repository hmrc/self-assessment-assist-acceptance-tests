/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class NonFhlIncomeRentARoom(rentsReceived: Option[BigDecimal])

object NonFhlIncomeRentARoom {
  implicit val format: OFormat[NonFhlIncomeRentARoom] = Json.format[NonFhlIncomeRentARoom]
}
