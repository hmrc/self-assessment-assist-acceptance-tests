@SaAccountsApi @All

Feature: Retrieve Coding Out Underpayments

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve Coding Out Underpayments with scenario: <Scenario>

    When a request is made to GET to url: <URL>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | URL                                       | Scenario  | Code | Item  | Response                               |
      | RetrieveCodingOutUnderpaymentsDefaultUrl  | None      | 200  | model | RetrieveCodingOutUnderpaymentsResponse |
      | RetrieveCodingOutUnderpaymentsLatestUrl   | None      | 200  | model | RetrieveCodingOutUnderpaymentsResponse |
      | RetrieveCodingOutUnderpaymentsUserUrl     | None      | 200  | model | RetrieveCodingOutUnderpaymentsResponse |
      | RetrieveCodingOutUnderpaymentsHmrcHeldUrl | None      | 200  | model | RetrieveCodingOutUnderpaymentsResponse |
      | RetrieveCodingOutUnderpaymentsDefaultUrl  | NOT_FOUND | 404  | body  | CODING_OUT_NOT_FOUND                   |
