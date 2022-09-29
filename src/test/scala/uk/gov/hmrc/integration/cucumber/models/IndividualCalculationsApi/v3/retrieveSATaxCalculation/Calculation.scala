/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.allowancesAndDeductions.AllowancesAndDeductions
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.businessProfitAndLoss.BusinessProfitAndLoss
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.chargeableEventGainsIncome.ChargeableEventGainsIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.codedOutUnderpayments.CodedOutUnderpayments
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.dividendsIncome.DividendsIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.EmploymentAndPensionsIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentExpenses.EmploymentExpenses
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.endOfYearEstimate.EndOfYearEstimate
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.foreignIncome.ForeignIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.foreignPropertyIncome.ForeignPropertyIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.foreignTaxForFtcrNotClaimed.ForeignTaxForFtcrNotClaimed
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.giftAid.GiftAid
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.incomeSummaryTotals.IncomeSummaryTotals
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.lossesAndClaims.LossesAndClaims
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.marriageAllowanceTransferredIn.MarriageAllowanceTransferredIn
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.notionalTax.NotionalTax
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionContributionReliefs.PensionContributionReliefs
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.PensionSavingsTaxCharges
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.previousCalculation.PreviousCalculation
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs.Reliefs
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.royaltyPayments.RoyaltyPayments
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.savingsAndGainsIncome.SavingsAndGainsIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.seafarersDeductions.SeafarersDeductions
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.shareSchemesIncome.ShareSchemesIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.stateBenefitsIncome.StateBenefitsIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.studentLoans.StudentLoans
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.TaxCalculation
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxDeductedAtSource.TaxDeductedAtSource

case class Calculation(allowancesAndDeductions: Option[AllowancesAndDeductions],
                       reliefs: Option[Reliefs],
                       taxDeductedAtSource: Option[TaxDeductedAtSource],
                       giftAid: Option[GiftAid],
                       royaltyPayments: Option[RoyaltyPayments],
                       notionalTax: Option[NotionalTax],
                       marriageAllowanceTransferredIn: Option[MarriageAllowanceTransferredIn],
                       pensionContributionReliefs: Option[PensionContributionReliefs],
                       pensionSavingsTaxCharges: Option[PensionSavingsTaxCharges],
                       studentLoans: Option[Seq[StudentLoans]],
                       codedOutUnderpayments: Option[CodedOutUnderpayments],
                       foreignPropertyIncome: Option[Seq[ForeignPropertyIncome]],
                       businessProfitAndLoss: Option[Seq[BusinessProfitAndLoss]],
                       employmentAndPensionsIncome: Option[EmploymentAndPensionsIncome],
                       employmentExpenses: Option[EmploymentExpenses],
                       seafarersDeductions: Option[SeafarersDeductions],
                       foreignTaxForFtcrNotClaimed: Option[ForeignTaxForFtcrNotClaimed],
                       stateBenefitsIncome: Option[StateBenefitsIncome],
                       shareSchemesIncome: Option[ShareSchemesIncome],
                       foreignIncome: Option[ForeignIncome],
                       chargeableEventGainsIncome: Option[ChargeableEventGainsIncome],
                       savingsAndGainsIncome: Option[SavingsAndGainsIncome],
                       dividendsIncome: Option[DividendsIncome],
                       incomeSummaryTotals: Option[IncomeSummaryTotals],
                       taxCalculation: Option[TaxCalculation],
                       previousCalculation: Option[PreviousCalculation],
                       endOfYearEstimate: Option[EndOfYearEstimate],
                       lossesAndClaims: Option[LossesAndClaims])

object Calculation {
  implicit val read: Reads[Calculation] = for {
    allowancesAndDeductions        <- (JsPath \ "allowancesAndDeductions").readNullable[AllowancesAndDeductions]
    reliefs                        <- (JsPath \ "reliefs").readNullable[Reliefs]
    taxDeductedAtSource            <- (JsPath \ "taxDeductedAtSource").readNullable[TaxDeductedAtSource]
    giftAid                        <- (JsPath \ "giftAid").readNullable[GiftAid]
    royaltyPayments                <- (JsPath \ "royaltyPayments").readNullable[RoyaltyPayments]
    notionalTax                    <- (JsPath \ "notionalTax").readNullable[NotionalTax]
    marriageAllowanceTransferredIn <- (JsPath \ "marriageAllowanceTransferredIn").readNullable[MarriageAllowanceTransferredIn]
    pensionContributionReliefs     <- (JsPath \ "pensionContributionReliefs").readNullable[PensionContributionReliefs]
    pensionSavingsTaxCharges       <- (JsPath \ "pensionSavingsTaxCharges").readNullable[PensionSavingsTaxCharges]
    studentLoans                   <- (JsPath \ "studentLoans").readNullable[Seq[StudentLoans]]
    codedOutUnderpayments          <- (JsPath \ "codedOutUnderpayments").readNullable[CodedOutUnderpayments]
    foreignPropertyIncome          <- (JsPath \ "foreignPropertyIncome").readNullable[Seq[ForeignPropertyIncome]]
    businessProfitAndLoss          <- (JsPath \ "businessProfitAndLoss").readNullable[Seq[BusinessProfitAndLoss]]
    employmentAndPensionsIncome    <- (JsPath \ "employmentAndPensionsIncome").readNullable[EmploymentAndPensionsIncome]
    employmentExpenses             <- (JsPath \ "employmentExpenses").readNullable[EmploymentExpenses]
    seafarersDeductions            <- (JsPath \ "seafarersDeductions").readNullable[SeafarersDeductions]
    foreignTaxForFtcrNotClaimed    <- (JsPath \ "foreignTaxForFtcrNotClaimed").readNullable[ForeignTaxForFtcrNotClaimed]
    stateBenefitsIncome            <- (JsPath \ "stateBenefitsIncome").readNullable[StateBenefitsIncome]
    shareSchemesIncome             <- (JsPath \ "shareSchemesIncome").readNullable[ShareSchemesIncome]
    foreignIncome                  <- (JsPath \ "foreignIncome").readNullable[ForeignIncome]
    chargeableEventGainsIncome     <- (JsPath \ "chargeableEventGainsIncome").readNullable[ChargeableEventGainsIncome]
    savingsAndGainsIncome          <- (JsPath \ "savingsAndGainsIncome").readNullable[SavingsAndGainsIncome]
    dividendsIncome                <- (JsPath \ "dividendsIncome").readNullable[DividendsIncome]
    incomeSummaryTotals            <- (JsPath \ "incomeSummaryTotals").readNullable[IncomeSummaryTotals]
    taxCalculation                 <- (JsPath \ "taxCalculation").readNullable[TaxCalculation]
    previousCalculation            <- (JsPath \ "previousCalculation").readNullable[PreviousCalculation]
    endOfYearEstimate              <- (JsPath \ "endOfYearEstimate").readNullable[EndOfYearEstimate]
    lossesAndClaims                <- (JsPath \ "lossesAndClaims").readNullable[LossesAndClaims]
  } yield {
    Calculation(
      allowancesAndDeductions = allowancesAndDeductions,
      reliefs = reliefs,
      taxDeductedAtSource = taxDeductedAtSource,
      giftAid = giftAid,
      royaltyPayments = royaltyPayments,
      notionalTax = notionalTax,
      marriageAllowanceTransferredIn = marriageAllowanceTransferredIn,
      pensionContributionReliefs = pensionContributionReliefs,
      pensionSavingsTaxCharges = pensionSavingsTaxCharges,
      studentLoans = studentLoans,
      codedOutUnderpayments = codedOutUnderpayments,
      foreignPropertyIncome = foreignPropertyIncome,
      businessProfitAndLoss = businessProfitAndLoss,
      employmentAndPensionsIncome = employmentAndPensionsIncome,
      employmentExpenses = employmentExpenses,
      seafarersDeductions = seafarersDeductions,
      foreignTaxForFtcrNotClaimed = foreignTaxForFtcrNotClaimed,
      stateBenefitsIncome = stateBenefitsIncome,
      shareSchemesIncome = shareSchemesIncome,
      foreignIncome = foreignIncome,
      chargeableEventGainsIncome = chargeableEventGainsIncome,
      savingsAndGainsIncome = savingsAndGainsIncome,
      dividendsIncome = dividendsIncome,
      incomeSummaryTotals = incomeSummaryTotals,
      taxCalculation = taxCalculation,
      previousCalculation = previousCalculation,
      endOfYearEstimate = endOfYearEstimate,
      lossesAndClaims = lossesAndClaims
    )
  }

  implicit val writes: OWrites[Calculation] = (o: Calculation) => {
    JsObject(
      Map(
        "allowancesAndDeductions"        -> Json.toJson(o.allowancesAndDeductions),
        "reliefs"                        -> Json.toJson(o.reliefs),
        "taxDeductedAtSource"            -> Json.toJson(o.taxDeductedAtSource),
        "giftAid"                        -> Json.toJson(o.giftAid),
        "royaltyPayments"                -> Json.toJson(o.royaltyPayments),
        "notionalTax"                    -> Json.toJson(o.notionalTax),
        "marriageAllowanceTransferredIn" -> Json.toJson(o.marriageAllowanceTransferredIn),
        "pensionContributionReliefs"     -> Json.toJson(o.pensionContributionReliefs),
        "pensionSavingsTaxCharges"       -> Json.toJson(o.pensionSavingsTaxCharges),
        "studentLoans"                   -> Json.toJson(o.studentLoans),
        "codedOutUnderpayments"          -> Json.toJson(o.codedOutUnderpayments),
        "foreignPropertyIncome"          -> Json.toJson(o.foreignPropertyIncome),
        "businessProfitAndLoss"          -> Json.toJson(o.businessProfitAndLoss),
        "employmentAndPensionsIncome"    -> Json.toJson(o.employmentAndPensionsIncome),
        "employmentExpenses"             -> Json.toJson(o.employmentExpenses),
        "seafarersDeductions"            -> Json.toJson(o.seafarersDeductions),
        "foreignTaxForFtcrNotClaimed"    -> Json.toJson(o.foreignTaxForFtcrNotClaimed),
        "stateBenefitsIncome"            -> Json.toJson(o.stateBenefitsIncome),
        "shareSchemesIncome"             -> Json.toJson(o.shareSchemesIncome),
        "foreignIncome"                  -> Json.toJson(o.foreignIncome),
        "chargeableEventGainsIncome"     -> Json.toJson(o.chargeableEventGainsIncome),
        "savingsAndGainsIncome"          -> Json.toJson(o.savingsAndGainsIncome),
        "dividendsIncome"                -> Json.toJson(o.dividendsIncome),
        "incomeSummaryTotals"            -> Json.toJson(o.incomeSummaryTotals),
        "taxCalculation"                 -> Json.toJson(o.taxCalculation),
        "previousCalculation"            -> Json.toJson(o.previousCalculation),
        "endOfYearEstimate"              -> Json.toJson(o.endOfYearEstimate),
        "lossesAndClaims"                -> Json.toJson(o.lossesAndClaims)
      ).filterNot { case (_, value) =>
        value == JsNull
      }
    )
  }
}