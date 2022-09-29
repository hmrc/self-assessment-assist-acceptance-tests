@IndividualsBusinessEOPSApiV1Smoke @IndividualsBusinessEOPSApiSmoke @IndividualsBusinessEOPSApiSmokeAll @AllSmoke
Feature: Smoke test all individuals-business-eops-api endpoints through API Platform

  Scenario: Setup
    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint
    When a request is made to POST to url: BusinessEOPSUrl, with the JSON body: SubmitBusinessEOPSSelfEmployment, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty
