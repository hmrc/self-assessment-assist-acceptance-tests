@AmendDividendsIncome @IndividualsIncomeReceivedApi @All

Feature: Amend Dividends Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend dividends income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedDividendsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                  | Scenario | Code | Item  | Response                               |
      | iirDividendsAmendRequest              | None     | 200  | model | HateoasLinks                           |
      | iirDividendsAmendMinimumFieldsRequest | None     | 200  | model | HateoasLinks                           |
      | iirDividendsAmendValueErrorsRequest   | None     | 400  | body  | iirDividendsAmendValueErrorsResponse   |
      | iirDividendsAmendInvalidBodyRequest   | None     | 400  | body  | iirDividendsAmendInvalidBodyResponse   |
      | iirDividendsAmendEmptyBodyRequest     | None     | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED |