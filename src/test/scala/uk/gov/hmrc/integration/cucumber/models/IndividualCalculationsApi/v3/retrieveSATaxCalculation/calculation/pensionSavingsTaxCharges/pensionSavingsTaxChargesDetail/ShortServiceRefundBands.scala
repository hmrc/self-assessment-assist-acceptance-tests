/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class ShortServiceRefundBands(name: String,
                                   rate: BigDecimal,
                                   bandLimit: BigInt,
                                   apportionedBandLimit: BigInt,
                                   shortServiceRefundAmount: BigDecimal,
                                   shortServiceRefundCharge: BigDecimal)

object ShortServiceRefundBands {
  implicit val format: OFormat[ShortServiceRefundBands] = Json.format[ShortServiceRefundBands]
}
