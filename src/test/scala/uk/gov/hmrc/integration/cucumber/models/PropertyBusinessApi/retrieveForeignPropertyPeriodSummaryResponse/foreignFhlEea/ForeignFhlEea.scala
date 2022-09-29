/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignFhlEea

import play.api.libs.json.{Json, OFormat}

case class ForeignFhlEea(income: Option[ForeignFhlEeaIncome], expenses: Option[ForeignFhlEeaExpenses])

object ForeignFhlEea {
  implicit val format: OFormat[ForeignFhlEea] = Json.format[ForeignFhlEea]
}
