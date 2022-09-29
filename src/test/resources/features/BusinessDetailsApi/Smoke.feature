@BusinessDetailsApiSmoke @BusinessDetailsApiSmokeAll @AllSmoke

Feature: Smoke test all business-details-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListAllBusinessesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListBusinessesResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveBusinessDetailsUrlDefault, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveBusinessDetailsResponse
    And the X-CorrelationId header is not empty
