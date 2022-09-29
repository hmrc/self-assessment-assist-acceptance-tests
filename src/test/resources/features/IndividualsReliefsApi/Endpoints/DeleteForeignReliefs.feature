@DeleteReliefForeign @IndividualsReliefsApi @All

Feature: Delete a foreign relief

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario: Successfully delete a foreign relief with Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to DELETE to url: ForeignReliefsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario Outline: Unsuccessfully delete a foreign relief with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to DELETE to url: ForeignReliefsUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario          | Code | Response                    |
      | NOT_FOUND                  | 404  | MATCHING_RESOURCE_NOT_FOUND |