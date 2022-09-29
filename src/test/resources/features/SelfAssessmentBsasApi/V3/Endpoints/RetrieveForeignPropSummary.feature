@SaBsasApi @All @RetrieveForeignPropBsas @V3

Feature: Retrieve Foreign Property Business Source Adjustable Summary

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Retrieve a Foreign Property Business Source Adjustable Summary with scenario: <Scenario>

    When a request is made to GET to url: RetrieveForeignPropBsasV3Url, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                               | Code | Item  | Response                                 |
      | None                                   | 404  | body  | MATCHING_RESOURCE_NOT_FOUND              |
      | FOREIGN_PROPERTY_FHL_PROFIT            | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_PROPERTY_FHL_LOSS              | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_PROPERTY_NON_FHL_PROFIT        | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_PROPERTY_NON_FHL_LOSS          | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_PROPERTY_FHL_CONSOLIDATED      | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_PROPERTY_NON_FHL_CONSOLIDATED  | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_FHL_PROPERTY_ALLOWANCE         | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_NON_FHL_PROPERTY_ALLOWANCE     | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_PROPERTY_STATUS_INVALID        | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | FOREIGN_PROPERTY_STATUS_SUPERSEDED     | 200  | model | RetrieveForeignPropBsasResponseV3        |
      | NOT_FOREIGN_PROPERTY                   | 400  | body  | V3_BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT  |

  Scenario: Retrieve a Foreign Property Business Source Adjustable Summary with all scenarios

    Given a list of gov-test-scenarios:
      | FOREIGN_PROPERTY_NON_FHL_CONSOLIDATED |
      | FOREIGN_PROPERTY_FHL_CONSOLIDATED     |
      | FOREIGN_FHL_PROPERTY_ALLOWANCE        |
      | FOREIGN_NON_FHL_PROPERTY_ALLOWANCE    |
      | FOREIGN_PROPERTY_NON_FHL_LOSS         |
      | FOREIGN_PROPERTY_NON_FHL_PROFIT       |
    When requests are made to GET to url RetrieveForeignPropBsasV3Url for each of these scenarios
    Then all fields are covered for model RetrieveForeignPropBsasResponseV3


