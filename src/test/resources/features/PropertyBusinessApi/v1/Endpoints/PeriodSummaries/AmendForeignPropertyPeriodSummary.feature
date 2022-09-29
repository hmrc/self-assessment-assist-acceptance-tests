@AmendForeignPropertyPeriodSummary @PropertyBusinessApiV1 @PropertyBusinessApi  @All

Feature: Amend a Foreign Property Income & Expenditure Period Summary

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend a Foreign Property Income & Expenditure Period Summary for <Scenario>

    When a request is made to PUT to url: ForeignPropertyPeriodSummaryUrl, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                       | Scenario                | Code | Item  | Response                                     |
      | AMEND_FOREIGN_PROPERTY                        | None                    | 200  | model | HateoasLinks                                 |
      | AMEND_FOREIGN_PROPERTY_CONSOLIDATED           | None                    | 200  | model | HateoasLinks                                 |
      | AMEND_FOREIGN_PROPERTY_MINIMUM_FIELDS         | None                    | 200  | model | HateoasLinks                                 |
      | AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_REQUEST   | None                    | 400  | body  | AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_RESPONSE |
      | AMEND_FOREIGN_PROPERTY_MISSING_ERRORS_REQUEST | None                    | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED       |
      | AMEND_FOREIGN_PROPERTY                        | NOT_FOUND               | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                  |
      | AMEND_FOREIGN_PROPERTY                        | INCOME_SOURCE_NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                  |