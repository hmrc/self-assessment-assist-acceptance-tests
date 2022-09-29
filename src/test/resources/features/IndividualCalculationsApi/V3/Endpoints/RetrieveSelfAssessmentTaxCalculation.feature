@RetrieveSelfAssessmentTaxCalculation @IndividualCalculationApiV3 @All

Feature: Retrieve Self-Assessment Tax Calculation

  Background: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Retrieve self-assessment tax calculation for <Scenario>

    When a request is made to GET to url: RetrieveSelfAssessmentTaxCalculationUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                     | Code | Item  | Response                                      |
      | None                         | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | None                         | 200  | model | RetrieveSelfAssessmentTaxCalculationMandatory |
      | UK_MULTIPLE_INCOMES_EXAMPLE  | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | UK_PROP_DIVIDENDS_EXAMPLE    | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | UK_PROP_GIFTAID_EXAMPLE      | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | UK_PROP_SAVINGS_EXAMPLE      | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | UK_SE_GIFTAID_EXAMPLE        | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | UK_SE_SAVINGS_EXAMPLE        | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | SCOT_SE_DIVIDENDS_EXAMPLE    | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | ERROR_MESSAGES_EXIST         | 200  | model | RetrieveSelfAssessmentTaxCalculation          |
      | NOT_FOUND                    | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                   |
      | UNMATCHED_STUB_ERROR         | 400  | body  | RULE_INCORRECT_GOV_TEST_SCENARIO              |