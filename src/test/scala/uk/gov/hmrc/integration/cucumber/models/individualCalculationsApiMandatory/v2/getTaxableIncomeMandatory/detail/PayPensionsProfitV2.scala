/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.functional.syntax._
import play.api.libs.json._

case class PayPensionsProfitV2(incomeReceived: BigInt,
                               taxableIncome: BigInt,
                               totalSelfEmploymentProfit: BigInt,
                               totalPropertyProfit: BigInt,
                               totalFHLPropertyProfit: BigInt,
                               totalUKOtherPropertyProfit: BigInt,
                               totalForeignPropertyProfit: BigInt,
                               totalEeaFhlProfit: BigInt,
                               totalOccupationalPensionIncome: BigDecimal,
                               totalStateBenefitsIncome: BigDecimal,
                               totalBenefitsInKind: BigDecimal,
                               totalPayeEmploymentAndLumpSumIncome: BigDecimal,
                               totalEmploymentExpenses: BigDecimal,
                               totalSeafarersDeduction: BigDecimal,
                               totalForeignTaxOnForeignEmployment: BigDecimal,
                               totalEmploymentIncome: BigInt,
                               totalShareSchemesIncome: BigDecimal,
                               totalOverseasPensionsStateBenefitsRoyalties: BigDecimal,
                               totalAllOtherIncomeReceivedWhilstAbroad: BigDecimal,
                               totalOverseasIncomeAndGains: BigDecimal,
                               totalForeignBenefitsAndGifts: BigDecimal,
                               tipsIncome: BigDecimal,
                               businessProfitAndLoss: BusinessProfitAndLossV2)

object PayPensionsProfitV2 {

  case class Part1(incomeReceived: BigInt,
                   taxableIncome: BigInt,
                   totalSelfEmploymentProfit: BigInt,
                   totalPropertyProfit: BigInt,
                   totalFHLPropertyProfit: BigInt,
                   totalUKOtherPropertyProfit: BigInt,
                   totalForeignPropertyProfit: BigInt,
                   totalEeaFhlProfit: BigInt,
                   totalOccupationalPensionIncome: BigDecimal,
                   totalStateBenefitsIncome: BigDecimal,
                   totalBenefitsInKind: BigDecimal,
                   totalPayeEmploymentAndLumpSumIncome: BigDecimal,
                   totalEmploymentExpenses: BigDecimal,
                   totalSeafarersDeduction: BigDecimal,
                   totalForeignTaxOnForeignEmployment: BigDecimal,
                   totalEmploymentIncome: BigInt,
                   totalShareSchemesIncome: BigDecimal,
                   totalOverseasPensionsStateBenefitsRoyalties: BigDecimal,
                   totalAllOtherIncomeReceivedWhilstAbroad: BigDecimal,
                   totalOverseasIncomeAndGains: BigDecimal,
                   totalForeignBenefitsAndGifts: BigDecimal,
                   tipsIncome: BigDecimal)

  case class Part2(businessProfitAndLoss: BusinessProfitAndLossV2)

  def partApply(part1: Part1, part2: Part2): PayPensionsProfitV2 = {
    import part1._
    import part2._

    PayPensionsProfitV2(
      incomeReceived,
      taxableIncome,
      totalSelfEmploymentProfit,
      totalPropertyProfit,
      totalFHLPropertyProfit,
      totalUKOtherPropertyProfit,
      totalForeignPropertyProfit,
      totalEeaFhlProfit,
      totalOccupationalPensionIncome,
      totalStateBenefitsIncome,
      totalBenefitsInKind,
      totalPayeEmploymentAndLumpSumIncome,
      totalEmploymentExpenses,
      totalSeafarersDeduction,
      totalForeignTaxOnForeignEmployment,
      totalEmploymentIncome,
      totalShareSchemesIncome,
      totalOverseasPensionsStateBenefitsRoyalties,
      totalAllOtherIncomeReceivedWhilstAbroad,
      totalOverseasIncomeAndGains,
      totalForeignBenefitsAndGifts,
      tipsIncome,
      businessProfitAndLoss
    )
  }

  def partUnapply(ppp: PayPensionsProfitV2): JsObject = {
    import ppp._

    Json.toJsObject(
      Part1(
        incomeReceived,
        taxableIncome,
        totalSelfEmploymentProfit,
        totalPropertyProfit,
        totalFHLPropertyProfit,
        totalUKOtherPropertyProfit,
        totalForeignPropertyProfit,
        totalEeaFhlProfit,
        totalOccupationalPensionIncome,
        totalStateBenefitsIncome,
        totalBenefitsInKind,
        totalPayeEmploymentAndLumpSumIncome,
        totalEmploymentExpenses,
        totalSeafarersDeduction,
        totalForeignTaxOnForeignEmployment,
        totalEmploymentIncome,
        totalShareSchemesIncome,
        totalOverseasPensionsStateBenefitsRoyalties,
        totalAllOtherIncomeReceivedWhilstAbroad,
        totalOverseasIncomeAndGains,
        totalForeignBenefitsAndGifts,
        tipsIncome
      ))(Json.writes[Part1]) ++
      Json.toJsObject(
        Part2(
          businessProfitAndLoss
        )
      )(Json.writes[Part2])
  }

  implicit val reads: Reads[PayPensionsProfitV2] = (
    JsPath.read[Part1](Json.reads[Part1]) and
      JsPath.read[Part2](Json.reads[Part2])
  )(partApply _)

  implicit val writes: OWrites[PayPensionsProfitV2] = new OWrites[PayPensionsProfitV2] {
    override def writes(o: PayPensionsProfitV2): JsObject = partUnapply(o)
  }

}
