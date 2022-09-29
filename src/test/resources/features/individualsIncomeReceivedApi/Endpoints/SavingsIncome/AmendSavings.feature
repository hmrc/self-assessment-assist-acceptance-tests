@AmendSavings @IndividualsIncomeReceivedApi @All

Feature: Amend Savings Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend savings income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedSavingsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                | Scenario | Code | Item  | Response                               |
      | iirSavingsAmendRequest              | None     | 200  | model | HateoasLinks                           |
      | iirSavingsAmendMinimumFieldsRequest | None     | 200  | model | HateoasLinks                           |
      | iirSavingsAmendValueErrorsRequest   | None     | 400  | body  | iirSavingsAmendValueErrorsResponse     |
      | iirSavingsAmendInvalidBodyRequest   | None     | 400  | body  | iirSavingsAmendInvalidBodyResponse     |
      | iirSavingsAmendEmptyBodyRequest     | None     | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED |