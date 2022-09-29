@RetrieveForeignProperty @PropertyBusinessApiV1 @PropertyBusinessApi  @All

Feature: Retrieve Foreign Property Annual Submission

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve Foreign Property Annual Submission for <Scenario>

    When a request is made to GET to url: ForeignPropertyAnnualSubmissionUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                  | Code | Item  | Response                                        |
      | None                      | 200  | model | RetrieveForeignPropertyAnnualSubmissionResponse |
      | MULTIPLE_FOREIGN_PROPERTY | 200  | model | RetrieveForeignPropertyAnnualSubmissionResponse |
      | NOT_FOUND                 | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                     |