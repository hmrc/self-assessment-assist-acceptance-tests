/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints

import play.api.libs.json.{Json, Reads}
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.json.CisDeductionsApi.CisDeductionsJson
import uk.gov.hmrc.integration.cucumber.json.IndividualCalculationsApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualDisclosuresApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualLossesApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualsBusinessEOPSApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualsExpensesApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived._
import uk.gov.hmrc.integration.cucumber.json.IndividualsReliefsApi._
import uk.gov.hmrc.integration.cucumber.json.IndividualsStateBenefitsApi._
import uk.gov.hmrc.integration.cucumber.json.MtdCharitableGiving._
import uk.gov.hmrc.integration.cucumber.json.MtdCrystallisation._
import uk.gov.hmrc.integration.cucumber.json.MtdDividendsIncome._
import uk.gov.hmrc.integration.cucumber.json.MtdSavingsAccount._
import uk.gov.hmrc.integration.cucumber.json.MtdTaxCalculation._
import uk.gov.hmrc.integration.cucumber.json.ObligationsApi.RetrieveEOPSJson
import uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi._
import uk.gov.hmrc.integration.cucumber.json.SaAccountsApi._
import uk.gov.hmrc.integration.cucumber.json.SaBissApi.RetrieveBissJson
import uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V2._
import uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V3._
import uk.gov.hmrc.integration.cucumber.json.SelfAssessmentAssistAPI.SelfEmployment.SeAnnualSummariesJson
import uk.gov.hmrc.integration.cucumber.json.SelfAssessmentAssistAPI._
import uk.gov.hmrc.integration.cucumber.json.SelfEmploymentBusinessApi.AnnualSubmission._
import uk.gov.hmrc.integration.cucumber.json.SelfEmploymentBusinessApi.PeriodSummary.{AmendSEPeriodSummaryJson, CreateSEPeriodSummaryJson}
import uk.gov.hmrc.integration.cucumber.json._

object ResponseBodies {

  def checkResponseBodyStructure[A](body: String)(implicit rds: Reads[A]): Unit =
    Json
      .parse(body)
      .validate[A]
      .fold(
        invalid =>
          Predef
            .assert(assertion = false, s"JSON Response did not match the expected format and could not be parsed.\nErrors: $invalid\n${errorLog()}"),
        _ => Predef.assert(assertion = true)
      )

  def findKeyAndMatchValue[T](key: String, value: String)(implicit reads: Reads[T]): Boolean = {
    request.body.exists(b =>
      (Json.parse(b) \\ key).headOption
        .exists(_.as[T].toString == value))
  }

  def retrieveExpectedResponse(responseName: String): String = {
    responseName match {

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ SUCCESSFUL RESPONSES ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      // ----- MTD API template endpoint -----
      case "INCOME_API_TEMPLATE_RESPONSE"         => SampleEndpointJson.INCOME_API_TEMPLATE_RESPONSE
      case "DEDUCTIONS_API_TEMPLATE_RESPONSE"     => SampleEndpointJson.DEDUCTIONS_API_TEMPLATE_RESPONSE
      case "DISCLOSURES_API_TEMPLATE_RESPONSE"    => SampleEndpointJson.DISCLOSURES_API_TEMPLATE_RESPONSE
      case "STATE_BENEFITS_API_TEMPLATE_RESPONSE" => SampleEndpointJson.STATE_BENEFITS_API_TEMPLATE_RESPONSE

      // ----- individuals-disclosures-api ----
      case "iDisclosuresRetrieval" => DisclosuresJson.iDisclosuresAmendRetrieval

      // ----- self-employment-business-api -----
      case "AMEND_SE_RULE_ALLOWANCE_NOT_SUPPORTED" => AmendSEAnnualSubmissionJson.allowanceNotSupportedErrorResponse

      // ----- property-business-api -----
      // Annual Submission

      // Period Summary
      case "PROPERTY_BUSINESS_DEFAULT_RESPONSE"                  => RetrievePeriodSummaryJson.PeriodSummaryDefaultResponse
      case "PROPERTY_BUSINESS_CONSOLIDATED_EXPENDITURE_RESPONSE" => RetrievePeriodSummaryJson.PeriodSummaryConsolidatedExpenditureResponse
      case "PROPERTY_BUSINESS_NO_EXPENDITURE_RESPONSE"           => RetrievePeriodSummaryJson.PeriodSummaryNoExpenditureResponse

      // ----- property-business-api V2 -----
      case "PROPERTY_BUSINESS_V2_RULE_TYPE_OF_BUSINESS_INCORRECT" =>
        AmendUKPropAnnualSubmissionJson.PROPERTY_BUSINESS_V2_RULE_TYPE_OF_BUSINESS_INCORRECT

      // ----- self-assessment-bsas-api -----

      // V2
      case "V2_LIST_BSAS_DEFAULT"                   => V2ListBsasJson.LIST_BSAS_DEFAULT
      case "V2_LIST_BSAS_FOREIGN_PROPERTY"          => V2ListBsasJson.LIST_BSAS_FOREIGN_PROPERTY
      case "V2_LIST_BSAS_FOREIGN_PROPERTY_FHL_EEA"  => V2ListBsasJson.LIST_BSAS_FOREIGN_PROPERTY_FHL_EEA
      case "V2_LIST_BSAS_MULTIPLE_FOREIGN_PROPERTY" => V2ListBsasJson.LIST_BSAS_MULTIPLE_FOREIGN_PROPERTY
      case "V2_LIST_BSAS_SE"                        => V2ListBsasJson.LIST_BSAS_SE
      case "V2_LIST_BSAS_MULTIPLE_SE"               => V2ListBsasJson.LIST_BSAS_MULTIPLE_SE
      case "V2_LIST_BSAS_UK_PROPERTY_FHL"           => V2ListBsasJson.LIST_BSAS_UK_PROPERTY_FHL
      case "V2_LIST_BSAS_UK_PROPERTY_NON_FHL"       => V2ListBsasJson.LIST_BSAS_UK_PROPERTY_NON_FHL
      case "V2_LIST_BSAS_MULTIPLE_PROPERTY"         => V2ListBsasJson.LIST_BSAS_MULTIPLE_PROPERTY
      case "FOREIGN_PROP_FHL_EEA_ADJUSTED"          => V2RetrieveForeignBsasJson.FOREIGN_PROP_FHL_EEA_ADJUSTED
      case "FOREIGN_PROP_FHL_EEA_CONSOLIDATED"      => V2RetrieveForeignBsasJson.FOREIGN_PROP_FHL_EEA_CONSOLIDATED
      case "FOREIGN_PROP_ADJUSTED"                  => V2RetrieveForeignBsasJson.FOREIGN_PROP_ADJUSTED
      case "FOREIGN_PROP_CONSOLIDATED"              => V2RetrieveForeignBsasJson.FOREIGN_PROP_CONSOLIDATED

      // ----- self-assessment-api-legacy -----
      // Self-Employment
      case "SE Full expenses period"                   => SelfEmployment.SePeriodsJson.fullExpensesBody
      case "SE_ANNUAL_SUMMARY_TRADING_ALLOWANCE"       => SeAnnualSummariesJson.annualSummaryWithTradingAllowance
      case "SE_ANNUAL_SUMMARY_ONLY_ALLOWANCES"         => SeAnnualSummariesJson.annualSummaryWithOnlyAllowances
      case "SE_ANNUAL_SUMMARY_BOTH_ALLOWANCE_SUPPLIED" => SeAnnualSummariesJson.RULE_BOTH_ALLOWANCES_SUPPLIED

      // UK Property
      case "UK property Non-FHL get a period"       => UkProperty.UkPropPeriodicUpdatesJson.nonFhlPeriod
      case "UK property FHL get a period"           => UkProperty.UkPropPeriodicUpdatesJson.fhlPeriod
      case "UK property list periods"               => UkProperty.UkPropPeriodicUpdatesJson.listPeriods
      case "Get Non-FHL UK Property Annual Summary" => UkProperty.UkPropAnnualSummaryJson.nonFhlAnnualSummary
      case "Get FHL UK Property Annual Summary"     => UkProperty.UkPropAnnualSummaryJson.fhlAnnualSummary

      // ----- mtd-tax-calculation -----
      case "Retrieve Tax Calculation V2 ALL_FIELDS_TEST_ONLY"      => RetrieveTaxCalculationJson.taxCalculationV2AllFieldsTestOnly
      case "Retrieve Tax Calculation V2 SELF_EMPLOYMENT"           => RetrieveTaxCalculationJson.taxCalculationV2SeIncome
      case "Retrieve Tax Calculation V2 BVR_ERRORS"                => RetrieveTaxCalculationJson.taxCalculationV2BvrErrors
      case "Retrieve Tax Calculation V2 WITH_WARNINGS"             => RetrieveTaxCalculationJson.taxCalculationV2WithWarnings
      case "Retrieve Tax Calculation messages WARNINGS_ONLY"       => RetrieveTaxCalculationJson.taxCalculationV2WarningsOnly
      case "Retrieve Tax Calculation messages ERRORS_ONLY"         => RetrieveTaxCalculationJson.taxCalculationV2ErrorsOnly
      case "Retrieve Tax Calculation messages ERRORS_AND_WARNINGS" => RetrieveTaxCalculationJson.taxCalculationV2ErrorsAndWarnings

      // ----- mtd-dividends-income -----
      case "DividendsFullDividends"        => DividendsJson.fullDividends
      case "DIVIDENDS_RETRIEVE_DEFAULT"    => DividendsJson.RETRIEVE_DEFAULT
      case "DIVIDENDS_RETRIEVE_ONLY_UK"    => DividendsJson.RETRIEVE_ONLY_UK
      case "DIVIDENDS_RETRIEVE_ONLY_OTHER" => DividendsJson.RETRIEVE_ONLY_OTHER

      // ----- mtd-charitable-giving -----
      case "CHARITIES_RETRIEVE_DEFAULT"                  => CharitableGivingJson.RETRIEVE_DEFAULT
      case "CHARITIES_RETRIEVE_ONLY_GIFT_AID_PAYMENTS"   => CharitableGivingJson.RETRIEVE_ONLY_GIFT_AID_PAYMENTS
      case "CHARITIES_RETRIEVE_ONLY_GIFTS"               => CharitableGivingJson.RETRIEVE_ONLY_GIFTS
      case "CHARITIES_RETRIEVE_WITHOUT_NON_UK_CHARITIES" => CharitableGivingJson.RETRIEVE_WITHOUT_NON_UK_CHARITIES
      case "CHARITIES_RETRIEVE_ZERO_NON_UK_CHARITIES"    => CharitableGivingJson.RETRIEVE_ZERO_NON_UK_CHARITIES
      case "CHARITIES_RETRIEVE_REMOVED_VALUES_EXAMPLE_1" => CharitableGivingJson.RETRIEVE_REMOVED_VALUES_EXAMPLE_1
      case "CHARITIES_RETRIEVE_REMOVED_VALUES_EXAMPLE_2" => CharitableGivingJson.RETRIEVE_REMOVED_VALUES_EXAMPLE_2

      // ----- mtd-savings-account -----
      case "SAVINGS_LIST_ALL_DEFAULT"                         => SavingsJson.LIST_ALL_DEFAULT
      case "SAVINGS_ACCOUNTS_LARGE"                           => SavingsJson.SAVINGS_ACCOUNTS_LARGE
      case "SAVINGS_RETRIEVE_ANNUAL_DEFAULT"                  => SavingsJson.RETRIEVE_ANNUAL_DEFAULT
      case "SAVINGS_RETRIEVE_ANNUAL_ONLY_TAXED_UK_INTEREST"   => SavingsJson.RETRIEVE_ANNUAL_ONLY_TAXED_UK_INTEREST
      case "SAVINGS_RETRIEVE_ANNUAL_ONLY_UNTAXED_UK_INTEREST" => SavingsJson.RETRIEVE_ANNUAL_ONLY_UNTAXED_UK_INTEREST
      case "SAVINGS_RETRIEVE_ANNUAL_REMOVED_VALUES_EXAMPLE_1" => SavingsJson.RETRIEVE_ANNUAL_REMOVED_VALUES_EXAMPLE_1
      case "SAVINGS_RETRIEVE_ANNUAL_REMOVED_VALUES_EXAMPLE_2" => SavingsJson.RETRIEVE_ANNUAL_REMOVED_VALUES_EXAMPLE_2
      case "SAVINGS_RETRIEVE_DEFAULT"                         => SavingsJson.RETRIEVE_DEFAULT
      case "SAVINGS_RETRIEVE_ENGLISH"                         => SavingsJson.RETRIEVE_ENGLISH
      case "SAVINGS_RETRIEVE_GREEK"                           => SavingsJson.RETRIEVE_GREEK
      case "SAVINGS_RETRIEVE_CHINESE"                         => SavingsJson.RETRIEVE_CHINESE

      // ----- mtd-crystallisation -----
      case "RETRIEVE_CRYSTALLISATION_DEFAULT"              => CrystallisationJson.RETRIEVE_CRYSTALLISATION_DEFAULT
      case "RETRIEVE_CRYSTALLISATION_OBLIGATION_OPEN"      => CrystallisationJson.RETRIEVE_CRYSTALLISATION_OBLIGATION_OPEN
      case "RETRIEVE_CRYSTALLISATION_OBLIGATION_FULFILLED" => CrystallisationJson.RETRIEVE_CRYSTALLISATION_OBLIGATION_FULFILLED

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ ERROR RESPONSES ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      // Common Errors
      case "CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API" => CommonErrorsJson.CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API
      case "CLIENT_OR_AGENT_NOT_AUTHORISED"        => CommonErrorsJson.CLIENT_OR_AGENT_NOT_AUTHORISED
      case "CLIENT_OR_AGENT_NOT_AUTHORISED_v2"     => CommonErrorsJson.CLIENT_OR_AGENT_NOT_AUTHORISED_v2
      case "CLIENT_NOT_SUBSCRIBED"                 => CommonErrorsJson.CLIENT_NOT_SUBSCRIBED
      case "UNAUTHORIZED"                          => CommonErrorsJson.UNAUTHORIZED
      case "AGENT_NOT_AUTHORIZED"                  => CommonErrorsJson.AGENT_NOT_AUTHORIZED
      case "INVALID_BODY_TYPE"                     => CommonErrorsJson.INVALID_BODY_TYPE
      case "INTERNAL_SERVER_ERROR"                 => CommonErrorsJson.INTERNAL_SERVER_ERROR
      case "NOT_FOUND"                             => CommonErrorsJson.NOT_FOUND
      case "NOT_FOUND_ALTERNATE"                   => CommonErrorsJson.NOT_FOUND_ALTERNATE
      case "NOT_FOUND_API_GATEWAY"                 => CommonErrorsJson.NOT_FOUND_API_GATEWAY
      case "RULE_INSOLVENT_TRADER"                 => CommonErrorsJson.RULE_INSOLVENT_TRADER
      case "MATCHING_RESOURCE_NOT_FOUND"           => CommonErrorsJson.MATCHING_RESOURCE_NOT_FOUND
      case "RULE_INCORRECT_GOV_TEST_SCENARIO"      => CommonErrorsJson.RULE_INCORRECT_GOV_TEST_SCENARIO
      case "ACCEPT_HEADER_INVALID"                 => CommonErrorsJson.ACCEPT_HEADER_INVALID
      case "FORMAT_NINO"                           => CommonErrorsJson.FORMAT_NINO
      case "FORMAT_TAX_YEAR"                       => CommonErrorsJson.FORMAT_TAX_YEAR
      case "INVALID_CORRELATIONID"                 => CommonErrorsJson.INVALID_CORRELATIONID
      case "RULE_SUBMISSION_FAILED"                => CommonErrorsJson.RULE_SUBMISSION_FAILED

      // Common Errors API Platform
      case "MATCHING_RESOURCE_NOT_FOUND_AP" => CommonErrorsJson.MATCHING_RESOURCE_NOT_FOUND_AP
      case "MISSING_CREDENTIALS"            => CommonErrorsJson.MISSING_CREDENTIALS

      // CIS Deductions API
      case "CIS_AMEND_DEDUCTIONS_DATE_RANGE_INVALID"  => CisDeductionsJson.CIS_AMEND_DEDUCTIONS_DATE_RANGE_INVALID
      case "CIS_AMEND_DUPLICATE_PERIOD"               => CisDeductionsJson.CIS_AMEND_DUPLICATE_PERIOD
      case "CIS_AMEND_UNALIGNED_DEDUCTIONS_PERIOD"    => CisDeductionsJson.CIS_AMEND_UNALIGNED_DEDUCTIONS_PERIOD
      case "CIS_CREATE_DEDUCTIONS_DATE_RANGE_INVALID" => CisDeductionsJson.CIS_CREATE_DEDUCTIONS_DATE_RANGE_INVALID
      case "CIS_CREATE_DUPLICATE_PERIOD"              => CisDeductionsJson.CIS_CREATE_DUPLICATE_PERIOD
      case "CIS_CREATE_DUPLICATE_SUBMISSION"          => CisDeductionsJson.CIS_CREATE_DUPLICATE_SUBMISSION
      case "CIS_CREATE_TAX_YEAR_NOT_ENDED"            => CisDeductionsJson.CIS_CREATE_TAX_YEAR_NOT_ENDED
      case "CIS_CREATE_UNALIGNED_DEDUCTIONS_PERIOD"   => CisDeductionsJson.CIS_CREATE_UNALIGNED_DEDUCTIONS_PERIOD
      case "CIS_RULE_DATE_RANGE_OUT_OF_DATE"          => CisDeductionsJson.CIS_RULE_DATE_RANGE_OUT_OF_DATE

      // Income Received Errors
      case "RULE_CUSTOM_EMPLOYMENT_IGNORE"   => IncomeReceivedErrorsJson.RULE_CUSTOM_EMPLOYMENT_IGNORE
      case "RULE_CUSTOM_EMPLOYMENT_UNIGNORE" => IncomeReceivedErrorsJson.RULE_CUSTOM_EMPLOYMENT_UNIGNORE

      // State Benefits Errors
      case "RULE_DELETE_FORBIDDEN"   => StateBenefitsErrorsJson.RULE_DELETE_FORBIDDEN
      case "RULE_IGNORE_FORBIDDEN"   => StateBenefitsErrorsJson.RULE_IGNORE_FORBIDDEN
      case "RULE_UNIGNORE_FORBIDDEN" => StateBenefitsErrorsJson.RULE_UNIGNORE_FORBIDDEN

      // ----- self-assessment-api -----
      case "RESOURCE_GONE"                => ErrorsJson.RESOURCE_GONE
      case "TAX_YEAR_NOT_FOUND"           => ErrorsJson.TAX_YEAR_NOT_FOUND
      case "MULTIPLE_ERRORS_ALTERNATE"    => ErrorsJson.MULTIPLE_ERRORS_ALTERNATE
      case "NINO_NOT_FOUND"               => ErrorsJson.NINO_NOT_FOUND
      case "SELF_EMPLOYMENT_ID_NOT_FOUND" => ErrorsJson.SELF_EMPLOYMENT_ID_NOT_FOUND
      case "TAX_YEAR_NOT_FOUND_ALTERNATE" => ErrorsJson.TAX_YEAR_NOT_FOUND_ALTERNATE
      case "NO_INCOMES_AND_EXPENSES"      => SelfEmployment.SePeriodsJson.NO_INCOMES_AND_EXPENSES
      case "BOTH_EXPENSES_SUPPLIED"       => SelfEmployment.SePeriodsJson.BOTH_EXPENSES_SUPPLIED

      // ----- mtd-savings-accounts -----
      case "FORMAT_ACCOUNT_NAME" => SavingsJson.FORMAT_ACCOUNT_NAME

      // ----- mtd-dividends-income -----
      case "DIVIDENDS_RETRIEVE_TEST_ONLY_MULTIPLE_ERRORS" => DividendsJson.RETRIEVE_TEST_ONLY_MULTIPLE_ERRORS

      // ----- mtd-crystallisation ------
      case "RULE_INCOME_SOURCES_CHANGED"   => CrystallisationJson.RULE_INCOME_SOURCES_CHANGED
      case "RULE_RECENT_SUBMISSIONS_EXIST" => CrystallisationJson.RULE_RECENT_SUBMISSIONS_EXIST
      case "RULE_RESIDENCY_CHANGED"        => CrystallisationJson.RULE_RESIDENCY_CHANGED
      case "FINAL_DECLARATION_RECEIVED"    => CrystallisationJson.FINAL_DECLARATION_RECEIVED
      case "NO_SUBMISSIONS_EXIST"          => CrystallisationJson.NO_SUBMISSIONS_EXIST
      case "RULE_INCOME_SOURCES_INVALID"   => CrystallisationJson.RULE_INCOME_SOURCES_INVALID

      // ----- individual-losses-api -----
      // V3
      case "RULE_DUPLICATE_SUBMISSION_V3"        => IndividualLossesJsonV3.RULE_DUPLICATE_SUBMISSION_V3
      case "RULE_DELETE_AFTER_FINAL_DECLARATION" => IndividualLossesJsonV3.RULE_DELETE_AFTER_FINAL_DECLARATION
      case "DUPLICATE_LOSS_CLAIM"                => IndividualLossesJsonV3.RULE_DUPLICATE_SUBMISSION_LOSS_CLAIMS
      case "AMEND_LOSS_RULE_NO_CHANGE"           => IndividualLossesJsonV3.AMEND_BF_LOSS_RULE_NO_CHANGE
      case "RULE_ACCOUNTING_PERIOD_NOT_ENDED"    => IndividualLossesJsonV3.RULE_ACCOUNTING_PERIOD_NOT_ENDED
      case "RULE_NO_ACCOUNTING_PERIOD"           => IndividualLossesJsonV3.NO_ACCOUNTING_PERIOD
      case "RULE_TYPE_OF_CLAIM_INVALID_V3"       => IndividualLossesJsonV3.AMEND_LOSS_CLAIM_RULE_TYPE_OF_CLAIM_INVALID_V3
      case "RULE_NO_CHANGE"                      => IndividualLossesJsonV3.RULE_NO_CHANGE
      case "RULE_LOSS_CLAIMS_MISSING"            => IndividualLossesJsonV3.RULE_LOSS_CLAIMS_MISSING

      // ----- individual-calculation-api -----
      //V2
      case "RULE_CALCULATION_ERROR_MESSAGES_EXIST"  => IndividualCalculationsJson.RULE_CALCULATION_ERROR_MESSAGES_EXIST
      case "NO_MESSAGES_PRESENT"                    => IndividualCalculationsJson.NO_MESSAGES_PRESENT
      case "END_OF_YEAR_ESTIMATE_NOT_PRESENT"       => IndividualCalculationsJson.END_OF_YEAR_ESTIMATE_NOT_PRESENT
      case "NO_ALLOWANCES_DEDUCTIONS_RELIEFS_EXIST" => IndividualCalculationsJson.NO_ALLOWANCES_DEDUCTIONS_RELIEFS_EXIST
      case "RULE_FINAL_DECLARATION_RECEIVED"        => IndividualCalculationsJson.RULE_FINAL_DECLARATION_RECEIVED
      case "RULE_NO_SUBMISSIONS_EXIST"              => IndividualCalculationsJson.RULE_NO_SUBMISSIONS_EXIST
      case "RULE_NO_INCOME_SUBMISSIONS_EXIST"       => IndividualCalculationsJson.RULE_NO_INCOME_SUBMISSION_EXIST
      case "v3_RULE_FINAL_DECLARATION_RECEIVED"     => IndividualCalculationsJson.v3_RULE_FINAL_DECLARATION_RECEIVED


      //V3
      case "V3_RULE_INCOME_SOURCES_CHANGED"         => IndividualCalculationsJson.RULE_INCOME_SOURCES_CHANGED
      case "V3_RULE_RECENT_SUBMISSIONS_EXIST"       => IndividualCalculationsJson.RULE_RECENT_SUBMISSIONS_EXIST
      case "V3_RULE_RESIDENCY_CHANGED"              => IndividualCalculationsJson.RULE_RESIDENCY_CHANGED
      case "V3_RULE_FINAL_DECLARATION_RECEIVED"     => IndividualCalculationsJson.V3_RULE_FINAL_DECLARATION_RECEIVED
      case "V3_RULE_INCOME_SOURCES_INVALID"         => IndividualCalculationsJson.RULE_INCOME_SOURCES_INVALID
      case "V3_RULE_NO_INCOME_SUBMISSIONS_EXIST"    => IndividualCalculationsJson.RULE_NO_INCOME_SUBMISSIONS_EXIST
      case "V3_RULE_SUBMISSION_FAILED"              => IndividualCalculationsJson.RULE_SUBMISSION_FAILED

      // ----- self-assessment-biss-api -----

      case "BISS_RULE_NO_INCOME_SUBMISSIONS_EXIST" => RetrieveBissJson.BISS_RULE_NO_INCOME_SUBMISSIONS_EXIST

      // ----- self-assessment-bsas-api -----

      // V2
      case "RULE_PERIODIC_DATA_INCOMPLETE"                  => V2TriggerBsasJson.RULE_PERIODIC_DATA_INCOMPLETE
      case "BSAS_RULE_NO_ACCOUNTING_PERIOD"                 => V2TriggerBsasJson.BSAS_TRIGGER_RULE_NO_ACCOUNTING_PERIOD
      case "RULE_NOT_UK_PROPERTY"                           => V2RetrieveBsasJson.RULE_NOT_UK_PROPERTY
      case "RULE_NO_ADJUSTMENTS_MADE"                       => V2RetrieveBsasJson.RULE_NO_ADJUSTMENTS_MADE
      case "RULE_NOT_SELF_EMPLOYMENT"                       => V2RetrieveBsasJson.RULE_NOT_SELF_EMPLOYMENT
      case "RULE_NOT_FOREIGN_PROPERTY"                      => V2RetrieveForeignBsasJson.RULE_NOT_FOREIGN_PROPERTY
      case "BSAS_RULE_BOTH_EXPENSES_SUPPLIED"               => SubmitBsasJson.BSAS_RULE_BOTH_EXPENSES_SUPPLIED
      case "BSAS_RULE_SELF_EMPLOYMENT_ADJUSTED"             => SubmitBsasJson.BSAS_RULE_SELF_EMPLOYMENT_ADJUSTED
      case "BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT"           => SubmitBsasJson.BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT
      case "BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED"    => SubmitBsasJson.BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED
      case "BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD" => SubmitBsasJson.BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD
      case "BSAS_RULE_SUMMARY_STATUS_SUPERSEDED"            => SubmitBsasJson.BSAS_RULE_SUMMARY_STATUS_SUPERSEDED
      case "BSAS_RULE_SUMMARY_STATUS_INVALID"               => SubmitBsasJson.BSAS_RULE_SUMMARY_STATUS_INVALID
      case "BSAS_RULE_BSAS_ALREADY_ADJUSTED"                => SubmitBsasJson.BSAS_RULE_BSAS_ALREADY_ADJUSTED
      case "RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED"         => CommonErrorsJson.RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED
      case "BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED"     => SubmitBsasJson.BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED
      case "BSAS_RULE_NOT_SELF_EMPLOYMENT"                  => SubmitBsasJson.BSAS_RULE_NOT_SELF_EMPLOYMENT
      case "BSAS_RULE_UK_PROPERTY_ADJUSTED"                 => SubmitBsasJson.BSAS_RULE_UK_PROPERTY_ADJUSTED
      case "BSAS_RULE_INCORRECT_PROPERTY_ADJUSTED"          => SubmitBsasJson.BSAS_RULE_INCORRECT_PROPERTY_ADJUSTED
      case "BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED"        => SubmitBsasJson.BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED

      // V3
      case "V3_RULE_PERIODIC_DATA_INCOMPLETE"                          => V3TriggerBsasJson.RULE_PERIODIC_DATA_INCOMPLETE
      case "V3_BSAS_RULE_NO_ACCOUNTING_PERIOD"                         => V3TriggerBsasJson.BSAS_TRIGGER_RULE_NO_ACCOUNTING_PERIOD
      case "V3_RULE_ACCOUNTING_PERIOD_NOT_ENDED"                       => V3TriggerBsasJson.RULE_ACCOUNTING_PERIOD_NOT_ENDED
      case "V3_BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT"                   => V3CommonBsasJson.BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT
      case "V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_PROPERTY"      => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_PROPERTY
      case "V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_FHL_EEA"       => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_FHL_EEA
      case "V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_FHL"                => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_FHL
      case "V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_NON_FHL"            => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_NON_FHL
      case "V3_BSAS_RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED_WITH_PATHS" => V3SubmitBsasJson.V3_BSAS_RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED_WITH_PATHS
      case "V3_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED"            => V3SubmitBsasJson.V3_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED
      case "V3_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD"         => V3SubmitBsasJson.V3_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD
      case "V3_BSAS_RULE_SUMMARY_STATUS_INVALID"                       => V3SubmitBsasJson.V3_BSAS_RULE_SUMMARY_STATUS_INVALID
      case "V3_BSAS_RULE_ALREADY_ADJUSTED"                             => V3SubmitBsasJson.V3_BSAS_RULE_ALREADY_ADJUSTED
      case "V3_BSAS_RULE_BOTH_PROPERTIES_SUPPLIED"                     => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_PROPERTIES_SUPPLIED
      case "V3_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED"                => V3SubmitBsasJson.V3_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED
      case "V3_BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED"             => V3SubmitBsasJson.V3_BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED
      case "V3_BSAS_RULE_BSAS_ALREADY_ADJUSTED"                        => V3SubmitBsasJson.V3_BSAS_RULE_ALREADY_ADJUSTED
      case "V3_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED"                    => V3SubmitBsasJson.V3_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED
      case "V3_BSAS_RULE_SELF_EMPLOYMENT_BOTH_EXPENSES"                => V3SubmitBsasJson.V3_BSAS_RULE_SELF_EMPLOYMENT_BOTH_EXPENSES

      // ----- self-assessment-accounts-api -----
      // Payments and Liabilities
      case "NO_DETAILS_FOUND" => TransactionDetailsJson.NO_DETAILS_FOUND

      // Coding Out Underpayments and Debts
      case "CREATE_AMEND_CODING_OUT_VALUE_ERRORS_RESPONSE" => CreateAmendCodingOutJson.createAmendCodingOutValueErrorsResponse
      case "CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_RESPONSE" =>
        CreateAmendCodingOutJson.createAmendCodingOutInvalidBodyTaxCodeComponentsResponse
      case "CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_INNER_RESPONSE" =>
        CreateAmendCodingOutJson.createAmendCodingOutInvalidBodyTaxCodeComponentsInnerResponse
      case "CODING_OUT_NOT_FOUND" => CodingOutJson.CODING_OUT_NOT_FOUND

      // ----- individuals-income-received-api -----
      case "iirSavingsAmendValueErrorsResponse"                 => AmendSavingsIncomeJson.iirSavingsAmendValueErrorsResponse
      case "iirSavingsAmendInvalidBodyResponse"                 => AmendSavingsIncomeJson.iirSavingsAmendInvalidBodyResponse
      case "iirInsurancePoliciesAmendValueErrorsResponse"       => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendValueErrorsResponse
      case "iirInsurancePoliciesAmendRefAndEventErrorsResponse" => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendRefAndEventErrorsResponse
      case "iirInsurancePoliciesAmendInvalidBodyResponse"       => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendInvalidBodyResponse
      case "iirForeignAmendValueErrorsResponse"                 => AmendForeignIncomeJson.iirForeignIncomeAmendValueErrorsResponse
      case "iirForeignAmendInvalidBodyResponse"                 => AmendForeignIncomeJson.iirForeignIncomeAmendInvalidBodyResponse
      case "iirPensionsAmendValueErrorsResponse"                => AmendPensionsIncomeJson.iirPensionsAmendValueErrorsResponse
      case "iirPensionsAmendInvalidBodyResponse"                => AmendPensionsIncomeJson.iirPensionsAmendInvalidBodyResponse
      case "iirOtherAmendValueErrorsResponse"                   => AmendOtherIncomeJson.iirOtherAmendValueErrorsResponse
      case "iirOtherAmendInvalidBodyResponse"                   => AmendOtherIncomeJson.iirOtherAmendInvalidBodyResponse
      case "iirDividendsAmendValueErrorsResponse"               => AmendDividendsIncomeJson.iirDividendsAmendValueErrorsResponse
      case "iirDividendsAmendInvalidBodyResponse"               => AmendDividendsIncomeJson.iirDividendsAmendInvalidBodyResponse
      case "iirOtherEmploymentAmendValueErrorsResponse"         => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendValueErrorsResponse
      case "iirOtherEmploymentAmendInvalidBodyResponse"         => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendInvalidBodyResponse

      case "RULE_MAXIMUM_SAVINGS_ACCOUNTS_LIMIT"   => AddUkSavingsAccountJson.RULE_MAXIMUM_SAVINGS_ACCOUNTS_LIMIT
      case "RULE_DUPLICATE_ACCOUNT_NAME"   => AddUkSavingsAccountJson.RULE_DUPLICATE_ACCOUNT_NAME

      case "iirCustomEmploymentAddValueErrorsResponse"   => AddCustomEmploymentJson.iirCustomEmploymentAddValueErrorsResponse
      case "iirCustomEmploymentAddInvalidBodyResponse"   => AddCustomEmploymentJson.iirCustomEmploymentAddInvalidBodyResponse
      case "iirCustomEmploymentAmendValueErrorsResponse" => AmendCustomEmploymentJson.iirCustomEmploymentAmendErrorsResponse
      case "iirCustomEmploymentAmendInvalidBodyResponse" => AmendCustomEmploymentJson.iirCustomEmploymentAmendInvalidBodyResponse
      case "RULE_UPDATE_FORBIDDEN"                       => AmendCustomEmploymentJson.RULE_UPDATE_FORBIDDEN

      case "iirFinancialDetailsAmendInvalidResponse"       => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendInvalidResponse
      case "iirFinancialDetailsAmendMissingErrorsResponse" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendMissingErrorsResponse
      case "iirFinancialDetailsAmendValueErrorsResponse"   => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendValueErrorsResponse
      case "iirFinancialDetailsAmendEmptyBenefitsInKindResponse" =>
        AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyBenefitsInKindResponse
      case "iirFinancialDetailsAmendEmptyDeductionsResponse" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyDeductionsResponse
      case "iirFinancialDetailsAmendEmptyStudentLoansResponse" =>
        AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyStudentLoansResponse
      case "iirFinancialDetailsAmendEmptyObjectsResponse" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyObjectsResponse

      case "iirOtherCapitalGainsInvalidRequestResponse" =>
        CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_INVALID_REQUEST_RESPONSE
      case "iirOtherCapitalGainsMissingFieldsResponse" => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MISSING_FIELDS_RESPONSE
      case "PPD_SUBMISSION_ID_NOT_FOUND"               => CreateAmendPPDJson.PPD_SUBMISSION_ID_NOT_FOUND
      case "DUPLICATED_PPD_SUBMISSION_ID"              => CreateAmendPPDJson.DUPLICATED_PPD_SUBMISSION_ID
      case "INCORRECT_DISPOSAL_TYPE"                   => CreateAmendPPDJson.INCORRECT_DISPOSAL_TYPE
      case "iirPPDMissingFieldsResponse"               => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MISSING_FIELD_RESPONSE
      case "iirPPDInvalidRequestResponse"              => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_REQUEST_RESPONSE

      case "iirCgtResidentialPropertyMissingFieldsResponse" =>
        CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MISSING_FIELDS_RESPONSE
      case "iirCgtResidentialPropertyInvalidRequestResponse" =>
        CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_INVALID_REQUEST_RESPONSE

      case "RULE_DELETE_FORBIDDEN_INCOME_RECEIVED" => DeleteCustomEmploymentJson.RULE_DELETE_FORBIDDEN_INCOME_RECEIVED

      // ----- individuals-disclosures-api -----
      case "iDisclosuresAmendValueErrorsResponse"    => DisclosuresJson.iDisclosuresAmendErrorsResponse
      case "iDisclosureMissingFieldResponse"         => DisclosuresJson.iDisclosuresAmendMissingFieldResponse
      case "RULE_VOLUNTARY_CLASS2_CANNOT_BE_CHANGED" => DisclosuresJson.RULE_VOLUNTARY_CLASS2_CANNOT_BE_CHANGED

      case "RULE_ACTIVE_MARRIAGE_ALLOWANCE_CLAIM" => MarriageAllowanceJson.RULE_ACTIVE_MARRIAGE_ALLOWANCE_CLAIM
      case "RULE_DECEASED_RECIPIENT"              => MarriageAllowanceJson.RULE_DECEASED_RECIPIENT
      case "RULE_INVALID_REQUEST"                 => MarriageAllowanceJson.RULE_INVALID_REQUEST

      // ----- individuals-state-benefits-api -----
      case "iStateBenefitsAmendValueErrorsResponse" => AmendStateBenefitJson.iStateBenefitsAmendValueErrorsResponse
      case "iStateBenefitsAmendInvalidBodyResponse" => AmendStateBenefitJson.iStateBenefitsAmendInvalidBodyResponse

      case "iStateBenefitsAddInvalidBodyResponse" => CreateStateBenefitJson.iStateBenefitsAddInvalidBodyResponse
      case "iStateBenefitsAddValueErrorsResponse" => CreateStateBenefitJson.iStateBenefitsAddValueErrorsResponse
      case "RULE_BENEFIT_TYPE_EXISTS"             => CreateStateBenefitJson.RULE_BENEFIT_TYPE_EXISTS

      case "BENEFITS_RULE_TAX_YEAR_NOT_ENDED"              => AmendStateBenefitAmountsJson.RULE_TAX_YEAR_NOT_ENDED
      case "iStateBenefitsAmendAmountsValueErrorsResponse" => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsValueErrorsResponse
      case "iStateBenefitsAmendAmountsInvalidBodyResponse" => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsInvalidBodyResponse

      case "iStateBenefitsRetrieveStateBenefitResponse"         => RetrieveStateBenefitJson.iStateBenefitsRetrieveStateBenefitResponse
      case "iStateBenefitsRetrieveCustomerAddedBenefitResponse" => RetrieveStateBenefitJson.iStateBenefitsRetrieveCustomerAddedBenefitResponse
      case "iStateBenefitsRetrieveCustomerAddedBenefitNoAmountsResponse" =>
        RetrieveStateBenefitJson.iStateBenefitsRetrieveCustomerAddedBenefitNoAmountsResponse
      case "iStateBenefitsRetrieveHmrcAmendedAmountsResponse" => RetrieveStateBenefitJson.iStateBenefitsRetrieveHmrcAmendedAmountsResponse

      // ----- individuals-reliefs-api -----
      case "reliefInvestmentsAmendValueErrorsResponse" => ReliefInvestmentsJson.reliefInvestmentsAmendValueErrorsResponse
      case "foreignReliefsAmendValueErrorsResponse"    => ForeignReliefsJson.foreignReliefsAmendValueErrorsResponse
      case "otherReliefsAmendValueErrorsResponse"      => OtherReliefsJson.otherReliefsAmendValueErrorsResponse
      case "pensionReliefsAmendValueErrorsResponse"    => PensionReliefsJson.pensionReliefsAmendValueErrorsResponse

      case "AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_RESPONSE" => CharitableGivingReliefsJson.AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_RESPONSE

      // ----- individuals-expenses-api -----
      case "AMEND_OTHER_EXPENSES_VALUE_ERRORS_RESPONSE"      => OtherExpensesJson.amendOtherExpensesValueErrorsResponse
      case "AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_RESPONSE" => EmploymentsExpensesJson.AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_RESPONSE

      // ----- property-business-api -----
      // Annual Submission
      case "amendAnnualSubmissionValueErrorsResponse" => AmendAnnualSubmissionJson.amendAnnualSubmissionValueErrorsResponse

      case "RULE_OVERLAPPING_PERIOD"      => V2CreatePeriodSummaryJson.RULE_OVERLAPPING_PERIOD
      case "RULE_MISALIGNED_PERIOD"       => V2CreatePeriodSummaryJson.RULE_MISALIGNED_PERIOD
      case "RULE_NOT_CONTIGUOUS_PERIOD"   => V2CreatePeriodSummaryJson.RULE_NOT_CONTIGUOUS_PERIOD
      case "RULE_DUPLICATE_SUBMISSION_PB" => V2CreatePeriodSummaryJson.RULE_DUPLICATE_SUBMISSION
      case "RULE_TAX_YEAR_NOT_SUPPORTED"       => V2CreatePeriodSummaryJson.RULE_TAX_YEAR_NOT_SUPPORTED


      // ----- property-business-api V2 -----
      case "AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_RESPONSE_V2" => AmendPeriodSummaryJsonV2.amendPeriodSummaryValueErrorsResponse
      case "RULE_TYPE_OF_BUSINESS_INCORRECT_RESPONSE"        => V2PropertyBusinessSharedErrors.RULE_TYPE_OF_BUSINESS_INCORRECT_RESPONSE
      case "AMEND_FOREIGN_PERIOD_RULE_TYPE_OF_BUSINESS_INCORRECT_PATHS_RESPONSE" =>
        AmendPeriodSummaryJsonV2.RULE_INCORRECT_OR_EMPTY_BODY_PATH_RESPONSE
      case "RULE_PROPERTY_INCOME_ALLOWANCE" => AmendUKPropAnnualSubmissionJson.RULE_PROPERTY_INCOME_ALLOWANCE

      // Period Summary

      case "AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_RESPONSE" => AmendPeriodSummaryJson.amendPeriodSummaryValueErrorsResponse

      // ----- property-business-api V2 -----
      // Annual Submission
      case "createAmendUKPropAnnualSubmissionValueErrorsResponse" =>
        AmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionValueErrorsResponse
      case "createAmendUKPropAnnualSubmissionInvalidBodyResponse" =>
        AmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionInvalidBodyResponse

      // Period Summary

      case "createAmendAnnualSubmissionValueErrorsResponse" =>
        AmendForeignPropertyAnnualSubmissionJsonV2.createAmendAnnualSubmissionValueErrorsResponse
      case "createAmendForeignPropAnnualSubmissionInvalidBodyResponse" =>
        AmendForeignPropertyAnnualSubmissionJsonV2.createAmendForeignPropAnnualSubmissionInvalidBodyResponse

      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_BOTH_EXPENSES" => AmendUkPropertyPeriodSummaryJson.bothExpensesSuppliedResponse
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_VALUE_FORMAT"  => AmendUkPropertyPeriodSummaryJson.valueFormatResponse
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_EMPTY_ITEMS"   => AmendUkPropertyPeriodSummaryJson.emptyItemsResponse

      // ----- self-employment-business-api ----
      case "RULE_OVERLAPPING_PERIOD_SE"                => CreateSEPeriodSummaryJson.createSEOverlappingPeriod
      case "RULE_MISALIGNED_PERIOD_SE"                 => CreateSEPeriodSummaryJson.createSEMisalignedPeriod
      case "RULE_NOT_CONTIGUOUS_PERIOD_SE"             => CreateSEPeriodSummaryJson.createSENotContiguousPeriod
      case "RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES_SE" => CreateSEPeriodSummaryJson.createSENotAllowedConsolidatedExpenses

      // ----- individuals-business-eops-api V1 -----
      case "BUSINESS_EOPS_RULE_ALREADY_SUBMITTED"              => SubmitBusinessEOPSResponseJsonV1.RULE_ALREADY_SUBMITTED
      case "BUSINESS_EOPS_RULE_EARLY_SUBMISSION"               => SubmitBusinessEOPSResponseJsonV1.RULE_EARLY_SUBMISSION
      case "BUSINESS_EOPS_RULE_LATE_SUBMISSION"                => SubmitBusinessEOPSResponseJsonV1.RULE_LATE_SUBMISSION
      case "BUSINESS_EOPS_RULE_CONSOLIDATED_EXPENSES"          => SubmitBusinessEOPSResponseJsonV1.RULE_CONSOLIDATED_EXPENSES
      case "BUSINESS_EOPS_RULE_MISMATCHED_START_DATE"          => SubmitBusinessEOPSResponseJsonV1.RULE_MISMATCHED_START_DATE
      case "BUSINESS_EOPS_RULE_MISMATCHED_END_DATE"            => SubmitBusinessEOPSResponseJsonV1.RULE_MISMATCHED_END_DATE
      case "BUSINESS_EOPS_RULE_CLASS4_OVER_16"                 => SubmitBusinessEOPSResponseJsonV1.RULE_CLASS4_OVER_16
      case "BUSINESS_EOPS_RULE_CLASS4_PENSION_AGE"             => SubmitBusinessEOPSResponseJsonV1.RULE_CLASS4_PENSION_AGE
      case "BUSINESS_EOPS_RULE_FHL_PRIVATE_USE_ADJUSTMENT"     => SubmitBusinessEOPSResponseJsonV1.RULE_FHL_PRIVATE_USE_ADJUSTMENT
      case "BUSINESS_EOPS_RULE_NON_FHL_PRIVATE_USE_ADJUSTMENT" => SubmitBusinessEOPSResponseJsonV1.RULE_NON_FHL_PRIVATE_USE_ADJUSTMENT
      case "BUSINESS_EOPS_RULE_NON_MATCHING_PERIOD"            => SubmitBusinessEOPSResponseJsonV1.RULE_NON_MATCHING_PERIOD
      case "BUSINESS_EOPS_RULE_BUSINESS_VALIDATION_FAILURE"    => SubmitBusinessEOPSResponseJsonV1.RULE_BUSINESS_VALIDATION_FAILURE

      // ----- individuals-business-eops-api V2 -----
      case "BUSINESS_EOPS_RULE_ALREADY_SUBMITTED_V2"                           => SubmitBusinessEOPSResponseJsonV2.RULE_ALREADY_SUBMITTED
      case "BUSINESS_EOPS_RULE_EARLY_SUBMISSION_V2"                            => SubmitBusinessEOPSResponseJsonV2.RULE_EARLY_SUBMISSION
      case "BUSINESS_EOPS_RULE_LATE_SUBMISSION_V2"                             => SubmitBusinessEOPSResponseJsonV2.RULE_LATE_SUBMISSION
      case "BUSINESS_EOPS_RULE_BVR_MISMATCHED_START_DATE_V2"                   => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_MISMATCHED_START_DATE
      case "BUSINESS_EOPS_RULE_BVR_CLASS4_OVER_16_V2"                          => SubmitBusinessEOPSResponseJsonV2.RULE_RULE_BVR_CLASS4_OVER_16
      case "BUSINESS_EOPS_RULE_BVR_CLASS4_PENSION_AGE_V2"                      => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_CLASS4_PENSION_AGE
      case "BUSINESS_EOPS_RULE_NON_MATCHING_PERIOD_V2"                         => SubmitBusinessEOPSResponseJsonV2.RULE_NON_MATCHING_PERIOD
      case "BUSINESS_EOPS_RULE_BVR_CONSOLIDATED_EXPENSES_V2"                   => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_CONSOLIDATED_EXPENSES
      case "BUSINESS_EOPS_RULE_BVR_CONSOLIDATED_EXPENSES_UK_TEST_ONLY_V2"      => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_CONSOLIDATED_EXPENSES_UK_TEST_ONLY
      case "BUSINESS_EOPS_RULE_BVR_CONSOLIDATED_EXPENSES_FOREIGN_TEST_ONLY_V2" => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_CONSOLIDATED_EXPENSES_FOREIGN_TEST_ONLY
      case "BUSINESS_EOPS_RULE_BVR_END_DATE_SHORT_V2"                          => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_END_DATE_SHORT
      case "BUSINESS_EOPS_RULE_BVR_END_DATE_EXCEEDS_V2"                        => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_END_DATE_EXCEEDS
      case "BUSINESS_EOPS_RULE_BVR_FHL_PRIVATE_USE_ADJUSTMENT_V2"              => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_FHL_PRIVATE_USE_ADJUSTMENT
      case "BUSINESS_EOPS_RULE_BVR_NON_FHL_PRIVATE_USE_ADJUSTMENT_V2"          => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_NON_FHL_PRIVATE_USE_ADJUSTMENT
      case "BUSINESS_EOPS_RULE_BVR_UK_PROPERTY_MULTIPLE_ERRORS_V2"             => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_UK_PROPERTY_MULTIPLE_ERRORS

      // Obligations API
      case "NO_OBLIGATIONS_FOUND" => RetrieveEOPSJson.NO_OBLIGATIONS_FOUND

      // ----- self-employment-business-api -----
      case "RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES" => AmendSEPeriodSummaryJson.RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES

      case _ => "{}"
    }
  }

}
