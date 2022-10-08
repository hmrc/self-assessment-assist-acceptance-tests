@SaAccountsApi @All @ListTransactions

Feature: List Self Assessment Transactions

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: List Transactions with scenario: <Scenario>

    When a request is made to GET to url: ListTransactionsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario              | Code | Item  | Response                     |
      | None                  | 200  | model | ListTransactionsResponse     |
      | NOT_FOUND             | 404  | body  | MATCHING_RESOURCE_NOT_FOUND  |