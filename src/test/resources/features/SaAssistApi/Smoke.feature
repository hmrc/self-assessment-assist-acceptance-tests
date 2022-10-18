@SelfEmploymentBusinessApiSmoke @SelfEmploymentBusinessApiSmokeAll @AllSmoke

Feature: Smoke test all  endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: SelfEmploymentBusinessAnnualSubmissionUrl, and the gov-test-scenario: DELETE
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: SelfEmploymentBusinessAnnualSubmissionUrl, with the JSON body: CREATE_OR_AMEND_ANNUAL_SUBMISSION, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: SelfEmploymentBusinessAnnualSubmissionUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveSEAnnualSubmissionResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveSEPeriodSummaryResponse
    And the X-CorrelationId header is not empty


#  Scenario: Successfully hit endpoint
#
#    When a request is made to GET to url: AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryUrl, and the gov-test-scenario: None
#    Then the response code is 200
#    And the response model is HateoasLinks
#    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: CreateOrListSelfEmploymentBusinessPeriodSummariesUrl, with the JSON body: CREATE_SE_PERIOD_SUMMARY, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is CreateSEPeriodSummaryResponse
    And the X-CorrelationId header is not empty
#
#  Scenario: Successfully hit endpoint
#
#    When a request is made to GET to url: AmendOrRetrieveSelfEmploymentBusinessPeriodicUpdateUrl, and the gov-test-scenario: None
#    Then the response code is 200
#    And the response model is RetrieveSEPeriodicUpdatesResponse
#    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryUrl, with the JSON body: AMEND_SE_PERIOD_SUMMARY, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: CreateOrListSelfEmploymentBusinessPeriodSummariesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListSEPeriodSummaries
    And the X-CorrelationId header is not empty

