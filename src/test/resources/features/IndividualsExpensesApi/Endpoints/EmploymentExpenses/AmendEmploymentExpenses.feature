@AmendEmploymentExpenses @IndividualsExpensesApi @All

Feature: Amend employment expenses

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully amend employment expenses

    When a request is made to PUT to url: amendEmploymentExpensesUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                      | Scenario  | Code | Item  | Response                    |
      | AMEND_EMPLOYMENT_EXPENSES | None      | 200  | model | HateoasLinks                |
      | AMEND_EMPLOYMENT_EXPENSES | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |