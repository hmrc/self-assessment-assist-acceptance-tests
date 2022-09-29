@RetrieveUKPropertyPeriodSummary @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Retrieve UK Property Period Summary V2

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve UK Property Period Summary for <Scenario>

    When a request is made to GET to url: UKPropertyPeriodSummaryUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                 | Code | Item  | Response                                          |
      | None                     | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                       |
      | UK_PROPERTY              | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse        |
      | UK_FHL_FULL_EXPENSES     | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse        |
      | UK_FHL_CONSOLIDATED      | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse        |
      | UK_NON_FHL_FULL_EXPENSES | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse        |
      | UK_NON_FHL_CONSOLIDATED  | 200  | model | RetrieveUKPropertyAnnualSubmissionResponse        |
      | FOREIGN_PROPERTY         | 400  | body  | PROPERTY_BUSINESS_V2_RULE_TYPE_OF_BUSINESS_INCORRECT |