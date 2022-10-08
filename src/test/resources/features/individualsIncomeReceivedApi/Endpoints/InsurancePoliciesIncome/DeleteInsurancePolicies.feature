@DeleteInsurancePolicies @IndividualsIncomeReceivedApi @All

Feature: Delete Insurance Policies Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Delete insurance policies income with scenario: <Scenario>

    When a request is made to DELETE to url: IndividualsIncomeReceivedInsurancePoliciesUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario  | Code | Response                    |
      | None      | 204  | empty                       |
      | NOT_FOUND | 404  | MATCHING_RESOURCE_NOT_FOUND |