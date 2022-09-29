/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.foreignIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignEarnings(customerReference: Option[String], earningsNotTaxableUK: BigDecimal)

object ForeignEarnings {
  implicit val format: OFormat[ForeignEarnings] = Json.format[ForeignEarnings]
}
