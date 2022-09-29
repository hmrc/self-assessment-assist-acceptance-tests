@OtherDeductionsApiSmoke @OtherDeductionsApiSmokeAll @AllSmoke

Feature: Smoke test all other-deductions-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: OtherDeductionsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: OtherDeductionsUrl, with the JSON body: AMEND_OTHER_DEDUCTIONS, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: OtherDeductionsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveOtherDeductionsResponse
    And the X-CorrelationId header is not empty
