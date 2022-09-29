@AmendSEPeriodicUpdate @SelfEmploymentBusinessApi @All

Feature: Amend a self-employment period summary

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend a self-employment period summary with Body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to PUT to url: AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                                     | Gov-Test-Scenario                 | Code | Item   | Response                                  |
      | AMEND_SE_PERIOD_SUMMARY                         | None                              | 200  | model  | HateoasLinks                              |
      | AMEND_SE_PERIOD_SUMMARY_CONSOLIDATED            | None                              | 200  | model  | HateoasLinks                              |
      | AMEND_SE_CONSOLIDATED_EXPENSES_EXCEEDED         | NOT_ALLOWED_CONSOLIDATED_EXPENSES | 400  | body   | RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES_SE |
      | AMEND_SE_PERIOD_SUMMARY                         | NOT_FOUND                         | 404  | body   | MATCHING_RESOURCE_NOT_FOUND               |