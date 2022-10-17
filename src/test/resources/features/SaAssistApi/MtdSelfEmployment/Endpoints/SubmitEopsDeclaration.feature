@SubmitSeEops @MtdSelfEmployment @All @AllSA

Feature: Submit Self-Employment End-of-Period Statement

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: (Retired endpoint) Test response returned by Submit SE EOPS for <RequestBody>

    When a request is made to POST to url: SeSubmitEopsDeclaration, with the JSON body: <RequestBody>, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    Examples:
      | RequestBody       |
      | submitSeEopsTrue  |
      | submitSeEopsFalse |