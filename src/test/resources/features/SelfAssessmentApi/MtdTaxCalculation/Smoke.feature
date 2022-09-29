@MtdTaxCalculationSmoke @AllSmoke @AllSmokeSA

Feature: Smoke test all endpoints through API Platform using version 2.0 header

  Scenario: Setup

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveTaxCalculationBvrMessages, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE
