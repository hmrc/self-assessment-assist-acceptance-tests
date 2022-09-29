@AmendOtherReliefs @IndividualsReliefsApi @All

Feature: Amend other reliefs

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully amend other reliefs with scenario: <Scenario>

    When a request is made to PUT to url: OtherReliefsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                            | Scenario  | Code | Item  | Response                                 |
      | AMEND_OTHER_RELIEFS             | None      | 200  | model | HateoasLinks                             |
      | otherReliefsAmendMinimumFields  | None      | 200  | model | HateoasLinks                             |

  Scenario Outline: Unsuccessfully amend other reliefs with scenario: <Scenario>

    When a request is made to PUT to url: OtherReliefsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty


    Examples:
      | Body                            | Scenario          | Code | Item  | Response                                 |
      | otherReliefsAmendValueErrors    | None              | 400  | body  | otherReliefsAmendValueErrorsResponse     |
      | otherReliefsAmendMissingErrors  | None              | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED   |
      | AMEND_OTHER_RELIEFS             | SUBMISSION_FAILED | 403  | body  | RULE_SUBMISSION_FAILED                   |