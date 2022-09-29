@SaBsasApi @All @RetrieveUkPropBsas @V3

Feature: Retrieve UK Property Business Source Adjustable Summary

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Retrieve a UK Property Business Source Adjustable Summary with scenario: <Scenario>

    When a request is made to GET to url: RetrieveUkPropBsasV3Url, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                          | Code | Item  | Response                      |
      | None                              | 404  | body  | MATCHING_RESOURCE_NOT_FOUND   |
      | UK_PROPERTY_FHL_PROFIT            | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_PROPERTY_FHL_LOSS              | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_PROPERTY_NON_FHL_PROFIT        | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_PROPERTY_NON_FHL_LOSS	      | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_PROPERTY_FHL_CONSOLIDATED      | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_PROPERTY_NON_FHL_CONSOLIDATED  | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_FHL_PROPERTY_ALLOWANCE         | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_NON_FHL_PROPERTY_ALLOWANCE     | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_PROPERTY_STATUS_INVALID        | 200  | model | RetrieveUkPropBsasResponseV3  |
      | UK_PROPERTY_STATUS_SUPERSEDED     | 200  | model | RetrieveUkPropBsasResponseV3  |
      | NOT_UK_PROPERTY                   | 400  | body  | V3_BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT       |
