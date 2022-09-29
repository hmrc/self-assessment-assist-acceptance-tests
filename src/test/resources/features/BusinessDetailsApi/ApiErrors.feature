@IBusinessDetailsApiErrors @BusinessDetailsApi @All

Feature: Test errors for business-details-api on a single endpoint

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario: Incorrect URL

    When a request is made to get ListAllBusinessesUrl with an incorrect URL
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  Scenario: Incorrect HTTP method

    When a request is made to get ListAllBusinessesUrl with an incorrect http method
    Then the response code is 404
    And the response body is MATCHING_RESOURCE_NOT_FOUND

  Scenario: Incorrect header: Accept

    When a request is made to get ListAllBusinessesUrl with v2.0 accept header
    Then the response code is 404
    And the response body is NOT_FOUND_API_GATEWAY

  Scenario: Invalid header: Accept

    When a request is made to get ListAllBusinessesUrl with an invalid accept header
    Then the response code is 406
    And the response body is ACCEPT_HEADER_INVALID

  Scenario: Missing header: Accept

    When a request is made to get ListAllBusinessesUrl with missing accept header
    Then the response code is 406
    And the response body is ACCEPT_HEADER_INVALID

  Scenario: Missing header: Authorization

    When a request is made to get ListAllBusinessesUrl with missing authorization header
    Then the response code is 401
    And the response body is UNAUTHORIZED
