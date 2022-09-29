@RetrieveCharitableGivingReliefs @IndividualsReliefsApi @All

Feature: Retrieve Charitable Giving Tax Relief

  Scenario: Setup user
    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve Charitable Giving Tax Relief with Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to GET to url: CharitableGivingReliefsUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario | Code | Item  | Response                        |
      | None              | 200  | model | RetrieveCharitableGivingReliefs |
      | NOT_FOUND         | 404  | body  | MATCHING_RESOURCE_NOT_FOUND     |
