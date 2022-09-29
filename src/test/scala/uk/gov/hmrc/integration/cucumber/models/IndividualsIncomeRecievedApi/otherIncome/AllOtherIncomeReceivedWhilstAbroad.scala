/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherIncome

import play.api.libs.json.{Json, OFormat}

case class AllOtherIncomeReceivedWhilstAbroad(countryCode: String,
                                              amountBeforeTax: Option[BigDecimal],
                                              taxTakenOff: Option[BigDecimal],
                                              specialWithholdingTax: Option[BigDecimal],
                                              foreignTaxCreditRelief: Boolean,
                                              taxableAmount: BigDecimal,
                                              residentialFinancialCostAmount: Option[BigDecimal],
                                              broughtFwdResidentialFinancialCostAmount: Option[BigDecimal])

object AllOtherIncomeReceivedWhilstAbroad {
  implicit val format: OFormat[AllOtherIncomeReceivedWhilstAbroad] = Json.format[AllOtherIncomeReceivedWhilstAbroad]
}
