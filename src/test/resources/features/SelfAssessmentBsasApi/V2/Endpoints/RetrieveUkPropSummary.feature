@SaBsasApi @All @RetrieveUkPropBsas @V2

Feature: Retrieve UK Property Business Source Adjustable Summaries

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve a UK Property Business Source Adjustable Summary with scenario: <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the response body contains <Key> - <Value> as a <Type>
    And the X-CorrelationId header is not empty

    Examples:
      | Url                               | Scenario                         | Code | Item  | Response                      | Key             | Value                       | Type    |
      | RetrieveUkPropBsasUrlNoParameters | None                             | 404  | body  | MATCHING_RESOURCE_NOT_FOUND   | code            | MATCHING_RESOURCE_NOT_FOUND | String  |
      | RetrieveUkPropBsasUrlNoParameters | UK_PROPERTY_FHL_ADJUSTED         | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | true                        | Boolean |
      | RetrieveUkPropBsasUrlReturnTrue   | UK_PROPERTY_FHL_ADJUSTED         | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | true                        | Boolean |
      | RetrieveUkPropBsasUrlReturnFalse  | UK_PROPERTY_FHL_ADJUSTED         | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | false                       | Boolean |
      | RetrieveUkPropBsasUrlNoParameters | UK_PROPERTY_FHL_CONSOLIDATED     | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | true                        | Boolean |
      | RetrieveUkPropBsasUrlReturnTrue   | UK_PROPERTY_FHL_CONSOLIDATED     | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | true                        | Boolean |
      | RetrieveUkPropBsasUrlReturnFalse  | UK_PROPERTY_FHL_CONSOLIDATED     | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | false                       | Boolean |
      | RetrieveUkPropBsasUrlNoParameters | UK_PROPERTY_NON_FHL_ADJUSTED     | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | true                        | Boolean |
      | RetrieveUkPropBsasUrlReturnTrue   | UK_PROPERTY_NON_FHL_ADJUSTED     | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | true                        | Boolean |
      | RetrieveUkPropBsasUrlReturnFalse  | UK_PROPERTY_NON_FHL_ADJUSTED     | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | false                       | Boolean |
      | RetrieveUkPropBsasUrlNoParameters | UK_PROPERTY_NON_FHL_CONSOLIDATED | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | true                        | Boolean |
      | RetrieveUkPropBsasUrlReturnTrue   | UK_PROPERTY_NON_FHL_CONSOLIDATED | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | true                        | Boolean |
      | RetrieveUkPropBsasUrlReturnFalse  | UK_PROPERTY_NON_FHL_CONSOLIDATED | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | false                       | Boolean |
      | RetrieveUkPropBsasUrlNoParameters | UK_PROPERTY_FHL_UNADJUSTED       | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | false                       | Boolean |
      | RetrieveUkPropBsasUrlReturnTrue   | UK_PROPERTY_FHL_UNADJUSTED       | 403  | body  | RULE_NO_ADJUSTMENTS_MADE      | code            | RULE_NO_ADJUSTMENTS_MADE    | String  |
      | RetrieveUkPropBsasUrlReturnFalse  | UK_PROPERTY_FHL_UNADJUSTED       | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | false                       | Boolean |
      | RetrieveUkPropBsasUrlNoParameters | UK_PROPERTY_NON_FHL_UNADJUSTED   | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | false                       | Boolean |
      | RetrieveUkPropBsasUrlReturnTrue   | UK_PROPERTY_NON_FHL_UNADJUSTED   | 403  | body  | RULE_NO_ADJUSTMENTS_MADE      | code            | RULE_NO_ADJUSTMENTS_MADE    | String  |
      | RetrieveUkPropBsasUrlReturnFalse  | UK_PROPERTY_NON_FHL_UNADJUSTED   | 200  | model | RetrieveUkPropBsasResponseV2  | adjustedSummary | false                       | Boolean |
      | RetrieveUkPropBsasUrlNoParameters | NOT_UK_PROPERTY                  | 403  | body  | RULE_NOT_UK_PROPERTY          | code            | RULE_NOT_UK_PROPERTY        | String  |
