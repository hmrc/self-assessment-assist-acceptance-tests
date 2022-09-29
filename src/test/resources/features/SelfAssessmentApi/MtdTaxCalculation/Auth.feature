@Auth @TaxCalcAuth @MtdTaxCalculation @All @AllSA

Feature: Test auth for mtd-tax-calculation on a single endpoint

  Scenario: Setup

    Given I set the API version to 2.0

  Scenario: Successful request - individual

    Given an individual is authorised
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Successful request - agent

    Given an agent is authorised
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Invalid enrolment

    Given an individual is not enrolled for mtd-sa
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    Given an agent is not enrolled for agent services
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Invalid nino

    Given an individual uses wrong nino
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    Given an agent uses wrong client nino
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Invalid mtditid

    Given an individual's enrolment contains wrong mtditid
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

    Given an agent's delegated enrolment contains wrong mtditid
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Agent not authorised by client

    Given an agent is not authorised by the client
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE

  Scenario: Invalid bearer token

    Given an individual has an invalid bearer token
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is UNAUTHORIZED

    Given an agent has an invalid bearer token
    When a request is made to GET to url: RetrieveTaxCalculation, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is UNAUTHORIZED
