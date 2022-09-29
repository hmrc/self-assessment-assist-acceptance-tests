@AmendPensions @IndividualsIncomeReceivedApi @All

Feature: Amend Pensions Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend pensions income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedPensionsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
     | Body                                 | Scenario | Code | Item  | Response                               |
     | iirPensionsAmendRequest              | None     | 200  | model | HateoasLinks                           |
     | iirPensionsAmendMinimumFieldsRequest | None     | 200  | model | HateoasLinks                           |
     | iirPensionsAmendValueErrorsRequest   | None     | 400  | body  | iirPensionsAmendValueErrorsResponse    |
     | iirPensionsAmendInvalidBodyRequest   | None     | 400  | body  | iirPensionsAmendInvalidBodyResponse    |
     | iirPensionsAmendEmptyBodyRequest     | None     | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED |