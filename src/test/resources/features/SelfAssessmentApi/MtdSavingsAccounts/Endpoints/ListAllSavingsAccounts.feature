@ListAllSavings @MtdSavingsAccounts @All @AllSA

Feature: List all UK savings accounts

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: List all UK savings accounts for Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to GET to url: ListAllSavingsAccounts, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | Gov-Test-Scenario      | Code | Response                    |
    | None                   | 200  | SAVINGS_LIST_ALL_DEFAULT    |
    | SAVINGS_ACCOUNTS_LARGE | 200  | SAVINGS_ACCOUNTS_LARGE      |
    | NOT_FOUND              | 404  | MATCHING_RESOURCE_NOT_FOUND |
