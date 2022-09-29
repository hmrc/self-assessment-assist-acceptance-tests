@AmendInsurancePolicies @IndividualsIncomeReceivedApi @All

Feature: Amend Insurance Policies Income

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend insurance policies income with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedInsurancePoliciesUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                              | Scenario | Code | Item  | Response                                           |
      | iirInsurancePoliciesAmendRequest                  | None     | 200  | model | HateoasLinks                                       |
      | iirInsurancePoliciesAmendMinimumFieldsRequest     | None     | 200  | model | HateoasLinks                                       |
      | iirInsurancePoliciesAmendValueErrorsRequest       | None     | 400  | body  | iirInsurancePoliciesAmendValueErrorsResponse       |
      | iirInsurancePoliciesAmendRefAndEventErrorsRequest | None     | 400  | body  | iirInsurancePoliciesAmendRefAndEventErrorsResponse |
      | iirInsurancePoliciesAmendInvalidBodyRequest       | None     | 400  | body  | iirInsurancePoliciesAmendInvalidBodyResponse       |
      | iirInsurancePoliciesAmendEmptyBodyRequest         | None     | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED             |
