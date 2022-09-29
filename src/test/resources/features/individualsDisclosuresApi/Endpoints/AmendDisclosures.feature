@AmendDisclosures @IndividualsDisclosuresApi @All

Feature: Amend Disclosures

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend disclosures with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsDisclosuresUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                  | Scenario                           | Code | Item  | Response                                |
      | iDisclosuresAmendRequest              | None                               | 200  | model | HateoasLinks                            |
      | iDisclosuresAmendMinimumFieldsRequest | None                               | 200  | model | HateoasLinks                            |
      | iDisclosuresAmendValueErrorsRequest   | None                               | 400  | body  | iDisclosuresAmendValueErrorsResponse    |
      | iDisclosuresAmendMissingErrorsRequest | None                               | 400  | body  | iDisclosureMissingFieldResponse         |
      | iDisclosuresAmendEmptyBodyRequest     | None                               | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED  |
      | iDisclosuresAmendRequest              | VOLUNTARY_CLASS2_CANNOT_BE_CHANGED | 403  | body  | RULE_VOLUNTARY_CLASS2_CANNOT_BE_CHANGED |
      | iDisclosuresAmendRequest              | NOT_FOUND                          | 404  | body  | MATCHING_RESOURCE_NOT_FOUND             |
