/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.OtherDeductionsApi

import play.api.libs.json.{Json, OFormat}

case class Seafarers(customerReference: Option[String], amountDeducted: BigDecimal, nameOfShip: String, fromDate: String, toDate: String)

object Seafarers {
  implicit val format: OFormat[Seafarers] = Json.format[Seafarers]
}
