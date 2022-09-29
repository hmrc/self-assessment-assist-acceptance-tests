/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class UkFhlProperty(income: Option[FhlIncome], expenses: Option[FhlExpenses])

object UkFhlProperty {
  implicit val format: OFormat[UkFhlProperty] = Json.format[UkFhlProperty]
}
