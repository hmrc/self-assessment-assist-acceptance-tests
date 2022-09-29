@HistoricFhlUKPropertyPeriodSummary @PropertyBusinessApiV2 @PropertyBusinessApi  @All

Feature: Create a Historic FHL UK Property Income & Expenses Period Summary V2

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Create Historic FHL UK Property Income & Expenses Period Summary with scenario: <Scenario>

    When a request is made to POST to url: HistoricFhlUKPropertyPeriodSummaryUrl, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                    | Scenario               | Code | Item  | Response                                      |
      | createHistoricFhlUKPropertyPeriodSummaryV2 | None                   | 201  | model | CreateHistoricUKPropertyPeriodSummaryResponse |
      | createHistoricFhlUKPropertyPeriodSummaryV2 | NOT_FOUND              | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                   |
      | createHistoricFhlUKPropertyPeriodSummaryV2 | MISALIGNED_PERIOD      | 400  | body  | RULE_MISALIGNED_PERIOD                        |
      | createHistoricFhlUKPropertyPeriodSummaryV2 | NOT_CONTIGUOUS_PERIOD  | 400  | body  | RULE_NOT_CONTIGUOUS_PERIOD                    |
      | createHistoricFhlUKPropertyPeriodSummaryV2 | OVERLAPPING_PERIOD     | 400  | body  | RULE_OVERLAPPING_PERIOD                       |
      | createHistoricFhlUKPropertyPeriodSummaryV2 | DUPLICATE_SUBMISSION   | 400  | body  | RULE_DUPLICATE_SUBMISSION_PB                  |
      | createHistoricFhlUKPropertyPeriodSummaryV2 | TAX_YEAR_NOT_SUPPORTED | 400  | body  | RULE_TAX_YEAR_NOT_SUPPORTED                   |
