/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsExpensesApi.Other

import play.api.libs.json.{Json, OFormat}

case class Royalties(customerReference: Option[String], expenseAmount: BigDecimal)

object Royalties {
  implicit val format: OFormat[Royalties] = Json.format[Royalties]
}
