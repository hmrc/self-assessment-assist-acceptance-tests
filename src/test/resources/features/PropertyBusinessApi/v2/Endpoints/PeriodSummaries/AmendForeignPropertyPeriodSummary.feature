@AmendForeignPropertyPeriodSummary @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Amend a Foreign Property Income & Expenditure Period Summary V2

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Amend a Foreign Property Income & Expenditure Period Summary for <Scenario>

    When a request is made to PUT to url: ForeignPropertyPeriodSummaryUrlV2, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                          | Scenario                   | Code | Item  | Response                                                            |
      | AMEND_FOREIGN_PROPERTY_V2                        | None                       | 200  | model | HateoasLinks                                                        |
      | AMEND_FOREIGN_PROPERTY_CONSOLIDATED_V2           | None                       | 200  | model | HateoasLinks                                                        |
      | AMEND_FOREIGN_PROPERTY_MINIMUM_FIELDS_V2         | None                       | 200  | model | HateoasLinks                                                        |
      | AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_REQUEST_V2   | None                       | 400  | body  | AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_RESPONSE_V2                     |
      | AMEND_FOREIGN_PROPERTY_MISSING_ERRORS_REQUEST_V2 | None                       | 400  | body  | AMEND_FOREIGN_PERIOD_RULE_TYPE_OF_BUSINESS_INCORRECT_PATHS_RESPONSE |
      | AMEND_FOREIGN_PROPERTY_V2                        | TYPE_OF_BUSINESS_INCORRECT | 400  | body  | RULE_TYPE_OF_BUSINESS_INCORRECT_RESPONSE                            |
      | AMEND_FOREIGN_PROPERTY_V2                        | NOT_FOUND                  | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                                         |
