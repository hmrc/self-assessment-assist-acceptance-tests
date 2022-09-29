/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.dividendsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class DividendIncomeReceivedWhilstAbroadMandatory(incomeSourceType: String,
                                                       countryCode: String,
                                                       grossIncome: BigDecimal,
                                                       netIncome: BigDecimal,
                                                       taxDeducted: BigDecimal,
                                                       foreignTaxCreditRelief: Boolean)

object DividendIncomeReceivedWhilstAbroadMandatory {
  implicit val format: OFormat[DividendIncomeReceivedWhilstAbroadMandatory] = Json.format[DividendIncomeReceivedWhilstAbroadMandatory]
}