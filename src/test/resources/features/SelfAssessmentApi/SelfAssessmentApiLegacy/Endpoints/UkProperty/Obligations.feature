@UKPropObligations @UKProp @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api retrieve UK property business obligations endpoint

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    And the response code is 201

  Scenario: (Retired endpoint) Test get UK property business obligations

    When a request is made to GET to url: UkpObligations, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE
