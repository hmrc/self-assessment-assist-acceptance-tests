@CreateForeignPropertyPeriodSummary @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Create a Foreign Property Income & Expenses Period Summary V2

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Create a Foreign Property Income & Expenses Period Summary with scenario: <Scenario>

    When a request is made to POST to url: CreateForeignPropertyPeriodSummaryUrlV2, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                          | Scenario                   | Code | Item  | Response                                 |
      | createForeignPropertyMinimumFieldsV2             | None                       | 201  | model | CreatePropertyPeriodSummaryResponse      |
      | createForeignPropertyWithExpensesV2              | None                       | 201  | model | CreatePropertyPeriodSummaryResponse      |
      | createForeignPropertyWithConsolidatedExpensesV2  | None                       | 201  | model | CreatePropertyPeriodSummaryResponse      |
      | createForeignPropertyWithConsolidatedExpensesV2  | OVERLAPPING                | 400  | body  | RULE_OVERLAPPING_PERIOD                  |
      | createForeignPropertyWithConsolidatedExpensesV2  | MISALIGNED                 | 400  | body  | RULE_MISALIGNED_PERIOD                   |
      | createForeignPropertyWithConsolidatedExpensesV2  | NOT_CONTIGUOUS             | 400  | body  | RULE_NOT_CONTIGUOUS_PERIOD               |
      | createForeignPropertyWithConsolidatedExpensesV2  | DUPLICATE_SUBMISSION       | 400  | body  | RULE_DUPLICATE_SUBMISSION_PB             |
      | createForeignPropertyWithConsolidatedExpensesV2  | TYPE_OF_BUSINESS_INCORRECT | 400  | body  | RULE_TYPE_OF_BUSINESS_INCORRECT_RESPONSE |
      | createForeignPropertyWithExpensesV2              | NOT_FOUND                  | 404  | body  | MATCHING_RESOURCE_NOT_FOUND              |