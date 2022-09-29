/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignIncomeMandatory(chargeableOverseasPensionsStateBenefitsRoyalties: BigDecimal,
                                  overseasPensionsStateBenefitsRoyaltiesDetail: Seq[OverseasPensionsStateBenefitsRoyaltiesDetailMandatory],
                                  chargeableAllOtherIncomeReceivedWhilstAbroad: BigDecimal,
                                  allOtherIncomeReceivedWhilstAbroadDetail: Seq[AllOtherIncomeReceivedWhilstAbroadDetailMandatory],
                                  overseasIncomeAndGains: OverseasIncomeAndGainsMandatory,
                                  totalForeignBenefitsAndGifts: BigDecimal,
                                  chargeableForeignBenefitsAndGiftsDetail: ChargeableForeignBenefitsAndGiftsDetailMandatory)

object ForeignIncomeMandatory {
  implicit val format: OFormat[ForeignIncomeMandatory] = Json.format[ForeignIncomeMandatory]
}