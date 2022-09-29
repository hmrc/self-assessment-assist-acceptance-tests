@RetrieveEOPS @ObligationsApi

Feature: Retrieve Income Tax (Self Assessment) End of Period Statement Obligations

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Successfully Retrieve EOPS with scenario: <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the EOPS body contains no empty arrays
    And the X-CorrelationId header is not empty

    Examples:
      | Url                      | Scenario  | Code | Item  | Response             |
      | RetrieveEOPSUrl          | None      | 200  | model | RetrieveEOPSResponse |
      | RetrieveEOPSOpenUrl      | OPEN      | 200  | model | RetrieveEOPSResponse |
      | RetrieveEOPSFulfilledUrl | FULFILLED | 200  | model | RetrieveEOPSResponse |

  Scenario Outline: Failure to Retrieve EOPS with scenario: <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Url                            | Scenario               | Code | Item | Response                    |
      | RetrieveEOPSForeignPropertyUrl | NO_OBLIGATIONS_FOUND   | 404  | body | NO_OBLIGATIONS_FOUND        |
      | RetrieveEOPSUrl                | NOT_FOUND              | 404  | body | MATCHING_RESOURCE_NOT_FOUND |
      | RetrieveEOPSUrl                | NOT_FOUND_BPKEY        | 404  | body | MATCHING_RESOURCE_NOT_FOUND |
      | RetrieveEOPSUrl                | INSOLVENT_TRADER       | 403  | body | RULE_INSOLVENT_TRADER       |
