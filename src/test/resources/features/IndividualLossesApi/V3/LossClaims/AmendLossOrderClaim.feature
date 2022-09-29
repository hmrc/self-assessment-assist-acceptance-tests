@AmendLossOrderClaim @LossClaims @IndividualLossesApi @IndividualLossesApiV3 @All

Feature: Amend a Loss Claims Order V3

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Amend a Loss Claims Order V3 with Body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to PUT to url: AmendLossClaimsOrderV3Url, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody               | Gov-Test-Scenario   | Code | Item  | Response                    |
      | AMEND_LOSS_CLAIM_ORDER_V3 | None                | 200  | model | AmendLossClaimOrderV3       |
      | AMEND_LOSS_CLAIM_ORDER_V3 | LOSS_CLAIMS_MISSING | 400  | body  | RULE_LOSS_CLAIMS_MISSING    |
      | AMEND_LOSS_CLAIM_ORDER_V3 | NOT_FOUND           | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |