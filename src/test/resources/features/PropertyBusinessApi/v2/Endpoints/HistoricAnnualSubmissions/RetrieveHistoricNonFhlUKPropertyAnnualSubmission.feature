@RetrieveHistoricNonFhlUKPropertyAnnualSubmission @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Retrieve Historic Non FHL UK Property Annual Submission V2

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve Historic Non FHL UK Property Annual Submission for <Scenario>

    When a request is made to GET to url: HistoricNonFhlUKPropertyAnnualSubmissionUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario  | Code | Item  | Response                                                 |
      | None      | 200  | model | RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse |
      | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                              |