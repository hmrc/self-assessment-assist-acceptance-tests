

Feature: Create nino and tax payers and generate access tokens for given environment
  @GenerateTestUsers1 @testTag
  Scenario: Generate Nino for self assessment assist

    Then generate tax payers for given environment

  Scenario: Close browser

    Then close the browser
