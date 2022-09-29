/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.foreignPropertyIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyIncome(incomeSourceId: String,
                                 incomeSourceType: String,
                                 countryCode: String,
                                 totalIncome: Option[BigDecimal],
                                 totalExpenses: Option[BigDecimal],
                                 netProfit: Option[BigDecimal],
                                 netLoss: Option[BigDecimal],
                                 totalAdditions: Option[BigDecimal],
                                 totalDeductions: Option[BigDecimal],
                                 taxableProfit: Option[BigDecimal],
                                 adjustedIncomeTaxLoss: Option[BigDecimal])

object ForeignPropertyIncome {
  implicit val format: OFormat[ForeignPropertyIncome] = Json.format[ForeignPropertyIncome]
}