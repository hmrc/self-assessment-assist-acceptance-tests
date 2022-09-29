@ListSaTaxCalculations @IndividualCalculationApiV2 @All

Feature: List Self-Assessment Tax Calculations

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: List self-assessment tax calculations for <Scenario>

    When a request is made to GET to url: ListSaTaxCalculationsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario              | Code | Item  | Response                         |
      | None                  | 200  | model | ListSATaxCalculationsV2          |
      | CRYSTALLISATION       | 200  | model | ListSATaxCalculationsV2          |
      | MULTIPLE_CALCULATIONS | 200  | model | ListSATaxCalculationsV2          |
      | NOT_FOUND             | 404  | body  | MATCHING_RESOURCE_NOT_FOUND      |
      | UNMATCHED_STUB_ERROR  | 400  | body  | RULE_INCORRECT_GOV_TEST_SCENARIO |