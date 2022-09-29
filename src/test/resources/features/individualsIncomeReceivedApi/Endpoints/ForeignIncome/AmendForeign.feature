@AmendForeignIncome @IndividualsIncomeReceivedApi @All

Feature: Amend Foreign Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend foreign income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedForeignUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                | Scenario | Code | Item  | Response                               |
      | iirForeignAmendRequest              | None     | 200  | model | HateoasLinks                           |
      | iirForeignAmendMinimumFieldsRequest | None     | 200  | model | HateoasLinks                           |
      | iirForeignAmendValueErrorsRequest   | None     | 400  | body  | iirForeignAmendValueErrorsResponse     |
      | iirForeignAmendInvalidBodyRequest   | None     | 400  | body  | iirForeignAmendInvalidBodyResponse     |
      | iirForeignAmendEmptyBodyRequest     | None     | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED |
