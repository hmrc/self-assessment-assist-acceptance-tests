@IndividualCalculationApiSmokeV3

Feature: Smoke test all individual-calculation-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 3.0

  Scenario: Successfully hit endpoint

    When a request is made to do an empty POST to url: v3TriggerCalcUrl, and the gov-test-scenario: None
    Then the response code is 202
    And the response model is TriggerSATaxCalculationV3

  Scenario: Successfully hit endpoint

    When a request is made to do an empty POST to url: SubmitSAFinalDeclarationUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSelfAssessmentTaxCalculationUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveSelfAssessmentTaxCalculation
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListSaTaxCalculationsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListSATaxCalculationsV3
    And the X-CorrelationId header is not empty