@AmendDeductions @CisDeductionsApi @All
Feature: Amend CIS Deductions

  Background:
    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend CIS Deductions with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to PUT to url: cisAmendOrDeleteUrl, with the JSON body: CIS_AMEND_REQUEST, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario             | Code | Response                                |
      | None                          | 204  | empty                                   |
      | DEDUCTIONS_DATE_RANGE_INVALID | 403  | CIS_AMEND_DEDUCTIONS_DATE_RANGE_INVALID |
      | UNALIGNED_DEDUCTIONS_PERIOD   | 403  | CIS_AMEND_UNALIGNED_DEDUCTIONS_PERIOD   |
      | DUPLICATE_PERIOD              | 403  | CIS_AMEND_DUPLICATE_PERIOD              |
      | NOT_FOUND                     | 404  | MATCHING_RESOURCE_NOT_FOUND             |
