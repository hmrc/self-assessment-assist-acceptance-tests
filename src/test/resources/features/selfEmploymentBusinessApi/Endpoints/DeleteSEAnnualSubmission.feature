@DeleteSEAnnualSubmission @SelfEmploymentBusinessApi @All

Feature: Delete SE Annual Submission

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Delete a self employment annual submission with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to DELETE to url: SelfEmploymentBusinessAnnualSubmissionUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario   | Code | Response                    |
      | DELETE              | 204  | empty                       |
      | NOT_FOUND           | 404  | MATCHING_RESOURCE_NOT_FOUND |
