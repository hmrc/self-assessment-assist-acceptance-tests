@AmendUkSavingsAccountSummary @IndividualsIncomeReceivedApi @All

Feature: Amend UK Savings Account

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend UK Savings Account income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedUkSavingsAccountSummaryUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                            | Scenario  | Code | Item  | Response                    |
      | iirUkSavingsAccountAmendRequest | None      | 200  | model | HateoasLinks                |
      | iirUkSavingsAccountAmendRequest | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |
