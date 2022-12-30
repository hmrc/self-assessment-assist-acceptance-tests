@api-tests
Feature: Local - Self assessment assist generate report and acknowledge report API

#     ********LOCAL TESTING  - HAPPY PATH *************
  @api-tests @local
  Scenario: POST call to Nino services - Local Testing
    Given I make a POST call to nino to activate the services
    Then the response code is 200

  @api-tests @local
  Scenario: POST call to generate auth token with valid nino - Local Testing
    Given I make a POST call to generate auth token with valid nino
    Then the response code is 201

  @api-tests @local
  Scenario: POST call to generate report with valid nino - Local Testing
    Given I make a POST call to generate report with valid nino
    Then the response code is 200


  @api-tests @local
  Scenario: POST call to generate acknowledge report with valid nino, reportID and correlationID - Local Testing
    Given I make a POST call to generate acknowledge report with valid nino
    Then the response code is 204

#     ********LOCAL TESTING  - NEGATIVE SCENARIOS *************
  @api-tests @local
  Scenario: POST call to generate report with UNFORMATTED NINO - Local Testing
    Given I make a POST call to generate report with unformatted nino
    Then the response code is 400
    And the response body is FORMAT_NINO

  @api-tests @local
  Scenario: POST call to generate report with INVALID NINO - Local Testing
    Given I make a POST call to generate report with invalid nino
    Then the response code is 403
    And the response body is CLIENT_OR_AGENT_NOT_AUTHORISED

  @api-tests @local
  Scenario: POST call to generate report with INVALID CalculationID - Local Testing
    Given I make a POST call to generate report with invalid calculationID nino
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  @api-tests @local
  Scenario: POST call to generate acknowledge report with invalid reportID - Local Testing
    Given I make a POST call to generate acknowledge report with invalid reportID nino
    Then the response code is 400
    And the response body is FORMAT_REPORT_ID

  @api-tests @local
  Scenario: POST call to generate acknowledge report with invalid correlationID - Local Testing
    Given I make a POST call to generate acknowledge report with invalid correlationID nino
    Then the response code is 500
    And the response body is INTERNAL_SERVER_ERROR
