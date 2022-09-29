@SEBusinessIncomeSource @SE @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api get self employment business income source summary endpoint

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Successfully get self employment business income source summary with <Gov-Test-Scenario>

    When a request is made to GET to url: SeBusinessIncomeSourceSummary, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>

    Examples:
      | Gov-Test-Scenario | Code | Response      |
      | None              | 410  | RESOURCE_GONE |
