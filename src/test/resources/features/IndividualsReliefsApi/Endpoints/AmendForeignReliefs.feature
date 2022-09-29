@AmendForeignReliefs @IndividualsReliefsApi @All

Feature: Amend a foreign relief

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario: Successfully amend a foreign relief with scenario: None
    When a request is made to PUT to url: ForeignReliefsUrl, with the JSON body: AMEND_FOREIGN_RELIEFS, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario Outline: Unsuccessfully amend a foreign relief with scenario: <Scenario>
    When a request is made to PUT to url: ForeignReliefsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                              | Scenario  | Code | Item  | Response                                 |
      | foreignReliefsAmendValueErrors    | None      | 400  | body  | foreignReliefsAmendValueErrorsResponse   |
      | foreignReliefsAmendMissingErrors  | None      | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED   |