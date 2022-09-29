@SaBsasApi @All @RetrieveSEBsasAdjustments @V2

Feature: Retrieve Self-Employment Business Source Accounting Adjustments

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve a Self-Employment Business Source Accounting Adjustments with scenario: <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Url                                      | Scenario                     | Code | Item  | Response                            |
      | RetrieveSelfEmploymentBsasAdjustmentsUrl | SELF_EMPLOYMENT_ADJUSTED     | 200  | model | RetrieveSEBsasAdjustmentsResponseV2 |
      | RetrieveSelfEmploymentBsasAdjustmentsUrl | SELF_EMPLOYMENT_CONSOLIDATED | 200  | model | RetrieveSEBsasAdjustmentsResponseV2 |
      | RetrieveSelfEmploymentBsasAdjustmentsUrl | SELF_EMPLOYMENT_UNADJUSTED   | 403  | body  | RULE_NO_ADJUSTMENTS_MADE            |
      | RetrieveSelfEmploymentBsasAdjustmentsUrl | NOT_SELF_EMPLOYMENT          | 403  | body  | RULE_NOT_SELF_EMPLOYMENT            |
      | RetrieveSelfEmploymentBsasAdjustmentsUrl | None                         | 404  | body  | MATCHING_RESOURCE_NOT_FOUND         |
