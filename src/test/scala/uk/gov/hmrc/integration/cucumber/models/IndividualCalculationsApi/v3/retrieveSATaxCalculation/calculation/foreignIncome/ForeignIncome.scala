/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.foreignIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignIncome(chargeableOverseasPensionsStateBenefitsRoyalties: Option[BigDecimal],
                         overseasPensionsStateBenefitsRoyaltiesDetail: Option[Seq[OverseasPensionsStateBenefitsRoyaltiesDetail]],
                         chargeableAllOtherIncomeReceivedWhilstAbroad: Option[BigDecimal],
                         allOtherIncomeReceivedWhilstAbroadDetail: Option[Seq[AllOtherIncomeReceivedWhilstAbroadDetail]],
                         overseasIncomeAndGains: Option[OverseasIncomeAndGains],
                         totalForeignBenefitsAndGifts: Option[BigDecimal],
                         chargeableForeignBenefitsAndGiftsDetail: Option[ChargeableForeignBenefitsAndGiftsDetail])

object ForeignIncome {
  implicit val format: OFormat[ForeignIncome] = Json.format[ForeignIncome]
}