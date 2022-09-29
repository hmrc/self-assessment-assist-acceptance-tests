/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json.{Json, OFormat}

case class GiftAidV2(grossGiftAidPayments: BigInt,
                     rate: BigDecimal,
                     giftAidTax: BigDecimal,
                     giftAidTaxReductions: Option[BigDecimal],
                     incomeTaxChargedAfterGiftAidTaxReductions: Option[BigDecimal],
                     giftAidCharge: Option[BigDecimal])

object GiftAidV2 {
  implicit val format: OFormat[GiftAidV2] = Json.format[GiftAidV2]
}
