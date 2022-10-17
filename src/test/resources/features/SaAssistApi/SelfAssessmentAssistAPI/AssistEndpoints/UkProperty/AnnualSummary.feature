@UKPropAnnuals @UKProp @SelfAssessmentApiLegacy @All @AllSA

Feature: Test sa-api Amend, Get and Logical Delete of a Non-FHL and a FHL UK property business annual summary

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0
    When a request is made to POST to url: UkpAddBusiness, with the JSON body: UkpAddBusiness, and the gov-test-scenario: None
    And the response code is 201

  Scenario Outline: Successfully amend, logical delete and get a <RequestUrl>

    When a request is made to PUT to url: <RequestUrl>, with the JSON body: <RequestBody>, and the gov-test-scenario: None
    Then the response code is 204
    And the response body is empty

    When a request is made to GET to url: <RequestUrl>, and the gov-test-scenario: None
    Then the response code is <ResponseCode>
    And the response body is <ResponseBody>

    Examples:
      | RequestUrl             | RequestBody            | ResponseCode | ResponseBody                           |
      | UkpFhlAnnualSummary    | UkpFhlAnnualSummary    | 200          | Get FHL UK Property Annual Summary     |
      | UkpFhlAnnualSummary    | UkpAnnualSummaryEmpty  | 404          | empty                                  |
      | UkpNonFhlAnnualSummary | UkpNonFhlAnnualSummary | 200          | Get Non-FHL UK Property Annual Summary |
      | UkpNonFhlAnnualSummary | UkpAnnualSummaryEmpty  | 404          | empty                                  |
