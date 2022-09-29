/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.dividendsIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignDividends(incomeSourceType: Option[String],
                            countryCode: String,
                            grossIncome: Option[BigDecimal],
                            netIncome: Option[BigDecimal],
                            taxDeducted: Option[BigDecimal],
                            foreignTaxCreditRelief: Option[Boolean])

object ForeignDividends {
  implicit val format: OFormat[ForeignDividends] = Json.format[ForeignDividends]
}