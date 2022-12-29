@api-tests
Feature: Local - Self assessment assist generate report and acknowledge report API

#     ********LOCAL TESTING  - HAPPY PATH *************
  @api-tests @local
  Scenario: POST call to Nino services - Local Testing
    Given I make a POST call to nino to activate the services
    Then the response code is 200
    And I close the browser

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

  @api-tests @local
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