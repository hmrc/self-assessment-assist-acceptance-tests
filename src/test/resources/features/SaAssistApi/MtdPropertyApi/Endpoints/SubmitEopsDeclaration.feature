@SubmitPropEops @MtdPropertyApi @All @AllSA

Feature: Submit UK Property End-of-Period Statement

  Scenario: User setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: (Retired endpoint) Test response returned by Submit UK Prop EOPS for <RequestBody>

    When a request is made to POST to url: PropSubmitEopsDeclaration, with the JSON body: <RequestBody>, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    Examples:
      | RequestBody                |
      | UkPropEopsDeclarationTrue  |
      | UkPropEopsDeclarationFalse |
