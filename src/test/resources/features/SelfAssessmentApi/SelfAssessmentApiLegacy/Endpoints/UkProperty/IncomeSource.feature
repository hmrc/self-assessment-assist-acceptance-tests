@UKPropIncomeSource @UKProp @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api add and get a UK property business endpoints

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario: Add Business, Get Business, Fail to add a 2nd Business

    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty

    When a request is made to GET to url: UkpGetBusiness, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 409
    And the response body is empty
