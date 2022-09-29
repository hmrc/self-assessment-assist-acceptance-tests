@RetrieveAllDisposalsAndOverrides @IndividualsIncomeReceivedApi @All

Feature: Retrieve All CGT Residential Property Disposals and Overrides

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve All CGT Residential Property Disposals and Overrides with scenario: <Scenario>

    When a request is made to GET to url: <URL>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | URL                                       | Scenario  | Code | Item  | Response                                 |
      | CgtRetrieveResidentialPropertyUrl         | None      | 200  | model | RetrieveAllDisposalsAndOverridesResponse |
      | CgtRetrieveResidentialPropertyUserUrl     | None      | 200  | model | RetrieveAllDisposalsAndOverridesResponse |
      | CgtRetrieveResidentialPropertyHmrcHeldUrl | None      | 200  | model | RetrieveAllDisposalsAndOverridesResponse |
      | CgtRetrieveResidentialPropertyLatestUrl   | None      | 200  | model | RetrieveAllDisposalsAndOverridesResponse |
      | CgtRetrieveResidentialPropertyLatestUrl   | LOSS      | 200  | model | RetrieveAllDisposalsAndOverridesResponse |
      | CgtRetrieveResidentialPropertyUrl         | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND              |
