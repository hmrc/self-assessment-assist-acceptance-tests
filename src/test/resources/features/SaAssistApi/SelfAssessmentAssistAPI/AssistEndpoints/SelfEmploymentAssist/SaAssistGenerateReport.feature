@SEAnnualSummary @SE @SelfAssessmentApiLegacy @All @AllSA
@testTag3
Feature: Test self assessment assist generate report API

  Scenario: SA Assist Generate repost API

    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerate, invoked with valid nino with request body: None
    Then the response code is 200

  Scenario: SA Assist Generate repost API with different calc id

    Given generate tax payers for given environment
    When generate report POSt call url: SaAssistGenerate, invoked with valid nino with request body: None
    Then the response code is 200

  Scenario: SA Assist Generate repost invalid calculation ID

    When generate report POSt call url: SaAssistGenerateInvalidCalc, invoked with invalid calculationID with request body: None
    Then the response code is 400

  Scenario: SA Assist Acknowledge repost API

    #Given generate tax payers for given environment
    When acknowledge report POSt call url: SaAssistAcknowledge, invoked with valid nino with request body: None
    Then the response code is 204

  Scenario: SA Assist Acknowledge repost invalid report ID
    When acknowledge report POSt call url: SaAssistAcknowledgeInvalidReportID, invoked with invalid reportID with request body: None
    Then the response code is 400
#  Scenario: Setup user
#
#    Given an individual is authorised
#    And I set the API version to 2.0
#
#
#    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness, and the gov-test-scenario: None
#    Then the response code is 201
#    Then save the Self-Employment ID
#
#    When a request is made to POST to url: SeAddBusiness, with the JSON body: SeAddBusiness2nd, and the gov-test-scenario: None
#    Then the response code is 201
#    Then save the 2nd Self-Employment ID
#
#  Scenario Outline: Successfully amend, logical delete and get a self-employment annual summary
#
#    When a request is made to PUT to url: SeAnnualSummary, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
#    Then the response code is 204
#    And the response body is empty
#
#    When a request is made to PUT to url: SeAnnualSummary, with the JSON body: SeAnnualSummaryBothAllowances, and the gov-test-scenario: None
#    Then the response code is 400
#    And the response body is SE_ANNUAL_SUMMARY_BOTH_ALLOWANCE_SUPPLIED
#
#    When a request is made to GET to url: SeAnnualSummary, and the gov-test-scenario: None
#    Then the response code is <ResponseCode>
#    And the response body is <ResponseBody>
#
#    Examples:
#    | RequestBody                        | Gov-Test-Scenario | ResponseCode | ResponseBody                              |
#    | SeAnnualSummaryWithTradingAllowance| None              | 200          | SE_ANNUAL_SUMMARY_TRADING_ALLOWANCE       |
#    | SeAnnualSummaryOnlyAllowances      | None              | 200          | SE_ANNUAL_SUMMARY_ONLY_ALLOWANCES         |
#    | SeAnnualSummaryEmpty               | None              | 404          | empty                                     |
#    | SeAnnualSummaryEmptyObjects        | None              | 404          | empty                                     |
#
#  Scenario: 2nd business
#
#    When a request is made to PUT to url: SeAnnualSummary2nd, with the JSON body: SeAnnualSummaryWithTradingAllowance, and the gov-test-scenario: None
#    Then the response code is 204
#    And the response body is empty
#
#    When a request is made to GET to url: SeAnnualSummary2nd, and the gov-test-scenario: None
#    Then the response code is 200
#    And the response body is SE_ANNUAL_SUMMARY_TRADING_ALLOWANCE
