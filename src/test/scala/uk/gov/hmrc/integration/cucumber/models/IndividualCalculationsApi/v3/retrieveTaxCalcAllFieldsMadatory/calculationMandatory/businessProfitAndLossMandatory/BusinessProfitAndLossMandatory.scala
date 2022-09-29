/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.businessProfitAndLossMandatory

import play.api.libs.json._

case class BusinessProfitAndLossMandatory(incomeSourceId: String,
                                          incomeSourceType: String,
                                          incomeSourceName: String,
                                          totalIncome: BigDecimal,
                                          totalExpenses: BigDecimal,
                                          netProfit: BigDecimal,
                                          netLoss: BigDecimal,
                                          totalAdditions: BigDecimal,
                                          totalDeductions: BigDecimal,
                                          accountingAdjustments: BigDecimal,
                                          taxableProfit: BigInt,
                                          adjustedIncomeTaxLoss: BigInt,
                                          totalBroughtForwardIncomeTaxLosses: BigInt,
                                          lossForCSFHL: BigInt,
                                          broughtForwardIncomeTaxLossesUsed: BigInt,
                                          taxableProfitAfterIncomeTaxLossesDeduction: BigInt,
                                          carrySidewaysIncomeTaxLossesUsed: BigInt,
                                          broughtForwardCarrySidewaysIncomeTaxLossesUsed: BigInt,
                                          totalIncomeTaxLossesCarriedForward: BigInt,
                                          class4Loss: BigInt,
                                          totalBroughtForwardClass4Losses: BigInt,
                                          broughtForwardClass4LossesUsed: BigInt,
                                          carrySidewaysClass4LossesUsed: BigInt,
                                          totalClass4LossesCarriedForward: BigInt)

object BusinessProfitAndLossMandatory {
  implicit val reads: Reads[BusinessProfitAndLossMandatory] = for {
    incomeSourceId                                 <- (JsPath \ "incomeSourceId").read[String]
    incomeSourceType                               <- (JsPath \ "incomeSourceType").read[String]
    incomeSourceName                               <- (JsPath \ "incomeSourceName").read[String]
    totalIncome                                    <- (JsPath \ "totalIncome").read[BigDecimal]
    totalExpenses                                  <- (JsPath \ "totalExpenses").read[BigDecimal]
    netProfit                                      <- (JsPath \ "netProfit").read[BigDecimal]
    netLoss                                        <- (JsPath \ "netLoss").read[BigDecimal]
    totalAdditions                                 <- (JsPath \ "totalAdditions").read[BigDecimal]
    totalDeductions                                <- (JsPath \ "totalDeductions").read[BigDecimal]
    accountingAdjustments                          <- (JsPath \ "accountingAdjustments").read[BigDecimal]
    taxableProfit                                  <- (JsPath \ "taxableProfit").read[BigInt]
    adjustedIncomeTaxLoss                          <- (JsPath \ "adjustedIncomeTaxLoss").read[BigInt]
    totalBroughtForwardIncomeTaxLosses             <- (JsPath \ "totalBroughtForwardIncomeTaxLosses").read[BigInt]
    lossForCSFHL                                   <- (JsPath \ "lossForCSFHL").read[BigInt]
    broughtForwardIncomeTaxLossesUsed              <- (JsPath \ "broughtForwardIncomeTaxLossesUsed").read[BigInt]
    taxableProfitAfterIncomeTaxLossesDeduction     <- (JsPath \ "taxableProfitAfterIncomeTaxLossesDeduction").read[BigInt]
    carrySidewaysIncomeTaxLossesUsed               <- (JsPath \ "carrySidewaysIncomeTaxLossesUsed").read[BigInt]
    broughtForwardCarrySidewaysIncomeTaxLossesUsed <- (JsPath \ "broughtForwardCarrySidewaysIncomeTaxLossesUsed").read[BigInt]
    totalIncomeTaxLossesCarriedForward             <- (JsPath \ "totalIncomeTaxLossesCarriedForward").read[BigInt]
    class4Loss                                     <- (JsPath \ "class4Loss").read[BigInt]
    totalBroughtForwardClass4Losses                <- (JsPath \ "totalBroughtForwardClass4Losses").read[BigInt]
    broughtForwardClass4LossesUsed                 <- (JsPath \ "broughtForwardClass4LossesUsed").read[BigInt]
    carrySidewaysClass4LossesUsed                  <- (JsPath \ "carrySidewaysClass4LossesUsed").read[BigInt]
    totalClass4LossesCarriedForward                <- (JsPath \ "totalClass4LossesCarriedForward").read[BigInt]

  } yield {
    BusinessProfitAndLossMandatory(
      incomeSourceId = incomeSourceId,
      incomeSourceType = incomeSourceType,
      incomeSourceName = incomeSourceName,
      totalIncome = totalIncome,
      totalExpenses = totalExpenses,
      netProfit = netProfit,
      netLoss = netLoss,
      totalAdditions = totalAdditions,
      totalDeductions = totalDeductions,
      accountingAdjustments = accountingAdjustments,
      taxableProfit = taxableProfit,
      adjustedIncomeTaxLoss = adjustedIncomeTaxLoss,
      totalBroughtForwardIncomeTaxLosses = totalBroughtForwardIncomeTaxLosses,
      lossForCSFHL = lossForCSFHL,
      broughtForwardIncomeTaxLossesUsed = broughtForwardIncomeTaxLossesUsed,
      taxableProfitAfterIncomeTaxLossesDeduction = taxableProfitAfterIncomeTaxLossesDeduction,
      carrySidewaysIncomeTaxLossesUsed = carrySidewaysIncomeTaxLossesUsed,
      broughtForwardCarrySidewaysIncomeTaxLossesUsed = broughtForwardCarrySidewaysIncomeTaxLossesUsed,
      totalIncomeTaxLossesCarriedForward = totalIncomeTaxLossesCarriedForward,
      class4Loss = class4Loss,
      totalBroughtForwardClass4Losses = totalBroughtForwardClass4Losses,
      broughtForwardClass4LossesUsed = broughtForwardClass4LossesUsed,
      carrySidewaysClass4LossesUsed = carrySidewaysClass4LossesUsed,
      totalClass4LossesCarriedForward = totalClass4LossesCarriedForward
    )
  }

  implicit val writes: OWrites[BusinessProfitAndLossMandatory] = (o: BusinessProfitAndLossMandatory) => {
    JsObject(
      Map(
        "incomeSourceId"                                 -> Json.toJson(o.incomeSourceId),
        "incomeSourceType"                               -> Json.toJson(o.incomeSourceType),
        "incomeSourceName"                               -> Json.toJson(o.incomeSourceName),
        "totalIncome"                                    -> Json.toJson(o.totalIncome),
        "totalExpenses"                                  -> Json.toJson(o.totalExpenses),
        "netProfit"                                      -> Json.toJson(o.netProfit),
        "netLoss"                                        -> Json.toJson(o.netLoss),
        "totalAdditions"                                 -> Json.toJson(o.totalAdditions),
        "totalDeductions"                                -> Json.toJson(o.totalDeductions),
        "accountingAdjustments"                          -> Json.toJson(o.accountingAdjustments),
        "taxableProfit"                                  -> Json.toJson(o.taxableProfit),
        "adjustedIncomeTaxLoss"                          -> Json.toJson(o.adjustedIncomeTaxLoss),
        "totalBroughtForwardIncomeTaxLosses"             -> Json.toJson(o.totalBroughtForwardIncomeTaxLosses),
        "lossForCSFHL"                                   -> Json.toJson(o.lossForCSFHL),
        "broughtForwardIncomeTaxLossesUsed"              -> Json.toJson(o.broughtForwardIncomeTaxLossesUsed),
        "taxableProfitAfterIncomeTaxLossesDeduction"     -> Json.toJson(o.taxableProfitAfterIncomeTaxLossesDeduction),
        "carrySidewaysIncomeTaxLossesUsed"               -> Json.toJson(o.carrySidewaysIncomeTaxLossesUsed),
        "broughtForwardCarrySidewaysIncomeTaxLossesUsed" -> Json.toJson(o.broughtForwardCarrySidewaysIncomeTaxLossesUsed),
        "totalIncomeTaxLossesCarriedForward"             -> Json.toJson(o.totalIncomeTaxLossesCarriedForward),
        "class4Loss"                                     -> Json.toJson(o.class4Loss),
        "totalBroughtForwardClass4Losses"                -> Json.toJson(o.totalBroughtForwardClass4Losses),
        "broughtForwardClass4LossesUsed"                 -> Json.toJson(o.broughtForwardClass4LossesUsed),
        "carrySidewaysClass4LossesUsed"                  -> Json.toJson(o.carrySidewaysClass4LossesUsed),
        "totalClass4LossesCarriedForward"                -> Json.toJson(o.totalClass4LossesCarriedForward)
      ).filterNot { case (_, value) =>
        value == JsNull
      }
    )
  }
}