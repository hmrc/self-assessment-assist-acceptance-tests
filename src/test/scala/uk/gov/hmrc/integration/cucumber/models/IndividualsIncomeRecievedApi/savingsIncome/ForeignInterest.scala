/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.savingsIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignInterest(amountBeforeTax: Option[BigDecimal],
                           countryCode: String,
                           taxTakenOff: Option[BigDecimal],
                           specialWithholdingTax: Option[BigDecimal],
                           taxableAmount: BigDecimal,
                           foreignTaxCreditRelief: Boolean)

object ForeignInterest {
  implicit val format: OFormat[ForeignInterest] = Json.format[ForeignInterest]
}
