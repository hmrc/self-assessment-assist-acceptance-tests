@AmendOtherDeductions @OtherDeductionsApi @All

Feature: Amend Other Deductions

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend other reliefs with scenario: <Scenario>

    When a request is made to PUT to url: OtherDeductionsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                   | Scenario  | Code | Item  | Response                                 |
      | AMEND_OTHER_DEDUCTIONS                 | None      | 200  | model | HateoasLinks                             |
      | AMEND_OTHER_DEDUCTIONS_MULTIPLE_ITEMS  | None      | 200  | model | HateoasLinks                             |
      | AMEND_OTHER_DEDUCTIONS_MINIMUM_FIELDS  | None      | 200  | model | HateoasLinks                             |
      | AMEND_OTHER_DEDUCTIONS_FIELDS_MISSING  | None      | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED   |