@RetrieveEmploymentFinancialDetails @IndividualsIncomeReceivedApi @All

Feature: Retrieve Employment Financial Details

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Retrieve employment financial details with scenario: <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Url                                                  | Scenario  | Code | Item  | Response                    |
      | IndividualsIncomeReceivedFinancialDetailsHMRCHeldUrl | None      | 200  | model | FinancialDetails            |
      | IndividualsIncomeReceivedFinancialDetailsUserUrl     | None      | 200  | model | FinancialDetails            |
      | IndividualsIncomeReceivedFinancialDetailsLatestUrl   | None      | 200  | model | FinancialDetails            |
      | IndividualsIncomeReceivedFinancialDetailsUrl         | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND |