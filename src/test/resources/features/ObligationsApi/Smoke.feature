@ObligationsApiSmoke @ObligationsApiSmokeAll @AllSmoke

Feature: Smoke test all obligations endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrievePeriodicObligationsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrievePeriodicObligationsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveCrystallisationObligationsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is retrieveCrystallisationObligationsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveEOPSUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveEOPSResponse
    And the X-CorrelationId header is not empty