@CreateAndAmendCharitableGivingTaxRelief @IndividualsReliefsApi @All

Feature: Create and Amend Charitable Giving Tax Relief

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create and Amend Charitable Giving Tax Relief with request body <Body> and Gov-Test-Scenario <Scenario>
    When a request is made to PUT to url: CharitableGivingReliefsUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                                           | Gov-Test-Scenario  | Code | Item  | Response                                              |
      | CHARITABLE_GIVING_RELIEFS_REQUEST_BODY                | None               | 200  | model | HateoasLinks                                          |
      | AMEND_CHARITABLE_GIVING_RELIEFS_MINIMUM_FIELDS        | None               | 200  | model | HateoasLinks                                          |
      | AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_REQUEST  | None               | 400  | body  | AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_RESPONSE |
      | CHARITABLE_GIVING_RELIEFS_REQUEST_BODY                | NOT_FOUND          | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                           |