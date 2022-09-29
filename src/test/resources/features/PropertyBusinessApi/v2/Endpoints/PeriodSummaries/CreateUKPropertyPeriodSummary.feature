@CreateUKPropertyPeriodSummary @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Create a UK Property Period Summary V2

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Create a UK Property Period Summary with scenario: <Scenario>

    When a request is made to POST to url: CreateUKPropertyPeriodSummaryUrl, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                   | Scenario                   | Code | Item  | Response                                 |
      | CREATE_UK_PROPERTY_MIN_FIELDS             | None                       | 201  | model | CreatePropertyPeriodSummaryResponse      |
      | CREATE_UK_PROPERTY_EXPENSES               | None                       | 201  | model | CreatePropertyPeriodSummaryResponse      |
      | CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES  | None                       | 201  | model | CreatePropertyPeriodSummaryResponse      |
      | CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES  | OVERLAPPING                | 400  | body  | RULE_OVERLAPPING_PERIOD                  |
      | CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES  | MISALIGNED                 | 400  | body  | RULE_MISALIGNED_PERIOD                   |
      | CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES  | NOT_CONTIGUOUS             | 400  | body  | RULE_NOT_CONTIGUOUS_PERIOD               |
      | CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES  | DUPLICATE_SUBMISSION       | 400  | body  | RULE_DUPLICATE_SUBMISSION_PB             |
      | CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES  | TYPE_OF_BUSINESS_INCORRECT | 400  | body  | RULE_TYPE_OF_BUSINESS_INCORRECT_RESPONSE |
      | CREATE_UK_PROPERTY_EXPENSES               | NOT_FOUND                  | 404  | body  | MATCHING_RESOURCE_NOT_FOUND              |