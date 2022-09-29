@TriggerSaTaxCalculation @IndividualCalculationApiV2 @All

Feature: Trigger a Self-Assessment Tax Calculation

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Trigger a self-assessment tax calculation

    When a request is made to POST to url: TriggerSaTaxCalculationUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody      | Scenario                    | Code | Item  |Response                          |
      | TRIGGER_TAX_CALC | None                        | 202  | model | TriggerSATaxCalculationV2        |
      | TRIGGER_TAX_CALC | NO_INCOME_SUBMISSIONS_EXIST | 403  | body  | RULE_NO_INCOME_SUBMISSIONS_EXIST |
      | TRIGGER_TAX_CALC | UNMATCHED_STUB_ERROR        | 400  | body  | RULE_INCORRECT_GOV_TEST_SCENARIO |