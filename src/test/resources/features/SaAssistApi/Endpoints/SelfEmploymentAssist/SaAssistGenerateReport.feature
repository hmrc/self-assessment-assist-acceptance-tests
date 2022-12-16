@SEAnnualSummary @SE @SelfAssessmentApiLegacy @All @AllSA
@testTag3
@api-tests
Feature: Test self assessment assist generate report API

  @api-tests
  Scenario: SA Assist Generate report API
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerate, invoked with valid nino with request body: None
    Then the response code is 200

  @wip
  Scenario: SA Assist Generate report API - Invalid NINO
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerateInvalidNino, invoked with invalid nino with request body: None
    Then the response code is 403

  @wip
  Scenario: SA Assist Generate report API with invalid nino
    Given generate tax payers with invalid nino
    When a request is made to GET to url: SaAssistGenerateInvalidNino, invoked with invalid nino with request body: None
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

  @api-tests
  Scenario: SA Assist Generate repost API with different calc id
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerate, invoked with valid nino with request body: None
    Then the response code is 200

  @api-tests
  Scenario: SA Assist Generate repost invalid calculation ID
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerateInvalidCalc, invoked with invalid calculationID with request body: None
    Then the response code is 400

  @wip
  Scenario: SA Assist Acknowledge repost API
    Given generate tax payers for given environment
    When acknowledge report POSt call url: SaAssistAcknowledge, invoked with valid nino with request body: None
    Then the response code is 204

  @api-tests
  Scenario: SA Assist Acknowledge repost invalid report ID
    Given generate tax payers for given environment
    When acknowledge report POSt call url: SaAssistAcknowledgeInvalidReportID, invoked with invalid reportID with request body: None
    Then the response code is 400

#     ********LOCAL TESTING  - HAPPY PATH *************
  @api-tests @local
  Scenario: POST call to Nino services - Local Testing
    Given I make a POST call to nino to activate the services
    Then the response code is 200

  @api-tests @local
  Scenario: POST call to generate auth token with valid nino - Local Testing
    Given I make a POST call to generate auth token with valid nino
    Then the response code is 201
    And I close the browser

  @api-tests @local
  Scenario: POST call to generate report with valid nino - Local Testing
    Given I make a POST call to generate report with valid nino
    Then the response code is 200
    And I close the browser

  @api-tests @local
  Scenario: POST call to generate acknowledge report with valid nino, reportID and correlationID - Local Testing
    Given I make a POST call to generate acknowledge report with valid nino
    Then the response code is 204
    And I close the browser

#     ********LOCAL TESTING  - NEGATIVE SCENARIOS *************
  @api-tests @local
  Scenario: POST call to generate report with invalid nino - Local Testing
    Given I make a POST call to generate report with invalid nino
    Then the response code is 400
    And the response body is FORMAT_NINO
    And I close the browser

  @api-tests @wip
  Scenario: POST call to generate acknowledge report with invalid reportID - Local Testing
    Given I make a POST call to generate acknowledge report with invalid reportID nino
    Then the response code is 400
    And the response body is FORMAT_REPORT_ID
    And I close the browser

  @api-tests @local
  Scenario: POST call to generate acknowledge report with invalid correlationID - Local Testing
    Given I make a POST call to generate acknowledge report with invalid correlationID nino
    Then the response code is 500
    And the response body is INTERNAL_SERVER_ERROR
    And I close the browser