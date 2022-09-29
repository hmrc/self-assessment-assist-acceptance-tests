@SaBsasApi @All @RetrieveSEBsas @V2

Feature: Retrieve UK Property Business' Summary Adjustments

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve a UK Property Business' Summary Adjustments with scenario: <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Url                              | Scenario                         | Code | Item  | Response                              |
      | RetrieveUkPropBsasAdjustmentsUrl | None                             | 404  | body  | MATCHING_RESOURCE_NOT_FOUND           |
      | RetrieveUkPropBsasAdjustmentsUrl | UK_PROPERTY_FHL_ADJUSTED         | 200  | model | RetrieveUkPropBsasAdjustmentsResponse |
      | RetrieveUkPropBsasAdjustmentsUrl | UK_PROPERTY_FHL_CONSOLIDATED     | 200  | model | RetrieveUkPropBsasAdjustmentsResponse |
      | RetrieveUkPropBsasAdjustmentsUrl | UK_PROPERTY_FHL_UNADJUSTED       | 403  | body  | RULE_NO_ADJUSTMENTS_MADE              |
      | RetrieveUkPropBsasAdjustmentsUrl | UK_PROPERTY_NON_FHL_ADJUSTED     | 200  | model | RetrieveUkPropBsasAdjustmentsResponse |
      | RetrieveUkPropBsasAdjustmentsUrl | UK_PROPERTY_NON_FHL_CONSOLIDATED | 200  | model | RetrieveUkPropBsasAdjustmentsResponse |
      | RetrieveUkPropBsasAdjustmentsUrl | UK_PROPERTY_NON_FHL_UNADJUSTED   | 403  | body  | RULE_NO_ADJUSTMENTS_MADE              |
      | RetrieveUkPropBsasAdjustmentsUrl | NOT_UK_PROPERTY                  | 403  | body  | RULE_NOT_UK_PROPERTY                  |