@IndividualsChargesApiSmoke @IndividualsChargesApiSmokeAll @AllSmoke
Feature: Smoke test all endpoints through API Platform using version 2.0 header

  Scenario: Setup
    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully retrieve Pensions Charges
    When a request is made to PUT to url: PensionChargesUrl, with the JSON body: AmendIndividualsChargesPensionsMaximum, and the gov-test-scenario: None
    Then the response code is 200
    When a request is made to GET to url: PensionChargesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is IndividualsChargesPensions
    And the X-CorrelationId header is not empty

  Scenario: Successfully amend Pensions Charges
    When a request is made to PUT to url: PensionChargesUrl, with the JSON body: AmendIndividualsChargesPensionsMaximum, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully delete Pensions Charges
    When a request is made to PUT to url: PensionChargesUrl, with the JSON body: AmendIndividualsChargesPensionsMaximum, and the gov-test-scenario: None
    Then the response code is 200
    When a request is made to DELETE to url: PensionChargesUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
