/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints

import play.api.libs.json.{Json, OFormat, Reads, Writes}
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.json.IndividualsChargesApi.IndividualsChargesPensionsResponseJson
import uk.gov.hmrc.integration.cucumber.models.BusinessDetailsApi.RetrieveBusinessDetails.RetrieveBusinessDetailsResponse
import uk.gov.hmrc.integration.cucumber.models.BusinessDetailsApi.listAllBusinesses.ListBusinessesResponse
import uk.gov.hmrc.integration.cucumber.models.CisDeductionsApi._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.IntentToCrystallise.IntentToCrystalliseV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.AllowancesDeductionsReliefsV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.IncomeTaxAndNicsCalculatedResponseV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.EoyEstimateV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.TaxableIncomeV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.{ListSATaxCalculationsV2, RetrieveSAMessagesV2, RetrieveSAMetadataV2, TriggerSATaxCalculationV2}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.RetrieveSATaxCalculation
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.RetrieveSATaxCalculationMandatory
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.{ListSATaxCalculationsV3, TriggerSATaxCalculationV3}
import uk.gov.hmrc.integration.cucumber.models.IndividualChargesApi.RetrievePensionChargesResponse
import uk.gov.hmrc.integration.cucumber.models.IndividualDisclosuresApi.Disclosures
import uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.BroughtForwardLosses.{AmendBFLossV3, CreateBFLossV3, ListBFLossesV3, RetrieveBFLossV3}
import uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.LossClaims._
import uk.gov.hmrc.integration.cucumber.models.IndividualsExpensesApi.Employment.RetrieveEmploymentExpensesResponse
import uk.gov.hmrc.integration.cucumber.models.IndividualsExpensesApi.Other.RetrieveOtherExpensesResponse
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax.RetrieveOtherDisposalsAndGains
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax.retrieveAllDisposalsAndOverrides.RetrieveAllDisposalsAndOverrides
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.dividendsIncome.{DividendsIncome, RetrieveUkDividendsIncome}
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employment.Employment
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails.FinancialDetails
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employments.{AddCustomEmployment, ListEmployments}
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.foreignIncome.ForeignIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.insurancePoliciesIncome.InsurancePoliciesIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.nonPAYE.NonPayeEmploymentIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome.OtherEmploymentIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherIncome.OtherIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.pensionsIncome.PensionsIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.savingsIncome.SavingsIncome
import uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.ukSavingsAccountIncome.{AddUkSavingsAccount, ListUkSavingsAccounts, RetrieveUkSavingsAccount}
import uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveCharitableGivingReliefs.RetrieveCharitableGivingReliefs
import uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveForeignReliefs.RetrieveForeignReliefs
import uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs.RetrieveOtherReliefs
import uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrievePensionReliefs.RetrievePensionReliefsResponse
import uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveReliefInvestments.RetrieveReliefInvestments
import uk.gov.hmrc.integration.cucumber.models.IndividualsStateBenefitsApi.CreateStateBenefit
import uk.gov.hmrc.integration.cucumber.models.IndividualsStateBenefitsApi.listBenefits.ListBenefits
import uk.gov.hmrc.integration.cucumber.models.Obligations.RetrieveCrystallisationObligations.RetrieveCrystallisationObligationsResponse
import uk.gov.hmrc.integration.cucumber.models.Obligations.RetrieveEOPS.RetrieveEOPSResponse
import uk.gov.hmrc.integration.cucumber.models.Obligations.RetrievePeriodicObligations.RetrievePeriodicObligationsResponse
import uk.gov.hmrc.integration.cucumber.models.OtherDeductionsApi.RetrieveOtherDeductionsResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.PeriodSummary._
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.PeriodSummary.CreateHistoricUKPropertyPeriodSummaryResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmission.RetrieveForeignPropertyAnnualSubmissionResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmissionV2.RetrieveForeignPropertyAnnualSubmissionResponseV2
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveHistoricUKPropertyAnnualSubmission.RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission.RetrieveUKPropertyAnnualSubmissionResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse.RetrieveUKPropertyPeriodSummaryResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.RetrieveForeignPropertyPeriodSummaryResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveHistoric.RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveHistoricFHLUKPropertyPeriodSummary.RetrieveHistoricFhlUkPiePeriodSummaryResponse
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveHistoricNonFhlUkPropertyPeriodSummary.RetrieveHistoricNonFhlUkPropertyPeriodSummaryResponse
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listPayments._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listTransactions._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveAllocations._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveBalance._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveChargeHistory._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveCodingOutUnderpayments.RetrieveCodingOutUnderpayments
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveTransactionDetails._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listCharges.ListCharges
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V2.retrieveSelfAssessmentChargeHistory.RetrieveSelfAssessmentChargeHistoryResponse
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentApi.MtdSavingsAccounts._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentApi.SelfEmployment._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBissApi.V2.RetrieveBissResponseV2
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.BsasIdResponse
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.listBsas._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveForeignPropBsas.RetrieveForeignPropBsasResponse
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsas._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsasAdjustments._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsas.RetrieveUkPropBsasResponseV2
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments._
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.listBsas.ListBsasResponseV3
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas.RetrieveForeignPropBsasResponseV3
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas.RetrieveSEBsasResponseV3
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.RetrieveUkPropBsasResponseV3
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.triggerBsas.TriggerBsasResponse
import uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.CreateSEPeriodSummaryResponse
import uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.listSEPeriodSummaries.ListSEPeriodSummaries
import uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEAnnualSummary.RetrieveSEBusinessAnnualSummary
import uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEPeriodSummary.RetrieveSEPeriodSummaryBody
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLinks
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.AllowancesDeductionsReliefsMandatoryV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.IncomeTaxAndNicsCalculatedResponseMandatoryV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.EoyEstimateMandatoryV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.TaxableIncomeMandatoryV2

object ResponseModels {

  def checkResponseBodyStructure[A: Writes](body: String, expectedBody: Option[String] = None)(implicit rds: Reads[A]): Unit = {
    Json
      .parse(body)
      .validate[A]
      .fold(
        invalid =>
          scala.Predef
            .assert(assertion = false, s"JSON Response did not match the expected format and could not be parsed.\nErrors: $invalid\n${errorLog()}"),
        valid =>
          if (expectedBody.isDefined) {
            Json.toJson(valid) shouldBe Json.parse(expectedBody.get)
          } else {
            scala.Predef.assert(assertion = true)
          }
      )
  }

  def checkAgainstExpectedModel(responseName: String, expectedBody: Option[String] = None): Unit = {
    responseName match {

      // ----- cis-deductions-api -----
      case "cisDeductionsRetrieveResponse" => checkResponseBodyStructure[RetrieveCisDeductions](response.body)
      case "cisDeductionsCreateResponse"   => checkResponseBodyStructure[CreateCisDeduction](response.body)

      // -----obligations api-----
      case "retrieveCrystallisationObligationsResponse" => checkResponseBodyStructure[RetrieveCrystallisationObligationsResponse](response.body)
      case "RetrieveEOPSResponse"                       => checkResponseBodyStructure[RetrieveEOPSResponse](response.body)
      case "RetrievePeriodicObligationsResponse"        => checkResponseBodyStructure[RetrievePeriodicObligationsResponse](response.body)

      // ----- individuals charges pensions -----
      case "IndividualsChargesPensions" =>
        checkResponseBodyStructure[RetrievePensionChargesResponse](
          response.body,
          Some(IndividualsChargesPensionsResponseJson.GET_PENSION_CHARGES_DEFAULT))
      case "IndividualsChargesPensionsOptional" =>
        checkResponseBodyStructure[RetrievePensionChargesResponse](
          response.body,
          Some(IndividualsChargesPensionsResponseJson.GET_PENSION_CHARGES_OPTIONAL))

      // ----- mtd-savings-account -----
      case "AddSavingsAccountResponse" => checkResponseBodyStructure[AddSavingsAccountResponse](response.body)

      // ----- individuals-reliefs-api -----
      case "RetrieveReliefInvestments"      => checkResponseBodyStructure[RetrieveReliefInvestments](response.body)
      case "RetrieveOtherReliefs"           => checkResponseBodyStructure[RetrieveOtherReliefs](response.body)
      case "RetrieveForeignReliefs"         => checkResponseBodyStructure[RetrieveForeignReliefs](response.body)
      case "RetrievePensionReliefsResponse" => checkResponseBodyStructure[RetrievePensionReliefsResponse](response.body)
      case "RetrieveCharitableGivingReliefs" => checkResponseBodyStructure[RetrieveCharitableGivingReliefs](response.body)

      // ----- individual-losses-api ----
      // V3
      case "AmendBFLossV3"         => checkResponseBodyStructure[AmendBFLossV3](response.body)
      case "ListBFLossesV3"        => checkResponseBodyStructure[ListBFLossesV3](response.body)
      case "CreateBFLossV3"        => checkResponseBodyStructure[CreateBFLossV3](response.body)
      case "RetrieveBFLossV3"      => checkResponseBodyStructure[RetrieveBFLossV3](response.body)
      case "AmendLossClaimV3"      => checkResponseBodyStructure[AmendLossClaimV3](response.body)
      case "CreateLossClaimV3"     => checkResponseBodyStructure[CreateLossClaimV3](response.body)
      case "LossClaimV3"           => checkResponseBodyStructure[RetrieveLossClaimV3](response.body)
      case "ListLossClaimsV3"      => checkResponseBodyStructure[ListLossClaimsV3](response.body)
      case "AmendLossClaimOrderV3" => checkResponseBodyStructure[AmendLossClaimOrderV3](response.body)

      // ----- self-assessment-api-legacy -----
      // Self-Employment
      case "ListAllPeriodsResponse" => checkResponseBodyStructure[Seq[ListAllPeriodsResponse]](response.body)

      // ----- individual-calculations-api -----
      // V2
      case "ListSATaxCalculationsV2"                       => checkResponseBodyStructure[ListSATaxCalculationsV2](response.body)
      case "AllowancesDeductionsReliefsV2"                 => checkResponseBodyStructure[AllowancesDeductionsReliefsV2](response.body)
      case "AllowancesDeductionsReliefsMandatoryV2"        => checkResponseBodyStructure[AllowancesDeductionsReliefsMandatoryV2](response.body)
      case "EoyEstimateV2"                                 => checkResponseBodyStructure[EoyEstimateV2](response.body)
      case "EoyEstimateMandatoryV2"                        => checkResponseBodyStructure[EoyEstimateMandatoryV2](response.body)
      case "IncomeTaxAndNicsCalculatedResponseV2"          => checkResponseBodyStructure[IncomeTaxAndNicsCalculatedResponseV2](response.body)
      case "IncomeTaxAndNicsCalculatedResponseMandatoryV2" => checkResponseBodyStructure[IncomeTaxAndNicsCalculatedResponseMandatoryV2](response.body)
      case "RetrieveSAMetadataV2"                          => checkResponseBodyStructure[RetrieveSAMetadataV2](response.body)
      case "RetrieveSAMessagesV2"                          => checkResponseBodyStructure[RetrieveSAMessagesV2](response.body)
      case "TaxableIncomeV2"                               => checkResponseBodyStructure[TaxableIncomeV2](response.body)
      case "TaxableIncomeMandatoryV2"                      => checkResponseBodyStructure[TaxableIncomeMandatoryV2](response.body)
      case "TriggerSATaxCalculationV2"                     => checkResponseBodyStructure[TriggerSATaxCalculationV2](response.body)
      case "IntentToCrystalliseV2"                         => checkResponseBodyStructure[IntentToCrystalliseV2](response.body)
      // V3
      case "TriggerSATaxCalculationV3"                     => checkResponseBodyStructure[TriggerSATaxCalculationV3](response.body)
      case "RetrieveSelfAssessmentTaxCalculation"          => checkResponseBodyStructure[RetrieveSATaxCalculation](response.body)
      case "RetrieveSelfAssessmentTaxCalculationMandatory" => checkResponseBodyStructure[RetrieveSATaxCalculationMandatory](response.body)
      case "ListSATaxCalculationsV3"                       => checkResponseBodyStructure[ListSATaxCalculationsV3](response.body)

      // ----- self-assessment-biss-api -----
      case "RetrieveBissResponseV2" => checkResponseBodyStructure[RetrieveBissResponseV2](response.body)

      // ----- self-assessment-bsas-api -----

      // V2
      case "BsasIdResponse"                        => checkResponseBodyStructure[BsasIdResponse](response.body)
      case "ListBsasResponse"                      => checkResponseBodyStructure[ListBsasResponse[BusinessSourceSummary]](response.body)
      case "ListSEBsasResponse"                    => checkResponseBodyStructure[ListBsasResponse[SEBusinessSourceSummary]](response.body)
      case "ListUkPropertyBsasResponse"            => checkResponseBodyStructure[ListBsasResponse[UkPropertyBusinessSourceSummary]](response.body)
      case "RetrieveUkPropBsasResponseV2"          => checkResponseBodyStructure[RetrieveUkPropBsasResponseV2](response.body)
      case "RetrieveSEBsasResponseV2"              => checkResponseBodyStructure[RetrieveSEBsasResponseV2](response.body)
      case "RetrieveSEBsasAdjustmentsResponseV2"   => checkResponseBodyStructure[RetrieveSEBsasAdjustmentsResponseV2](response.body)
      case "RetrieveUkPropBsasAdjustmentsResponse" => checkResponseBodyStructure[RetrieveUkPropBsasAdjustmentsResponse](response.body)
      case "RetrieveForeignPropBsasResponse"       => checkResponseBodyStructure[RetrieveForeignPropBsasResponse](response.body)

      // V3
      case "TriggerBsasResponseV3"             => checkResponseBodyStructure[TriggerBsasResponse](response.body)
      case "RetrieveSEBsasResponseV3"          => checkResponseBodyStructure[RetrieveSEBsasResponseV3](response.body)
      case "RetrieveUkPropBsasResponseV3"      => checkResponseBodyStructure[RetrieveUkPropBsasResponseV3](response.body)
      case "ListBsasResponseV3"                => checkResponseBodyStructure[ListBsasResponseV3](response.body)
      case "RetrieveForeignPropBsasResponseV3" => checkResponseBodyStructure[RetrieveForeignPropBsasResponseV3](response.body)

      // ----- self-assessment-accounts-api -----
      //V1
      case "RetrieveBalanceResponse"                => checkResponseBodyStructure[RetrieveBalance](response.body)
      case "ListTransactionsResponse"               => checkResponseBodyStructure[ListTransactions](response.body)
      case "RetrieveTransactionDetailsResponse"     => checkResponseBodyStructure[RetrieveTransactionDetails](response.body)
      case "RetrieveAllocationsResponse"            => checkResponseBodyStructure[RetrieveAllocations](response.body)
      case "ListPaymentsResponse"                   => checkResponseBodyStructure[ListPayments](response.body)
      case "ListChargesResponse"                    => checkResponseBodyStructure[ListCharges](response.body)
      case "RetrieveChargeHistoryResponse"          => checkResponseBodyStructure[RetrieveChargeHistory](response.body)
      case "RetrieveCodingOutUnderpaymentsResponse" => checkResponseBodyStructure[RetrieveCodingOutUnderpayments](response.body)

      //V2
      case "RetrieveSelfAssessmentChargeHistoryResponse"          => checkResponseBodyStructure[RetrieveSelfAssessmentChargeHistoryResponse](response.body)
      // ----- business-details-api -----
      case "ListBusinessesResponse"          => checkResponseBodyStructure[ListBusinessesResponse](response.body)
      case "RetrieveBusinessDetailsResponse" => checkResponseBodyStructure[RetrieveBusinessDetailsResponse](response.body)

      // ----- individuals-income-received-api -----
      case "SavingsIncome"                   => checkResponseBodyStructure[SavingsIncome](response.body)
      case "SavingsIncomeResponse"           => checkResponseBodyStructure[SavingsIncome](response.body)
      case "InsurancePoliciesIncome"         => checkResponseBodyStructure[InsurancePoliciesIncome](response.body)
      case "InsurancePoliciesIncomeResponse" => checkResponseBodyStructure[InsurancePoliciesIncome](response.body)
      case "ForeignIncome"                   => checkResponseBodyStructure[ForeignIncome](response.body)
      case "ForeignIncomeResponse"           => checkResponseBodyStructure[ForeignIncome](response.body)
      case "PensionsIncome"                  => checkResponseBodyStructure[PensionsIncome](response.body)
      case "PensionsIncomeResponse"          => checkResponseBodyStructure[PensionsIncome](response.body)
      case "OtherIncome"                     => checkResponseBodyStructure[OtherIncome](response.body)
      case "OtherIncomeResponse"             => checkResponseBodyStructure[OtherIncome](response.body)
      case "OtherEmploymentIncome"           => checkResponseBodyStructure[OtherEmploymentIncome](response.body)
      case "OtherEmploymentIncomeResponse"   => checkResponseBodyStructure[OtherEmploymentIncome](response.body)
      case "DividendsIncome"                 => checkResponseBodyStructure[DividendsIncome](response.body)
      case "DividendsIncomeResponse"         => checkResponseBodyStructure[DividendsIncome](response.body)
      case "UkDividendsIncomeResponse"       => checkResponseBodyStructure[RetrieveUkDividendsIncome](response.body)
      case "ListUkSavingsAccounts"           => checkResponseBodyStructure[ListUkSavingsAccounts](response.body)
      case "UkSavingsAccountIncomeResponse"  => checkResponseBodyStructure[RetrieveUkSavingsAccount](response.body)

      case "AddUkSavingsAccount" => checkResponseBodyStructure[AddUkSavingsAccount](response.body)

      case "Employment"          => checkResponseBodyStructure[Employment](response.body)
      case "AddCustomEmployment" => checkResponseBodyStructure[AddCustomEmployment](response.body)
      case "ListEmployments"     => checkResponseBodyStructure[ListEmployments](response.body)
      case "FinancialDetails"    => checkResponseBodyStructure[FinancialDetails](response.body)

      case "RetrieveOtherDisposalsAndGainsResponse"   => checkResponseBodyStructure[RetrieveOtherDisposalsAndGains](response.body)
      case "RetrieveAllDisposalsAndOverridesResponse" => checkResponseBodyStructure[RetrieveAllDisposalsAndOverrides](response.body)

      case "NonPayeEmploymentIncome" => checkResponseBodyStructure[NonPayeEmploymentIncome](response.body)

      // ----- individual-disclosures-api -----
      case "RetrieveDisclosuresResponse" => checkResponseBodyStructure[Disclosures](response.body, expectedBody)

      // ----- individual-state-benefits-api -----
      case "CreateStateBenefit" => checkResponseBodyStructure[CreateStateBenefit](response.body)
      case "ListStateBenefits"  => checkResponseBodyStructure[ListBenefits](response.body)

      // ----- individuals-expenses-api -----
      case "RetrieveOtherExpensesResponse"      => checkResponseBodyStructure[RetrieveOtherExpensesResponse](response.body)
      case "RetrieveEmploymentExpensesResponse" => checkResponseBodyStructure[RetrieveEmploymentExpensesResponse](response.body)

      // ----- other-deductions-api -----
      case "RetrieveOtherDeductionsResponse" => checkResponseBodyStructure[RetrieveOtherDeductionsResponse](response.body)

      // ----- property-business-api -----
      case "CreatePropertyPeriodSummaryResponse"     => checkResponseBodyStructure[CreatePropertyPeriodSummaryResponse](response.body)
      case "RetrieveUKPropertyPeriodSummaryResponse" => checkResponseBodyStructure[RetrieveUKPropertyPeriodSummaryResponse](response.body)
      case "ListPropertyPeriodSummariesResponse"     => checkResponseBodyStructure[ListPropertyPeriodSummariesResponse](response.body)
      case "RetrieveForeignPropertyAnnualSubmissionResponse" =>
        checkResponseBodyStructure[RetrieveForeignPropertyAnnualSubmissionResponse](response.body)
      case "RetrieveUKPropertyAnnualSubmissionResponse" => checkResponseBodyStructure[RetrieveUKPropertyAnnualSubmissionResponse](response.body)
      case "RetrieveForeignPropertyAnnualSubmissionResponseV2" =>
        checkResponseBodyStructure[RetrieveForeignPropertyAnnualSubmissionResponseV2](response.body)

      case "RetrieveForeignPropertyPeriodSummaryResponseV2" => checkResponseBodyStructure[RetrieveForeignPropertyPeriodSummaryResponse](response.body)

      // ░▒▓▓▓ Historic Property Business API V2 ▓▓▓▒░
      case "RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse"    => checkResponseBodyStructure[RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse](response.body)

      case "RetrieveHistoricFhlUKPropertyPeriodSummaryResponse" => checkResponseBodyStructure[RetrieveHistoricFhlUkPiePeriodSummaryResponse](response.body)
      case "RetrieveHistoricNonFhlUKPropertyPeriodSummaryResponse" => checkResponseBodyStructure[RetrieveHistoricNonFhlUkPropertyPeriodSummaryResponse](response.body)
      case "RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse" => checkResponseBodyStructure[RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse](response.body)

      case "CreateHistoricUKPropertyPeriodSummaryResponse" => checkResponseBodyStructure[CreateHistoricUKPropertyPeriodSummaryResponse](response.body)

      case "ListHistoricUKPropertyPeriodSummariesResponse" => checkResponseBodyStructure[ListHistoricUKPropertyPeriodSummariesResponse](response.body)
      case "ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponse" => checkResponseBodyStructure[ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponse](response.body)


      // ----- self-employment-business-api -----
      case "RetrieveSEAnnualSubmissionResponse" => checkResponseBodyStructure[RetrieveSEBusinessAnnualSummary](response.body)
      case "CreateSEPeriodSummaryResponse"      => checkResponseBodyStructure[CreateSEPeriodSummaryResponse](response.body)
      case "RetrieveSEPeriodSummaryResponse"    => checkResponseBodyStructure[RetrieveSEPeriodSummaryBody](response.body)
      case "ListSEPeriodSummaries"              => checkResponseBodyStructure[ListSEPeriodSummaries](response.body)

      case "HateoasLinks" => checkResponseBodyStructure[HateoasLinks](response.body)
      case _              => checkResponseBodyStructure[notFound](response.body)

    }
  }

  case class notFound(notFound: String)

  object notFound {
    implicit val writes: OFormat[notFound] = Json.format[notFound]
  }

}
