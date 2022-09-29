/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.capitalGainsTax

import play.api.libs.json.{Json, OFormat}

case class CgtTaxBands(name: String,
                       rate:BigDecimal,
                       income: BigDecimal,
                       taxAmount: BigDecimal)

object CgtTaxBands {
  implicit val format: OFormat[CgtTaxBands] = Json.format[CgtTaxBands]
}