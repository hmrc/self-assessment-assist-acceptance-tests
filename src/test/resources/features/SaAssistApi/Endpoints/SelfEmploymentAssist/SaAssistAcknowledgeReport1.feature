@SEAnnualSummary @SE @SelfAssessmentApiLegacy @All @AllSA
@testTag3
Feature: Test self assessment assist generate report API

  Scenario: SA Assist Generate repost API
    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerate, invoked with valid nino with request body: None
    Then the response code is 200

#  Scenario: SA Assist Generate repost API with different calc id#
#    Given generate tax payers for given environment
#    When generate report POSt call url: SaAssistGenerate, invoked with valid nino with request body: None
#    Then the response code is 200
#
#  Scenario: SA Assist Generate repost invalid calculation ID#
#    When generate report POSt call url: SaAssistGenerateInvalidCalc, invoked with invalid calculationID with request body: None
#    Then the response code is 400
#
#  Scenario: SA Assist Acknowledge repost API#
#    Given generate tax payers for given environment
#    When acknowledge report POSt call url: SaAssistAcknowledge, invoked with valid nino with request body: None
#    Then the response code is 204
#
#  Scenario: SA Assist Acknowledge repost invalid report ID
#    When acknowledge report POSt call url: SaAssistAcknowledgeInvalidReportID, invoked with invalid reportID with request body: None
#    Then the response code is 400

