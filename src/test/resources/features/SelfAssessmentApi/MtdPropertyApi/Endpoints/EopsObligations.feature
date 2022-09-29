@PropEopsObligations @MtdPropertyApi @All @AllSA

Feature: Retrieve End of Period Statement Obligations for a UK Property Business

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario: (Retired endpoint) Retrieve UK Property EOPS Obligations

    When a request is made to GET to url: PropRetrieveEopsObligations, and the gov-test-scenario: None
    Then the response code is 410
    And the response body is RESOURCE_GONE
