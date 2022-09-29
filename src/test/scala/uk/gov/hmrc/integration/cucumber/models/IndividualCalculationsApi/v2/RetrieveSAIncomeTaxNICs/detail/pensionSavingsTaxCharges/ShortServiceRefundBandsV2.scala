/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class ShortServiceRefundBandsV2(name: String,
                                     rate: BigDecimal,
                                     bandLimit: BigInt,
                                     apportionedBandLimit: BigInt,
                                     shortServiceRefundAmount: BigDecimal,
                                     shortServiceRefundCharge: BigDecimal)

object ShortServiceRefundBandsV2 {
  implicit val format: OFormat[ShortServiceRefundBandsV2] = Json.format[ShortServiceRefundBandsV2]
}
