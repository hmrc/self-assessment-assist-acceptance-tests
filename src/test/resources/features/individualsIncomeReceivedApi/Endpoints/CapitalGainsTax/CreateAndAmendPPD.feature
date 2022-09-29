@CreateAndAmendPPD @IndividualsIncomeReceivedApi @All

Feature: Create And Amend 'Report and Pay Capital Gains Tax on Property' Overrides

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Create and Amend PPD 'Report and Pay Capital Gains Tax on Property' Overrides with scenario: <Scenario>

    When a request is made to PUT to url: IndividualsIncomeReceivedPPDUrl, with the JSON body: <Body>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Body                       | Scenario                     | Code | Item  | Response                     |
      | iirPPDRequest              | None                         | 200  | model | HateoasLinks                 |
      | iirPPDMinimumFieldsRequest | None                         | 200  | model | HateoasLinks                 |
      | iirPPDMissingFieldsRequest | None                         | 400  | body  | iirPPDMissingFieldsResponse  |
      | iirPPDInvalidRequest       | None                         | 400  | body  | iirPPDInvalidRequestResponse |
      | iirPPDRequest              | DUPLICATED_PPD_SUBMISSION_ID | 400  | body  | DUPLICATED_PPD_SUBMISSION_ID |
      | iirPPDRequest              | INCORRECT_DISPOSAL_TYPE      | 403  | body  | INCORRECT_DISPOSAL_TYPE      |
      | iirPPDRequest              | NOT_FOUND                    | 404  | body  | MATCHING_RESOURCE_NOT_FOUND  |
      | iirPPDRequest              | PPD_SUBMISSION_ID_NOT_FOUND  | 404  | body  | PPD_SUBMISSION_ID_NOT_FOUND  |
    