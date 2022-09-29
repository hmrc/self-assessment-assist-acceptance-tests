@IgnoreEmploymentExpenses @IndividualsExpensesApi @All

Feature: Ignore employment expenses

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully ignore employment expenses

    When a request is made to do an empty POST to url: ignoreEmploymentExpensesUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario  | Code | Item  | Response                    |
      | None      | 200  | model | HateoasLinks                |
      | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |
