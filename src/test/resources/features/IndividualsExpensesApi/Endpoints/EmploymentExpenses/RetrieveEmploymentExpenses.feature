@RetrieveEmploymentExpenses @IndividualsExpensesApi @All

Feature: Retrieve employment expenses

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve employment expenses with scenario: <Scenario>

    When a request is made to GET to url: <URL>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | URL                       | Scenario  | Code  | Item  | Response                            |
      | employmentExpensesUrl     | None      | 200   | model | RetrieveEmploymentExpensesResponse  |
      | hmrcEmploymentExpensesUrl | None      | 200   | model | RetrieveEmploymentExpensesResponse  |
      | userEmploymentExpensesUrl | None      | 200   | model | RetrieveEmploymentExpensesResponse  |
      | employmentExpensesUrl     | NOT_FOUND | 404   | body  | MATCHING_RESOURCE_NOT_FOUND         |