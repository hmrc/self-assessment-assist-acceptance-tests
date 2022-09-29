@AmendStateBenefit @IndividualsStateBenefitsApi @All

Feature: Amend State Benefit

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend state benefit with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsStateBenefitsPathIdUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                    | Scenario  | Code | Item  | Response                               |
      | iStateBenefitsAmendRequest              | None      | 200  | model | HateoasLinks                           |
      | iStateBenefitsAmendMinimumFieldsRequest | None      | 200  | model | HateoasLinks                           |
      | iStateBenefitsAmendValueErrorsRequest   | None      | 400  | body  | iStateBenefitsAmendValueErrorsResponse |
      | iStateBenefitsAmendInvalidBodyRequest   | None      | 400  | body  | iStateBenefitsAmendInvalidBodyResponse |
      | iStateBenefitsAmendEmptyBodyRequest     | None      | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED |
      | iStateBenefitsAmendRequest              | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND            |