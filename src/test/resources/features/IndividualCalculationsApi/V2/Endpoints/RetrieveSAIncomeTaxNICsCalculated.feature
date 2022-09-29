@RetrieveSAIncomeTaxNICsCalculated @IndividualCalculationApiV2 @All

Feature: Retrieve Self-Assessment Income Tax and NICs Calculated

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve self-assessment income tax and NICs calculated for <Scenario>


    When a request is made to GET to url: RetrieveSaIncomeTaxNICsCalculatedUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                     | Code | Item  | Response                                      |
      | None                         | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | None                         | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | UK_MULTIPLE_INCOMES_EXAMPLE  | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | UK_PROP_DIVIDENDS_EXAMPLE    | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | UK_PROP_GIFTAID_EXAMPLE      | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | UK_PROP_SAVINGS_EXAMPLE      | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | UK_SE_GIFTAID_EXAMPLE        | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | UK_SE_SAVINGS_EXAMPLE        | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | SCOT_SE_DIVIDENDS_EXAMPLE    | 200  | model | IncomeTaxAndNicsCalculatedResponseV2          |
      | None                         | 200  | model | IncomeTaxAndNicsCalculatedResponseMandatoryV2 |
      | NOT_FOUND                    | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                   |
      | ERROR_MESSAGES_EXIST         | 403  | body  | RULE_CALCULATION_ERROR_MESSAGES_EXIST         |
      | UNMATCHED_STUB_ERROR         | 400  | body  | RULE_INCORRECT_GOV_TEST_SCENARIO              |
