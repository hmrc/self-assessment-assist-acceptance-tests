@DeleteReliefInvestments @IndividualsReliefsApi @All

Feature: Delete a relief investment

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully delete a relief investment with Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to DELETE to url: ReliefsInvestmentsUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario          | Code | Response                    |
      | None                       | 204  | empty                       |

  Scenario Outline: Unsuccessfully delete a relief investment with Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to DELETE to url: ReliefsInvestmentsUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario          | Code | Response                    |
      | NOT_FOUND                  | 404  | MATCHING_RESOURCE_NOT_FOUND |