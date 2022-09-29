@CreateAndAmendHistoricFhlUKPropertyBusinessAnnualSubmission @PropertyBusinessApiV2 @PropertyBusinessApi @All

Feature: Create and Amend Historic FHL UK Property Business Annual Submission

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Create and Amend Historic FHL UK Property Business Annual Submission with scenario: <Scenario>

    When a request is made to PUT to url: HistoricFhlUKPropertyAnnualSubmissionUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                                    | Scenario  | Code | Item  | Response                    |
      | CREATE_AMEND_HISTORIC_FHL_UK_PROPERTY_ANNUAL_SUBMISSION | None      | 200  | model | HateoasLinks                |
      | CREATE_AMEND_HISTORIC_FHL_UK_PROPERTY_ANNUAL_SUBMISSION | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |
