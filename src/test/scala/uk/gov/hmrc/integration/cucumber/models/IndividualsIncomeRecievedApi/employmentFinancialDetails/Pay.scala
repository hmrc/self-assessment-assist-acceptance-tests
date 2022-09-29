/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails

import play.api.libs.json.{Json, OFormat}

case class Pay(taxablePayToDate: Option[BigDecimal],
               totalTaxToDate: Option[BigDecimal],
               payFrequency: Option[String],
               paymentDate: Option[String],
               taxWeekNo: Option[Int],
               taxMonthNo: Option[Int])

object Pay {
  implicit val format: OFormat[Pay] = Json.format[Pay]
}
