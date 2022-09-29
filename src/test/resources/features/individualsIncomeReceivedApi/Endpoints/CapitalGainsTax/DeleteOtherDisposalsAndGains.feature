@DeleteOtherDisposalsAndGains @All @IndividualsIncomeReceivedApi

Feature: Delete other Capital Gains disposals

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Delete other Capital Gains disposals with scenario: <Scenario>

    When a request is made to DELETE to url: IndividualsIncomeReceivedOtherCapitalGainsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario    | Code | Response                     |
      | None        | 204  | empty                        |
      | NOT_FOUND   | 404  | MATCHING_RESOURCE_NOT_FOUND  |