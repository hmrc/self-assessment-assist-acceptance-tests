@IndividualCalculationApiSmokeV2

Feature: Smoke test all individual-calculation-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ListSaTaxCalculationsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListSATaxCalculationsV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSaAllowancesDeductionsReliefsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is AllowancesDeductionsReliefsV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSaEOYEstimateUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is EoyEstimateV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSaIncomeTaxNICsCalculatedUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is IncomeTaxAndNicsCalculatedResponseV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSaMetadataUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveSAMetadataV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSaMessagesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveSAMessagesV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSaTaxableIncomeUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is TaxableIncomeV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: TriggerSaTaxCalculationUrl, with the JSON body: TRIGGER_TAX_CALC, and the gov-test-scenario: None
    Then the response code is 202
    And the response model is TriggerSATaxCalculationV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to do an empty POST to url: CalcIntentToCrystallise, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is IntentToCrystalliseV2
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: CalcCrystallisation, with the JSON body: crystallisationBody, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty