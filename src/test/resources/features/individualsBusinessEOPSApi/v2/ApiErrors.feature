@IndividualsBusinessEOPSApiErrors @IndividualsBusinessEOPSApi @IndividualsBusinessEOPSApiV2 @All

Feature: Test errors for amend individuals-business-eops-api on a single endpoint

  Background: Setup

    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario: Incorrect URL

    When a request is made to post to BusinessEOPSUrl with body SubmitBusinessEOPSSelfEmployment with an incorrect URL
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  Scenario: Incorrect HTTP method

    When a request is made to post to BusinessEOPSUrl with body SubmitBusinessEOPSSelfEmployment with an incorrect http method
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  Scenario: Incorrect header: Accept

    When a request is made to post to BusinessEOPSUrl with body SubmitBusinessEOPSSelfEmployment and v1.9 accept header
    Then the response code is 404
    And the response body is NOT_FOUND_API_GATEWAY

  Scenario: Invalid header: Accept

    When a request is made to post to BusinessEOPSUrl with body SubmitBusinessEOPSSelfEmployment with an invalid accept header
    Then the response code is 406
    And the response body is ACCEPT_HEADER_INVALID

  Scenario: Invalid header: Content-Type

    When a request is made to post to BusinessEOPSUrl with body SubmitBusinessEOPSSelfEmployment with invalid content type header
    Then the response code is 415
    And the response body is INVALID_BODY_TYPE

  Scenario: Missing header: Accept

    When a request is made to post to BusinessEOPSUrl with body SubmitBusinessEOPSSelfEmployment with missing accept header
    Then the response code is 406
    And the response body is ACCEPT_HEADER_INVALID

  Scenario: Missing header: Authorization

    When a request is made to post to BusinessEOPSUrl with body SubmitBusinessEOPSSelfEmployment with missing authorization header
    Then the response code is 401
    And the response body is UNAUTHORIZED

  Scenario: Missing header: Content-Type

    When a request is made to post to BusinessEOPSUrl with body SubmitBusinessEOPSSelfEmployment with missing content type header
    Then the response code is 415
    And the response body is INVALID_BODY_TYPE
