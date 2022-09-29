@AmendUkPropertyPeriodSummary @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Amend a UK Property Income & Expenses Period Summary

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Amend a UK Property Income & Expenditure Period Summary for <Scenario>

    When a request is made to PUT to url: UkPropertyPeriodSummaryUrl, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                        | Scenario                   | Code | Item  | Response                                          |
      #Happy path scenarios
      | AMEND_UK_PROPERTY_PERIOD_SUMMARY               | None                       | 200  | model | HateoasLinks                                      |
      | AMEND_UK_PROPERTY_PERIOD_SUMMARY_CONSOLIDATED  | None                       | 200  | model | HateoasLinks                                      |
      | AMEND_UK_PROPERTY_PERIOD_SUMMARY_MINIMUM       | None                       | 200  | model | HateoasLinks                                      |
      #Validation error scenarios
      | AMEND_UK_PROPERTY_PERIOD_SUMMARY_VALUE_FORMAT  | None                       | 400  | body  | AMEND_UK_PROPERTY_PERIOD_SUMMARY_VALUE_FORMAT     |
      | AMEND_UK_PROPERTY_PERIOD_SUMMARY_BOTH_EXPENSES | None                       | 400  | body  | AMEND_UK_PROPERTY_PERIOD_SUMMARY_BOTH_EXPENSES    |
      | AMEND_UK_PROPERTY_PERIOD_SUMMARY_EMPTY_ITEMS   | None                       | 400  | body  | AMEND_UK_PROPERTY_PERIOD_SUMMARY_EMPTY_ITEMS      |
      #Downstream error scenarios
      | AMEND_UK_PROPERTY_PERIOD_SUMMARY               | TYPE_OF_BUSINESS_INCORRECT | 400  | body  | PROPERTY_BUSINESS_V2_RULE_TYPE_OF_BUSINESS_INCORRECT |
      | AMEND_UK_PROPERTY_PERIOD_SUMMARY               | NOT_FOUND                  | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                       |
