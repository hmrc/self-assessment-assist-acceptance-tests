@AmendStateBenefitAmounts @IndividualsStateBenefitsApi @All

Feature: Amend State Benefit Amounts

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend state benefit amounts with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsStateBenefitsAmountsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                           | Scenario           | Code | Item  | Response                                      |
      | iStateBenefitsAmendAmountsRequest              | None               | 200  | model | HateoasLinks                                  |
      | iStateBenefitsAmendAmountsMinimumFieldsRequest | None               | 200  | model | HateoasLinks                                  |
      | iStateBenefitsAmendAmountsValueErrorsRequest   | None               | 400  | body  | iStateBenefitsAmendAmountsValueErrorsResponse |
      | iStateBenefitsAmendAmountsInvalidBodyRequest   | None               | 400  | body  | iStateBenefitsAmendAmountsInvalidBodyResponse |
      | iStateBenefitsAmendAmountsEmptyBodyRequest     | None               | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED        |
      | iStateBenefitsAmendAmountsRequest              | TAX_YEAR_NOT_ENDED | 400  | body  | BENEFITS_RULE_TAX_YEAR_NOT_ENDED              |
      | iStateBenefitsAmendAmountsRequest              | NOT_FOUND          | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                   |
