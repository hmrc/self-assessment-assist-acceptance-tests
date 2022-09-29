@DeleteCgtResidentialPropertyDisposals @All @IndividualsIncomeReceivedApi

Feature: Delete CGT Residential Property Disposals

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Delete CGT Residential Property Disposals with scenario: <Scenario>

    When a request is made to DELETE to url: CgtRetrieveResidentialPropertyUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario    | Code | Response                     |
      | None        | 204  | empty                        |
      | NOT_FOUND   | 404  | MATCHING_RESOURCE_NOT_FOUND  |