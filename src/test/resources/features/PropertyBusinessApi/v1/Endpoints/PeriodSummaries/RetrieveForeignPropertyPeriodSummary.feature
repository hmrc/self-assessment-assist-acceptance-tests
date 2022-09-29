@RetrieveForeignPropertyPeriodSummary @PropertyBusinessApiV1 @PropertyBusinessApi  @All

Feature: Retrieve Foreign Property Period Summary

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve Foreign Property Period Summary for <Scenario>

    When a request is made to GET to url: ForeignPropertyPeriodSummaryUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                 | Code | Item | Response                                            |
      | None                     | 200  | body | PROPERTY_BUSINESS_DEFAULT_RESPONSE                  |
      | CONSOLIDATED_EXPENDITURE | 200  | body | PROPERTY_BUSINESS_CONSOLIDATED_EXPENDITURE_RESPONSE |
      | NO_EXPENDITURE           | 200  | body | PROPERTY_BUSINESS_NO_EXPENDITURE_RESPONSE           |
      | NOT_FOUND                | 404  | body | MATCHING_RESOURCE_NOT_FOUND                         |