@ListSEPeriodSummaries @SelfEmploymentBusinessApi @All

Feature: List Self-Employment Period Summaries

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: List Self-Employment Period Summaries with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to GET to url: CreateOrListSelfEmploymentBusinessPeriodSummariesUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | Gov-Test-Scenario          | Code | Item   | Response                     |
    | None                       | 200  | model  | ListSEPeriodSummaries        |
    | NOT_FOUND                  | 404  | body   | MATCHING_RESOURCE_NOT_FOUND  |