@PropertyBusinessApiV1Smoke @PropertyBusinessApiSmoke @AllSmoke

Feature: Smoke test all property-business-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: ForeignPropertyPeriodSummaryUrl, with the JSON body: AMEND_FOREIGN_PROPERTY, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ForeignPropertyPeriodSummaryUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response body is PROPERTY_BUSINESS_DEFAULT_RESPONSE
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: ForeignPropertyPeriodSummaryCreateAndListUrl, with the JSON body: CREATE_FOREIGN_PROPERTY_EXPENSES, and the gov-test-scenario: None
    Then the response code is 201
    And the response model is CreatePropertyPeriodSummaryResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ForeignPropertyPeriodSummaryCreateAndListUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListPropertyPeriodSummariesResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: ForeignPropertyAnnualSubmissionUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: ForeignPropertyAnnualSubmissionUrl, with the JSON body: amendAnnualSubmissionDefault, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ForeignPropertyAnnualSubmissionUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveForeignPropertyAnnualSubmissionResponse
    And the X-CorrelationId header is not empty
