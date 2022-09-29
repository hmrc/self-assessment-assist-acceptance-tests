@SaBsasApi @All @V3

Feature: Submit a Self-Employment Business' Accounting Adjustment

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Submit a Self-Employment Accounting Adjustments for <Gov-Test-Scenario>

    When a request is made to POST to url: SubmitSEBsasAdjustmentUrlV3, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                                             | Gov-Test-Scenario                                   | Code | Item  | Response                                           |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | None                                                | 200  | model | HateoasLinks                                       |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT_CONSOLIDATED  | None                                                | 200  | model | HateoasLinks                                       |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT_BOTH_EXPENSES | None                                                | 400  | body  | V3_BSAS_RULE_SELF_EMPLOYMENT_BOTH_EXPENSES         |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | SUMMARY_STATUS_INVALID                              | 403  | body  | V3_BSAS_RULE_SUMMARY_STATUS_INVALID                |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | SUMMARY_STATUS_SUPERSEDED                           | 403  | body  | V3_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED             |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | ALREADY_ADJUSTED                                    | 403  | body  | V3_BSAS_RULE_ALREADY_ADJUSTED                      |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | RESULTING_VALUE_NOT_PERMITTED                       | 403  | body  | V3_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED         |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | SELF_EMPLOYMENT_OVER_CONSOLIDATED_EXPENSES_THRESHOLD| 403  | body  | V3_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD  |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | TRADING_INCOME_ALLOWANCE_CLAIMED                    | 403  | body  | V3_BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED      |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | TYPE_OF_BUSINESS_INCORRECT                          | 400  | body  | V3_BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT            |
      | V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT               | NOT_FOUND                                           | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                        |
