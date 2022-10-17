@SelfAssessmentApiLegacySmoke @AllSmoke @AllSmokeSA

Feature: Smoke test all endpoints through API Platform

  Scenario: Setup

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

        # Self-Employment

  Scenario: Self-Employment Income Source

    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty
    Then save the Self-Employment ID

    When a request is made to GET to url: SeListBusinesses, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    When a request is made to GET to url: SeGetBusiness, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Self-Employment Obligations

    When a request is made to GET to url: SeObligations, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Self-Employment Periodic Updates

    When a request is made to POST to url: SePeriods, with the JSON body: SePeriodConsolidated, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty

    When a request is made to PUT to url: SePeriodOne, with the JSON body: SePeriodFull, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    When a request is made to GET to url: SePeriodOne, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is SE Full expenses period

    When a request is made to GET to url: SePeriods, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListAllPeriodsResponse

  Scenario: Self-Employment Annual Summaries

    When a request is made to PUT to url: SeAnnualSummary, with the JSON body: SeAnnualSummaryOnlyAllowances, and the gov-test-scenario: None
    Then the response code is 204

    When a request is made to GET to url: SeAnnualSummary, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is SE_ANNUAL_SUMMARY_ONLY_ALLOWANCES

  Scenario: Self-Employment EOPS Obligations

    When a request is made to GET to url: SeRetrieveEopsObligations, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Self-Employment BISS

    When a request is made to GET to url: SeBusinessIncomeSourceSummary, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    # UK Property

  Scenario: UK Property Income Source

    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 201

    When a request is made to GET to url: UkpGetBusiness, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: (Retired endpoint) UK Property Obligations

    When a request is made to GET to url: UkpObligations, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: UK Property FHL Periodic Updates

    When a request is made to POST to url: UkpFhlPeriods, with the JSON body: UkpCreateFhlPeriodicUpdate, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty

    When a request is made to GET to url: UkpFhlPeriodOne, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is UK property FHL get a period

    When a request is made to PUT to url: UkpFhlPeriodOne, with the JSON body: UkpAmendFhlPeriodicUpdate, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    When a request is made to GET to url: UkpFhlPeriods, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is UK property list periods

  Scenario: UK Property FHL Annual Summaries

    When a request is made to PUT to url: UkpFhlAnnualSummary, with the JSON body: UkpFhlAnnualSummary, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    When a request is made to GET to url: UkpFhlAnnualSummary, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is Get FHL UK Property Annual Summary

  Scenario: UK Property Non-FHL Periodic Updates

    When a request is made to POST to url: UkpNonFhlPeriods, with the JSON body: UkpCreateNonFhlPeriodicUpdate, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty

    When a request is made to GET to url: UkpNonFhlPeriodOne, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is UK property Non-FHL get a period

    When a request is made to PUT to url: UkpNonFhlPeriodOne, with the JSON body: UkpAmendNonFhlPeriodicUpdate, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    When a request is made to GET to url: UkpNonFhlPeriods, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is UK property list periods

  Scenario: UK Property Non-FHL Annual Summaries

    When a request is made to PUT to url: UkpNonFhlAnnualSummary, with the JSON body: UkpNonFhlAnnualSummary, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    When a request is made to GET to url: UkpNonFhlAnnualSummary, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is Get Non-FHL UK Property Annual Summary

  Scenario: UK Property BISS

    When a request is made to GET to url: UkpBusinessIncomeSourceSummary, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    # Tax Calculations

  Scenario: Trigger Tax Calculation

    When a request is made to POST to url: TriggerTaxCalc, with the JSON body: TriggerTaxCalc, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE