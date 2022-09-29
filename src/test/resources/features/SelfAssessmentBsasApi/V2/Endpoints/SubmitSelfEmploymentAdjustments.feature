@SaBsasApi @All @V2

Feature: Submit a Self-Employment Business' Accounting Adjustment

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Submit a Self-Employment Business' Accounting Adjustment for <Scenario>

    When a request is made to POST to url: SubmitSEBsasAdjustmentUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                                    | Scenario                                             | Code | Item  | Response                                       |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT 	       | None                                                 | 200  | model | BsasIdResponse                                 |
      | SUBMIT_BSAS_ADJUSTMENT_SE_CONSOLIDATED         | None                                                 | 200  | model | BsasIdResponse                                 |
      | SUBMIT_BSAS_ADJUSTMENT_INVALID_SELF_EMPLOYMENT | None                                                 | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED         |
      | SELF_EMPLOYMENT_BOTH_EXPENSES_SUPPLIED         | None                                                 | 400  | body  | BSAS_RULE_BOTH_EXPENSES_SUPPLIED               |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT         | NOT_SELF_EMPLOYMENT                                  | 403  | body  | BSAS_RULE_NOT_SELF_EMPLOYMENT           	      |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT         | TRADING_INCOME_ALLOWANCE_CLAIMED                     | 403  | body  | BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED     |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT         | SELF_EMPLOYMENT_OVER_CONSOLIDATED_EXPENSES_THRESHOLD | 403  | body  | BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT         | SUMMARY_STATUS_SUPERSEDED                            | 403  | body  | BSAS_RULE_SUMMARY_STATUS_SUPERSEDED            |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT         | SUMMARY_STATUS_INVALID                               | 403  | body  | BSAS_RULE_SUMMARY_STATUS_INVALID               |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT         | BSAS_ALREADY_ADJUSTED                                | 403  | body  | BSAS_RULE_BSAS_ALREADY_ADJUSTED                |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT         | RESULTING_VALUE_NOT_PERMITTED                        | 403  | body  | BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED        |
      | SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT         | NOT_FOUND                                            | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                    |
