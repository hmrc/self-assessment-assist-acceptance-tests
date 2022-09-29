@SelfEmploymentBusinessApi @CreateSEPeriodSummary @All

Feature: Create a self-employment period summary

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create a Self Employment Period Summary for <Scenario>

    When a request is made to POST to url: CreateOrListSelfEmploymentBusinessPeriodSummariesUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                     | Scenario                          | Code | Item  | Response                                  |
      | CREATE_SE_PERIOD_SUMMARY | None                              | 200  | model | CreateSEPeriodSummaryResponse             |
      | CREATE_SE_PERIOD_SUMMARY | MISALIGNED_PERIOD                 | 400  | body  | RULE_MISALIGNED_PERIOD_SE                 |
      | CREATE_SE_PERIOD_SUMMARY | NOT_ALLOWED_CONSOLIDATED_EXPENSES | 400  | body  | RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES_SE |
      | CREATE_SE_PERIOD_SUMMARY | NOT_CONTIGUOUS_PERIOD             | 400  | body  | RULE_NOT_CONTIGUOUS_PERIOD_SE             |
      | CREATE_SE_PERIOD_SUMMARY | OVERLAPPING_PERIOD                | 400  | body  | RULE_OVERLAPPING_PERIOD_SE                |
      | CREATE_SE_PERIOD_SUMMARY | NOT_FOUND                         | 404  | body  | MATCHING_RESOURCE_NOT_FOUND               |