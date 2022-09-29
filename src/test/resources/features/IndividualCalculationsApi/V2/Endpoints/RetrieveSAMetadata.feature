@RetrieveSaMetadata @IndividualCalculationApiV2 @All

Feature: Retrieve Self-Assessment Metadata

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve self-assessment metadata for <Scenario>


    When a request is made to GET to url: RetrieveSaMetadataUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                     | Code | Item  | Response                          |
      | None                         | 200  | model | RetrieveSAMetadataV2              |
      | ERROR_MESSAGES_EXIST         | 200  | model | RetrieveSAMetadataV2              |
      | CRYSTALLISATION_METADATA     | 200  | model | RetrieveSAMetadataV2              |
      | UK_MULTIPLE_INCOMES_EXAMPLE  | 200  | model | RetrieveSAMetadataV2              |
      | UK_PROP_DIVIDENDS_EXAMPLE    | 200  | model | RetrieveSAMetadataV2              |
      | UK_PROP_GIFTAID_EXAMPLE      | 200  | model | RetrieveSAMetadataV2              |
      | UK_PROP_SAVINGS_EXAMPLE      | 200  | model | RetrieveSAMetadataV2              |
      | UK_SE_GIFTAID_EXAMPLE        | 200  | model | RetrieveSAMetadataV2              |
      | UK_SE_SAVINGS_EXAMPLE        | 200  | model | RetrieveSAMetadataV2              |
      | SCOT_SE_DIVIDENDS_EXAMPLE    | 200  | model | RetrieveSAMetadataV2              |
      | NOT_FOUND                    | 404  | body  | MATCHING_RESOURCE_NOT_FOUND       |
      | UNMATCHED_STUB_ERROR         | 400  | body  | RULE_INCORRECT_GOV_TEST_SCENARIO  |