@MtdCharitableGivingSmoke @AllSmoke @AllSmokeSA

Feature: Smoke test all endpoints through API Platform using version 2.0 header

  Scenario: Setup

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: AmendCharitableGiving, with the JSON body: CHARITIES_FULL_PAYLOAD, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveCharitableGiving, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is CHARITIES_RETRIEVE_DEFAULT
