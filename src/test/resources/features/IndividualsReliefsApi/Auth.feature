@Auth @IndividualsReliefsApiAuth @IndividualsReliefsApi @All

Feature: Test auth for individuals-reliefs-api on a single endpoint

  Background: Setup

    Given I set the API version to 1.0

  Scenario: Successful request - individual

    Given an individual is authorised
    And a request is made to PUT to url: ReliefsInvestmentsUrl, with the JSON body: AMEND_RELIEF_INVESTMENTS, and the gov-test-scenario: None
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And a request is made to DELETE to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    And the response code is 204

  Scenario: Successful request - agent

    Given an agent is authorised
    And a request is made to PUT to url: ReliefsInvestmentsUrl, with the JSON body: AMEND_RELIEF_INVESTMENTS, and the gov-test-scenario: None
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And a request is made to DELETE to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    And the response code is 204

  Scenario: Invalid enrolment

    Given an individual is not enrolled for mtd-sa
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

    Given an agent is not enrolled for agent services
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

  Scenario: Invalid nino

    Given an individual uses wrong nino
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

    Given an agent uses wrong client nino
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

  Scenario: Invalid mtditid

    Given an individual's enrolment contains wrong mtditid
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

    Given an agent's delegated enrolment contains wrong mtditid
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

  Scenario: Agent not authorised by client

    Given an agent is not authorised by the client
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

  Scenario: Invalid bearer token

    Given an individual has an invalid bearer token
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 401
    And the response body is UNAUTHORIZED

    Given an agent has an invalid bearer token
    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 401
    And the response body is UNAUTHORIZED