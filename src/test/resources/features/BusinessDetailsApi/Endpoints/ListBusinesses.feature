@BusinessDetailsApi @ListBusinesses

Feature: List All Businesses

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: List all businesses with scenario: <Scenario>

    When a request is made to GET to url: ListAllBusinessesUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario              | Code | Item  | Response                    |
      | None                  | 200  | model | ListBusinessesResponse      |
      | PROPERTY              | 200  | model | ListBusinessesResponse      |
      | FOREIGN_PROPERTY      | 200  | model | ListBusinessesResponse      |
      | BUSINESS_AND_PROPERTY | 200  | model | ListBusinessesResponse      |
      | UNSPECIFIED           | 200  | model | ListBusinessesResponse      |
      | NOT_FOUND             | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |