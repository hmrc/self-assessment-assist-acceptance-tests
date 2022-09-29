@AmendUkDividends @IndividualsIncomeReceivedApi @All

Feature: Amend UK Dividends

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend UK dividends income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedUkDividendsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                       | Scenario  | Code | Item  | Response                    |
      | iirUkDividendsAmendRequest | None      | 200  | model | HateoasLinks                |
      | iirUkDividendsAmendRequest | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |


  Scenario Outline: Amend UK dividends income for a Tax Year Specific (TYS) tax year, with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedUkDividendsTysUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                       | Scenario  | Code | Item  | Response                    |
      | iirUkDividendsAmendRequest | None      | 200  | model | HateoasLinks                |
      | iirUkDividendsAmendRequest | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |