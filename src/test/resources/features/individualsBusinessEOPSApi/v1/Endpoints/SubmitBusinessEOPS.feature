@SubmitBusinessEOPS @IndividualsBusinessEOPSApiV1 @IndividualsBusinessEOPSApi @IndividualsBusinessEOPSStagingV1
Feature: Submit Business EOPS

  Background:
    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario Outline: Submit business EOPS with request body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario> - backend validation
    When a request is made to POST to url: BusinessEOPSUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                       | Gov-Test-Scenario                       | Code | Item | Response                                          |
      | SubmitBusinessEOPSSelfEmployment  | None                                    | 204  | body | empty                                             |
      | SubmitBusinessEOPSUkProperty      | None                                    | 204  | body | empty                                             |
      | SubmitBusinessEOPSForeignProperty | None                                    | 204  | body | empty                                             |
      | SubmitBusinessEOPSSelfEmployment  | NOT_FOUND                               | 404  | body | MATCHING_RESOURCE_NOT_FOUND                       |
      | SubmitBusinessEOPSSelfEmployment  | ALREADY_SUBMITTED                       | 403  | body | BUSINESS_EOPS_RULE_ALREADY_SUBMITTED              |
      | SubmitBusinessEOPSSelfEmployment  | CLASS4_OVER_16                          | 403  | body | BUSINESS_EOPS_RULE_CLASS4_OVER_16                 |
      | SubmitBusinessEOPSSelfEmployment  | CLASS4_PENSION_AGE                      | 403  | body | BUSINESS_EOPS_RULE_CLASS4_PENSION_AGE             |
      | SubmitBusinessEOPSSelfEmployment  | CONSOLIDATED_EXPENSES                   | 403  | body | BUSINESS_EOPS_RULE_CONSOLIDATED_EXPENSES          |
      | SubmitBusinessEOPSSelfEmployment  | CONSOLIDATED_EXPENSES_UK_TEST_ONLY      | 403  | body | BUSINESS_EOPS_RULE_CONSOLIDATED_EXPENSES          |
      | SubmitBusinessEOPSSelfEmployment  | CONSOLIDATED_EXPENSES_FOREIGN_TEST_ONLY | 403  | body | BUSINESS_EOPS_RULE_CONSOLIDATED_EXPENSES          |
      | SubmitBusinessEOPSSelfEmployment  | EARLY_SUBMISSION                        | 403  | body | BUSINESS_EOPS_RULE_EARLY_SUBMISSION               |
      | SubmitBusinessEOPSSelfEmployment  | LATE_SUBMISSION                         | 403  | body | BUSINESS_EOPS_RULE_LATE_SUBMISSION                |
      | SubmitBusinessEOPSSelfEmployment  | MISMATCHED_END_DATE                     | 403  | body | BUSINESS_EOPS_RULE_MISMATCHED_END_DATE            |
      | SubmitBusinessEOPSSelfEmployment  | MISMATCHED_END_DATE_TEST_ONLY           | 403  | body | BUSINESS_EOPS_RULE_MISMATCHED_END_DATE            |
      | SubmitBusinessEOPSSelfEmployment  | MISMATCHED_START_DATE                   | 403  | body | BUSINESS_EOPS_RULE_MISMATCHED_START_DATE          |
      | SubmitBusinessEOPSSelfEmployment  | FHL_PRIVATE_USE_ADJUSTMENT              | 403  | body | BUSINESS_EOPS_RULE_FHL_PRIVATE_USE_ADJUSTMENT     |
      | SubmitBusinessEOPSSelfEmployment  | NON_FHL_PRIVATE_USE_ADJUSTMENT          | 403  | body | BUSINESS_EOPS_RULE_NON_FHL_PRIVATE_USE_ADJUSTMENT |
      | SubmitBusinessEOPSSelfEmployment  | NON_MATCHING_PERIOD                     | 403  | body | BUSINESS_EOPS_RULE_NON_MATCHING_PERIOD            |
      | SubmitBusinessEOPSSelfEmployment  | BUSINESS_VALIDATION_FAILURE             | 403  | body | BUSINESS_EOPS_RULE_BUSINESS_VALIDATION_FAILURE    |
