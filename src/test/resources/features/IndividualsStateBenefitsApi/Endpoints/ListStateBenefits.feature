@ListStateBenefits @IndividualsStateBenefitsApi @All

Feature: List State Benefits

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: List State Benefits with scenario: <Scenario>

    When a request is made to GET to url: IndividualsStateBenefitsUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario  | Code | Item  | Response                    |
      | None      | 200  | model | ListStateBenefits           |
      | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |

  Scenario Outline: List State Benefit with Benefit ID and scenario: <Scenario>

    When a request is made to GET to url: IndividualsStateBenefitsQueryIdUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                            | Code | Item | Response                                                    |
      | None                                | 200  | body | iStateBenefitsRetrieveStateBenefitResponse                  |
      | CUSTOMER_ADDED                      | 200  | body | iStateBenefitsRetrieveCustomerAddedBenefitResponse          |
      | TEST_ONLY_CUSTOMER_ADDED_NO_AMOUNTS | 200  | body | iStateBenefitsRetrieveCustomerAddedBenefitNoAmountsResponse |
      | HMRC_AMENDED_AMOUNTS                | 200  | body | iStateBenefitsRetrieveHmrcAmendedAmountsResponse            |
      | NOT_FOUND                           | 404  | body | MATCHING_RESOURCE_NOT_FOUND                                 |
