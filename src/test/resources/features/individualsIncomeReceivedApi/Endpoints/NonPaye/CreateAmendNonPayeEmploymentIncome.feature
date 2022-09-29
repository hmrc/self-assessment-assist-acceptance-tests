@CreateAndAmendNonPayeEmploymentIncome @IndividualsIncomeReceivedApi @All

Feature: Create and Amend Non PAYE Employment Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create and Amend Non PAYE Employment Income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedNonPayeEmploymentIncomeUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                          | Scenario |  Code    | Item  | Response                               |
      | iirNonPayeEmploymentIncomeRequest             | None     | 200      | model | HateoasLinks                           |
      | iirNonPayeEmploymentIncomeRequest             | NOT_FOUND| 404      | body  | MATCHING_RESOURCE_NOT_FOUND            |