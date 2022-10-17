@MtdPropertyApiSmoke @AllSmoke @AllSmokeSA

Feature: Smoke test all endpoints through API Platform using version 2.0 header

  Scenario: Setup

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Hit retired endpoint

    When a request is made to GET to url: PropRetrieveEopsObligations, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Hit retired endpoint

    When a request is made to POST to url: PropSubmitEopsDeclaration, with the JSON body: UkPropEopsDeclarationTrue, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE
