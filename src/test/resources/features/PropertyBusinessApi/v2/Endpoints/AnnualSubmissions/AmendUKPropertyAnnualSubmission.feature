@AmendUKPropertyAnnualSubmission @PropertyBusinessApiV2 @PropertyBusinessApi @All

Feature: Create or Amend a UK Property Annual Submission V2

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Create or Amend a UK Property Annual Submission for <Scenario>

    When a request is made to PUT to url: UKPropertyAnnualSubmissionUrl, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                                         | Scenario                    | Code | Item  | Response                                              |
      | createAmendUKPropAnnualSubmissionDefault                        | None                        | 200  | model | HateoasLinks                                          |
      | createAmendUKPropAnnualSubmissionMinimumFields                  | None                        | 200  | model | HateoasLinks                                          |
      | createAmendUKPropAnnualSubmissionValueErrorsRequest             | None                        | 400  | body  | createAmendUKPropAnnualSubmissionValueErrorsResponse  |
      | createAmendUKPropAnnualSubmissionInvalidBodyRequest             | None                        | 400  | body  | createAmendUKPropAnnualSubmissionInvalidBodyResponse  |
      | createAmendUKPropAnnualSubmissionEmptyBodyRequest               | None                        | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED                |
      | createAmendUKPropAnnualSubmissionDefault                        | TYPE_OF_BUSINESS_INCORRECT  | 400  | body  | PROPERTY_BUSINESS_V2_RULE_TYPE_OF_BUSINESS_INCORRECT  |
      | createAmendUKPropAnnualSubmissionRulePropIncomeAllowanceRequest | None                        | 400  | body  | RULE_PROPERTY_INCOME_ALLOWANCE                        |