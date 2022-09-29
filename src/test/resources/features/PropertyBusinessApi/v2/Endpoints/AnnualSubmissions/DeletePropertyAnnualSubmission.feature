@DeletePropertyAnnualSubmission @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Delete a Property Annual Submission V2

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Delete a property annual submission for <Scenario>

    When a request is made to DELETE to url: DeletePropertyAnnualSubmissionUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                 | Code | Item | Response                    |
      | None                     | 204  | body | empty                       |
      | NOT_FOUND                | 404  | body | MATCHING_RESOURCE_NOT_FOUND |