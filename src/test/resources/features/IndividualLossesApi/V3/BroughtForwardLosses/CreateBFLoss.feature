@CreateLosses @BroughtForwardLosses @IndividualLossesApi @IndividualLossesApiV3 @All

Feature: Create a brought forward loss

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Create Brought Forward Loss for <IncomeType> and Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to POST to url: CreateBFLossesUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | RequestBody                 | Gov-Test-Scenario    | Code | Item    | Response                     |
    | UK_PROPERTY_FHL_V3          | None                 | 201  | model   | CreateBFLossV3               |
    | UK_PROPERTY_NON_FHL_V3      | None                 | 201  | model   | CreateBFLossV3               |
    | SELF_EMPLOYMENT_V3          | DUPLICATE_SUBMISSION | 403  | body    | RULE_DUPLICATE_SUBMISSION_V3 |
    | SELF_EMPLOYMENT_V3          | NOT_FOUND            | 404  | body    | MATCHING_RESOURCE_NOT_FOUND  |
    | FOREIGN_PROPERTY_V3         | None                 | 201  | model   | CreateBFLossV3               |
    | FOREIGN_PROPERTY_FHL_EEA_V3 | None                 | 201  | model   | CreateBFLossV3               |
    | SELF_EMPLOYMENT_V3          | None                 | 201  | model   | CreateBFLossV3               |
    | SELF_EMPLOYMENT_CLASS4_V3   | None                 | 201  | model   | CreateBFLossV3               |
