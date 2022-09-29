@AmendReliefInvestments @IndividualsReliefsApi @All

Feature: Amend a relief investment

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend a relief investment with request body <Body> and Gov-Test-Scenario <Scenario>
    When a request is made to PUT to url: ReliefsInvestmentsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                | Scenario  | Code | Item  | Response                                   |
      | AMEND_RELIEF_INVESTMENTS            | None      | 200  | model | HateoasLinks                               |
      | reliefInvestmentsAmendMinimumFields | None      | 200  | model | HateoasLinks                               |

  Scenario Outline: Amend a relief investment with request body <Body> and Gov-Test-Scenario <Scenario>
    When a request is made to PUT to url: ReliefsInvestmentsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                | Scenario  | Code | Item  | Response                                   |
      | reliefInvestmentsAmendValueErrors   | None      | 400  | body  | reliefInvestmentsAmendValueErrorsResponse  |
      | reliefInvestmentsAmendMissingErrors | None      | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED     |