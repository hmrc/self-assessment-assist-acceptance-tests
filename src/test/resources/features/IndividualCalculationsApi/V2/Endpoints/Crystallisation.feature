@CalcCrystallisation @IndividualCalculationApiV2 @All

Feature: Crystallisation

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Crystallisation endpoint Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to POST to url: CalcCrystallisation, with the JSON body: crystallisationBody, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario            | Code  | Response                          |
      | None                         | 204   | empty                             |
      | INCOME_SOURCES_CHANGED       | 403   | RULE_INCOME_SOURCES_CHANGED       |
      | RECENT_SUBMISSIONS_EXIST     | 403   | RULE_RECENT_SUBMISSIONS_EXIST     |
      | RESIDENCY_CHANGED            | 403   | RULE_RESIDENCY_CHANGED            |
      | INCOME_SOURCES_INVALID       | 403   | RULE_INCOME_SOURCES_INVALID       |
      | NO_INCOME_SUBMISSIONS_EXIST  | 403   | RULE_NO_INCOME_SUBMISSIONS_EXIST  |
      | SUBMISSION_FAILED            | 403   | RULE_SUBMISSION_FAILED            |
      | FINAL_DECLARATION_RECEIVED   | 403   | FINAL_DECLARATION_RECEIVED        |
      | NOT_FOUND                    | 404   | MATCHING_RESOURCE_NOT_FOUND       |
      | UNMATCHED_STUB_ERROR         | 400   | RULE_INCORRECT_GOV_TEST_SCENARIO  |
