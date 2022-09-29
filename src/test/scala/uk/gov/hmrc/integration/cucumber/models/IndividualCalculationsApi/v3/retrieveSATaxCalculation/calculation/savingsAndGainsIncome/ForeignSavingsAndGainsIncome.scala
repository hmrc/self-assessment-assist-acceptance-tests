/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.savingsAndGainsIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignSavingsAndGainsIncome(incomeSourceType: String,
                                        countryCode: Option[String],
                                        grossIncome: Option[BigDecimal],
                                        netIncome: Option[BigDecimal],
                                        taxDeducted: Option[BigDecimal],
                                        foreignTaxCreditRelief: Option[Boolean])

object ForeignSavingsAndGainsIncome {
  implicit val format: OFormat[ForeignSavingsAndGainsIncome] = Json.format[ForeignSavingsAndGainsIncome]
}