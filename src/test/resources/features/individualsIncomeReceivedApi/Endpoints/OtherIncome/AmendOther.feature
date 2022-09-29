@AmendOther @IndividualsIncomeReceivedApi @All

Feature: Amend Other Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend other income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedOtherUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                              | Scenario | Code | Item  | Response                               |
      | iirOtherAmendRequest              | None     | 200  | model | HateoasLinks                           |
      | iirOtherAmendMinimumFieldsRequest | None     | 200  | model | HateoasLinks                           |
      | iirOtherAmendValueErrorsRequest   | None     | 400  | body  | iirOtherAmendValueErrorsResponse       |
      | iirOtherAmendInvalidBodyRequest   | None     | 400  | body  | iirOtherAmendInvalidBodyResponse       |
      | iirOtherAmendEmptyBodyRequest     | None     | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED |