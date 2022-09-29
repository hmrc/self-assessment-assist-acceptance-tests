@CreateOrAmendSEAnnualSubmission @SelfEmploymentBusinessApi @All

Feature: Create or Amend an annual submission

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create or Amend an annual submission with Body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to PUT to url: SelfEmploymentBusinessAnnualSubmissionUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                                          | Gov-Test-Scenario       | Code | Item  | Response                              |
      | CREATE_OR_AMEND_ANNUAL_SUBMISSION                    | None                    | 200  | model | HateoasLinks                          |
      | CREATE_OR_AMEND_ANNUAL_SUBMISSION_TRADING_ALLOWANCES | None                    | 200  | model | HateoasLinks                          |
      | CREATE_OR_AMEND_ANNUAL_SUBMISSION                    | ALLOWANCE_NOT_SUPPORTED | 400  | body  | AMEND_SE_RULE_ALLOWANCE_NOT_SUPPORTED |
      | CREATE_OR_AMEND_ANNUAL_SUBMISSION                    | NOT_FOUND               | 404  | body  | MATCHING_RESOURCE_NOT_FOUND           |
