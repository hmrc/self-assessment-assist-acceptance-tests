@DeletePensionCharges @IndividualsChargesApi @Staging
Feature: Delete Pension Charges

  Background:
    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully delete Pensions Charges
    When a request is made to DELETE to url: PensionChargesUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario Outline: Unsuccessfully delete Pension Charges with Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to DELETE to url: PensionChargesUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the response body is <Response>

    Examples:
      | Gov-Test-Scenario          | Code | Item   | Response                             |
      | NOT_FOUND                  | 404  | body   | MATCHING_RESOURCE_NOT_FOUND          |