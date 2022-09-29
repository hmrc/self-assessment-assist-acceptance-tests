@BusinessDetailsApi @RetrieveBusinessDetails

Feature: Retrieve Business Details

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve business details with scenario: <Scenario>

    When a request is made to GET to url: <URL>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | URL                                | Scenario         | Code | Item  | Response                        |
      | RetrieveBusinessDetailsUrlDefault  | None             | 200  | model | RetrieveBusinessDetailsResponse |
      | RetrieveBusinessDetailsUrlProperty | PROPERTY         | 200  | model | RetrieveBusinessDetailsResponse |
      | RetrieveBusinessDetailsUrlForeign  | FOREIGN_PROPERTY | 200  | model | RetrieveBusinessDetailsResponse |
      | RetrieveBusinessDetailsUrlDefault  | NOT_FOUND        | 404  | body  | MATCHING_RESOURCE_NOT_FOUND     |
