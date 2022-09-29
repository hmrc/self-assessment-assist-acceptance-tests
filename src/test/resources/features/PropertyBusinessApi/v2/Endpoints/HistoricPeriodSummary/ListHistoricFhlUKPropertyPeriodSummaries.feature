@ListHistoricFhlUKPropertyPeriodSummaries @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: List Historic FHL UK Property Income & Expenses Period Summaries V2

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: List Historic FHL UK Property Income & Expenses Period Summaries with scenario: <Scenario>

    When a request is made to GET to url: HistoricFhlUKPropertyPeriodSummaryUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                    | Code | Item  | Response                                      |
      | None                        | 200  | model | ListHistoricUKPropertyPeriodSummariesResponse |
      | EMPTY                       | 200  | model | ListHistoricUKPropertyPeriodSummariesResponse |
