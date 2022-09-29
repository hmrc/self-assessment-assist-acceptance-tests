@RetrieveLosses @BroughtForwardLosses @IndividualLossesApi @IndividualLossesApiV3 @All

Feature: Retrieve a Brought Forward Loss V3

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Retrieve a Brought Forward Loss V3 with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to GET to url: RetrieveBFLossesUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | Gov-Test-Scenario     | Code | Item  | Response                     |
    | None                  | 200  | model | RetrieveBFLossV3             |
    | UK_PROPERTY           | 200  | model | RetrieveBFLossV3             |
    | FOREIGN_PROPERTY      | 200  | model | RetrieveBFLossV3             |
    | NOT_FOUND             | 404  | body  | MATCHING_RESOURCE_NOT_FOUND  |
