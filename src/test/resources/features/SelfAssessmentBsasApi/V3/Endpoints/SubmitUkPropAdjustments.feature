@SaBsasApi @All @V3

Feature: Submit a UK Property Business' Accounting Adjustment

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Submit a UK Property Business' Accounting Adjustment for <Scenario>

    When a request is made to POST to url: SubmitUkPropBsasAdjustmentUrlV3, with the JSON body: <RequestBody>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | RequestBody                                              | Scenario                                         | Code | Item  | Response                                                  |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL                     | None                                             | 200  | model | HateoasLinks                                              |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL_CONSOLIDATED        | None                                             | 200  | model | HateoasLinks                                              |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | None                                             | 200  | model | HateoasLinks                                              |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL_CONSOLIDATED            | None                                             | 200  | model | HateoasLinks                                              |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL_BOTH_EXPENSES       | None                                             | 400  | body  | V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_NON_FHL            |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL_BOTH_EXPENSES           | None                                             | 400  | body  | V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_FHL                |
    | V3_SUBMIT_BSAS_ADJUSTMENT_INVALID_UK_FHL_AND_NON_FHL     | None                                             | 400  | body  | V3_BSAS_RULE_BOTH_PROPERTIES_SUPPLIED                     |
    | V3_SUBMIT_BSAS_ADJUSTMENT_EMPTY_UK_NON_FHL_INCOME_OBJECT | None                                             | 400  | body  | V3_BSAS_RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED_WITH_PATHS |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | TYPE_OF_BUSINESS_INCORRECT                       | 400  | body  | V3_BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT                   |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | UK_PROPERTY_INCOME_ALLOWANCE_CLAIMED             | 403  | body  | V3_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED            |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | UK_PROPERTY_INCOME_ALLOWANCE_CLAIMED_TEST_ONLY_1 | 403  | body  | V3_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED            |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | UK_PROPERTY_OVER_CONSOLIDATED_EXPENSES_THRESHOLD | 403  | body  | V3_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD         |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | SUMMARY_STATUS_SUPERSEDED                        | 403  | body  | V3_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED                    |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | SUMMARY_STATUS_INVALID                           | 403  | body  | V3_BSAS_RULE_SUMMARY_STATUS_INVALID                       |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | ALREADY_ADJUSTED                                 | 403  | body  | V3_BSAS_RULE_ALREADY_ADJUSTED                             |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | RESULTING_VALUE_NOT_PERMITTED                    | 403  | body  | V3_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED                |
    | V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL                         | NOT_FOUND                                        | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                               |
