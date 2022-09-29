/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ChargeableForeignBenefitsAndGiftsDetailMandatory(transactionBenefit: BigDecimal,
                                                            protectedForeignIncomeSourceBenefit: BigDecimal,
                                                            protectedForeignIncomeOnwardGift: BigDecimal,
                                                            benefitReceivedAsASettler: BigDecimal,
                                                            onwardGiftReceivedAsASettler: BigDecimal)

object ChargeableForeignBenefitsAndGiftsDetailMandatory {
  implicit val format: OFormat[ChargeableForeignBenefitsAndGiftsDetailMandatory] = Json.format[ChargeableForeignBenefitsAndGiftsDetailMandatory]
}