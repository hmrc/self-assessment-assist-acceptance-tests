@AmendDividends @MtdDividendsIncome @All @AllSA

Feature: Amend UK dividends annual summary

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Successfully amend dividends with a full payload for body <Body>

    When a request is made to PUT to url: AmendDividends, with the JSON body: <Body>, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

    Examples:
      | Body                          |
      | dividendsFullDividends        |
      | dividendsUkDividendsOnly      |
      | dividendsOtherUkDividendsOnly |
    