@LossesSmoke @LossesSmokeV3 @LossesAllSmoke @AllSmoke

Feature: Smoke test all individual-losses-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 3.0


#     Brought forward losses

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: CreateBFLossesUrl, with the JSON body: SELF_EMPLOYMENT_V3, and the gov-test-scenario: None
    Then the response code is 201
    And the response model is CreateBFLossV3

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: AmendBFLossesUrl, with the JSON body: AMEND_LOSS_AMOUNT_V3, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is AmendBFLossV3
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: DeleteBFLossesUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveBFLossesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveBFLossV3
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListAllBFLossesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListBFLossesV3
    And the X-CorrelationId header is not empty



    # Loss Claims

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: CreateLossClaimUrl, with the JSON body: LOSS_CLAIM_SELF_EMPLOYMENT_V3, and the gov-test-scenario: None
    Then the response code is 201
    And the response model is CreateLossClaimV3
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: DeleteLossClaimUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveLossClaimUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is LossClaimV3
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: AmendLossClaimUrl, with the JSON body: AMEND_LOSS_CLAIM_SELF_EMPLOYMENT, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is AmendLossClaimV3
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListLossClaimUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListLossClaimsV3

 Scenario: Successfully hit endpoint

    When a request is made to PUT to url: AmendLossClaimsOrderV3Url, with the JSON body: AMEND_LOSS_CLAIM_ORDER_V3, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is AmendLossClaimOrderV3
    And the X-CorrelationId header is not empty