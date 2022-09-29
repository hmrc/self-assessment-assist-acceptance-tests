/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.incomeTax

import play.api.libs.json.{Json, OFormat}

case class TaxBands(name: String,
                    rate: BigDecimal,
                    bandLimit: BigInt,
                    apportionedBandLimit: BigInt,
                    income: BigInt,
                    taxAmount: BigDecimal)

object TaxBands {
  implicit val format: OFormat[TaxBands] = Json.format[TaxBands]
}