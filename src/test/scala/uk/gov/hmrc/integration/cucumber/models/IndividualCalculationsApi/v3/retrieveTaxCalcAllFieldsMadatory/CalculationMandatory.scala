/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.allowancesAndDeductionsMandatory.AllowancesAndDeductionsMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.businessProfitAndLossMandatory.BusinessProfitAndLossMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.chargeableEventGainsIncomeMandatory.ChargeableEventGainsIncomeMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.codedOutUnderpaymentsMandatory.CodedOutUnderpaymentsMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.dividendsIncomeMandatory.DividendsIncomeMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.EmploymentAndPensionsIncomeMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentExpensesMandatory.EmploymentExpensesMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.endOfYearEstimateMandatory.EndOfYearEstimateMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignIncomeMandatory.ForeignIncomeMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignPropertyIncomeMandatory.ForeignPropertyIncomeMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignTaxForFtcrNotClaimedMandatory.ForeignTaxForFtcrNotClaimedMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.giftAidMandatory.GiftAidMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.incomeSummaryTotalsMandatory.IncomeSummaryTotalsMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.lossesAndClaimsMandatory.LossesAndClaimsMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.marriageAllowanceTransferredInMandatory.MarriageAllowanceTransferredInMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.notionalTaxMandatory.NotionalTaxMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionContributionReliefsMandatory.PensionContributionReliefsMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.PensionSavingsTaxChargesMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.previousCalculationMandatory.PreviousCalculationMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory.ReliefsMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.royaltyPaymentsMandatory.RoyaltyPaymentsMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.savingsAndGainsIncomeMandatory.SavingsAndGainsIncomeMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.seafarersDeductionsMandatory.SeafarersDeductionsMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.shareSchemesIncomeMandatory.ShareSchemesIncomeMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory.StateBenefitsIncomeMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.studentLoansMandatory.StudentLoansMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.TaxCalculationMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxDeductedAtSourceMandatory.TaxDeductedAtSourceMandatory

case class CalculationMandatory(allowancesAndDeductions: AllowancesAndDeductionsMandatory,
                                reliefs: ReliefsMandatory,
                                taxDeductedAtSource: TaxDeductedAtSourceMandatory,
                                giftAid: GiftAidMandatory,
                                royaltyPayments: RoyaltyPaymentsMandatory,
                                notionalTax: NotionalTaxMandatory,
                                marriageAllowanceTransferredIn: MarriageAllowanceTransferredInMandatory,
                                pensionContributionReliefs: PensionContributionReliefsMandatory,
                                pensionSavingsTaxCharges: PensionSavingsTaxChargesMandatory,
                                studentLoans: Seq[StudentLoansMandatory],
                                codedOutUnderpayments: CodedOutUnderpaymentsMandatory,
                                foreignPropertyIncome: Seq[ForeignPropertyIncomeMandatory],
                                businessProfitAndLoss: Seq[BusinessProfitAndLossMandatory],
                                employmentAndPensionsIncome: EmploymentAndPensionsIncomeMandatory,
                                employmentExpenses: EmploymentExpensesMandatory,
                                seafarersDeductions: SeafarersDeductionsMandatory,
                                foreignTaxForFtcrNotClaimed: ForeignTaxForFtcrNotClaimedMandatory,
                                stateBenefitsIncome: StateBenefitsIncomeMandatory,
                                shareSchemesIncome: ShareSchemesIncomeMandatory,
                                foreignIncome: ForeignIncomeMandatory,
                                chargeableEventGainsIncome: ChargeableEventGainsIncomeMandatory,
                                savingsAndGainsIncome: SavingsAndGainsIncomeMandatory,
                                dividendsIncome: DividendsIncomeMandatory,
                                incomeSummaryTotals: IncomeSummaryTotalsMandatory,
                                taxCalculation: TaxCalculationMandatory,
                                previousCalculation: PreviousCalculationMandatory,
                                endOfYearEstimate: EndOfYearEstimateMandatory,
                                lossesAndClaims: LossesAndClaimsMandatory)

object CalculationMandatory {
  implicit val read: Reads[CalculationMandatory] = for {
    allowancesAndDeductions        <- (JsPath \ "allowancesAndDeductions").read[AllowancesAndDeductionsMandatory]
    reliefs                        <- (JsPath \ "reliefs").read[ReliefsMandatory]
    taxDeductedAtSource            <- (JsPath \ "taxDeductedAtSource").read[TaxDeductedAtSourceMandatory]
    giftAid                        <- (JsPath \ "giftAid").read[GiftAidMandatory]
    royaltyPayments                <- (JsPath \ "royaltyPayments").read[RoyaltyPaymentsMandatory]
    notionalTax                    <- (JsPath \ "notionalTax").read[NotionalTaxMandatory]
    marriageAllowanceTransferredIn <- (JsPath \ "marriageAllowanceTransferredIn").read[MarriageAllowanceTransferredInMandatory]
    pensionContributionReliefs     <- (JsPath \ "pensionContributionReliefs").read[PensionContributionReliefsMandatory]
    pensionSavingsTaxCharges       <- (JsPath \ "pensionSavingsTaxCharges").read[PensionSavingsTaxChargesMandatory]
    studentLoans                   <- (JsPath \ "studentLoans").read[Seq[StudentLoansMandatory]]
    codedOutUnderpayments          <- (JsPath \ "codedOutUnderpayments").read[CodedOutUnderpaymentsMandatory]
    foreignPropertyIncome          <- (JsPath \ "foreignPropertyIncome").read[Seq[ForeignPropertyIncomeMandatory]]
    businessProfitAndLoss          <- (JsPath \ "businessProfitAndLoss").read[Seq[BusinessProfitAndLossMandatory]]
    employmentAndPensionsIncome    <- (JsPath \ "employmentAndPensionsIncome").read[EmploymentAndPensionsIncomeMandatory]
    employmentExpenses             <- (JsPath \ "employmentExpenses").read[EmploymentExpensesMandatory]
    seafarersDeductions            <- (JsPath \ "seafarersDeductions").read[SeafarersDeductionsMandatory]
    foreignTaxForFtcrNotClaimed    <- (JsPath \ "foreignTaxForFtcrNotClaimed").read[ForeignTaxForFtcrNotClaimedMandatory]
    stateBenefitsIncome            <- (JsPath \ "stateBenefitsIncome").read[StateBenefitsIncomeMandatory]
    shareSchemesIncome             <- (JsPath \ "shareSchemesIncome").read[ShareSchemesIncomeMandatory]
    foreignIncome                  <- (JsPath \ "foreignIncome").read[ForeignIncomeMandatory]
    chargeableEventGainsIncome     <- (JsPath \ "chargeableEventGainsIncome").read[ChargeableEventGainsIncomeMandatory]
    savingsAndGainsIncome          <- (JsPath \ "savingsAndGainsIncome").read[SavingsAndGainsIncomeMandatory]
    dividendsIncome                <- (JsPath \ "dividendsIncome").read[DividendsIncomeMandatory]
    incomeSummaryTotals            <- (JsPath \ "incomeSummaryTotals").read[IncomeSummaryTotalsMandatory]
    taxCalculation                 <- (JsPath \ "taxCalculation").read[TaxCalculationMandatory]
    previousCalculation            <- (JsPath \ "previousCalculation").read[PreviousCalculationMandatory]
    endOfYearEstimate              <- (JsPath \ "endOfYearEstimate").read[EndOfYearEstimateMandatory]
    lossesAndClaims                <- (JsPath \ "lossesAndClaims").read[LossesAndClaimsMandatory]
  } yield {
    CalculationMandatory(
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

  implicit val writes: OWrites[CalculationMandatory] = (o: CalculationMandatory) => {
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