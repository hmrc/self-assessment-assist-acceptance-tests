@AmendForeignPropertyAnnualSubmission @PropertyBusinessApiV2 @PropertyBusinessApi @All

Feature: Create and Amend a Foreign Property Annual Submission V2

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Create and Amend a Foreign Property Annual Submission for <Scenario>

    When a request is made to PUT to url: ForeignPropertyAnnualSubmissionUrlV2, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                                        | Scenario                    | Code | Item  | Response                                                  |
      | createAmendForeignPropAnnualSubmissionDefaultV2                | None                        | 200  | model | HateoasLinks                                              |
      | createAmendForeignPropAnnualSubmissionWithMultiplePropertiesV2 | None                        | 200  | model | HateoasLinks                                              |
      | createAmendForeignPropAnnualSubmissionValueErrorsRequestV2     | None                        | 400  | body  | createAmendAnnualSubmissionValueErrorsResponse            |
      | createAmendForeignPropAnnualSubmissionInvalidBodyRequestV2     | None                        | 400  | body  | createAmendForeignPropAnnualSubmissionInvalidBodyResponse |
      | createAmendForeignPropAnnualSubmissionEmptyBodyRequestV2       | None                        | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED                    |
      | createAmendForeignPropAnnualSubmissionDefaultV2                | TYPE_OF_BUSINESS_INCORRECT  | 400  | body  | PROPERTY_BUSINESS_V2_RULE_TYPE_OF_BUSINESS_INCORRECT      |
      | createAmendForeignPropAnnualSubmissionDefaultV2                | NOT_FOUND                   | 404  | body  | MATCHING_RESOURCE_NOT_FOUND                               |
