@SaBissApiV1Smoke @SaBissApiSmoke @AllSmoke

Feature: Smoke test all self-assessment-biss-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveBissResponseV2
    And the X-CorrelationId header is not empty
