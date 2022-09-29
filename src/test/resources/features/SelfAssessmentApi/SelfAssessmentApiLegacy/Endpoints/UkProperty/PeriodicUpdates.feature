@UKPropPeriods @UKProp @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api FHL UK property periodic updates

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    And the response code is 201

  Scenario: Test sa-api FHL UK property periodic updates

    # Create
    When a request is made to POST to url: UkpFhlPeriods, with the JSON body: UkpCreateFhlPeriodicUpdate, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty

    # Get
    When a request is made to GET to url: UkpFhlPeriodOne, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is UK property FHL get a period

    # Amend
    When a request is made to PUT to url: UkpFhlPeriodOne, with the JSON body: UkpAmendFhlPeriodicUpdate, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    # List
    When a request is made to GET to url: UkpFhlPeriods, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is UK property list periods

  Scenario: Test sa-api Non-FHL UK property periodic updates

    # Create
    When a request is made to POST to url: UkpNonFhlPeriods, with the JSON body: UkpCreateNonFhlPeriodicUpdate, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty

    # Get
    When a request is made to GET to url: UkpNonFhlPeriodOne, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is UK property Non-FHL get a period

    # Amend
    When a request is made to PUT to url: UkpNonFhlPeriodOne, with the JSON body: UkpAmendNonFhlPeriodicUpdate, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    # List
    When a request is made to GET to url: UkpNonFhlPeriods, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is UK property list periods
