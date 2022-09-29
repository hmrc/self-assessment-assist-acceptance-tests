@RetrieveCharGiving @MtdCharitableGiving @All @AllSA

Feature: Retrieve charitable giving tax relief annual summary

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve charitable giving for <Gov-Test-Scenario>

    When a request is made to GET to url: RetrieveCharitableGiving, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario           | Code | Response                                     |
      | None                        | 200  | CHARITIES_RETRIEVE_DEFAULT                   |
      | ONLY_GIFT_AID_PAYMENTS      | 200  | CHARITIES_RETRIEVE_ONLY_GIFT_AID_PAYMENTS    |
      | ONLY_GIFTS                  | 200  | CHARITIES_RETRIEVE_ONLY_GIFTS                |
      | WITHOUT_NON_UK_CHARITIES    | 200  | CHARITIES_RETRIEVE_WITHOUT_NON_UK_CHARITIES  |
      | ZERO_NON_UK_CHARITIES       | 200  | CHARITIES_RETRIEVE_ZERO_NON_UK_CHARITIES     |
      | REMOVED_VALUES_EXAMPLE_1    | 200  | CHARITIES_RETRIEVE_REMOVED_VALUES_EXAMPLE_1  |
      | REMOVED_VALUES_EXAMPLE_2    | 200  | CHARITIES_RETRIEVE_REMOVED_VALUES_EXAMPLE_2  |
      | MATCHING_RESOURCE_NOT_FOUND | 404  | MATCHING_RESOURCE_NOT_FOUND                  |
