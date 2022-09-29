@LossesApiErrors @IndividualLossesApi @IndividualLossesApiV3 @All

Feature: Test errors for individual-losses-api on a single endpoint

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario: Incorrect URL

    When a request is made to post to CreateBFLossesUrl with body SELF_EMPLOYMENT_V3 with an incorrect URL
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  Scenario: Incorrect HTTP method

    When a request is made to post to CreateBFLossesUrl with body SELF_EMPLOYMENT_V3 with an incorrect http method
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  Scenario: Incorrect header: Accept

    When a request is made to post to CreateBFLossesUrl with body SELF_EMPLOYMENT_V3 and v1.9 accept header
    Then the response code is 404
    And the response body is NOT_FOUND_API_GATEWAY

  Scenario: Invalid header: Accept

    When a request is made to post to CreateBFLossesUrl with body SELF_EMPLOYMENT_V3 with an invalid accept header
    Then the response code is 406
    And the response body is ACCEPT_HEADER_INVALID

  Scenario: Invalid header: Content-Type

    When a request is made to post to CreateBFLossesUrl with body SELF_EMPLOYMENT_V3 with invalid content type header
    Then the response code is 415
    And the response body is INVALID_BODY_TYPE

  Scenario: Missing header: Accept

    When a request is made to post to CreateBFLossesUrl with body SELF_EMPLOYMENT_V3 with missing accept header
    Then the response code is 406
    And the response body is ACCEPT_HEADER_INVALID

  Scenario: Missing header: Authorization

    When a request is made to post to CreateBFLossesUrl with body SELF_EMPLOYMENT_V3 with missing authorization header
    Then the response code is 401
    And the response body is UNAUTHORIZED

  Scenario: Missing header: Content-Type

    When a request is made to post to CreateBFLossesUrl with body SELF_EMPLOYMENT_V3 with missing content type header
    Then the response code is 415
    And the response body is INVALID_BODY_TYPE
