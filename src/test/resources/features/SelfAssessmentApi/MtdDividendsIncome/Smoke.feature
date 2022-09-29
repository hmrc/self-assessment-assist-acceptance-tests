@MtdDividendsIncomeSmoke @AllSmoke @AllSmokeSA

Feature: Smoke test all endpoints through API Platform using version 2.0 header

  Scenario: Setup

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: AmendDividends, with the JSON body: dividendsFullDividends, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveDividends, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is DIVIDENDS_RETRIEVE_DEFAULT
