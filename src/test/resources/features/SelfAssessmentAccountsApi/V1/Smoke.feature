@SaAccountsApiSmoke @SaAccountsApiSmokeAll @AllSmoke

Feature: Smoke test all self-assessment-accounts-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveBalanceUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveBalanceResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListTransactionsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListTransactionsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveTransactionDetailsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveTransactionDetailsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListPaymentsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListPaymentsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveAllocationsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveAllocationsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListChargesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListChargesResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveChargeHistoryUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveChargeHistoryResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveCodingOutUnderpaymentsDefaultUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveCodingOutUnderpaymentsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: CodingOutUrl, with the JSON body: CREATE_AMEND_CODING_OUT_REQUEST, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: CodingOutUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty
