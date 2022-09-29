@IndividualsIncomeReceivedApiSmoke @IndividualsIncomeReceivedApiSmokeAll @AllSmoke

Feature: Smoke test all individuals-income-received-api endpoints through API Platform

  Scenario: Setup user

    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  # --- Additional Income ---

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedSavingsUrl, with the JSON body: iirSavingsAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedSavingsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is SavingsIncomeResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedSavingsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedInsurancePoliciesUrl, with the JSON body: iirInsurancePoliciesAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedInsurancePoliciesUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is InsurancePoliciesIncomeResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedInsurancePoliciesUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedForeignUrl, with the JSON body: iirForeignAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedForeignUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ForeignIncomeResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedForeignUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedPensionsUrl, with the JSON body: iirPensionsAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedPensionsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is PensionsIncomeResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedPensionsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedOtherUrl, with the JSON body: iirOtherAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedOtherUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is OtherIncomeResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedOtherUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedOtherEmploymentUrl, with the JSON body: iirOtherEmploymentAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedOtherEmploymentUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is OtherEmploymentIncomeResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedOtherEmploymentUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedDividendsUrl, with the JSON body: iirDividendsAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedDividendsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is DividendsIncomeResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedDividendsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  # -- Employments ---

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedEmploymentsIdUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is Employment
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: IndividualsIncomeReceivedEmploymentsUrl, with the JSON body: iirCustomEmploymentAddRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is AddCustomEmployment
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedEmploymentsIdUrl, with the JSON body: iirCustomEmploymentAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to do an empty POST to url: IndividualsIncomeReceivedEmploymentsIgnoreUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedEmploymentsIdUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedEmploymentsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListEmployments
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedFinancialDetailsUrl, with the JSON body: iirFinancialDetailsAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedFinancialDetailsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is FinancialDetails
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedFinancialDetailsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to do an empty POST to url: IndividualsIncomeReceivedEmploymentsUnignoreUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  # -- Capital Gains Tax ---

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedOtherCapitalGainsUrl, with the JSON body: iirOtherCapitalGainsRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedOtherCapitalGainsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveOtherDisposalsAndGainsResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedOtherCapitalGainsUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedPPDUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: CgtRetrieveResidentialPropertyUrl, with the JSON body: iirCgtResidentialPropertyRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: CgtRetrieveResidentialPropertyUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is RetrieveAllDisposalsAndOverridesResponse
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: CgtRetrieveResidentialPropertyUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedPPDUrl, with the JSON body: iirPPDRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  # -- Non-PAYE Employment Income ---

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedNonPayeEmploymentIncomeUrl, with the JSON body: iirNonPayeEmploymentIncomeRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedNonPayeEmploymentIncomeUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is NonPayeEmploymentIncome
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to DELETE to url: IndividualsIncomeReceivedNonPayeEmploymentIncomeUrl, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedUkDividendsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is UkDividendsIncomeResponse

  Scenario: Successfully hit endpoint for a Tax Year Specific (TYS) tax year

    When a request is made to PUT to url: IndividualsIncomeReceivedUkDividendsTysUrl, with the JSON body: iirUkDividendsAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedUkDividendsUrl, with the JSON body: iirUkDividendsAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to POST to url: IndividualsIncomeReceivedUkSavingsAccountsUrl, with the JSON body: iirUkSavingsAccountAddRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is AddUkSavingsAccount
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedUkSavingsAccountsUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is ListUkSavingsAccounts
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to PUT to url: IndividualsIncomeReceivedUkSavingsAccountSummaryUrl, with the JSON body: iirUkSavingsAccountAmendRequest, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is HateoasLinks
    And the X-CorrelationId header is not empty

  Scenario: Successfully hit endpoint

    When a request is made to GET to url: IndividualsIncomeReceivedUkSavingsAccountSummaryUrl, and the gov-test-scenario: None
    Then the response code is 200
    And the response model is UkSavingsAccountIncomeResponse