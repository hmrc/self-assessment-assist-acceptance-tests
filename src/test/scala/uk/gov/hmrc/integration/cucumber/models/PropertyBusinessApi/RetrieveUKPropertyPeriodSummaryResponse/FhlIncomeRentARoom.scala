/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class FhlIncomeRentARoom(rentsReceived: Option[BigDecimal])

object FhlIncomeRentARoom {
  implicit val format: OFormat[FhlIncomeRentARoom] = Json.format[FhlIncomeRentARoom]
}
