@RetrievePeriodObligations @ObligationsApi

Feature: RETRIEVE Income Tax (Self Assessment) Income and Expenditure Obligations

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully Retrieve Income Tax Income and Expenditure with scenario: <Scenario>

    When a request is made to GET to url: RetrievePeriodicObligationsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the Periodic body contains no empty arrays
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario  | Code | Item  | Response                            |
      | None      | 200  | model | RetrievePeriodicObligationsResponse |
      | OPEN      | 200  | model | RetrievePeriodicObligationsResponse |
      | FULFILLED | 200  | model | RetrievePeriodicObligationsResponse |

  Scenario Outline: Failure to Retrieve EOPS with scenario: <Scenario>

    When a request is made to GET to url: RetrievePeriodicObligationsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario         | Code | Item | Response                    |
      | NOT_FOUND_BPKEY  | 404  | body | MATCHING_RESOURCE_NOT_FOUND |
      | NOT_FOUND        | 404  | body | MATCHING_RESOURCE_NOT_FOUND |
      | INSOLVENT_TRADER | 403  | body | RULE_INSOLVENT_TRADER       |
