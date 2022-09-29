/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherIncome

import play.api.libs.json.{Json, OFormat}

case class ChargeableForeignBenefitsAndGifts(transactionBenefit: Option[BigDecimal],
                                             protectedForeignIncomeSourceBenefit: Option[BigDecimal],
                                             protectedForeignIncomeOnwardGift: Option[BigDecimal],
                                             benefitReceivedAsASettler: Option[BigDecimal],
                                             onwardGiftReceivedAsASettler: Option[BigDecimal])

object ChargeableForeignBenefitsAndGifts {
  implicit val format: OFormat[ChargeableForeignBenefitsAndGifts] = Json.format[ChargeableForeignBenefitsAndGifts]
}
