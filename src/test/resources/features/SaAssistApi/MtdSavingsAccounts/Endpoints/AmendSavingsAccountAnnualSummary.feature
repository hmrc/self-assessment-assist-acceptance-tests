@AmendSavingsAnnuals @MtdSavingsAccounts @All @AllSA

Feature: Amend a UK savings account annual summary

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Amend savings account annual summary with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to PUT to url: AmendSavingsAccountAnnualSummary, with the JSON body: savingsAccountAnnualSummary, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | Gov-Test-Scenario | Code | Response                    |
    | None              | 204  | empty                       |
    | NOT_FOUND         | 404  | MATCHING_RESOURCE_NOT_FOUND |
