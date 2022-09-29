@RetrieveSAAllowancesDeductionsReliefs @IndividualCalculationApiV2 @All

Feature: Retrieve Self-Assessment Allowances Deductions And Reliefs

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve self-assessment allowances deductions and reliefs for <Scenario>

    When a request is made to GET to url: RetrieveSaAllowancesDeductionsReliefsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                               | Code | Item  | Response                               |
      | None                                   | 200  | model | AllowancesDeductionsReliefsV2          |
      | UK_MULTIPLE_INCOMES_EXAMPLE            | 200  | model | AllowancesDeductionsReliefsV2          |
      | UK_PROP_DIVIDENDS_EXAMPLE              | 200  | model | AllowancesDeductionsReliefsV2          |
      | UK_PROP_GIFTAID_EXAMPLE                | 200  | model | AllowancesDeductionsReliefsV2          |
      | UK_PROP_SAVINGS_EXAMPLE                | 200  | model | AllowancesDeductionsReliefsV2          |
      | UK_SE_SAVINGS_EXAMPLE                  | 200  | model | AllowancesDeductionsReliefsV2          |
      | SCOT_SE_DIVIDENDS_EXAMPLE              | 200  | model | AllowancesDeductionsReliefsV2          |
      | None                                   | 200  | model | AllowancesDeductionsReliefsMandatoryV2 |
      | ERROR_MESSAGES_EXIST                   | 403  | body  | RULE_CALCULATION_ERROR_MESSAGES_EXIST  |
      | NO_ALLOWANCES_DEDUCTIONS_RELIEFS_EXIST | 200  | model | AllowancesDeductionsReliefsV2          |
      | NOT_FOUND                              | 404  | body  | MATCHING_RESOURCE_NOT_FOUND            |
      | UNMATCHED_STUB_ERROR                   | 400  | body  | RULE_INCORRECT_GOV_TEST_SCENARIO       |