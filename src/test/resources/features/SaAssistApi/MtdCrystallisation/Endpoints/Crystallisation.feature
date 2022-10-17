@Crystallisation @MtdCrystallisation @All @AllSA

Feature: Crystallisation

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario: (Retired endpoint) Crystallisation endpoint

    When a request is made to POST to url: Crystallisation, with the JSON body: crystallisationBody, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

