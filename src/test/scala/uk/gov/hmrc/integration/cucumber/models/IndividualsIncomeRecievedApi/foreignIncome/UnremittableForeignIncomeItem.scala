/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.foreignIncome

import play.api.libs.json.{Json, OFormat}

case class UnremittableForeignIncomeItem(countryCode: String, amountInForeignCurrency: BigDecimal, amountTaxPaid: Option[BigDecimal])

object UnremittableForeignIncomeItem {
  implicit val format: OFormat[UnremittableForeignIncomeItem] = Json.format[UnremittableForeignIncomeItem]
}
