@TriggerSaTaxCalculation @IndividualCalculationApiV3 @All

Feature: Submit a Self Assessment Final Declaration

  Background: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Submit a Self Assessment Final Declaration

    When a request is made to do an empty POST to url: SubmitSAFinalDeclarationUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                    | Code | Response                             |
      | None                        | 204  | empty                                |
      | INCOME_SOURCES_CHANGED      | 403  | V3_RULE_INCOME_SOURCES_CHANGED       |
      | RECENT_SUBMISSIONS_EXIST    | 403  | V3_RULE_RECENT_SUBMISSIONS_EXIST     |
      | RESIDENCY_CHANGED           | 403  | V3_RULE_RESIDENCY_CHANGED            |
      | FINAL_DECLARATION_RECEIVED  | 403  | V3_RULE_FINAL_DECLARATION_RECEIVED   |
      | INCOME_SOURCES_INVALID      | 403  | V3_RULE_INCOME_SOURCES_INVALID       |
      | NO_INCOME_SUBMISSIONS_EXIST | 403  | V3_RULE_NO_INCOME_SUBMISSIONS_EXIST  |
      | SUBMISSION_FAILED           | 403  | V3_RULE_SUBMISSION_FAILED            |
      | NOT_FOUND                   | 404  | MATCHING_RESOURCE_NOT_FOUND          |
      | UNMATCHED_STUB_ERROR        | 400  | RULE_INCORRECT_GOV_TEST_SCENARIO     |