/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.pensionsIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignPensions(countryCode: String,
                           amountBeforeTax: Option[BigDecimal],
                           taxTakenOff: Option[BigDecimal],
                           specialWithholdingTax: Option[BigDecimal],
                           foreignTaxCreditRelief: Boolean,
                           taxableAmount: BigDecimal)

object ForeignPensions {
  implicit val format: OFormat[ForeignPensions] = Json.format[ForeignPensions]
}
