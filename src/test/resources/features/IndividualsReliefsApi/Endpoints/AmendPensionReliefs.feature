@AmendPensionReliefs @IndividualsReliefsApi @All

Feature: Amend pensions reliefs

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully amend a pension relief with request body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to PUT to url: PensionReliefsUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty


    Examples:
      | RequestBody                              | Gov-Test-Scenario  | Code | Item  | Response                                 |
      | AMEND_PENSION_RELIEFS                    | None               | 200  | model | HateoasLinks                             |
      | pensionReliefsAmendMinimumFields         | None               | 200  | model | HateoasLinks                             |

  Scenario Outline: Unsuccessfully amend a pension relief with request body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to PUT to url: PensionReliefsUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                              | Gov-Test-Scenario  | Code | Item  | Response                                 |
      | pensionReliefsAmendValueErrorsRequest    | None               | 400  | body  | pensionReliefsAmendValueErrorsResponse   |
      | pensionReliefsAmendMissingErrorsRequest  | None               | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED   |