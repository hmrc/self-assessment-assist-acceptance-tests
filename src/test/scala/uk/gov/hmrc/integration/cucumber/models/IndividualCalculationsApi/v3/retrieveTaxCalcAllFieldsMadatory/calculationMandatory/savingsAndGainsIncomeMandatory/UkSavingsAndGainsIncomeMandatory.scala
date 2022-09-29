/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.savingsAndGainsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class UkSavingsAndGainsIncomeMandatory(incomeSourceId: String,
                                            incomeSourceType: String,
                                            incomeSourceName: String,
                                            grossIncome: BigDecimal,
                                            netIncome: BigDecimal,
                                            taxDeducted: BigDecimal)

object UkSavingsAndGainsIncomeMandatory {
  implicit val format: OFormat[UkSavingsAndGainsIncomeMandatory] = Json.format[UkSavingsAndGainsIncomeMandatory]
}