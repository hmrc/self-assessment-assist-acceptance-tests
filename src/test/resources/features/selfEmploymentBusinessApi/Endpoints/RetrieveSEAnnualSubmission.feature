@RetrieveSEAnnualSubmission @SelfEmploymentBusinessApi @All

Feature: Retrieve SE Annual Submission

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve an self employment annual submission with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to GET to url: SelfEmploymentBusinessAnnualSubmissionUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | Gov-Test-Scenario          | Code | Item   | Response                            |
    | None                       | 200  | model  | RetrieveSEAnnualSubmissionResponse  |
    | TRADING_ALLOWANCE          | 200  | model  | RetrieveSEAnnualSubmissionResponse  |
    | NOT_FOUND                  | 404  | body   | MATCHING_RESOURCE_NOT_FOUND         |