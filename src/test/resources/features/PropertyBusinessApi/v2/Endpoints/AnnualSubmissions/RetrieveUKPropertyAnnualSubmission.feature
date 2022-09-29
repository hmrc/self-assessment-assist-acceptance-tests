@RetrieveUKPropertyAnnualSubmission @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Retrieve UK Property Annual Submission V2

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve UK Property Annual Submission for <Scenario>

    When a request is made to GET to url: UKPropertyAnnualSubmissionUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                        | Code | Item  | Response                                             |
      | None                            | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                          |
      | UK_PROPERTY                     | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse           |
      | UK_FHL_ALL_OTHER_ALLOWANCES     | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse           |
      | UK_FHL_PROPERTY_ALLOWANCE       | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse           |
      | UK_NON_FHL_ALL_OTHER_ALLOWANCES | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse           |
      | UK_NON_FHL_PROPERTY_ALLOWANCE   | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse           |
      | FOREIGN_PROPERTY                | 400  | body  | PROPERTY_BUSINESS_V2_RULE_TYPE_OF_BUSINESS_INCORRECT |