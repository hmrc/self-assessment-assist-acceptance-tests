@IndividualsStateBenefitsApiSmoke @IndividualsStateBenefitsApiSmokeAll @AllSmoke

Feature: Smoke test all individuals-state-benefits-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsStateBenefitsAmountsUrl, with the JSON body: iStateBenefitsAmendAmountsRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

    When a request is made to DELETE to url: IndividualsStateBenefitsAmountsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: IndividualsStateBenefitsUrl, with the JSON body: iStateBenefitsAddRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is CreateStateBenefit

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsStateBenefitsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListStateBenefits
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsStateBenefitsQueryIdUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is iStateBenefitsRetrieveStateBenefitResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsStateBenefitsPathIdUrl, with the JSON body: iStateBenefitsAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to do an empty POST to url: IndividualsStateBenefitsIgnoreUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to do an empty POST to url: IndividualsStateBenefitsUnignoreUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsStateBenefitsPathIdUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the X-CorrelationId header is not empty
