@AmendCharGiving @MtdCharitableGiving @All @AllSA

Feature: Amend charitable giving tax relief annual summary

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Successfully amend charitable giving with request body <RequestBody>

    When a request is made to PUT to url: AmendCharitableGiving, with the JSON body: <RequestBody>, and the gov-test-scenario: None
    Then the response code is <Code>
    And the response body is empty
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                                     | Code |
      | CHARITIES_FULL_PAYLOAD                          | 204  |
      | CHARITIES_PARTIAL_PAYLOAD                       | 204  |
      | CHARITIES_GIFTS_ONLY                            | 204  |
      | CHARITIES_GIFT_AID_PAYMENTS_ONLY                | 204  |
      | FULL_PAYLOAD_EMOJI_nonUKCharityNames            | 400  |
      | FULL_PAYLOAD_EMOJI_investmentsNonUKCharityNames | 400  |
