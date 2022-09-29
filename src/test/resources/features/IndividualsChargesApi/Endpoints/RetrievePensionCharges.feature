@RetrievePensionCharges @IndividualsChargesApi @Staging
Feature: Retrieve Pension Charges

  Background:
    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario Outline: Successfully retrieve Pensions Charges with <Gov-Test-Scenario>
    When a request is made to GET to url: PensionChargesUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario | Code | Item  | Response                           |
      | None              | 200  | model | IndividualsChargesPensions         |

  Scenario Outline: Unsuccessfully retrieve Pension Charges with <Gov-Test-Scenario>
    When a request is made to GET to url: PensionChargesUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario          | Code | Item   | Response                             |
      | NOT_FOUND                  | 404  | body   | MATCHING_RESOURCE_NOT_FOUND          |