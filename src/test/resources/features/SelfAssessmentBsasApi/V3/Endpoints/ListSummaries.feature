@SaBsasApi @All @ListBsas @V3

Feature: List Business Source Adjustable Summaries

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: List Business Source Adjustable Summaries with scenario: <Scenario>

    When a request is made to GET to url: SaBsasListUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario         | Code | Item  | Response                    |
      | None             | 200  | model | ListBsasResponseV3          |
      | SELF_EMPLOYMENT  | 200  | model | ListBsasResponseV3          |
      | UK_PROPERTY      | 200  | model | ListBsasResponseV3          |
      | FOREIGN_PROPERTY | 200  | model | ListBsasResponseV3          |
      | NOT_FOUND        | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |
