@IndividualsExpensesApiSmoke @IndividualExpensesApiSmokeAll @AllSmoke

Feature: Smoke test all individuals-expenses-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: individualsOtherExpensesUrl, with the JSON body: AMEND_OTHER_EXPENSES, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: individualsOtherExpensesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveOtherExpensesResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: individualsOtherExpensesUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: amendEmploymentExpensesUrl, with the JSON body: AMEND_EMPLOYMENT_EXPENSES, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: employmentExpensesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveEmploymentExpensesResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to do an empty POST to url: ignoreEmploymentExpensesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: employmentExpensesUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
