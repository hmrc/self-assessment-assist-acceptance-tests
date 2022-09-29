/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.giftAidMandatory

import play.api.libs.json.{Json, OFormat}

case class GiftAidMandatory(grossGiftAidPayments: BigInt,
                            rate: BigDecimal,
                            giftAidTax: BigDecimal,
                            giftAidTaxReductions: BigDecimal,
                            incomeTaxChargedAfterGiftAidTaxReductions: BigDecimal,
                            giftAidCharge: BigDecimal)

object GiftAidMandatory {
  implicit val format: OFormat[GiftAidMandatory] = Json.format[GiftAidMandatory]
}