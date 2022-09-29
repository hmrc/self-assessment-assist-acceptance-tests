@AmendForeignPropertyAnnualSubmission @PropertyBusinessApiV1 @PropertyBusinessApi  @All

Feature: Amend a Foreign Property Annual Submission

  Background: Setup

    Given an individual is authorised
    And I set the API version to 1.0

  Scenario Outline: Amend a Foreign Property Annual Submission for <Scenario>

    When a request is made to PUT to url: ForeignPropertyAnnualSubmissionUrl, with the JSON body: <Request>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Request                                     | Scenario  | Code | Item  | Response                                 |
      | amendAnnualSubmissionDefault                | None      | 200  | model | HateoasLinks                             |
      | amendAnnualSubmissionWithMultipleProperties | None      | 200  | model | HateoasLinks                             |
      | amendAnnualSubmissionMinimumFields          | None      | 200  | model | HateoasLinks                             |
      | amendAnnualSubmissionValueErrorsRequest     | None      | 400  | body  | amendAnnualSubmissionValueErrorsResponse |
      | amendAnnualSubmissionMissingErrorsRequest   | None      | 400  | body  | RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED   |