@RetrievePensionReliefs @IndividualsReliefsApi @All

Feature: Retrieve pension reliefs

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully retrieve a pension relief with <Gov-Test-Scenario>
    When a request is made to GET to url: PensionReliefsUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario          | Code | Item   | Response                           |
      | None                       | 200  | model  | RetrievePensionReliefsResponse     |

  Scenario Outline: Unsuccessfully retrieve a pension relief with <Gov-Test-Scenario>
    When a request is made to GET to url: PensionReliefsUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario          | Code | Item   | Response                           |
      | NOT_FOUND                  | 404  | body   | MATCHING_RESOURCE_NOT_FOUND        |