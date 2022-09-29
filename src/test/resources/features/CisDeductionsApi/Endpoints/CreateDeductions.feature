@CreateDeductions @CisDeductionsApi @All
Feature: Create CIS Deductions

  Background:
    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create CIS Deductions with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to POST to url: cisCreateUrl, with the JSON body: CIS_CREATE_REQUEST, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario             | Code | Item  | Response                                 |
      | None                          | 200  | model | cisDeductionsCreateResponse              |
      | DEDUCTIONS_DATE_RANGE_INVALID | 403  | body  | CIS_CREATE_DEDUCTIONS_DATE_RANGE_INVALID |
      | TAX_YEAR_NOT_ENDED            | 403  | body  | CIS_CREATE_TAX_YEAR_NOT_ENDED            |
      | UNALIGNED_DEDUCTIONS_PERIOD   | 403  | body  | CIS_CREATE_UNALIGNED_DEDUCTIONS_PERIOD   |
      | DUPLICATE_PERIOD              | 403  | body  | CIS_CREATE_DUPLICATE_PERIOD              |
      | DUPLICATE_SUBMISSION          | 403  | body  | CIS_CREATE_DUPLICATE_SUBMISSION          |
