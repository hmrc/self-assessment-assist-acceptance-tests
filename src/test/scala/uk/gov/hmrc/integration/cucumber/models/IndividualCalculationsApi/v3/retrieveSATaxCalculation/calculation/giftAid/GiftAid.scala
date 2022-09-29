/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.giftAid

import play.api.libs.json.{Json, OFormat}

case class GiftAid(grossGiftAidPayments: BigInt,
                   rate: BigDecimal,
                   giftAidTax: BigDecimal,
                   giftAidTaxReductions: Option[BigDecimal],
                   incomeTaxChargedAfterGiftAidTaxReductions: Option[BigDecimal],
                   giftAidCharge: Option[BigDecimal])

object GiftAid {
  implicit val format: OFormat[GiftAid] = Json.format[GiftAid]
}