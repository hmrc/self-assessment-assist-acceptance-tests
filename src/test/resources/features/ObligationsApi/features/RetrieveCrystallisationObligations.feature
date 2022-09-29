@RetrieveCrystallisationObligations @ObligationsApi

Feature: Retrieve Crystallisation Obligations

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve crystallisation obligations with scenario: <Scenario>

    When a request is made to GET to url: RetrieveCrystallisationObligationsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario         | Code | Item  | Response                                   |
      | None             | 200  | model | retrieveCrystallisationObligationsResponse |
      | OPEN             | 200  | model | retrieveCrystallisationObligationsResponse |
      | FULFILLED        | 200  | model | retrieveCrystallisationObligationsResponse |
      | INSOLVENT_TRADER | 403  | body  | RULE_INSOLVENT_TRADER                      |
      | NOT_FOUND_BPKEY  | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                |
      | NOT_FOUND        | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                |