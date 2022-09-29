@AmendOtherExpenses @IndividualsExpensesApi @All

Feature: Amend other expenses

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully amend other expenses

    When a request is made to PUT to url: individualsOtherExpensesUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                 | Scenario  | Code | Item   | Response     |
      | AMEND_OTHER_EXPENSES | None      | 200  | model  | HateoasLinks |