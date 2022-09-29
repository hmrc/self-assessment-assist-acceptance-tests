@RetrieveSavingsAnnuals @MtdSavingsAccounts @All @AllSA

Feature: Retrieve a UK savings account annual summary

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve savings account annual summary for Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to GET to url: RetrieveSavingsAccountAnnualSummary, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | Gov-Test-Scenario        | Code | Response                                         |
    | None                     | 200  | SAVINGS_RETRIEVE_ANNUAL_DEFAULT                  |
    | ONLY_TAXED_UK_INTEREST   | 200  | SAVINGS_RETRIEVE_ANNUAL_ONLY_TAXED_UK_INTEREST   |
    | ONLY_UNTAXED_UK_INTEREST | 200  | SAVINGS_RETRIEVE_ANNUAL_ONLY_UNTAXED_UK_INTEREST |
    | REMOVED_VALUES_EXAMPLE_1 | 200  | SAVINGS_RETRIEVE_ANNUAL_REMOVED_VALUES_EXAMPLE_1 |
    | REMOVED_VALUES_EXAMPLE_2 | 200  | SAVINGS_RETRIEVE_ANNUAL_REMOVED_VALUES_EXAMPLE_2 |
    | NOT_FOUND                | 404  | MATCHING_RESOURCE_NOT_FOUND                      |
