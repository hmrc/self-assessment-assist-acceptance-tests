@RetrieveCrystallisation @MtdCrystallisation @All @AllSA

Feature: Retrieve Crystallisation

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario: Retrieve crystallisation obligations

    When a request is made to GET to url: RetrieveCrystallisation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE
    