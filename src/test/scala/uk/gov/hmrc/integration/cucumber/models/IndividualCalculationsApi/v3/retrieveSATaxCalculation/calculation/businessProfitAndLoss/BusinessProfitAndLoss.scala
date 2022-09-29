/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.businessProfitAndLoss

import play.api.libs.json._

case class BusinessProfitAndLoss(incomeSourceId: String,
                                 incomeSourceType: String,
                                 incomeSourceName: Option[String],
                                 totalIncome: Option[BigDecimal],
                                 totalExpenses: Option[BigDecimal],
                                 netProfit: Option[BigDecimal],
                                 netLoss: Option[BigDecimal],
                                 totalAdditions: Option[BigDecimal],
                                 totalDeductions: Option[BigDecimal],
                                 accountingAdjustments: Option[BigDecimal],
                                 taxableProfit: Option[BigInt],
                                 adjustedIncomeTaxLoss: Option[BigInt],
                                 totalBroughtForwardIncomeTaxLosses: Option[BigInt],
                                 lossForCSFHL: Option[BigInt],
                                 broughtForwardIncomeTaxLossesUsed: Option[BigInt],
                                 taxableProfitAfterIncomeTaxLossesDeduction: Option[BigInt],
                                 carrySidewaysIncomeTaxLossesUsed: Option[BigInt],
                                 broughtForwardCarrySidewaysIncomeTaxLossesUsed: Option[BigInt],
                                 totalIncomeTaxLossesCarriedForward: Option[BigInt],
                                 class4Loss: Option[BigInt],
                                 totalBroughtForwardClass4Losses: Option[BigInt],
                                 broughtForwardClass4LossesUsed: Option[BigInt],
                                 carrySidewaysClass4LossesUsed: Option[BigInt],
                                 totalClass4LossesCarriedForward: Option[BigInt])

object BusinessProfitAndLoss {
  implicit val reads: Reads[BusinessProfitAndLoss] = for {
    incomeSourceId                                 <- (JsPath \ "incomeSourceId").read[String]
    incomeSourceType                               <- (JsPath \ "incomeSourceType").read[String]
    incomeSourceName                               <- (JsPath \ "incomeSourceName").readNullable[String]
    totalIncome                                    <- (JsPath \ "totalIncome").readNullable[BigDecimal]
    totalExpenses                                  <- (JsPath \ "totalExpenses").readNullable[BigDecimal]
    netProfit                                      <- (JsPath \ "netProfit").readNullable[BigDecimal]
    netLoss                                        <- (JsPath \ "netLoss").readNullable[BigDecimal]
    totalAdditions                                 <- (JsPath \ "totalAdditions").readNullable[BigDecimal]
    totalDeductions                                <- (JsPath \ "totalDeductions").readNullable[BigDecimal]
    accountingAdjustments                          <- (JsPath \ "accountingAdjustments").readNullable[BigDecimal]
    taxableProfit                                  <- (JsPath \ "taxableProfit").readNullable[BigInt]
    adjustedIncomeTaxLoss                          <- (JsPath \ "adjustedIncomeTaxLoss").readNullable[BigInt]
    totalBroughtForwardIncomeTaxLosses             <- (JsPath \ "totalBroughtForwardIncomeTaxLosses").readNullable[BigInt]
    lossForCSFHL                                   <- (JsPath \ "lossForCSFHL").readNullable[BigInt]
    broughtForwardIncomeTaxLossesUsed              <- (JsPath \ "broughtForwardIncomeTaxLossesUsed").readNullable[BigInt]
    taxableProfitAfterIncomeTaxLossesDeduction     <- (JsPath \ "taxableProfitAfterIncomeTaxLossesDeduction").readNullable[BigInt]
    carrySidewaysIncomeTaxLossesUsed               <- (JsPath \ "carrySidewaysIncomeTaxLossesUsed").readNullable[BigInt]
    broughtForwardCarrySidewaysIncomeTaxLossesUsed <- (JsPath \ "broughtForwardCarrySidewaysIncomeTaxLossesUsed").readNullable[BigInt]
    totalIncomeTaxLossesCarriedForward             <- (JsPath \ "totalIncomeTaxLossesCarriedForward").readNullable[BigInt]
    class4Loss                                     <- (JsPath \ "class4Loss").readNullable[BigInt]
    totalBroughtForwardClass4Losses                <- (JsPath \ "totalBroughtForwardClass4Losses").readNullable[BigInt]
    broughtForwardClass4LossesUsed                 <- (JsPath \ "broughtForwardClass4LossesUsed").readNullable[BigInt]
    carrySidewaysClass4LossesUsed                  <- (JsPath \ "carrySidewaysClass4LossesUsed").readNullable[BigInt]
    totalClass4LossesCarriedForward                <- (JsPath \ "totalClass4LossesCarriedForward").readNullable[BigInt]

  } yield {
    BusinessProfitAndLoss(
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

  implicit val writes: OWrites[BusinessProfitAndLoss] = (o: BusinessProfitAndLoss) => {
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