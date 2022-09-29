/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class ShortServiceRefundBandsMandatory(name: String,
                                            rate: BigDecimal,
                                            bandLimit: BigInt,
                                            apportionedBandLimit: BigInt,
                                            shortServiceRefundAmount: BigDecimal,
                                            shortServiceRefundCharge: BigDecimal)

object ShortServiceRefundBandsMandatory {
  implicit val format: OFormat[ShortServiceRefundBandsMandatory] = Json.format[ShortServiceRefundBandsMandatory]
}
