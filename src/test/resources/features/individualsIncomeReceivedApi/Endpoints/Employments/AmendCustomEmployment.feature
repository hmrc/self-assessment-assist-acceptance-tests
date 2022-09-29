@AmendCustomEmployment @IndividualsIncomeReceivedApi @All

Feature: Amend A Custom Employment

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend a custom employment with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedEmploymentsIdUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                         | Scenario  | Code | Item  | Response                                    |
      | iirCustomEmploymentAmendRequest              | None      | 200  | model | HateoasLinks                                |
      | iirCustomEmploymentAmendMinimumFieldsRequest | None      | 200  | model | HateoasLinks                                |
      | iirCustomEmploymentAmendValueErrorsRequest   | None      | 400  | body  | iirCustomEmploymentAmendValueErrorsResponse |
      | iirCustomEmploymentAmendInvalidBodyRequest   | None      | 400  | body  | iirCustomEmploymentAmendInvalidBodyResponse |
      | iirCustomEmploymentAmendRequest              | HMRC_HELD | 403  | body  | RULE_UPDATE_FORBIDDEN                       |
      | iirCustomEmploymentAmendRequest              | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                 |