/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignNonFhlProperty

import play.api.libs.json.{Json, OFormat}

case class ForeignNonFhlPropertyRentIncome(rentAmount: Option[BigDecimal])

object ForeignNonFhlPropertyRentIncome {
  implicit val format: OFormat[ForeignNonFhlPropertyRentIncome] = Json.format[ForeignNonFhlPropertyRentIncome]
}
