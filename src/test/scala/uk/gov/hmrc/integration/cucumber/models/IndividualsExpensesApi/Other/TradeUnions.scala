/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsExpensesApi.Other

import play.api.libs.json.{Json, OFormat}

case class TradeUnions(customerReference: Option[String], expenseAmount: BigDecimal)

object TradeUnions {
  implicit val format: OFormat[TradeUnions] = Json.format[TradeUnions]
}
