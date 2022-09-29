@SubmitBusinessEOPS @IndividualsBusinessEOPSApiV2 @IndividualsBusinessEOPSApi @IndividualsBusinessEOPSStagingV2
Feature: Submit Business EOPS

  Background:
    Given an individual is authorised on the API Platform
    And I set the API version to 2.0

  Scenario Outline: Submit business EOPS with request body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario> - backend validation
    When a request is made to POST to url: BusinessEOPSUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                         | Gov-Test-Scenario                           | Code | Item | Response                                                          |
      | SubmitBusinessEOPSSelfEmploymentV2  | None                                        | 204  | body | empty                                                             |
      | SubmitBusinessEOPSUkPropertyV2      | None                                        | 204  | body | empty                                                             |
      | SubmitBusinessEOPSForeignPropertyV2 | None                                        | 204  | body | empty                                                             |
      | SubmitBusinessEOPSSelfEmploymentV2  | NOT_FOUND                                   | 404  | body | MATCHING_RESOURCE_NOT_FOUND                                       |
      | SubmitBusinessEOPSSelfEmploymentV2  | ALREADY_SUBMITTED                           | 403  | body | BUSINESS_EOPS_RULE_ALREADY_SUBMITTED_V2                           |
      | SubmitBusinessEOPSSelfEmploymentV2  | EARLY_SUBMISSION                            | 403  | body | BUSINESS_EOPS_RULE_EARLY_SUBMISSION_V2                            |
      | SubmitBusinessEOPSSelfEmploymentV2  | LATE_SUBMISSION                             | 403  | body | BUSINESS_EOPS_RULE_LATE_SUBMISSION_V2                             |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_MISMATCHED_START_DATE                   | 403  | body | BUSINESS_EOPS_RULE_BVR_MISMATCHED_START_DATE_V2                   |
      | SubmitBusinessEOPSSelfEmploymentV2  | NON_MATCHING_PERIOD                         | 403  | body | BUSINESS_EOPS_RULE_NON_MATCHING_PERIOD_V2                         |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_CLASS4_OVER_16                          | 403  | body | BUSINESS_EOPS_RULE_BVR_CLASS4_OVER_16_V2                          |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_CLASS4_PENSION_AGE                      | 403  | body | BUSINESS_EOPS_RULE_BVR_CLASS4_PENSION_AGE_V2                      |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_CONSOLIDATED_EXPENSES                   | 403  | body | BUSINESS_EOPS_RULE_BVR_CONSOLIDATED_EXPENSES_V2                   |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_CONSOLIDATED_EXPENSES_UK_TEST_ONLY      | 403  | body | BUSINESS_EOPS_RULE_BVR_CONSOLIDATED_EXPENSES_UK_TEST_ONLY_V2      |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_CONSOLIDATED_EXPENSES_FOREIGN_TEST_ONLY | 403  | body | BUSINESS_EOPS_RULE_BVR_CONSOLIDATED_EXPENSES_FOREIGN_TEST_ONLY_V2 |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_END_DATE_SHORT                          | 403  | body | BUSINESS_EOPS_RULE_BVR_END_DATE_SHORT_V2                          |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_END_DATE_EXCEEDS                        | 403  | body | BUSINESS_EOPS_RULE_BVR_END_DATE_EXCEEDS_V2                        |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_FHL_PRIVATE_USE_ADJUSTMENT              | 403  | body | BUSINESS_EOPS_RULE_BVR_FHL_PRIVATE_USE_ADJUSTMENT_V2              |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_NON_FHL_PRIVATE_USE_ADJUSTMENT          | 403  | body | BUSINESS_EOPS_RULE_BVR_NON_FHL_PRIVATE_USE_ADJUSTMENT_V2          |
      | SubmitBusinessEOPSSelfEmploymentV2  | BVR_UK_PROPERTY_MULTIPLE_ERRORS             | 403  | body | BUSINESS_EOPS_RULE_BVR_UK_PROPERTY_MULTIPLE_ERRORS_V2             |
