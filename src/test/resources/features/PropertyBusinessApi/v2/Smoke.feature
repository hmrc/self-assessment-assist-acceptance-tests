@PropertyBusinessApiV2Smoke @PropertyBusinessApiSmoke @AllSmoke

Feature: Smoke test all property-business-api endpoints through API Platform V2

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Retrieve UK Property Period Summary V2

    When a request is made to GET to url: UKPropertyPeriodSummaryUrl, and the gov-test-scenario: UK_PROPERTY
    Then the response code is 200
    And the response model is RetrieveUKPropertyPeriodSummaryResponse
    And the X-CorrelationId header is not empty

  Scenario: Retrieve UK Property Annual Submission V2

    When a request is made to GET to url: UKPropertyAnnualSubmissionUrl, and the gov-test-scenario: UK_PROPERTY
    Then the response code is 200
    And the response model is RetrieveUKPropertyAnnualSubmissionResponse
    And the X-CorrelationId header is not empty

  Scenario: Delete a UK property annual submission V2

    When a request is made to DELETE to url: DeletePropertyAnnualSubmissionUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Amend a UK Property Period Summary V2

    When a request is made to PUT to url: UkPropertyPeriodSummaryUrl, with the JSON body: AMEND_UK_PROPERTY_PERIOD_SUMMARY, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Create a UK Property Period Summary V2

    When a request is made to POST to url: CreateUKPropertyPeriodSummaryUrl, with the JSON body: CREATE_UK_PROPERTY_EXPENSES, and the gov-test-scenario: None
    Then the response code is 201
    And the response model is CreatePropertyPeriodSummaryResponse
    And the X-CorrelationId header is not empty

  Scenario: Create or Amend a UK Property Annual Submission V2

    When a request is made to PUT to url: UKPropertyAnnualSubmissionUrl, with the JSON body: createAmendUKPropAnnualSubmissionDefault, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Amend a Foreign Property Income & Expenditure Period Summary V2

    When a request is made to PUT to url: ForeignPropertyPeriodSummaryUrlV2, with the JSON body: AMEND_FOREIGN_PROPERTY_V2, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: List Property Income & Expenses Period Summaries for <Scenario>

    When a request is made to GET to url: ListPropertyPeriodSummariesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListPropertyPeriodSummariesResponse
    And the X-CorrelationId header is not empty

  Scenario: Create a Foreign Property Income & Expenses Period Summary V2

    When a request is made to POST to url: CreateForeignPropertyPeriodSummaryUrlV2, with the JSON body: createForeignPropertyWithExpensesV2, and the gov-test-scenario: None
    Then the response code is 201
    And the response model is CreatePropertyPeriodSummaryResponse
    And the X-CorrelationId header is not empty
    
  Scenario: Create and Amend a Foreign Property Annual Submission V2

    When a request is made to PUT to url: ForeignPropertyAnnualSubmissionUrlV2, with the JSON body: createAmendForeignPropAnnualSubmissionDefaultV2, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks

  Scenario: Retrieve Foreign Property Period Summary V2

    When a request is made to GET to url: ForeignPropertyPeriodSummaryUrlV2, and the gov-test-scenario: FOREIGN_PROPERTY
    Then the response code is 200
    And the response model is RetrieveForeignPropertyPeriodSummaryResponseV2
    And the X-CorrelationId header is not empty

  Scenario: Retrieve Foreign Property Annual Submission V2

    When a request is made to GET to url: ForeignPropertyAnnualSubmissionUrlV2, and the gov-test-scenario: FOREIGN_PROPERTY
    Then the response code is 200
    And the response model is RetrieveForeignPropertyAnnualSubmissionResponseV2
    And the X-CorrelationId header is not empty

  Scenario: Retrieve Historic FHL UK Property Annual Submission

    When a request is made to GET to url: HistoricFhlUKPropertyAnnualSubmissionUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse
    And the X-CorrelationId header is not empty

  Scenario: Retrieve Historic Non FHL UK Property Annual Submission V2

    When a request is made to GET to url: HistoricNonFhlUKPropertyAnnualSubmissionUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse
    And the X-CorrelationId header is not empty

  Scenario: Create a Historic Non-FHL UK Property Income & Expenses Period Summary with scenario V2

    When a request is made to POST to url: HistoricNonFhlUKPropertyPeriodSummaryUrl, with the JSON body: createHistoricNonFhlUKPropertyPeriodWithExpensesV2, and the gov-test-scenario: None
    Then the response code is 201
    And the response model is CreateHistoricUKPropertyPeriodSummaryResponse
    And the X-CorrelationId header is not empty

  Scenario: Create a Historic FHL UK Property Income & Expenses Period Summary V2

    When a request is made to POST to url: HistoricFhlUKPropertyPeriodSummaryUrl, with the JSON body: createHistoricFhlUKPropertyPeriodSummaryV2, and the gov-test-scenario: None
    Then the response code is 201
    And the response model is CreateHistoricUKPropertyPeriodSummaryResponse
    And the X-CorrelationId header is not empty

  Scenario: Create and Amend Historic FHL UK Property Annual Submission V2

    When a request is made to PUT to url: HistoricFhlUKPropertyAnnualSubmissionUrl, with the JSON body: CREATE_AMEND_HISTORIC_FHL_UK_PROPERTY_ANNUAL_SUBMISSION, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks

  Scenario: Delete Historic FHL UK Property Business Annual Submission V2

    When a request is made to DELETE to url: HistoricFhlUKPropertyAnnualSubmissionUrl, and the gov-test-scenario: DELETE
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Delete Historic Non FHL UK Property Business Annual Submission V2

    When a request is made to DELETE to url: HistoricNonFhlUKPropertyAnnualSubmissionUrl, and the gov-test-scenario: DELETE
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Amend a Historic FHL UK property Income & Expenses Period Summary V2

    When a request is made to PUT to url: HistoricFhlUKPropertyPeriodSummaryPeriodUrl, with the JSON body: AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY_V2, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: List Historic FHL UK Property Income & Expenses Period Summaries V2

    When a request is made to GET to url: HistoricFhlUKPropertyPeriodSummaryUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListHistoricUKPropertyPeriodSummariesResponse
    And the X-CorrelationId header is not empty

  Scenario: Retrieve a Historic FHL UK property Income & Expenses Period Summary V2

    When a request is made to GET to url: HistoricFhlUKPropertyPeriodSummaryPeriodUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveHistoricFhlUKPropertyPeriodSummaryResponse
    And the X-CorrelationId header is not empty

  Scenario: Retrieve a Historic Non-FHL UK property Income & Expenses Period Summary V2

    When a request is made to GET to url: HistoricNonFhlUKPropertyPeriodSummaryPeriodUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveHistoricNonFhlUKPropertyPeriodSummaryResponse
    And the X-CorrelationId header is not empty

  Scenario: List Historic Non FHL UK Property Income & Expenses Period Summaries V2

    When a request is made to GET to url: HistoricNonFhlUKPropertyPeriodSummaryUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponse
    And the X-CorrelationId header is not empty