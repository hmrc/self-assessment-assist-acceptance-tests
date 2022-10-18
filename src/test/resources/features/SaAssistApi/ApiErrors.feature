@SelfEmploymentBusinessApiErrors @SelfEmploymentBusinessApi @All

Feature: Test errors for self-employment-business-api on a single endpoint

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario: Incorrect URL

    When a request is made to put to SelfEmploymentBusinessAnnualSubmissionUrl with body CREATE_OR_AMEND_ANNUAL_SUBMISSION with an incorrect URL
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  Scenario: Incorrect HTTP method

    When a request is made to put to SelfEmploymentBusinessAnnualSubmissionUrl with body CREATE_OR_AMEND_ANNUAL_SUBMISSION with an incorrect http method
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  Scenario: Incorrect Accept header version

    When a request is made to put to SelfEmploymentBusinessAnnualSubmissionUrl with body CREATE_OR_AMEND_ANNUAL_SUBMISSION and v2.0 accept header
    Then the response code is 404
    And the response body is NOT_FOUND_API_GATEWAY

  Scenario: Invalid header: Accept

    When a request is made to put to SelfEmploymentBusinessAnnualSubmissionUrl with body CREATE_OR_AMEND_ANNUAL_SUBMISSION with an invalid accept header
    Then the response code is 406
    And the response body is ACCEPT_HEADER_INVALID

  Scenario: Missing header: Accept

    When a request is made to put to SelfEmploymentBusinessAnnualSubmissionUrl with body CREATE_OR_AMEND_ANNUAL_SUBMISSION with missing accept header
    Then the response code is 406
    And the response body is ACCEPT_HEADER_INVALID

  Scenario: Missing header: Authorization

    When a request is made to put to SelfEmploymentBusinessAnnualSubmissionUrl with body CREATE_OR_AMEND_ANNUAL_SUBMISSION with missing authorization header
    Then the response code is 401
    And the response body is UNAUTHORIZED
