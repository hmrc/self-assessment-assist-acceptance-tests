/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignNonFhlProperty

import play.api.libs.json.{Json, OFormat}

case class ForeignNonFhlProperty(countryCode: String, income: Option[ForeignNonFhlPropertyIncome], expenses: Option[ForeignNonFhlPropertyExpenses])

object ForeignNonFhlProperty {
  implicit val format: OFormat[ForeignNonFhlProperty] = Json.format[ForeignNonFhlProperty]
}
