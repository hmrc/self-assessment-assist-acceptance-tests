/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class UkNonFhlProperty(income: Option[NonFhlIncome], expenses: Option[NonFhlExpenses])

object UkNonFhlProperty {
  implicit val format: OFormat[UkNonFhlProperty] = Json.format[UkNonFhlProperty]
}
