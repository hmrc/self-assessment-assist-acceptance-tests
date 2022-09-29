@SaBsasApi @All @RetrieveForeignPropBsas @V2

Feature: Retrieve Foreign Property Business Source Adjustable Summaries

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve a Foreign Property Business Source Adjustable Summary with scenario: <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the response body contains <Key> - <Value> as a <Type>
    And the X-CorrelationId header is not empty

    Examples:
      | Url                                    | Scenario                               | Code | Item  | Response                        | Key             | Value                       | Type    |
      | RetrieveForeignPropBsasUrlNoParameters | None                                   | 404  | body  | MATCHING_RESOURCE_NOT_FOUND     | code            | MATCHING_RESOURCE_NOT_FOUND | String  |
      | RetrieveForeignPropBsasUrlNoParameters | FOREIGN_PROPERTY_FHL_EEA_ADJUSTED      | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | true                        | Boolean |
      | RetrieveForeignPropBsasUrlReturnTrue   | FOREIGN_PROPERTY_FHL_EEA_ADJUSTED      | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | true                        | Boolean |
      | RetrieveForeignPropBsasUrlReturnFalse  | FOREIGN_PROPERTY_FHL_EEA_ADJUSTED      | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | false                       | Boolean |
      | RetrieveForeignPropBsasUrlNoParameters | FOREIGN_PROPERTY_FHL_EEA_CONSOLIDATED  | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | true                        | Boolean |
      | RetrieveForeignPropBsasUrlReturnTrue   | FOREIGN_PROPERTY_FHL_EEA_CONSOLIDATED  | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | true                        | Boolean |
      | RetrieveForeignPropBsasUrlReturnFalse  | FOREIGN_PROPERTY_FHL_EEA_CONSOLIDATED  | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | false                       | Boolean |
      | RetrieveForeignPropBsasUrlNoParameters | FOREIGN_PROPERTY_ADJUSTED              | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | true                        | Boolean |
      | RetrieveForeignPropBsasUrlReturnTrue   | FOREIGN_PROPERTY_ADJUSTED              | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | true                        | Boolean |
      | RetrieveForeignPropBsasUrlReturnFalse  | FOREIGN_PROPERTY_ADJUSTED              | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | false                       | Boolean |
      | RetrieveForeignPropBsasUrlNoParameters | FOREIGN_PROPERTY_CONSOLIDATED          | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | true                        | Boolean |
      | RetrieveForeignPropBsasUrlReturnTrue   | FOREIGN_PROPERTY_CONSOLIDATED          | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | true                        | Boolean |
      | RetrieveForeignPropBsasUrlReturnFalse  | FOREIGN_PROPERTY_CONSOLIDATED          | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | false                       | Boolean |
      | RetrieveForeignPropBsasUrlNoParameters | FOREIGN_PROPERTY_FHL_EEA_UNADJUSTED    | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | false                       | Boolean |
      | RetrieveForeignPropBsasUrlReturnTrue   | FOREIGN_PROPERTY_FHL_EEA_UNADJUSTED    | 403  | body  | RULE_NO_ADJUSTMENTS_MADE        | code            | RULE_NO_ADJUSTMENTS_MADE    | String  |
      | RetrieveForeignPropBsasUrlReturnFalse  | FOREIGN_PROPERTY_FHL_EEA_UNADJUSTED    | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | false                       | Boolean |
      | RetrieveForeignPropBsasUrlNoParameters | FOREIGN_PROPERTY_UNADJUSTED            | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | false                       | Boolean |
      | RetrieveForeignPropBsasUrlReturnTrue   | FOREIGN_PROPERTY_UNADJUSTED            | 403  | body  | RULE_NO_ADJUSTMENTS_MADE        | code            | RULE_NO_ADJUSTMENTS_MADE    | String  |
      | RetrieveForeignPropBsasUrlReturnFalse  | FOREIGN_PROPERTY_UNADJUSTED            | 200  | model | RetrieveForeignPropBsasResponse | adjustedSummary | false                       | Boolean |
      | RetrieveForeignPropBsasUrlNoParameters | NOT_FOREIGN_PROPERTY                   | 403  | body  | RULE_NOT_FOREIGN_PROPERTY       | code            | RULE_NOT_FOREIGN_PROPERTY   | String  |
