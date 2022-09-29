@CreateAndAmendOtherCapitalGains @IndividualsIncomeReceivedApi @All

Feature: Create and Amend CGT Residential Property Disposals

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create and Amend CGT Residential Property Disposals with scenario: <Scenario>

    When a request is made to PUT to url: CgtRetrieveResidentialPropertyUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                          | Scenario | Code | Item  | Response                                        |
      | iirCgtResidentialPropertyRequest              | None     | 200  | model | HateoasLinks                                    |
      | iirCgtResidentialPropertyMinimumFieldsRequest | None     | 200  | model | HateoasLinks                                    |
      | iirCgtResidentialPropertyMissingFieldsRequest | None     | 400  | body  | iirCgtResidentialPropertyMissingFieldsResponse  |
      | iirCgtResidentialPropertyInvalidRequest       | None     | 400  | body  | iirCgtResidentialPropertyInvalidRequestResponse |