/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.foreignIncome

import play.api.libs.json.{Json, OFormat}

case class ChargeableForeignBenefitsAndGiftsDetail(transactionBenefit: Option[BigDecimal],
                                                   protectedForeignIncomeSourceBenefit: Option[BigDecimal],
                                                   protectedForeignIncomeOnwardGift: Option[BigDecimal],
                                                   benefitReceivedAsASettler: Option[BigDecimal],
                                                   onwardGiftReceivedAsASettler: Option[BigDecimal])

object ChargeableForeignBenefitsAndGiftsDetail {
  implicit val format: OFormat[ChargeableForeignBenefitsAndGiftsDetail] = Json.format[ChargeableForeignBenefitsAndGiftsDetail]
}