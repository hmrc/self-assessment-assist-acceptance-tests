@DeleteHistoricNonFhlUKPropertyBusinessAnnualSubmission @PropertyBusinessApiV2 @PropertyBusinessApi @All

Feature: Delete Historic Non FHL UK Property Business Annual Submission

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Delete Historic Non FHL UK Property Business Annual Submission with scenario: <Scenario>

    When a request is made to DELETE to url: HistoricNonFhlUKPropertyAnnualSubmissionUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario  | Code | Response                    |
      | DELETE    | 204  | empty                       |
      | NOT_FOUND | 404  | MATCHING_RESOURCE_NOT_FOUND |
