@CreateAndAmendOtherCapitalGains @IndividualsIncomeReceivedApi @All

Feature: Create and Amend Other Capital Gains and Disposals

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create and Amend Other Capital Gains and Disposals with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedOtherCapitalGainsUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                                     | Scenario | Code | Item  | Response                                   |
      | iirOtherCapitalGainsRequest              | None     | 200  | model | HateoasLinks                               |
      | iirOtherCapitalGainsMinimumFieldsRequest | None     | 200  | model | HateoasLinks                               |
      | iirOtherCapitalGainsMissingFieldsRequest | None     | 400  | body  | iirOtherCapitalGainsMissingFieldsResponse  |
      | iirOtherCapitalGainsInvalidRequest       | None     | 400  | body  | iirOtherCapitalGainsInvalidRequestResponse |