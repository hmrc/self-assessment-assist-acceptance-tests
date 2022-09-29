@RetrieveTaxCalc @MtdTaxCalculation @All @AllSA

Feature: Retrieve a tax calculation

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve a tax calculation with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>

    Examples:
      | Gov-Test-Scenario       | Code | Response       |
      | None                    | 410  | RESOURCE_GONE  |
