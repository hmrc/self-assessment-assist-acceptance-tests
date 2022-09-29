@HistoricFhlUKPropertyPeriodSummary @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Amend a Historic FHL UK property Income & Expenses Period Summary V2

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Amend a Historic FHL UK property Income & Expenses Period Summary with scenario: <Scenario>

    When a request is made to PUT to url: HistoricFhlUKPropertyPeriodSummaryPeriodUrl, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                                                 | Scenario                | Code | Item  | Response                       |
      | AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY_V2                        | None                    | 200  | model | HateoasLinks                   |
      | AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY_CONSOLIDATED_V2           | None                    | 200  | model | HateoasLinks                   |
      | AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY_V2                        | NOT_FOUND               | 404  | body  | MATCHING_RESOURCE_NOT_FOUND    |