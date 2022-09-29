@SEIncomeSource @SE @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api self-employment business income source endpoints

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario: Successfully add, get, list a business

    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty
    Then save the Self-Employment ID

    When a request is made to GET to url: SeGetBusiness, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    When a request is made to GET to url: SeListBusinesses, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: 2nd business

    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness2nd, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty
    Then save the 2nd Self-Employment ID

    When a request is made to GET to url: SeGetBusiness2nd, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    When a request is made to GET to url: SeListBusinesses, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE