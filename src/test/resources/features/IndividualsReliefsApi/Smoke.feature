@IndividualsReliefsApiSmoke @IndividualsReliefsApiSmokeAll @AllSmoke

Feature: Smoke test all individuals-reliefs-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: ReliefsInvestmentsUrl, with the JSON body: AMEND_RELIEF_INVESTMENTS, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveReliefInvestments
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: ReliefsInvestmentsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: OtherReliefsUrl, with the JSON body: AMEND_OTHER_RELIEFS, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: OtherReliefsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveOtherReliefs
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: OtherReliefsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty


  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: ForeignReliefsUrl, with the JSON body: AMEND_FOREIGN_RELIEFS, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: ForeignReliefsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveForeignReliefs
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: ForeignReliefsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty


  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: PensionReliefsUrl, with the JSON body: AMEND_PENSION_RELIEFS, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: PensionReliefsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrievePensionReliefsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: PensionReliefsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: CharitableGivingReliefsUrl, with the JSON body: CHARITABLE_GIVING_RELIEFS_REQUEST_BODY, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

    Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: CharitableGivingReliefsUrl, and the gov-test-scenario: DELETE
    Then the response code is 204
    And the response body is empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: CharitableGivingReliefsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveCharitableGivingReliefs
    And the X-CorrelationId header is not empty
