@SaBsasApiSmokeAll @SaBsasApiSmoke @AllSmoke @V3

Feature: Smoke test all self-assessment-bsas-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 3.0

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: TriggerBsasUrl, with the JSON body: V3_TRIGGER_BSAS_SELF_EMPLOYMENT, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is TriggerBsasResponseV3
    And the X-CorrelationId header is not empty
#
 Scenario: Successfully hit endpoint

   When a request is made to GET to url: SaBsasListUrl, and the gov-test-scenario: None
   Then the response code is 200
   And the response model is ListBsasResponseV3
   And the X-CorrelationId header is not empty
#
    # UK Property

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: SubmitUkPropBsasAdjustmentUrlV3, with the JSON body: V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveUkPropBsasV3Url, and the gov-test-scenario: UK_PROPERTY_FHL_PROFIT
    Then the response code is 200
    And the response model is RetrieveUkPropBsasResponseV3
    And the X-CorrelationId header is not empty
#
#  Scenario: Successfully hit endpoint
#
#    When a request is made to GET to url: RetrieveUkPropBsasAdjustmentsUrl, and the gov-test-scenario: UK_PROPERTY_FHL_ADJUSTED
#    Then the response code is 200
#    And the response model is RetrieveUkPropBsasAdjustmentsResponse
#    And the X-CorrelationId header is not empty
#
#
#    # Self-Employment
#
  Scenario: Successfully hit endpoint

    When a request is made to POST to url: SubmitSEBsasAdjustmentUrlV3, with the JSON body: SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveSelfEmploymentBsasUrlV3, and the gov-test-scenario: SELF_EMPLOYMENT_PROFIT
    Then the response code is 200
    And the response model is RetrieveSEBsasResponseV3
    And the X-CorrelationId header is not empty
#
#  Scenario: Successfully hit endpoint
#
#    When a request is made to GET to url: RetrieveSelfEmploymentBsasAdjustmentsUrl, and the gov-test-scenario: SELF_EMPLOYMENT_ADJUSTED
#    Then the response code is 200
#    And the response model is RetrieveSEBsasAdjustmentsResponseV2
#    And the X-CorrelationId header is not empty
#
#
    # Foreign Property

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: SubmitForeignPropBsasAdjustmentUrl, with the JSON body: V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty
#
  Scenario: Successfully hit endpoint

    When a request is made to GET to url: RetrieveForeignPropBsasV3Url, and the gov-test-scenario: FOREIGN_PROPERTY_FHL_PROFIT
    Then the response code is 200
    And the response model is RetrieveForeignPropBsasResponseV3
    And the X-CorrelationId header is not empty
#
#  Scenario: Successfully hit endpoint
#
#    When a request is made to GET to url: RetrieveForeignPropBsasAdjustmentsUrl, and the gov-test-scenario: FOREIGN_PROPERTY_FHL_EEA_ADJUSTED
#    Then the response code is 200
#    And the response body is FOREIGN_PROP_FHL_EEA_ADJUSTED
#    And the X-CorrelationId header is not empty
