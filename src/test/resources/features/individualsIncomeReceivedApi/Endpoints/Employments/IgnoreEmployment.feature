@IgnoreEmployment @IndividualsIncomeReceivedApi @All

Feature: Ignore Employment

  Scenario: Setup
    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Ignore employment with scenario: <Scenario>

    When a request is made to do an empty POST to url: IndividualsIncomeReceivedEmploymentsIgnoreUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario          | Code | Item  | Response                           |
      | None              | 200  | model | HateoasLinks                       |
      | CUSTOM_EMPLOYMENT | 403  | body  | RULE_CUSTOM_EMPLOYMENT_IGNORE      |
      | NOT_FOUND         | 404  | body  | MATCHING_RESOURCE_NOT_FOUND        |