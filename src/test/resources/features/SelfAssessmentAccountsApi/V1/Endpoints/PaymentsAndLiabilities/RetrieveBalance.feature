@SaAccountsApi @All @RetrieveBalance

Feature: Retrieve a Self Assessment Balance

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve a balance with scenario: <Scenario>

    When a request is made to GET to url: RetrieveBalanceUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario          | Code | Item  | Response                    |
      | None              | 200  | model | RetrieveBalanceResponse     |
      | NOTHING_DUE       | 200  | model | RetrieveBalanceResponse     |
      | OVERDUE           | 200  | model | RetrieveBalanceResponse     |
      | NOT_FOUND         | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |
