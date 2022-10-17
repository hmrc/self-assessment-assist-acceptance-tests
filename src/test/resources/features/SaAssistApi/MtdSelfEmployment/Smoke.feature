@MtdSelfEmploymentSmoke @AllSmoke @AllSmokeSA

Feature: Smoke test all endpoints through API Platform

  Scenario: Setup

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Hit retired endpoint

    And a request is made to POST to url: SeSubmitEopsDeclaration, with the JSON body: submitSeEopsTrue, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE
