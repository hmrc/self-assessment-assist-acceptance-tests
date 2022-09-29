@SaBsasApi @All @RetrieveSEBsas @V3

Feature: Retrieve Self-Employment Business Source Adjustable Summaries

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Retrieve a Self-Employment Business Source Adjustable Summary with scenario: <Gov-Test-Scenario>

    When a request is made to GET to url: RetrieveSelfEmploymentBsasUrlV3, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario                 | Code | Item  | Response                    |
      | None                              | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |
      | SELF_EMPLOYMENT_PROFIT            | 200  | model | RetrieveSEBsasResponseV3    |
      | SELF_EMPLOYMENT_LOSS              | 200  | model | RetrieveSEBsasResponseV3    |
      | SELF_EMPLOYMENT_CONSOLIDATED      | 200  | model | RetrieveSEBsasResponseV3    |
      | TRADING_ALLOWANCE                 | 200  | model | RetrieveSEBsasResponseV3    |
      | SELF_EMPLOYMENT_UNADJUSTED        | 200  | model | RetrieveSEBsasResponseV3    |
      | SELF_EMPLOYMENT_STATUS_INVALID    | 200  | model | RetrieveSEBsasResponseV3    |
      | SELF_EMPLOYMENT_STATUS_SUPERSEDED | 200  | model | RetrieveSEBsasResponseV3    |
      | NOT_SELF_EMPLOYMENT               | 400  | body  | V3_BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT |