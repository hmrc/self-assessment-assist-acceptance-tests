@SaAccountsApi @All @RetrieveTransactionDetails

Feature: Retrieve a Self Assessment Transaction's Details

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve a Transaction's Details with scenario: <Scenario>

    When a request is made to GET to url: RetrieveTransactionDetailsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario          | Code | Item  | Response                            |
      | None              | 200  | model | RetrieveTransactionDetailsResponse  |
      | PAYMENT_ON_ACCOUNT| 200  | model | RetrieveTransactionDetailsResponse  |
      | NO_DETAILS_FOUND  | 404  | body  | NO_DETAILS_FOUND                    |
      | NOT_FOUND         | 404  | body  | MATCHING_RESOURCE_NOT_FOUND         |
