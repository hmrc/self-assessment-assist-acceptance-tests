/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints

import uk.gov.hmrc.integration.cucumber.json.CisDeductionsApi.CisDeductionsJson
import uk.gov.hmrc.integration.cucumber.json.HistoricPropertyBusinessApi.CreateAmendHistoricFhlUKPropAnnualSubmissionJson
import uk.gov.hmrc.integration.cucumber.json.IndividualCalculationsApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualDisclosuresApi.{DisclosuresJson, MarriageAllowanceJson}
import uk.gov.hmrc.integration.cucumber.json.IndividualLossesApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualsBusinessEOPSApi.{SubmitBusinessEOPSRequestJsonV1, SubmitBusinessEOPSRequestJsonV2}
import uk.gov.hmrc.integration.cucumber.json.IndividualsChargesApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualsExpensesApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived._
import uk.gov.hmrc.integration.cucumber.json.IndividualsReliefsApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualsStateBenefitsApi._
import uk.gov.hmrc.integration.cucumber.json.MtdCharitableGiving._
import uk.gov.hmrc.integration.cucumber.json.MtdCrystallisation._
import uk.gov.hmrc.integration.cucumber.json.MtdDividendsIncome._
import uk.gov.hmrc.integration.cucumber.json.MtdPropertyApi._
import uk.gov.hmrc.integration.cucumber.json.MtdSavingsAccount._
import uk.gov.hmrc.integration.cucumber.json.MtdSelfEmployment._
import uk.gov.hmrc.integration.cucumber.json.OtherDeductionsApi._
import uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi._
import uk.gov.hmrc.integration.cucumber.json.SaAccountsApi.CreateAmendCodingOutJson
import uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V2.{SubmitBsasJson, V2TriggerBsasJson}
import uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V3.{V3SubmitBsasJson, V3TriggerBsasJson}
import uk.gov.hmrc.integration.cucumber.json.SampleEndpointJson
import uk.gov.hmrc.integration.cucumber.json.SelfAssessmentApiLegacy.SelfEmployment._
import uk.gov.hmrc.integration.cucumber.json.SelfAssessmentApiLegacy.TaxCalculations._
import uk.gov.hmrc.integration.cucumber.json.SelfAssessmentApiLegacy.UkProperty._
import uk.gov.hmrc.integration.cucumber.json.SelfEmploymentBusinessApi.AnnualSubmission.AmendSEAnnualSubmissionJson
import uk.gov.hmrc.integration.cucumber.json.SelfEmploymentBusinessApi.PeriodSummary.{AmendSEPeriodSummaryJson, CreateSEPeriodSummaryJson}

object RequestBodies {

  def retrieveRequestBody(body: String): String = {
    body match {

      // ----- MTD API template endpoint -----
      case "API_TEMPLATE_REQUEST" => SampleEndpointJson.API_TEMPLATE_REQUEST

      // ----- CIS Deductions API endpoint -----
      case "CIS_CREATE_REQUEST" => CisDeductionsJson.CIS_CREATE_REQUEST
      case "CIS_AMEND_REQUEST"  => CisDeductionsJson.CIS_AMEND_REQUEST

      // ----- Self Employment Business API -----
      case "CREATE_OR_AMEND_ANNUAL_SUBMISSION"                    => AmendSEAnnualSubmissionJson.CreateOrAmendAnnualSubmission
      case "CREATE_OR_AMEND_ANNUAL_SUBMISSION_TRADING_ALLOWANCES" => AmendSEAnnualSubmissionJson.CreateOrAmendAnnualSubmissionTradingAllowances
      case "AMEND_SE_PERIOD_SUMMARY"                              => AmendSEPeriodSummaryJson.amendSEPeriodSummaryDefault
      case "AMEND_SE_PERIOD_SUMMARY_CONSOLIDATED"                 => AmendSEPeriodSummaryJson.amendSEPeriodSummaryConsolidated
      case "AMEND_SE_CONSOLIDATED_EXPENSES_EXCEEDED"              => AmendSEPeriodSummaryJson.amendSEPeriodSummaryConsolidatedExceeded

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Self Employment Business API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "CREATE_SE_PERIOD_SUMMARY" => CreateSEPeriodSummaryJson.CREATE_SE_PERIOD_SUMMARY

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Property Business API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░
      // Annual Submission
      case "amendAnnualSubmissionDefault"                => AmendAnnualSubmissionJson.amendAnnualSubmissionDefault
      case "amendAnnualSubmissionWithMultipleProperties" => AmendAnnualSubmissionJson.amendAnnualSubmissionWithMultipleProperties
      case "amendAnnualSubmissionMinimumFields"          => AmendAnnualSubmissionJson.amendAnnualSubmissionMinimumFields
      case "amendAnnualSubmissionValueErrorsRequest"     => AmendAnnualSubmissionJson.amendAnnualSubmissionValueErrorsRequest
      case "amendAnnualSubmissionMissingErrorsRequest"   => AmendAnnualSubmissionJson.amendAnnualSubmissionMissingErrorsRequest

      // Period Summary
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY"               => AmendUkPropertyPeriodSummaryJson.defaultRequest
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_CONSOLIDATED"  => AmendUkPropertyPeriodSummaryJson.consolidatedRequest
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_MINIMUM"       => AmendUkPropertyPeriodSummaryJson.minimumRequest
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_VALUE_FORMAT"  => AmendUkPropertyPeriodSummaryJson.valueFormatRequest
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_BOTH_EXPENSES" => AmendUkPropertyPeriodSummaryJson.bothExpensesSuppliedRequest
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_EMPTY_ITEMS"   => AmendUkPropertyPeriodSummaryJson.emptyItemsRequest

      case "AMEND_FOREIGN_PROPERTY"                        => AmendPeriodSummaryJson.amendPeriodSummaryDefault
      case "AMEND_FOREIGN_PROPERTY_CONSOLIDATED"           => AmendPeriodSummaryJson.amendPeriodSummaryConsolidated
      case "AMEND_FOREIGN_PROPERTY_MINIMUM_FIELDS"         => AmendPeriodSummaryJson.amendPeriodSummaryMinimumFields
      case "AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_REQUEST"   => AmendPeriodSummaryJson.amendPeriodSummaryValueErrorsRequest
      case "AMEND_FOREIGN_PROPERTY_MISSING_ERRORS_REQUEST" => AmendPeriodSummaryJson.amendPeriodSummaryMissingErrorsRequest

      case "CREATE_FOREIGN_PROPERTY_MIN_FIELDS"            => CreatePeriodSummaryJson.createPeriodSummaryMinFields
      case "CREATE_FOREIGN_PROPERTY_EXPENSES"              => CreatePeriodSummaryJson.createPeriodSummaryWithExpenditure
      case "CREATE_FOREIGN_PROPERTY_CONSOLIDATED_EXPENSES" => CreatePeriodSummaryJson.createPeriodSummaryWithConsolidatedExpenditure
      case "CREATE_UK_PROPERTY_MIN_FIELDS"                 => CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryMinFields
      case "CREATE_UK_PROPERTY_EXPENSES"                   => CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure
      case "CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES"      => CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithConsolidatedExpenditure

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Property Business API V2 ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "CREATE_AMEND_HISTORIC_FHL_UK_PROPERTY_ANNUAL_SUBMISSION" =>
        CreateAmendHistoricFhlUKPropAnnualSubmissionJson.historicFhlUKPropertyBusinessAmendRequest

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Property Business API V2 ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "AMEND_FOREIGN_PROPERTY_V2"                        => AmendPeriodSummaryJsonV2.amendPeriodSummaryDefault
      case "AMEND_FOREIGN_PROPERTY_CONSOLIDATED_V2"           => AmendPeriodSummaryJsonV2.amendPeriodSummaryConsolidated
      case "AMEND_FOREIGN_PROPERTY_MINIMUM_FIELDS_V2"         => AmendPeriodSummaryJsonV2.amendPeriodSummaryMinimumFields
      case "AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_REQUEST_V2"   => AmendPeriodSummaryJsonV2.amendPeriodSummaryValueErrorsRequest
      case "AMEND_FOREIGN_PROPERTY_MISSING_ERRORS_REQUEST_V2" => AmendPeriodSummaryJsonV2.amendPeriodSummaryMissingErrorsRequest
      case "createAmendUKPropAnnualSubmissionDefault"         => AmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionDefault
      case "createAmendUKPropAnnualSubmissionMinimumFields"   => AmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionMinimumFields
      case "createAmendUKPropAnnualSubmissionValueErrorsRequest" =>
        AmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionValueErrorsRequest
      case "createAmendUKPropAnnualSubmissionInvalidBodyRequest" =>
        AmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionInvalidBodyRequest
      case "createAmendUKPropAnnualSubmissionEmptyBodyRequest" => AmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionEmptyBodyRequest
      case "createAmendUKPropAnnualSubmissionRulePropIncomeAllowanceRequest" =>
        AmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionRulePropIncomeAllowanceRequest

      case "createAmendForeignPropAnnualSubmissionDefaultV2" => AmendForeignPropertyAnnualSubmissionJsonV2.createAmendAnnualSubmissionDefault
      case "createAmendForeignPropAnnualSubmissionWithMultiplePropertiesV2" =>
        AmendForeignPropertyAnnualSubmissionJsonV2.createAmendAnnualSubmissionWithMultipleProperties
      case "createAmendForeignPropAnnualSubmissionValueErrorsRequestV2" =>
        AmendForeignPropertyAnnualSubmissionJsonV2.createAmendAnnualSubmissionValueErrorsRequest
      case "createAmendForeignPropAnnualSubmissionInvalidBodyRequestV2" =>
        AmendForeignPropertyAnnualSubmissionJsonV2.createAmendAnnualSubmissionInvalidBodyRequest
      case "createAmendForeignPropAnnualSubmissionEmptyBodyRequestV2" =>
        AmendForeignPropertyAnnualSubmissionJsonV2.createAmendAnnualSubmissionEmptyBodyRequest

      case "createForeignPropertyMinimumFieldsV2"            => V2CreatePeriodSummaryJson.createPeriodSummaryMinFields
      case "createForeignPropertyWithExpensesV2"             => V2CreatePeriodSummaryJson.createPeriodSummaryWithExpenses
      case "createForeignPropertyWithConsolidatedExpensesV2" => V2CreatePeriodSummaryJson.createPeriodSummaryWithConsolidatedExpenses
      case "createHistoricFhlUKPropertyPeriodSummaryV2"      => V2CreatePeriodSummaryJson.createHistoricFhlUKPropertyPeriodSummary

      // ░▒▓▓▓ Historic Property Business API V2 ▓▓▓▒░
      case "createHistoricNonFhlUKPropertyPeriodWithConsolidatedExpensesV2" =>
        V2CreatePeriodSummaryJson.createHistoricNonFhlUKPropertyPeriodWithConsolidatedExpensesV2
      case "createHistoricNonFhlUKPropertyPeriodWithExpensesV2" => V2CreatePeriodSummaryJson.createHistoricNonFhlUKPropertyPeriodWithExpensesV2
      case "AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY_V2" =>
        AmendHistoricFhlUKPropertyPeriodSummaryJsonV2.amendHistoricFhlUKPropertyPeriodSummaryDefaultRequest
      case "AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY_CONSOLIDATED_V2" =>
        AmendHistoricFhlUKPropertyPeriodSummaryJsonV2.amendHistoricFhlUKPropertyPeriodSummaryConsolidatedRequest

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Self Assessment Accounts API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "CREATE_AMEND_CODING_OUT_REQUEST"              => CreateAmendCodingOutJson.createAmendCodingOutRequest
      case "CREATE_AMEND_CODING_OUT_VALUE_ERRORS_REQUEST" => CreateAmendCodingOutJson.createAmendCodingOutValueErrorsRequest
      case "CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_REQUEST" =>
        CreateAmendCodingOutJson.createAmendCodingOutInvalidBodyTaxCodeComponentsRequest
      case "CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_INNER_REQUEST" =>
        CreateAmendCodingOutJson.createAmendCodingOutInvalidBodyTaxCodeComponentsInnerRequest
      case "CREATE_AMEND_CODING_OUT_EMPTY_BODY_REQUEST" => CreateAmendCodingOutJson.createAmendCodingOutEmptyBodyRequest

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Expenses API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "AMEND_OTHER_EXPENSES"                      => OtherExpensesJson.amendOtherExpenses
      case "AMEND_OTHER_EXPENSES_MINIMUM_FIELDS"       => OtherExpensesJson.amendOtherExpensesMinimumFields
      case "AMEND_OTHER_EXPENSES_MISSING_ERRORS"       => OtherExpensesJson.amendOtherExpensesMissingErrorsRequest
      case "AMEND_OTHER_EXPENSES_VALUE_ERRORS_REQUEST" => OtherExpensesJson.amendOtherExpensesValueErrorsRequest

      case "AMEND_EMPLOYMENT_EXPENSES"                      => EmploymentsExpensesJson.AMEND_EMPLOYMENT_EXPENSES
      case "AMEND_EMPLOYMENT_EXPENSES_MINIMUM_FIELDS"       => EmploymentsExpensesJson.AMEND_EMPLOYMENT_EXPENSES_MINIMUM_FIELDS
      case "AMEND_EMPLOYMENT_EXPENSES_MISSING_ERRORS"       => EmploymentsExpensesJson.AMEND_EMPLOYMENT_EXPENSES_MISSING_ERRORS
      case "AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_REQUEST" => EmploymentsExpensesJson.AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_REQUEST

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Other Deductions API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "AMEND_OTHER_DEDUCTIONS"                => OtherDeductionsJson.AMEND_OTHER_DEDUCTIONS
      case "AMEND_OTHER_DEDUCTIONS_MULTIPLE_ITEMS" => OtherDeductionsJson.AMEND_OTHER_DEDUCTIONS_MULTIPLE_ITEMS
      case "AMEND_OTHER_DEDUCTIONS_MINIMUM_FIELDS" => OtherDeductionsJson.AMEND_OTHER_DEDUCTIONS_MINIMUM_FIELDS
      case "AMEND_OTHER_DEDUCTIONS_FIELDS_MISSING" => OtherDeductionsJson.AMEND_OTHER_DEDUCTIONS_FIELDS_MISSING

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Charges API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "AmendIndividualsChargesPensionsMaximum" => IndividualsChargesPensionsRequestJson.AMEND_PENSIONS_CHARGES_MAXIMUM_DEFAULT
      case "AmendIndividualsChargesPensionsMinimum" => IndividualsChargesPensionsRequestJson.AMEND_PENSIONS_CHARGES_MINIMUM_DEFAULT

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Reliefs API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "AMEND_RELIEF_INVESTMENTS"            => ReliefInvestmentsJson.AMEND_RELIEF_INVESTMENTS
      case "reliefInvestmentsAmendMinimumFields" => ReliefInvestmentsJson.reliefInvestmentsAmendMinimumFields
      case "reliefInvestmentsAmendValueErrors"   => ReliefInvestmentsJson.reliefInvestmentsAmendValueErrorsRequest
      case "reliefInvestmentsAmendMissingErrors" => ReliefInvestmentsJson.reliefInvestmentsAmendMissingErrorsRequest

      case "AMEND_FOREIGN_RELIEFS"            => ForeignReliefsJson.AMEND_FOREIGN_RELIEFS
      case "foreignReliefsAmendValueErrors"   => ForeignReliefsJson.foreignReliefsAmendValueErrorsRequest
      case "foreignReliefsAmendMissingErrors" => ForeignReliefsJson.foreignReliefsAmendMissingErrorsRequest

      case "AMEND_OTHER_RELIEFS"            => OtherReliefsJson.AMEND_OTHER_RELIEFS
      case "otherReliefsAmendMinimumFields" => OtherReliefsJson.otherReliefsAmendMinimumFields
      case "otherReliefsAmendValueErrors"   => OtherReliefsJson.otherReliefsAmendValueErrorsRequest
      case "otherReliefsAmendMissingErrors" => OtherReliefsJson.otherReliefsAmendMissingErrorsRequest

      case "AMEND_PENSION_RELIEFS"                   => PensionReliefsJson.AMEND_PENSION_RELIEFS
      case "pensionReliefsAmendMinimumFields"        => PensionReliefsJson.pensionReliefsAmendMinimumFields
      case "pensionReliefsAmendMissingErrorsRequest" => PensionReliefsJson.pensionReliefsAmendMissingErrorsRequest
      case "pensionReliefsAmendValueErrorsRequest"   => PensionReliefsJson.pensionReliefsAmendValueErrorsRequest

      case "CHARITABLE_GIVING_RELIEFS_REQUEST_BODY"               => CharitableGivingReliefsJson.CREATE_OR_AMEND_CHARITABLE_GIVING_RELIEFS
      case "AMEND_CHARITABLE_GIVING_RELIEFS_MINIMUM_FIELDS"       => CharitableGivingReliefsJson.AMEND_CHARITABLE_GIVING_RELIEFS_MINIMUM_FIELDS
      case "AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_REQUEST" => CharitableGivingReliefsJson.AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_REQUEST

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Disclosures API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "iDisclosuresAmendRequest"              => DisclosuresJson.iDisclosuresAmend
      case "iDisclosuresAmendRequestAgain"         => DisclosuresJson.iDisclosuresAmendAgain
      case "iDisclosuresAmendMinimumFieldsRequest" => DisclosuresJson.iDisclosuresAmendMinimumFields
      case "iDisclosuresAmendMissingErrorsRequest" => DisclosuresJson.iDisclosuresAmendMissingErrors
      case "iDisclosuresAmendValueErrorsRequest"   => DisclosuresJson.iDisclosuresAmendValueErrorsRequest
      case "iDisclosuresAmendEmptyBodyRequest"     => DisclosuresJson.iDisclosuresAmendEmptyBodyRequest

      case "marriageAllowanceRequest"              => MarriageAllowanceJson.marriageAllowanceRequest
      case "marriageAllowanceMinimumFieldsRequest" => MarriageAllowanceJson.marriageAllowanceMinimumFields
      case "marriageAllowanceEmptyBodyRequest"     => MarriageAllowanceJson.marriageAllowanceEmptyBodyRequest

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals State Benefits API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "iStateBenefitsAmendRequest"              => AmendStateBenefitJson.iStateBenefitsAmendRequest
      case "iStateBenefitsAmendMinimumFieldsRequest" => AmendStateBenefitJson.iStateBenefitsAmendMinimumFieldsRequest
      case "iStateBenefitsAmendInvalidBodyRequest"   => AmendStateBenefitJson.iStateBenefitsAmendInvalidBodyRequest
      case "iStateBenefitsAmendEmptyBodyRequest"     => AmendStateBenefitJson.iStateBenefitsAmendEmptyBodyRequest
      case "iStateBenefitsAmendValueErrorsRequest"   => AmendStateBenefitJson.iStateBenefitsAmendValueErrorsRequest

      case "iStateBenefitsAddRequest"              => CreateStateBenefitJson.iStateBenefitsAddRequest
      case "iStateBenefitsAddMinimumFieldsRequest" => CreateStateBenefitJson.iStateBenefitsAddMinimumFieldsRequest
      case "iStateBenefitsAddInvalidBodyRequest"   => CreateStateBenefitJson.iStateBenefitsAddInvalidBodyRequest
      case "iStateBenefitsAddValueErrorsRequest"   => CreateStateBenefitJson.iStateBenefitsAddValueErrorsRequest

      case "iStateBenefitsAmendAmountsRequest"              => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsRequest
      case "iStateBenefitsAmendAmountsMinimumFieldsRequest" => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsMinimumFieldsRequest
      case "iStateBenefitsAmendAmountsInvalidBodyRequest"   => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsInvalidBodyRequest
      case "iStateBenefitsAmendAmountsEmptyBodyRequest"     => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsEmptyBodyRequest
      case "iStateBenefitsAmendAmountsValueErrorsRequest"   => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsValueErrorsRequest

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Income Received API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "iirSavingsAmendRequest"              => AmendSavingsIncomeJson.iirSavingsAmendRequest
      case "iirSavingsAmendMinimumFieldsRequest" => AmendSavingsIncomeJson.iirSavingsAmendMinimumFieldsRequest
      case "iirSavingsAmendValueErrorsRequest"   => AmendSavingsIncomeJson.iirSavingsAmendValueErrorsRequest
      case "iirSavingsAmendInvalidBodyRequest"   => AmendSavingsIncomeJson.iirSavingsAmendInvalidBodyRequest
      case "iirSavingsAmendEmptyBodyRequest"     => AmendSavingsIncomeJson.iirSavingsAmendEmptyBodyRequest
      case "iirSavingsAmendRequestAgain"         => AmendSavingsIncomeJson.iirSavingsAmendRequestAgain

      case "iirUkSavingsAccountAddRequest"   => AddUkSavingsAccountJson.iirUkSavingsAccountAddRequest
      case "iirUkSavingsAccountAmendRequest" => AmendUkSavingsAccountIncomeJson.iirUkSavingsAccountAmendRequest

      case "iirInsurancePoliciesAmendRequest"                  => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendRequest
      case "iirInsurancePoliciesAmendMinimumFieldsRequest"     => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendMinimumFieldsRequest
      case "iirInsurancePoliciesAmendInvalidBodyRequest"       => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendInvalidBodyRequest
      case "iirInsurancePoliciesAmendEmptyBodyRequest"         => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendEmptyBodyRequest
      case "iirInsurancePoliciesAmendRefAndEventErrorsRequest" => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendRefAndEventErrorsRequest
      case "iirInsurancePoliciesAmendValueErrorsRequest"       => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendValueErrorsRequest
      case "iirInsurancePoliciesAmendRequestAgain"             => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendRequestAgain

      case "iirForeignAmendRequest"              => AmendForeignIncomeJson.iirForeignAmendRequest
      case "iirForeignAmendMinimumFieldsRequest" => AmendForeignIncomeJson.iirForeignIncomeAmendMinimumFieldsRequest
      case "iirForeignAmendInvalidBodyRequest"   => AmendForeignIncomeJson.iirForeignIncomeAmendInvalidBodyRequest
      case "iirForeignAmendValueErrorsRequest"   => AmendForeignIncomeJson.iirForeignIncomeAmendValueErrorsRequest
      case "iirForeignAmendEmptyBodyRequest"     => AmendForeignIncomeJson.iirForeignIncomeAmendEmptyBodyRequest
      case "iirForeignAmendRequestAgain"         => AmendForeignIncomeJson.iirForeignAmendRequestAgain

      case "iirPensionsAmendRequest"              => AmendPensionsIncomeJson.iirPensionsAmendRequest
      case "iirPensionsAmendMinimumFieldsRequest" => AmendPensionsIncomeJson.iirPensionsAmendMinimumFieldsRequest
      case "iirPensionsAmendInvalidBodyRequest"   => AmendPensionsIncomeJson.iirPensionsAmendInvalidBodyRequest
      case "iirPensionsAmendValueErrorsRequest"   => AmendPensionsIncomeJson.iirPensionsAmendValueErrorsRequest
      case "iirPensionsAmendEmptyBodyRequest"     => AmendPensionsIncomeJson.iirPensionsAmendEmptyBodyRequest
      case "iirPensionsAmendRequestAgain"         => AmendPensionsIncomeJson.iirPensionsAmendRequestAgain

      case "iirOtherAmendRequest"              => AmendOtherIncomeJson.iirOtherAmendRequest
      case "iirOtherAmendMinimumFieldsRequest" => AmendOtherIncomeJson.iirOtherAmendMinimumFieldsRequest
      case "iirOtherAmendInvalidBodyRequest"   => AmendOtherIncomeJson.iirOtherAmendInvalidBodyRequest
      case "iirOtherAmendValueErrorsRequest"   => AmendOtherIncomeJson.iirOtherAmendValueErrorsRequest
      case "iirOtherAmendEmptyBodyRequest"     => AmendOtherIncomeJson.iirOtherIncomeAmendEmptyBodyRequest
      case "iirOtherAmendRequestAgain"         => AmendOtherIncomeJson.iirOtherAmendRequestAgain

      case "iirUkDividendsAmendRequest" => AmendUkDividendsIncomeJson.iirUkDividendsAmendRequest

      case "iirDividendsAmendRequest"              => AmendDividendsIncomeJson.iirDividendsAmendRequest
      case "iirDividendsAmendMinimumFieldsRequest" => AmendDividendsIncomeJson.iirDividendsAmendMinimumFieldsRequest
      case "iirDividendsAmendInvalidBodyRequest"   => AmendDividendsIncomeJson.iirDividendsAmendInvalidBodyRequest
      case "iirDividendsAmendValueErrorsRequest"   => AmendDividendsIncomeJson.iirDividendsAmendValueErrorsRequest
      case "iirDividendsAmendEmptyBodyRequest"     => AmendDividendsIncomeJson.iirDividendsAmendEmptyBodyRequest

      case "iirOtherEmploymentAmendRequest"              => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendRequest
      case "iirOtherEmploymentAmendMinimumFieldsRequest" => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendMinimumFieldsRequest
      case "iirOtherEmploymentAmendValueErrorsRequest"   => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendValueErrorsRequest
      case "iirOtherEmploymentAmendInvalidBodyRequest"   => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendInvalidBodyRequest
      case "iirOtherEmploymentAmendEmptyBodyRequest"     => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendEmptyBodyRequest
      case "iirOtherEmploymentAmendRequestAgain"         => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendRequestAgain

      case "iirCustomEmploymentAddRequest"              => AddCustomEmploymentJson.iirCustomEmploymentAddRequest
      case "iirCustomEmploymentAddMinimumFieldsRequest" => AddCustomEmploymentJson.iirCustomEmploymentAddMinimumFieldsRequest
      case "iirCustomEmploymentAddInvalidBodyRequest"   => AddCustomEmploymentJson.iirCustomEmploymentAddInvalidBodyRequest
      case "iirCustomEmploymentAddValueErrorsRequest"   => AddCustomEmploymentJson.iirCustomEmploymentAddValueErrorsRequest

      case "iirCustomEmploymentAmendRequest"              => AmendCustomEmploymentJson.iirCustomEmploymentAmendRequest
      case "iirCustomEmploymentAmendMinimumFieldsRequest" => AmendCustomEmploymentJson.iirCustomEmploymentAmendMinimumFieldsRequest
      case "iirCustomEmploymentAmendInvalidBodyRequest"   => AmendCustomEmploymentJson.iirCustomEmploymentAmendInvalidBodyRequest
      case "iirCustomEmploymentAmendValueErrorsRequest"   => AmendCustomEmploymentJson.iirCustomEmploymentAmendValueErrorsRequest

      case "iirFinancialDetailsAmendRequest"              => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendRequest
      case "iirFinancialDetailsAmendInvalidRequest"       => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendInvalidRequest
      case "iirFinancialDetailsAmendMinimumFieldsRequest" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendMinimumFieldsRequest
      case "iirFinancialDetailsAmendValueErrorsRequest"   => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendValueErrorsRequest
      case "iirFinancialDetailsAmendMissingErrorsRequest" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendMissingErrorsRequest
      case "iirFinancialDetailsAmendEmptyBenefitsInKindRequest" =>
        AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyBenefitsInKindRequest
      case "iirFinancialDetailsAmendEmptyDeductionsRequest"   => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyDeductionsRequest
      case "iirFinancialDetailsAmendEmptyStudentLoansRequest" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyStudentLoansRequest
      case "iirFinancialDetailsAmendEmptyObjectsRequest"      => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyObjectsRequest

      case "iirOtherCapitalGainsRequest"              => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_REQUEST
      case "iirOtherCapitalGainsMinimumFieldsRequest" => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MINIMUM_FIELDS
      case "iirOtherCapitalGainsMissingFieldsRequest" => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MISSING_FIELDS
      case "iirOtherCapitalGainsInvalidRequest"       => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_INVALID_REQUEST
      case "iirPPDRequest"                            => CreateAmendPPDJson.CREATE_AND_AMEND_PPD
      case "iirPPDMinimumFieldsRequest"               => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MINIMUM_FIELDS
      case "iirPPDMissingFieldsRequest"               => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MISSING_FIELDS
      case "iirPPDInvalidRequest"                     => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_REQUEST

      case "iirCgtResidentialPropertyRequest" => CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_REQUEST
      case "iirCgtResidentialPropertyMinimumFieldsRequest" =>
        CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MINIMUM_FIELDS
      case "iirCgtResidentialPropertyMissingFieldsRequest" =>
        CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MISSING_FIELDS
      case "iirCgtResidentialPropertyInvalidRequest" =>
        CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_INVALID_REQUEST

      case "iirNonPayeEmploymentIncomeRequest" => CreateAmendNonPayeEmploymentIncomeJson.CREATE_AND_AMEND_NON_PAYE_EMPLOYMENT_INCOME_REQUEST

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individual Losses API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░
      // V3
      case "SELF_EMPLOYMENT_V3"                   => IndividualLossesJsonV3.SELF_EMPLOYMENT_V3
      case "SELF_EMPLOYMENT_CLASS4_V3"            => IndividualLossesJsonV3.SELF_EMPLOYMENT_CLASS4_V3
      case "UK_PROPERTY_FHL_V3"                   => IndividualLossesJsonV3.UK_FHL_PROPERTY_V3
      case "UK_PROPERTY_NON_FHL_V3"               => IndividualLossesJsonV3.UK_NON_FHL_PROPERTY_V3
      case "FOREIGN_PROPERTY_V3"                  => IndividualLossesJsonV3.FOREIGN_PROPERTY_V3
      case "FOREIGN_PROPERTY_FHL_EEA_V3"          => IndividualLossesJsonV3.FOREIGN_PROPERTY_FHL_EEA_V3
      case "AMEND_LOSS_CLAIM_SELF_EMPLOYMENT"     => IndividualLossesJsonV3.AMEND_LOSS_CLAIM_SELF_EMPLOYMENT
      case "AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL" => IndividualLossesJsonV3.AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL
      case "LOSS_CLAIM_SELF_EMPLOYMENT_V3"        => IndividualLossesJsonV3.LOSS_CLAIM_SELF_EMPLOYMENT_V3
      case "LOSS_CLAIM_FOREIGN_PROPERTY_V3"       => IndividualLossesJsonV3.LOSS_CLAIM_FOREIGN_PROPERTY_V3
      case "LOSS_CLAIM_UK_PROPERTY_V3"            => IndividualLossesJsonV3.LOSS_CLAIM_UK_PROPERTY_V3
      case "AMEND_LOSS_CLAIM_ORDER_V3"            => IndividualLossesJsonV3.AMEND_LOSS_CLAIM_ORDER_V3
      case "AMEND_LOSS_AMOUNT_V3"                 => IndividualLossesJsonV3.AMEND_LOSS_AMOUNT

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individual Calculations API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      case "TRIGGER_TAX_CALC" => IndividualCalculationsJson.triggerTaxCalc

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Business Source Accounting Summary API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      // V2
      case "SUBMIT_BSAS_ADJUSTMENT_NON_FHL"                       => SubmitBsasJson.NON_FHL_BREAKDOWN
      case "SUBMIT_BSAS_ADJUSTMENT_NON_FHL_CONSOLIDATED"          => SubmitBsasJson.NON_FHL_CONSOLIDATED
      case "SUBMIT_BSAS_ADJUSTMENT_NON_FHL_BOTH_EXPENSES"         => SubmitBsasJson.NON_FHL_BOTH_EXPENSES
      case "SUBMIT_BSAS_ADJUSTMENT_FHL"                           => SubmitBsasJson.FHL_BREAKDOWN
      case "SUBMIT_BSAS_ADJUSTMENT_FHL_CONSOLIDATED"              => SubmitBsasJson.FHL_CONSOLIDATED
      case "SUBMIT_BSAS_ADJUSTMENT_FHL_BOTH_EXPENSES"             => SubmitBsasJson.FHL_BOTH_EXPENSES
      case "SUBMIT_BSAS_ADJUSTMENT_INVALID_FHL_AND_NON_FHL"       => SubmitBsasJson.INVALID_FHL_AND_NON_FHL
      case "SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT"               => SubmitBsasJson.SELF_EMPLOYMENT_BREAKDOWN
      case "SUBMIT_BSAS_ADJUSTMENT_SE_CONSOLIDATED"               => SubmitBsasJson.SELF_EMPLOYMENT_CONSOLIDATED
      case "SUBMIT_BSAS_ADJUSTMENT_INVALID_SELF_EMPLOYMENT"       => SubmitBsasJson.INVALID_SELF_EMPLOYMENT
      case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN"                       => SubmitBsasJson.FOREIGN_PROP_BREAKDOWN
      case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_CONSOLIDATED"          => SubmitBsasJson.FOREIGN_PROP_CONSOLIDATED
      case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_BOTH_EXPENSES"         => SubmitBsasJson.FOREIGN_PROP_BOTH_EXPENSES
      case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA"               => SubmitBsasJson.FOREIGN_FHL_EEA_BREAKDOWN
      case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_CONSOLIDATED"  => SubmitBsasJson.FOREIGN_FHL_EEA_CONSOLIDATED
      case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_BOTH_EXPENSES" => SubmitBsasJson.FOREIGN_FHL_EEA_BOTH_EXPENSES
      case "SUBMIT_BSAS_ADJUSTMENT_INVALID_FOREIGN_AND_FHL_EEA"   => SubmitBsasJson.INVALID_FOREIGN_AND_FHL_EEA
      case "SELF_EMPLOYMENT_BOTH_EXPENSES_SUPPLIED"               => SubmitBsasJson.SELF_EMPLOYMENT_BOTH_EXPENSES_SUPPLIED
      case "V2_TRIGGER_BSAS_FOREIGN_PROPERTY"                     => V2TriggerBsasJson.FOREIGN_PROPERTY
      case "V2_TRIGGER_BSAS_FOREIGN_PROPERTY_FHL_EEA"             => V2TriggerBsasJson.FOREIGN_PROPERTY_FHL_EEA
      case "V2_TRIGGER_BSAS_SELF_EMPLOYMENT"                      => V2TriggerBsasJson.SELF_EMPLOYMENT
      case "V2_TRIGGER_BSAS_UK_FHL_PROPERTY"                      => V2TriggerBsasJson.UK_FHL_PROPERTY
      case "V2_TRIGGER_BSAS_UK_NON_FHL_PROPERTY"                  => V2TriggerBsasJson.UK_NON_FHL_PROPERTY

      // V3
      case "V3_TRIGGER_BSAS_FOREIGN_PROPERTY"                         => V3TriggerBsasJson.FOREIGN_PROPERTY
      case "V3_TRIGGER_BSAS_FOREIGN_PROPERTY_FHL_EEA"                 => V3TriggerBsasJson.FOREIGN_PROPERTY_FHL_EEA
      case "V3_TRIGGER_BSAS_SELF_EMPLOYMENT"                          => V3TriggerBsasJson.SELF_EMPLOYMENT
      case "V3_TRIGGER_BSAS_UK_FHL_PROPERTY"                          => V3TriggerBsasJson.UK_FHL_PROPERTY
      case "V3_TRIGGER_BSAS_UK_NON_FHL_PROPERTY"                      => V3TriggerBsasJson.UK_NON_FHL_PROPERTY
      case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN"                        => V3SubmitBsasJson.V3_FOREIGN_PROPERTY_BREAKDOWN
      case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_CONSOLIDATED"           => V3SubmitBsasJson.V3_FOREIGN_PROPERTY_CONSOLIDATED
      case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA"                => V3SubmitBsasJson.V3_FOREIGN_FHL_EEA_BREAKDOWN
      case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_CONSOLIDATED"   => V3SubmitBsasJson.V3_FOREIGN_FHL_EEA_CONSOLIDATED
      case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_BOTH_EXPENSES"          => V3SubmitBsasJson.V3_FOREIGN_PROPERTY_BOTH_EXPENSES
      case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_BOTH_EXPENSES"  => V3SubmitBsasJson.V3_FOREIGN_FHL_EEA_BOTH_EXPENSES
      case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL"                     => V3SubmitBsasJson.UK_NON_FHL_BREAKDOWN
      case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL_CONSOLIDATED"        => V3SubmitBsasJson.UK_NON_FHL_CONSOLIDATED
      case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL"                         => V3SubmitBsasJson.UK_FHL_BREAKDOWN
      case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL_CONSOLIDATED"            => V3SubmitBsasJson.UK_FHL_CONSOLIDATED
      case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL_BOTH_EXPENSES"       => V3SubmitBsasJson.UK_NON_FHL_BOTH_EXPENSES
      case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL_BOTH_EXPENSES"           => V3SubmitBsasJson.UK_FHL_BOTH_EXPENSES
      case "V3_SUBMIT_BSAS_ADJUSTMENT_INVALID_UK_FHL_AND_NON_FHL"     => V3SubmitBsasJson.INVALID_UK_FHL_AND_NON_FHL
      case "V3_SUBMIT_BSAS_ADJUSTMENT_EMPTY_UK_NON_FHL_INCOME_OBJECT" => V3SubmitBsasJson.EMPTY_UK_NON_FHL_INCOME_OBJECT
      case "V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT"                => V3SubmitBsasJson.V3_SELF_EMPLOYMENT_BREAKDOWN
      case "V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT_CONSOLIDATED"   => V3SubmitBsasJson.V3_SELF_EMPLOYMENT_CONSOLIDATED
      case "V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT_BOTH_EXPENSES"  => V3SubmitBsasJson.V3_SELF_EMPLOYMENT_BOTH_EXPENSES

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Self Assessment API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      // ----- self-assessment-api-legacy -----
      // Self-Employment
      case "SeAddBusiness"                       => SeIncomeSourceJson.seBusiness
      case "SeAddBusiness2nd"                    => SeIncomeSourceJson.seBusiness2nd
      case "SePeriodFull"                        => SePeriodsJson.fullExpensesBody
      case "SePeriodConsolidated"                => SePeriodsJson.consolidatedExpensesBody
      case "SePeriodNoIncomesAndExpenses"        => SePeriodsJson.noIncomesAndExpensesBody
      case "SePeriodFullAndConsolidatedExpenses" => SePeriodsJson.fullAndConsolidatedExpensesBody
      case "SeAnnualSummaryWithTradingAllowance" => SeAnnualSummariesJson.annualSummaryWithTradingAllowance
      case "SeAnnualSummaryOnlyAllowances"       => SeAnnualSummariesJson.annualSummaryWithOnlyAllowances
      case "SeAnnualSummaryBothAllowances"       => SeAnnualSummariesJson.annualSummaryBothAllowancesSupplied
      case "SeAnnualSummaryEmpty"                => SeAnnualSummariesJson.annualSummaryEmpty
      case "SeAnnualSummaryEmptyObjects"         => SeAnnualSummariesJson.annualSummaryEmptyObjects

      // UK Property
      case "UkpAddBusiness"                => "{}"
      case "UkpCreateNonFhlPeriodicUpdate" => UkPropPeriodicUpdatesJson.nonFhlPeriod
      case "UkpAmendNonFhlPeriodicUpdate"  => UkPropPeriodicUpdatesJson.amendNonFhlPeriod
      case "UkpCreateFhlPeriodicUpdate"    => UkPropPeriodicUpdatesJson.fhlPeriod
      case "UkpAmendFhlPeriodicUpdate"     => UkPropPeriodicUpdatesJson.amendFhlPeriod
      case "UkpNonFhlAnnualSummary"        => UkPropAnnualSummaryJson.nonFhlAnnualSummary
      case "UkpFhlAnnualSummary"           => UkPropAnnualSummaryJson.fhlAnnualSummary
      case "UkpAnnualSummaryEmpty"         => UkPropAnnualSummaryJson.annualSummaryEmpty

      // Tax Calculations
      case "TriggerTaxCalc" => TaxCalculationsJson.triggerTaxCalculationBody

      // ----- mtd-charitable-giving -----
      case "CHARITIES_FULL_PAYLOAD"                          => CharitableGivingJson.FULL_PAYLOAD
      case "FULL_PAYLOAD_EMOJI_nonUKCharityNames"            => CharitableGivingJson.FULL_PAYLOAD_EMOJI_nonUKCharityNames
      case "FULL_PAYLOAD_EMOJI_investmentsNonUKCharityNames" => CharitableGivingJson.FULL_PAYLOAD_EMOJI_investmentsNonUKCharityNames
      case "CHARITIES_PARTIAL_PAYLOAD"                       => CharitableGivingJson.PARTIAL_PAYLOAD
      case "CHARITIES_GIFTS_ONLY"                            => CharitableGivingJson.GIFTS_ONLY
      case "CHARITIES_GIFT_AID_PAYMENTS_ONLY"                => CharitableGivingJson.GIFT_AID_PAYMENTS_ONLY

      // ----- mtd-crystallisation -----
      case "crystallisationBody" => CrystallisationJson.crystallisationBody

      // ----- mtd-dividends-income -----
      case "dividendsEmptyBody"            => DividendsJson.emptyBody
      case "dividendsFullDividends"        => DividendsJson.fullDividends
      case "dividendsUkDividendsOnly"      => DividendsJson.ukDividendsOnly
      case "dividendsOtherUkDividendsOnly" => DividendsJson.otherUkDividendsOnly

      // ----- mtd-property-api -----
      case "UkPropEopsDeclarationTrue"  => UkPropEopsDeclarationJson.EopsDeclarationTrue
      case "UkPropEopsDeclarationFalse" => UkPropEopsDeclarationJson.EopsDeclarationFalse

      // ----- mtd-savings-accounts -----
      case "SavingsName32Characters"      => SavingsJson.name32Characters
      case "SavingsNameValidSymbols"      => SavingsJson.nameValidSymbols
      case "SavingsNameSpace"             => SavingsJson.nameSpace
      case "SavingsName33Characters"      => SavingsJson.name33Characters
      case "SavingsNameInvalidSymbols"    => SavingsJson.nameInvalidSymbols
      case "SavingsNameEmpty"             => SavingsJson.nameEmpty
      case "SavingsNameEmojis"            => SavingsJson.nameEmojis
      case "SavingsNameForeignCharacters" => SavingsJson.nameForeignCharacters
      case "savingsAccountAnnualSummary"  => SavingsJson.savingsAccountAnnualSummary

      // ----- mtd-self-employment -----
      case "submitSeEopsTrue"  => SubmitSeEopsJson.submitEopsTrue
      case "submitSeEopsFalse" => SubmitSeEopsJson.submitEopsFalse

      // ----- Individuals Business EOPS -----

      // V1
      case "SubmitBusinessEOPSSelfEmployment"  => SubmitBusinessEOPSRequestJsonV1.submitEOPSStatementSelfEmployment
      case "SubmitBusinessEOPSUkProperty"      => SubmitBusinessEOPSRequestJsonV1.submitEOPSStatementUkProperty
      case "SubmitBusinessEOPSForeignProperty" => SubmitBusinessEOPSRequestJsonV1.submitEOPSStatementForeignProperty

      // V2
      case "SubmitBusinessEOPSSelfEmploymentV2"  => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementSelfEmploymentV2
      case "SubmitBusinessEOPSUkPropertyV2"      => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementUkPropertyV2
      case "SubmitBusinessEOPSForeignPropertyV2" => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementForeignPropertyV2

      case _ => "{}"

    }
  }

}
