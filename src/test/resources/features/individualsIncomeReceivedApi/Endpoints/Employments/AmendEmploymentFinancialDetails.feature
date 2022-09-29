@AmendEmploymentFinancialDetails @IndividualsIncomeReceivedApi @All

Feature: Amend Employment Financial Details

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend employment financial details with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedFinancialDetailsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                               | Scenario  | Code | Item  | Response                                            |
      | iirFinancialDetailsAmendRequest                    | None      | 200  | model | HateoasLinks                                        |
      | iirFinancialDetailsAmendMinimumFieldsRequest       | None      | 200  | model | HateoasLinks                                        |
      | iirFinancialDetailsAmendValueErrorsRequest         | None      | 400  | body  | iirFinancialDetailsAmendValueErrorsResponse         |
      | iirFinancialDetailsAmendInvalidRequest             | None      | 400  | body  | iirFinancialDetailsAmendInvalidResponse             |
      | iirFinancialDetailsAmendMissingErrorsRequest       | None      | 400  | body  | iirFinancialDetailsAmendMissingErrorsResponse       |
      | iirFinancialDetailsAmendEmptyBenefitsInKindRequest | None      | 400  | body  | iirFinancialDetailsAmendEmptyBenefitsInKindResponse |
      | iirFinancialDetailsAmendEmptyDeductionsRequest     | None      | 400  | body  | iirFinancialDetailsAmendEmptyDeductionsResponse     |
      | iirFinancialDetailsAmendEmptyStudentLoansRequest   | None      | 400  | body  | iirFinancialDetailsAmendEmptyStudentLoansResponse   |
      | iirFinancialDetailsAmendEmptyObjectsRequest        | None      | 400  | body  | iirFinancialDetailsAmendEmptyObjectsResponse        |
      | iirFinancialDetailsAmendRequest                    | NOT_FOUND | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                         |