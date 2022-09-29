/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignPropertyIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyIncomeMandatory(incomeSourceId: String,
                                          incomeSourceType: String,
                                          countryCode: String,
                                          totalIncome: BigDecimal,
                                          totalExpenses: BigDecimal,
                                          netProfit: BigDecimal,
                                          netLoss: BigDecimal,
                                          totalAdditions: BigDecimal,
                                          totalDeductions: BigDecimal,
                                          taxableProfit: BigDecimal,
                                          adjustedIncomeTaxLoss: BigDecimal)

object ForeignPropertyIncomeMandatory {
  implicit val format: OFormat[ForeignPropertyIncomeMandatory] = Json.format[ForeignPropertyIncomeMandatory]
}