@IgnoreStateBenefit @IndividualsStateBenefitsApi @All

Feature: Ignore State Benefit

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Ignore state benefit with scenario: <Scenario>

    When a request is made to do an empty POST to url: IndividualsStateBenefitsIgnoreUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario         | Code | Item  | Response                     |
      | None             | 200  | model | HateoasLinks                 |
      | IGNORE_FORBIDDEN | 403  | body  | RULE_IGNORE_FORBIDDEN        |
      | NOT_FOUND        | 404  | body  | MATCHING_RESOURCE_NOT_FOUND  |