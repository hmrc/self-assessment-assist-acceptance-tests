@RetrieveDeductions @CisDeductionsApi @All
Feature: Retrieve CIS Deductions

  Background:
    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve CIS Deductions with <Gov-Test-Scenario>

    When a request is made to GET to url: <URL>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Body>
    And the X-CorrelationId header is not empty

    Examples:
      | URL                      | Gov-Test-Scenario      | Code | Item  | Body                            |
      | cisRetrieveUrl           | None                   | 200  | model | cisDeductionsRetrieveResponse   |
      | cisRetrieveAllUrl        | None                   | 200  | model | cisDeductionsRetrieveResponse   |
      | cisRetrieveCustomerUrl   | None                   | 200  | model | cisDeductionsRetrieveResponse   |
      | cisRetrieveContractorUrl | None                   | 200  | model | cisDeductionsRetrieveResponse   |
      | cisRetrieveAllUrl        | DATE_RANGE_OUT_OF_DATE | 403  | body  | CIS_RULE_DATE_RANGE_OUT_OF_DATE |
      | cisRetrieveUrl           | NOT_FOUND              | 404  | body  | MATCHING_RESOURCE_NOT_FOUND     |
