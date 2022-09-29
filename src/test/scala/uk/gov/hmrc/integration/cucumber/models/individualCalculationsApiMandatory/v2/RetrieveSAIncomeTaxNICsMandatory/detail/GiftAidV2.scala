/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class GiftAidV2(grossGiftAidPayments: BigInt,
                     rate: BigDecimal,
                     giftAidTax: BigDecimal,
                     giftAidTaxReductions: BigDecimal,
                     incomeTaxChargedAfterGiftAidTaxReductions: BigDecimal,
                     giftAidCharge: BigDecimal)

object GiftAidV2 {
  implicit val format: OFormat[GiftAidV2] = Json.format[GiftAidV2]
}
