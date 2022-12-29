@api-tests
Feature: Generate auth token

  @api-tests @dev
  Scenario: Generate auth token using auth wizard
    Given I login through the Auth login page using nino
    Then I can see the auth token page header : Authority Wizard Session
    And I close the browser