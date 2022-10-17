@SEPeriods @SE @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api self-employment periodic update endpoints

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness, and the gov-test-scenario: None
    Then the response code is 201
    Then save the Self-Employment ID

    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness2nd, and the gov-test-scenario: None
    Then the response code is 201
    Then save the 2nd Self-Employment ID

  Scenario: Successfully create, amend, get and list periodic update

    When a request is made to POST to url: SePeriods, with the JSON body: SePeriodConsolidated, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty

    When a request is made to PUT to url: SePeriodOne, with the JSON body: SePeriodFull, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    When a request is made to GET to url: SePeriodOne, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is SE Full expenses period

  Scenario: 2nd business

    When a request is made to POST to url: SePeriods2nd, with the JSON body: SePeriodFull, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty

    When a request is made to GET to url: SePeriods2nd, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListAllPeriodsResponse

    When a request is made to GET to url: SePeriodOne2nd, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is SE Full expenses period

    When a request is made to GET to url: SePeriods2nd, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListAllPeriodsResponse

  Scenario: Create periodic update error scenarios

    When a request is made to POST to url: SePeriods, with the JSON body: SePeriodNoIncomesAndExpenses, and the gov-test-scenario: None
    Then the response code is 400
    And the response body is NO_INCOMES_AND_EXPENSES

    When a request is made to POST to url: SePeriods, with the JSON body: SePeriodFullAndConsolidatedExpenses, and the gov-test-scenario: None
    Then the response code is 400
    And the response body is BOTH_EXPENSES_SUPPLIED
