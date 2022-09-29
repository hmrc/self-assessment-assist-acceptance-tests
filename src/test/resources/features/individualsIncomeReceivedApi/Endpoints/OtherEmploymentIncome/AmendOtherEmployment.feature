@AmendOtherEmployment @IndividualsIncomeReceivedApi @All

Feature: Amend Other Employment Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend other employment income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedOtherEmploymentUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                        | Scenario | Code | Item  | Response                                   |
      | iirOtherEmploymentAmendRequest              | None     | 200  | model | HateoasLinks                               |
      | iirOtherEmploymentAmendMinimumFieldsRequest | None     | 200  | model | HateoasLinks                               |
      | iirOtherEmploymentAmendValueErrorsRequest   | None     | 400  | body  | iirOtherEmploymentAmendValueErrorsResponse |
      | iirOtherEmploymentAmendInvalidBodyRequest   | None     | 400  | body  | iirOtherEmploymentAmendInvalidBodyResponse |
      | iirOtherEmploymentAmendEmptyBodyRequest     | None     | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED     |