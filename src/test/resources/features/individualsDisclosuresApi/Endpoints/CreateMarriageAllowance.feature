@CreateMarriageAllowance @IndividualsDisclosuresApi @All

Feature: Create Marriage Allowance

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create marriage allowance with scenario: <Scenario>

    When a request is made to POST to url: MarriageAllowanceUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                  | Scenario                  | Code | Response                                |
      | marriageAllowanceRequest              | None                      | 201  | empty                                   |
      | marriageAllowanceMinimumFieldsRequest | None                      | 201  | empty                                   |
      | marriageAllowanceEmptyBodyRequest     | None                      | 400  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED  |
      | marriageAllowanceRequest              | CLAIM_ALREADY_EXISTS      | 403  | RULE_ACTIVE_MARRIAGE_ALLOWANCE_CLAIM    |
      | marriageAllowanceRequest              | DECEASED_RECIPIENT        | 403  | RULE_DECEASED_RECIPIENT                 |
      | marriageAllowanceRequest              | INVALID_REQUEST           | 403  | RULE_INVALID_REQUEST                    |
      | marriageAllowanceRequest              | INVALID_REQUEST_TEST_ONLY | 403  | RULE_INVALID_REQUEST                    |