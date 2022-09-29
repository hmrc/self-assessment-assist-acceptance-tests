@AmendLossClaim @LossClaims @IndividualLossesApi @IndividualLossesApiV3 @All

Feature: Amend a Loss Claim V3

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Amend a Loss Claim V3 with Body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario>
.

    When a request is made to POST to url: AmendLossClaimUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | RequestBody                             | Gov-Test-Scenario          | Code | Item   | Response                      |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | None                       | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL    | None                       | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | SE_FORWARD                 | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | SE_SIDEWAYS                | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL    | FP_FORWARD                 | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL    | FP_SIDEWAYS                | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | NONFHL_FORWARD             | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | NONFHL_SIDEWAYS            | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | NONFHL_SIDEWAYS_FHL        | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | NONFHL_FORWARD_TO_SIDEWAYS | 200  | model  | AmendLossClaimV3              |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | NO_CHANGE                  | 403  | body   | RULE_NO_CHANGE                |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | TYPE_OF_CLAIM_INVALID      | 403  | body   | RULE_TYPE_OF_CLAIM_INVALID_V3 |
    | AMEND_LOSS_CLAIM_SELF_EMPLOYMENT        | NOT_FOUND                  | 404  | body   | MATCHING_RESOURCE_NOT_FOUND   |
