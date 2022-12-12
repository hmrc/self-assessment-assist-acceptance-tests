@api-tests
Feature: Generate auth token from dev
@MADHU1
  Scenario: Generate auth token from the web
    Given I login through the Auth login page using nino
    Then I can see the auth token page header : Authority Wizard Session


