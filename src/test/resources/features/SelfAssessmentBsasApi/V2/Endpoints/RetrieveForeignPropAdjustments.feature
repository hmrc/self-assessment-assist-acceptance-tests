@SaBsasApi @All @RetrieveForeignPropBsas @V2

Feature: Retrieve Foreign Property Business' Summary Adjustments

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve a Foreign Property Business' Summary Adjustments with scenario: <Scenario>

    When a request is made to GET to url: RetrieveForeignPropBsasAdjustmentsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                               | Code | Item  | Response                           |
      | None                                   | 404  | body  | MATCHING_RESOURCE_NOT_FOUND        |
      | FOREIGN_PROPERTY_FHL_EEA_ADJUSTED      | 200  | body  | FOREIGN_PROP_FHL_EEA_ADJUSTED      |
      | FOREIGN_PROPERTY_FHL_EEA_CONSOLIDATED  | 200  | body  | FOREIGN_PROP_FHL_EEA_CONSOLIDATED  |
      | FOREIGN_PROPERTY_FHL_EEA_UNADJUSTED    | 403  | body  | RULE_NO_ADJUSTMENTS_MADE           |
      | FOREIGN_PROPERTY_ADJUSTED              | 200  | body  | FOREIGN_PROP_ADJUSTED              |
      | FOREIGN_PROPERTY_CONSOLIDATED          | 200  | body  | FOREIGN_PROP_CONSOLIDATED          |
      | FOREIGN_PROPERTY_UNADJUSTED            | 403  | body  | RULE_NO_ADJUSTMENTS_MADE           |
      | NOT_FOREIGN_PROPERTY                   | 403  | body  | RULE_NOT_FOREIGN_PROPERTY          |