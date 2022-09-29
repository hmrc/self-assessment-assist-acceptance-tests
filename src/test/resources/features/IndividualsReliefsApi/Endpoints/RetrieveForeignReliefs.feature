@RetrieveForeignReliefs @IndividualsReliefsApi @All

Feature: Retrieve Foreign Reliefs

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully retrieve foreign reliefs with Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to GET to url: ForeignReliefsUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario          | Code | Item   | Response                             |
      | None                       | 200  | model  | RetrieveForeignReliefs               |

  Scenario Outline: Unsuccessfully retrieve foreign reliefs with Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to GET to url: ForeignReliefsUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario          | Code | Item   | Response                           |
      | NOT_FOUND                  | 404  | body   | MATCHING_RESOURCE_NOT_FOUND        |