@SaBissApiV2 @SaBissApi @All

Feature: Test auth for self-assessment-biss-api on a single endpoint

  Scenario: Setup

    Given I set the API version to 2.0

  Scenario: Successful request - individual

    Given an individual is authorised
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 200

  Scenario: Successful request - agent

    Given an agent is authorised
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 200

  Scenario: Invalid enrolment

    Given an individual is not enrolled for mtd-sa
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 403

    Given an agent is not enrolled for agent services
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 403

  Scenario: Invalid nino

    Given an individual uses wrong nino
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 403

    Given an agent uses wrong client nino
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 403

  Scenario: Invalid mtditid

    Given an individual's enrolment contains wrong mtditid
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 403

    Given an agent's delegated enrolment contains wrong mtditid
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 403

  Scenario: Agent not authorised by client

    Given an agent is not authorised by the client
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 403

  Scenario: Invalid bearer token

    Given an individual has an invalid bearer token
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 401

    Given an agent has an invalid bearer token
    When a request is made to GET to url: RetrieveSEBissUrlV2, and the gov-test-scenario: None
    Then the response code is 401
