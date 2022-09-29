@SEBusinessObligations @SE @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api self-employment obligations endpoints

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness, and the gov-test-scenario: None
    Then the response code is 201
    Then save the Self-Employment ID

    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness2nd, and the gov-test-scenario: None
    Then the response code is 201
    Then save the 2nd Self-Employment ID

  Scenario: Successfully get self employment obligations

    When a request is made to GET to url: SeObligations, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: 2nd business

    When a request is made to GET to url: SeObligations2nd, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE