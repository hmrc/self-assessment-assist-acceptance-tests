@IntentToCrystallise @MtdCrystallisation @All @AllSA

Feature: Intent to crystallise

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario: (Retired endpoint) Intent to crystallise endpoint

    When a request is made to do an empty POST to url: IntentToCrystallise, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

