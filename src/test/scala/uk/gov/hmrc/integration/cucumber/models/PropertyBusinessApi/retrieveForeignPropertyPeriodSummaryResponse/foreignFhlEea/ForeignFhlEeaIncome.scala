/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignFhlEea

import play.api.libs.json.{Json, OFormat}

case class ForeignFhlEeaIncome(rentAmount: Option[BigDecimal])

object ForeignFhlEeaIncome {
  implicit val format: OFormat[ForeignFhlEeaIncome] = Json.format[ForeignFhlEeaIncome]
}
