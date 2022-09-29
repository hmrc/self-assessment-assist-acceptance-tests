@IndividualsDisclosuresApiSmoke @IndividualsDisclosuresApiSmokeAll @AllSmoke

Feature: Smoke test all individuals-disclosures-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsDisclosuresUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveDisclosuresResponse
    And the X-CorrelationId header is not empty

    When a request is made to DELETE to url: IndividualsDisclosuresUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the X-CorrelationId header is not empty

    When a request is made to PUT to url: IndividualsDisclosuresUrl, with the JSON body: iDisclosuresAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: MarriageAllowanceUrl, with the JSON body: marriageAllowanceRequest, and the gov-test-scenario: None
    Then the response code is 201
    And the response body is empty
    And the X-CorrelationId header is not empty

