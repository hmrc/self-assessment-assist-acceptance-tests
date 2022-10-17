@RetrieveSavings @MtdSavingsAccounts @All @AllSA

Feature: Retrieve a UK savings account

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve a UK savings account for Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to GET to url: RetrieveSavingsAccount, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | Gov-Test-Scenario | Code | Response                    |
    | None              | 200  | SAVINGS_RETRIEVE_DEFAULT    |
    | ACCOUNT_GREEK     | 200  | SAVINGS_RETRIEVE_GREEK      |
    | ACCOUNT_CHINESE   | 200  | SAVINGS_RETRIEVE_CHINESE    |
    | NOT_FOUND         | 404  | MATCHING_RESOURCE_NOT_FOUND |
