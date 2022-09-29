@Auth @SelfAssessmentApiLegacyAuth @SelfAssessmentApiLegacy @All @AllSA

Feature: Test auth for self-assessment-api-legacy on a single endpoint

  Scenario: Setup

    Given I set the API version to 2.0

  Scenario: Successful request - individual

    Given an individual is authorised
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 201

  Scenario: Successful request - agent

    Given an agent is authorised
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 201

  Scenario: Invalid enrolment

    Given an individual is not enrolled for mtd-sa
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_NOT_SUBSCRIBED

  Scenario: Invalid nino

    Given an individual uses wrong nino
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_NOT_SUBSCRIBED

    Given an agent uses wrong client nino
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is AGENT_NOT_AUTHORIZED

  Scenario: Invalid mtditid

    Given an individual's enrolment contains wrong mtditid
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_NOT_SUBSCRIBED

    Given an agent's delegated enrolment contains wrong mtditid
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is AGENT_NOT_AUTHORIZED

  Scenario: Agent not authorised by client

    Given an agent is not authorised by the client
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is AGENT_NOT_AUTHORIZED

  Scenario: Invalid bearer token

    Given an individual has an invalid bearer token
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is UNAUTHORIZED

    Given an agent has an invalid bearer token
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is UNAUTHORIZED
