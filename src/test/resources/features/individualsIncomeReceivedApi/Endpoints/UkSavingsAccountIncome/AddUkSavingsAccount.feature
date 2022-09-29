@AddUkSavingsAccount @IndividualsIncomeReceivedApi @All

Feature: Add a UK Savings Account

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Add a UK Savings Account with scenario: <Scenario>

    When a request is made to POST to url: IndividualsIncomeReceivedUkSavingsAccountsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                          | Scenario                       | Code | Item  | Response                            |
      | iirUkSavingsAccountAddRequest | None                           | 200  | model | AddUkSavingsAccount                 |
      | iirUkSavingsAccountAddRequest | MAXIMUM_SAVINGS_ACCOUNTS_LIMIT | 403  | body  | RULE_MAXIMUM_SAVINGS_ACCOUNTS_LIMIT |
      | iirUkSavingsAccountAddRequest | DUPLICATE_ACCOUNT_NAME         | 403  | body  | RULE_DUPLICATE_ACCOUNT_NAME         |