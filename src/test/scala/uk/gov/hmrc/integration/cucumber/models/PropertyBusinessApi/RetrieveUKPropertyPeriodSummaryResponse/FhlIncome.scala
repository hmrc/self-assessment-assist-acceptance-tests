/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class FhlIncome(periodAmount: Option[BigDecimal], taxDeducted: Option[BigDecimal], rentARoom: Option[FhlIncomeRentARoom])

object FhlIncome {
  implicit val format: OFormat[FhlIncome] = Json.format[FhlIncome]
}
