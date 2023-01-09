@api-tests @dev
Feature: Dev - Self assessment assist generate report and acknowledge report API

#     ******** HAPPY PATH *************
  @api-tests @dev
  Scenario: POST call to generate report using valid nino
    Given I generate tax payers for given environment
    When I make a POST call to SaAssistGenerate url to generate report with valid nino and request body None
    Then the response code is 200

  @api-tests @dev
  Scenario: POST call to generate acknowledge report using valid nino
    Given I generate tax payers for given environment
    When I make a POST call to SaAssistGenerate url to generate report with valid nino and request body None
    Then the response code is 200
    And I make a POST call to SaAssistAcknowledge url to generate acknowledge report with valid nino and request body None
    Then the response code is 204

#     ******** NEGATIVE SCENARIOS *************

  @api-tests @dev
  Scenario: POST call to generate report using invalid NINO
    Given I generate tax payers for given environment
    When I make a POST call to SaAssistGenerateInvalidNino url to generate report with invalid nino and request body None
    Then the response code is 400
    And the response body is FORMAT_NINO

  @api-tests @dev
  Scenario: POST call to generate report using invalid calculation ID
    Given I generate tax payers for given environment
    When I make a POST call to SaAssistGenerateInvalidCalc url with invalid calculationID and request body None
    Then the response code is 400
    And the response body is FORMAT_CALC_ID

  @api-tests @dev
  Scenario: POST call to generate acknowledge report using invalid report ID
    Given I generate tax payers for given environment
    When I make a POST call to SaAssistAcknowledgeInvalidReportID url with invalid reportID and request body None
    Then the response code is 400
    And the response body is FORMAT_REPORT_ID

    #401 & 403 needs to be added to the dev env