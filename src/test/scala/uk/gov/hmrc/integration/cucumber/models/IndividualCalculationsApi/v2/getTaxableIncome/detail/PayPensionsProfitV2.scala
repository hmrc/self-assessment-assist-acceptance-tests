/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.functional.syntax._
import play.api.libs.json._

case class PayPensionsProfitV2(incomeReceived: BigInt,
                               taxableIncome: BigInt,
                               totalSelfEmploymentProfit: Option[BigInt],
                               totalPropertyProfit: Option[BigInt],
                               totalFHLPropertyProfit: Option[BigInt],
                               totalUKOtherPropertyProfit: Option[BigInt],
                               totalForeignPropertyProfit: Option[BigInt],
                               totalEeaFhlProfit: Option[BigInt],
                               totalOccupationalPensionIncome: Option[BigDecimal],
                               totalStateBenefitsIncome: Option[BigDecimal],
                               totalBenefitsInKind: Option[BigDecimal],
                               totalPayeEmploymentAndLumpSumIncome: Option[BigDecimal],
                               totalEmploymentExpenses: Option[BigDecimal],
                               totalSeafarersDeduction: Option[BigDecimal],
                               totalForeignTaxOnForeignEmployment: Option[BigDecimal],
                               totalEmploymentIncome: Option[BigInt],
                               totalShareSchemesIncome: Option[BigDecimal],
                               totalOverseasPensionsStateBenefitsRoyalties: Option[BigDecimal],
                               totalAllOtherIncomeReceivedWhilstAbroad: Option[BigDecimal],
                               totalOverseasIncomeAndGains: Option[BigDecimal],
                               totalForeignBenefitsAndGifts: Option[BigDecimal],
                               tipsIncome: Option[BigDecimal],
                               businessProfitAndLoss: Option[BusinessProfitAndLossV2])

object PayPensionsProfitV2 {

  case class Part1(incomeReceived: BigInt,
                   taxableIncome: BigInt,
                   totalSelfEmploymentProfit: Option[BigInt],
                   totalPropertyProfit: Option[BigInt],
                   totalFHLPropertyProfit: Option[BigInt],
                   totalUKOtherPropertyProfit: Option[BigInt],
                   totalForeignPropertyProfit: Option[BigInt],
                   totalEeaFhlProfit: Option[BigInt],
                   totalOccupationalPensionIncome: Option[BigDecimal],
                   totalStateBenefitsIncome: Option[BigDecimal],
                   totalBenefitsInKind: Option[BigDecimal],
                   totalPayeEmploymentAndLumpSumIncome: Option[BigDecimal],
                   totalEmploymentExpenses: Option[BigDecimal],
                   totalSeafarersDeduction: Option[BigDecimal],
                   totalForeignTaxOnForeignEmployment: Option[BigDecimal],
                   totalEmploymentIncome: Option[BigInt],
                   totalShareSchemesIncome: Option[BigDecimal],
                   totalOverseasPensionsStateBenefitsRoyalties: Option[BigDecimal],
                   totalAllOtherIncomeReceivedWhilstAbroad: Option[BigDecimal],
                   totalOverseasIncomeAndGains: Option[BigDecimal],
                   totalForeignBenefitsAndGifts: Option[BigDecimal],
                   tipsIncome: Option[BigDecimal])

  case class Part2(businessProfitAndLoss: Option[BusinessProfitAndLossV2])

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
