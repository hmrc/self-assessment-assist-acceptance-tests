/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.dividendsIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignDividend(countryCode: String,
                           amountBeforeTax: Option[BigDecimal],
                           taxTakenOff: Option[BigDecimal],
                           specialWithholdingTax: Option[BigDecimal],
                           foreignTaxCreditRelief: Boolean,
                           taxableAmount: BigDecimal)

object ForeignDividend {
  implicit val format: OFormat[ForeignDividend] = Json.format[ForeignDividend]
}
