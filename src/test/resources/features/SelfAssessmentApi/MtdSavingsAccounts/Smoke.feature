@MtdSavingsAccountsSmoke @AllSmoke @AllSmokeSA

Feature: Smoke test all endpoints through API Platform using version 2.0 header

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: AddSavingsAccount, with the JSON body: SavingsName32Characters, and the gov-test-scenario: None
    Then the response code is 201
    And the response model is AddSavingsAccountResponse

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListAllSavingsAccounts, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is SAVINGS_LIST_ALL_DEFAULT

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSavingsAccount, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is SAVINGS_RETRIEVE_DEFAULT

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: AmendSavingsAccountAnnualSummary, with the JSON body: savingsAccountAnnualSummary, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSavingsAccountAnnualSummary, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is SAVINGS_RETRIEVE_ANNUAL_DEFAULT
