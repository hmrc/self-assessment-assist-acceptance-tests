@SaAccountsApi @All @CreateAmendCodingOut

Feature: Create or Amend Coding Out underpayment and debt amounts

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create or Amend Coding Out underpayment and debt amounts with scenario: <Scenario>

    When a request is made to PUT to url: CodingOutUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                                                 | Scenario | Code | Item  | Response                                                              |
      | CREATE_AMEND_CODING_OUT_REQUEST                                      | None     | 200  | model | HateoasLinks                                                          |
      | CREATE_AMEND_CODING_OUT_VALUE_ERRORS_REQUEST                         | None     | 400  | body  | CREATE_AMEND_CODING_OUT_VALUE_ERRORS_RESPONSE                         |
      | CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_REQUEST       | None     | 400  | body  | CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_RESPONSE       |
      | CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_INNER_REQUEST | None     | 400  | body  | CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_INNER_RESPONSE |
      | CREATE_AMEND_CODING_OUT_EMPTY_BODY_REQUEST                           | None     | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED                                |