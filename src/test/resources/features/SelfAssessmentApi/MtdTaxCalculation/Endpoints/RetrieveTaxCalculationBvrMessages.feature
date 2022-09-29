@RetrieveBVRMessages @MtdTaxCalculation @All @AllSA

Feature: Retrieve validation messages associated with a tax calculation

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve validation messages where there are warnings and errors for Gov-Test-Scenario <Scenario>

    When a request is made to GET to url: RetrieveTaxCalculationBvrMessages, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response body is <Response>

    Examples:
      | Scenario      | Code  | Response       |
      | None          | 410   | RESOURCE_GONE  |
