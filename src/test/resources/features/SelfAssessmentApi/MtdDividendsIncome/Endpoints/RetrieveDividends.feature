@RetrieveDividends @MtdDividendsIncome @All @AllSA

Feature: Retrieve UK dividends annual summary

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Test retrieve dividends for Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to GET to url: RetrieveDividends, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>

    Examples:
      | Gov-Test-Scenario           | Code | Response                                      |
      | None                        | 200  | DIVIDENDS_RETRIEVE_DEFAULT                    |
      | ONLY_UK                     | 200  | DIVIDENDS_RETRIEVE_ONLY_UK                    |
      | ONLY_OTHER                  | 200  | DIVIDENDS_RETRIEVE_ONLY_OTHER                 |
      | TEST_ONLY_MULTIPLE_ERRORS   | 400  | DIVIDENDS_RETRIEVE_TEST_ONLY_MULTIPLE_ERRORS  |
      | MATCHING_RESOURCE_NOT_FOUND | 404  | MATCHING_RESOURCE_NOT_FOUND                   |
