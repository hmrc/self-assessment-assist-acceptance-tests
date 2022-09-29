@DeleteCustomEmployment @IndividualsIncomeReceivedApi @All

Feature: Delete Custom Employment

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Delete custom employment with scenario: <Scenario>

    When a request is made to DELETE to url: IndividualsIncomeReceivedEmploymentsIdUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario          | Code | Response                              |
      | None              | 204  | empty                                 |
      | DELETE_FORBIDDEN  | 403  | RULE_DELETE_FORBIDDEN_INCOME_RECEIVED |
      | NOT_FOUND         | 404  | MATCHING_RESOURCE_NOT_FOUND           |
