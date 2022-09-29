@SaBsasApi @All @ListBsas @V2

Feature: List Business Source Adjustable Summaries

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: List Business Source Adjustable Summaries with scenario: <Scenario>

    When a request is made to GET to url: SaBsasListUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                  | Code | Item | Response                               |
      | None                      | 200  | body | V2_LIST_BSAS_DEFAULT                   |
      | SELF_EMPLOYMENT_SINGLE    | 200  | body | V2_LIST_BSAS_SE                        |
      | UK_PROPERTY_FHL           | 200  | body | V2_LIST_BSAS_UK_PROPERTY_FHL           |
      | UK_PROPERTY_NON_FHL       | 200  | body | V2_LIST_BSAS_UK_PROPERTY_NON_FHL       |
      | FOREIGN_PROPERTY          | 200  | body | V2_LIST_BSAS_FOREIGN_PROPERTY          |
      | FOREIGN_PROPERTY_FHL_EEA  | 200  | body | V2_LIST_BSAS_FOREIGN_PROPERTY_FHL_EEA  |
      | SELF_EMPLOYMENT_MULTIPLE  | 200  | body | V2_LIST_BSAS_MULTIPLE_SE               |
      | UK_PROPERTY_MULTIPLE      | 200  | body | V2_LIST_BSAS_MULTIPLE_PROPERTY         |
      | FOREIGN_PROPERTY_MULTIPLE | 200  | body | V2_LIST_BSAS_MULTIPLE_FOREIGN_PROPERTY |
      | NOT_FOUND                 | 404  | body | MATCHING_RESOURCE_NOT_FOUND            |
