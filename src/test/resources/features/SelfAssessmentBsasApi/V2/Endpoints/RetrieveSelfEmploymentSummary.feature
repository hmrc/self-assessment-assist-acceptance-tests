@SaBsasApi @All @RetrieveSEBsas @V2

Feature: Retrieve Self-Employment Business Source Adjustable Summaries

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve a Self-Employment Business Source Adjustable Summary with scenario: <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Url                                       | Scenario                     | Code | Item  | Response                    |
      | RetrieveSelfEmploymentBsasUrlNoParameters | None                         | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |
      | RetrieveSelfEmploymentBsasUrlNoParameters | SELF_EMPLOYMENT_ADJUSTED     | 200  | model | RetrieveSEBsasResponseV2    |
      | RetrieveSelfEmploymentBsasUrlReturnTrue   | SELF_EMPLOYMENT_ADJUSTED     | 200  | model | RetrieveSEBsasResponseV2    |
      | RetrieveSelfEmploymentBsasUrlReturnFalse  | SELF_EMPLOYMENT_ADJUSTED     | 200  | model | RetrieveSEBsasResponseV2    |
      | RetrieveSelfEmploymentBsasUrlNoParameters | SELF_EMPLOYMENT_CONSOLIDATED | 200  | model | RetrieveSEBsasResponseV2    |
      | RetrieveSelfEmploymentBsasUrlReturnTrue   | SELF_EMPLOYMENT_CONSOLIDATED | 200  | model | RetrieveSEBsasResponseV2    |
      | RetrieveSelfEmploymentBsasUrlReturnFalse  | SELF_EMPLOYMENT_CONSOLIDATED | 200  | model | RetrieveSEBsasResponseV2    |
      | RetrieveSelfEmploymentBsasUrlNoParameters | SELF_EMPLOYMENT_UNADJUSTED   | 200  | model | RetrieveSEBsasResponseV2    |
      | RetrieveSelfEmploymentBsasUrlReturnTrue   | SELF_EMPLOYMENT_UNADJUSTED   | 403  | body  | RULE_NO_ADJUSTMENTS_MADE    |
      | RetrieveSelfEmploymentBsasUrlReturnFalse  | SELF_EMPLOYMENT_UNADJUSTED   | 200  | model | RetrieveSEBsasResponseV2    |
      | RetrieveSelfEmploymentBsasUrlNoParameters | NOT_SELF_EMPLOYMENT          | 403  | body  | RULE_NOT_SELF_EMPLOYMENT    |