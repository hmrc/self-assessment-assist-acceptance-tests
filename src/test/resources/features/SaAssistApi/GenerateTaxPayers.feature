@api-tests
Feature: Create taxpayers - agent, individual and organisation

  @api-tests @local
  Scenario: Create Taxpayer
    Given I generate tax payers for given environment
    And I close the browser