@UKPropBiss @UKProp @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api get UK property business income source summary endpoint

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 201

  Scenario Outline: Test get UK property business income source summary with <Gov-Test-Scenario>

    When a request is made to GET to url: UkpBusinessIncomeSourceSummary, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>

    Examples:
      | Gov-Test-Scenario | Code | Response      |
      | None              | 410  | RESOURCE_GONE |
