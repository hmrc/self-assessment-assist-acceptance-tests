@SaBsasApi @All @V2

Feature: Submit a UK Property Business' Accounting Adjustment

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Submit a UK Property Business' Accounting Adjustment for <Scenario>

    When a request is made to POST to url: SubmitUkPropBsasAdjustmentUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | RequestBody                                    | Scenario                                        | Code | Item  | Response                                       |
    | SUBMIT_BSAS_ADJUSTMENT_NON_FHL                 | None                                            | 200  | model | BsasIdResponse                                 |
    | SUBMIT_BSAS_ADJUSTMENT_NON_FHL_CONSOLIDATED    | None                                            | 200  | model | BsasIdResponse                                 |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | None                                            | 200  | model | BsasIdResponse                                 |
    | SUBMIT_BSAS_ADJUSTMENT_FHL_CONSOLIDATED        | None                                            | 200  | model | BsasIdResponse                                 |
    | SUBMIT_BSAS_ADJUSTMENT_NON_FHL_BOTH_EXPENSES   | None                                            | 400  | body  | BSAS_RULE_BOTH_EXPENSES_SUPPLIED               |
    | SUBMIT_BSAS_ADJUSTMENT_FHL_BOTH_EXPENSES       | None                                            | 400  | body  | BSAS_RULE_BOTH_EXPENSES_SUPPLIED               |
    | SUBMIT_BSAS_ADJUSTMENT_INVALID_FHL_AND_NON_FHL | None                                            | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED         |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | PROPERTY_TYPE_OF_BUSINESS_INCORRECT             | 403  | body  | BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT           |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | PROPERTY_INCOME_ALLOWANCE_CLAIMED               | 403  | body  | BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED    |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | PROPERTY_INCOME_ALLOWANCE_CLAIMED_TEST_ONLY_1   | 403  | body  | BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED    |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | PROPERTY_OVER_CONSOLIDATED_EXPENSES_THRESHOLD   | 403  | body  | BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | SUMMARY_STATUS_SUPERSEDED                       | 403  | body  | BSAS_RULE_SUMMARY_STATUS_SUPERSEDED            |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | SUMMARY_STATUS_INVALID                          | 403  | body  | BSAS_RULE_SUMMARY_STATUS_INVALID               |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | BSAS_ALREADY_ADJUSTED                           | 403  | body  | BSAS_RULE_BSAS_ALREADY_ADJUSTED                |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | RESULTING_VALUE_NOT_PERMITTED                   | 403  | body  | BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED        |
    | SUBMIT_BSAS_ADJUSTMENT_FHL                     | NOT_FOUND                                       | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                    |
