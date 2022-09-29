@Auth @MtdSavingsAccountAuth @MtdSavingsAccounts @All @AllSA

Feature: Test auth for mtd-savings-accounts on a single endpoint

  Scenario: Setup

    Given I set the API version to 2.0

  Scenario: Successful request - individual

    Given an individual is authorised
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 201

  Scenario: Successful request - agent

    Given an agent is authorised
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 201

  Scenario: Invalid enrolment

    Given an individual is not enrolled for mtd-sa
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API

    Given an agent is not enrolled for agent services
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API

  Scenario: Invalid nino

    Given an individual uses wrong nino
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API

    Given an agent uses wrong client nino
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API

  Scenario: Invalid mtditid

    Given an individual's enrolment contains wrong mtditid
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API

    Given an agent's delegated enrolment contains wrong mtditid
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API

  Scenario: Agent not authorised by client

    Given an agent is not authorised by the client
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API

  Scenario: Invalid bearer token

    Given an individual has an invalid bearer token
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is UNAUTHORIZED

    Given an agent has an invalid bearer token
    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 403
    And the response body is UNAUTHORIZED