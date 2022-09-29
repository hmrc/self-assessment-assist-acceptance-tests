@CreateStateBenefit @IndividualsStateBenefitsApi @All

Feature: Create State Benefit

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create state benefit with scenario: <Scenario>

    When a request is made to POST to url: IndividualsStateBenefitsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                  | Scenario            | Code | Item  | Response                                |
      | iStateBenefitsAddRequest              | None                | 200  | model | CreateStateBenefit                      |
      | iStateBenefitsAddMinimumFieldsRequest | None                | 200  | model | CreateStateBenefit                      |
      | iStateBenefitsAddInvalidBodyRequest   | None                | 400  | body  | iStateBenefitsAddInvalidBodyResponse    |
      | iStateBenefitsAddValueErrorsRequest   | None                | 400  | body  | iStateBenefitsAddValueErrorsResponse    |
      | iStateBenefitsAddRequest              | BENEFIT_TYPE_EXISTS | 403  | body  | RULE_BENEFIT_TYPE_EXISTS                |