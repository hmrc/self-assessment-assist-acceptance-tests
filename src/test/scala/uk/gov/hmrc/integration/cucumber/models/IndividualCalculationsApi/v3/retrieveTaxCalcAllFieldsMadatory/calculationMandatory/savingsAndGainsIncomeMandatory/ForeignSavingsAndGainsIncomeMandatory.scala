/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.savingsAndGainsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignSavingsAndGainsIncomeMandatory(incomeSourceType: String,
                                                 countryCode: String,
                                                 grossIncome: BigDecimal,
                                                 netIncome: BigDecimal,
                                                 taxDeducted: BigDecimal,
                                                 foreignTaxCreditRelief: Boolean)

object ForeignSavingsAndGainsIncomeMandatory {
  implicit val format: OFormat[ForeignSavingsAndGainsIncomeMandatory] = Json.format[ForeignSavingsAndGainsIncomeMandatory]
}