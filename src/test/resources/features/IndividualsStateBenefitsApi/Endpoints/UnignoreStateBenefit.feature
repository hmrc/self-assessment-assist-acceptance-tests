@UnignoreStateBenefit @IndividualsStateBenefitsApi @All

Feature: Unignore State Benefit

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Unignore state benefit with scenario: <Scenario>

    When a request is made to do an empty POST to url: IndividualsStateBenefitsUnignoreUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario           | Code | Item  | Response                     |
      | None               | 200  | model | HateoasLinks                 |
      | UNIGNORE_FORBIDDEN | 403  | body  | RULE_UNIGNORE_FORBIDDEN      |
      | NOT_FOUND          | 404  | body  | MATCHING_RESOURCE_NOT_FOUND  |
