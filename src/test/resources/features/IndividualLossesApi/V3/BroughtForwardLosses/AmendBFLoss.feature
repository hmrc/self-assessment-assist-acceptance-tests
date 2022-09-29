@AmendLosses @BroughtForwardLosses @IndividualLossesApi @IndividualLossesApiV3 @All

Feature: Amend a Brought Forward Loss Amount V3

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Amend a Brought Forward Loss Amount V3 with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to POST to url: AmendBFLossesUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | Gov-Test-Scenario         | RequestBody        |Code | Item  | Response                    |
    | None                      | AMEND_LOSS_AMOUNT_V3  | 200 | model | AmendBFLossV3               |
    | CLASS_4                   | AMEND_LOSS_AMOUNT_V3  | 200 | model | AmendBFLossV3               |
    | UK_PROPERTY_FHL           | AMEND_LOSS_AMOUNT_V3  | 200 | model | AmendBFLossV3               |
    | UK_PROPERTY_NON_FHL       | AMEND_LOSS_AMOUNT_V3  | 200 | model | AmendBFLossV3               |
    | FOREIGN_PROPERTY_FHL_EEA  | AMEND_LOSS_AMOUNT_V3  | 200 | model | AmendBFLossV3               |
    | FOREIGN_PROPERTY          | AMEND_LOSS_AMOUNT_V3  | 200 | model | AmendBFLossV3               |
    | NO_CHANGE                 | AMEND_LOSS_AMOUNT_V3  | 403 | body  | AMEND_LOSS_RULE_NO_CHANGE   |
    | NOT_FOUND                 | AMEND_LOSS_AMOUNT_V3  | 404 | body  | MATCHING_RESOURCE_NOT_FOUND |
