/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.savingsAndGainsIncome

import play.api.libs.json.{Json, OFormat}

case class UkSavingsAndGainsIncome(incomeSourceId: Option[String],
                                   incomeSourceType: String,
                                   incomeSourceName: Option[String],
                                   grossIncome: BigDecimal,
                                   netIncome: Option[BigDecimal],
                                   taxDeducted: Option[BigDecimal])

object UkSavingsAndGainsIncome {
  implicit val format: OFormat[UkSavingsAndGainsIncome] = Json.format[UkSavingsAndGainsIncome]
}