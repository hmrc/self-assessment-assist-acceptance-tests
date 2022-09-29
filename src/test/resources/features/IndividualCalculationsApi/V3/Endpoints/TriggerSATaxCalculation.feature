@TriggerSaTaxCalculation @IndividualCalculationApiV3 @All

Feature: Trigger a Self-Assessment Tax Calculation

  Background: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Trigger a self-assessment tax calculation

    When a request is made to do an empty POST to url: <RequestUrl>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
     | RequestUrl                       | Scenario                    | Code | Item  |Response                            |
     | v3TriggerCalcUrl                 | None                        | 202  | model | TriggerSATaxCalculationV3          |
     | v3TriggerCalcFinalDeclarationUrl | None                        | 202  | model | TriggerSATaxCalculationV3          |
     | v3TriggerCalcUrl                 | NO_INCOME_SUBMISSIONS_EXIST | 403  | body  | RULE_NO_INCOME_SUBMISSIONS_EXIST   |
     | v3TriggerCalcFinalDeclarationUrl | FINAL_DECLARATION_RECEIVED  | 403  | body  | v3_RULE_FINAL_DECLARATION_RECEIVED |
     | v3TriggerCalcUrl                 | UNMATCHED_STUB_ERROR        | 400  | body  | RULE_INCORRECT_GOV_TEST_SCENARIO   |

