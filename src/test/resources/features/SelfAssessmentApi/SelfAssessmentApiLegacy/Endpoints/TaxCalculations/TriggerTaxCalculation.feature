@TaxCalcLegacy @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api trigger a tax calculation endpoint

  Background: Setup test scenario

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario: Successfully trigger a tax calculation

    When a request is made to POST to url: TriggerTaxCalc, with the JSON body: TriggerTaxCalc, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE
