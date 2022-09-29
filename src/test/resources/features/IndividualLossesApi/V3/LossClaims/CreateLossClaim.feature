@CreateLossClaim @LossClaims @IndividualLossesApi @IndividualLossesApiV3 @All

Feature: Create a Loss Claim V3

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Create a Loss Claim V3 with Body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to POST to url: CreateLossClaimUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | RequestBody                    | Gov-Test-Scenario             | Code | Item  | Response                         |
    | LOSS_CLAIM_SELF_EMPLOYMENT_V3  | None                          | 201  | model | CreateLossClaimV3                |
    | LOSS_CLAIM_UK_PROPERTY_V3      | None                          | 201  | model | CreateLossClaimV3                |
    | LOSS_CLAIM_FOREIGN_PROPERTY_V3 | None                          | 201  | model | CreateLossClaimV3                |
    | LOSS_CLAIM_SELF_EMPLOYMENT_V3  | DUPLICATE                     | 403  | body  | DUPLICATE_LOSS_CLAIM             |
    | LOSS_CLAIM_SELF_EMPLOYMENT_V3  | NOT_FOUND                     | 404  | body  | MATCHING_RESOURCE_NOT_FOUND      |
    | LOSS_CLAIM_SELF_EMPLOYMENT_V3  | ACCOUNTING_PERIOD_NOT_ENDED   | 403  | body  | RULE_ACCOUNTING_PERIOD_NOT_ENDED |
    | LOSS_CLAIM_SELF_EMPLOYMENT_V3  | NO_ACCOUNTING_PERIOD          | 403  | body  | RULE_NO_ACCOUNTING_PERIOD        |