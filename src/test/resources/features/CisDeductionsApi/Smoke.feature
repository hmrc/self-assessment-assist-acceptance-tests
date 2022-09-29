@CisDeductionsApiSmoke @CisDeductionsApiSmokeAll @AllSmoke

Feature: Smoke test all individual-calculation-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: cisCreateUrl, with the JSON body: CIS_CREATE_REQUEST, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is cisDeductionsCreateResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: cisRetrieveUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is cisDeductionsRetrieveResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: cisAmendOrDeleteUrl, with the JSON body: CIS_AMEND_REQUEST, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: cisAmendOrDeleteUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty
