@AddCustomEmployment @IndividualsIncomeReceivedApi @All

Feature: Add A Custom Employment

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Add a custom employment with scenario: <Scenario>

    When a request is made to POST to url: IndividualsIncomeReceivedEmploymentsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                       | Scenario | Code | Item  | Response                                  |
      | iirCustomEmploymentAddRequest              | None     | 200  | model | AddCustomEmployment                       |
      | iirCustomEmploymentAddMinimumFieldsRequest | None     | 200  | model | AddCustomEmployment                       |
      | iirCustomEmploymentAddInvalidBodyRequest   | None     | 400  | body  | iirCustomEmploymentAddInvalidBodyResponse |
      | iirCustomEmploymentAddValueErrorsRequest   | None     | 400  | body  | iirCustomEmploymentAddValueErrorsResponse |
