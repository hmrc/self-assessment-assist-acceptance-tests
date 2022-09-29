@CalcCrystallisation @IndividualCalculationApiV2 @All

Feature: Intent to crystallise

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Intent to crystallise endpoint for Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to do an empty POST to url: CalcIntentToCrystallise, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>

    Examples:
      | Gov-Test-Scenario          | Code  | Item     | Response                          |
      | None                       | 200   | model    | IntentToCrystalliseV2             |
      | FINAL_DECLARATION_RECEIVED | 403   | body     | RULE_FINAL_DECLARATION_RECEIVED   |
      | NO_SUBMISSIONS_EXIST       | 403   | body     | RULE_NO_SUBMISSIONS_EXIST         |
      | UNMATCHED_STUB_ERROR       | 400   | body     | RULE_INCORRECT_GOV_TEST_SCENARIO  |
