@SEAnnualSummary @SE @SelfAssessmentApiLegacy @All @AllSA
@testTag3
@api-tests
Feature: Test self assessment assist generate report API

  Scenario: SA Assist Generate report API
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerate, invoked with valid nino with request body: None
    Then the response code is 200

  Scenario: SA Assist Generate report API - Invalid NINO
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerateInvalidNino, invoked with invalid nino with request body: None
    Then the response code is 403

  Scenario: SA Assist Generate report API with invalid nino
   Given generate tax payers with invalid nino
    When a request is made to GET to url: SaAssistGenerateInvalidNino, invoked with invalid nino with request body: None
  Then the response code is 403
   And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

  Scenario: SA Assist Generate repost API with different calc id
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerate, invoked with valid nino with request body: None
    Then the response code is 200

  Scenario: SA Assist Generate repost invalid calculation ID
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerateInvalidCalc, invoked with invalid calculationID with request body: None
    Then the response code is 400

  Scenario: SA Assist Acknowledge repost API
    Given generate tax payers for given environment
    When acknowledge report POSt call url: SaAssistAcknowledge, invoked with valid nino with request body: None
    Then the response code is 204

  Scenario: SA Assist Acknowledge repost invalid report ID
    Given generate tax payers for given environment
    When acknowledge report POSt call url: SaAssistAcknowledgeInvalidReportID, invoked with invalid reportID with request body: None
    Then the response code is 400

