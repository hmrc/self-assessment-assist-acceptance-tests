@RetrieveSaMessages @IndividualCalculationApiV2 @All

Feature: Retrieve Self-Assessment Messages

  Background: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve self-assessment messages for <Scenario>


    When a request is made to GET to url: RetrieveSaMessagesUrl, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Scenario                     | Code | Item  | Response                          |
      | None                         | 200  | model | RetrieveSAMessagesV2              |
      | MESSAGES_INFO                | 200  | model | RetrieveSAMessagesV2              |
      | MESSAGES_INFO_WARNINGS       | 200  | model | RetrieveSAMessagesV2              |
      | MESSAGES_WARNINGS            | 200  | model | RetrieveSAMessagesV2              |
      | MESSAGES_WARNINGS_ERRORS     | 200  | model | RetrieveSAMessagesV2              |
      | MESSAGES_ERRORS              | 200  | model | RetrieveSAMessagesV2              |
      | NOT_FOUND                    | 404  | body  | MATCHING_RESOURCE_NOT_FOUND       |
      | NO_MESSAGES_PRESENT          | 404  | body  | NO_MESSAGES_PRESENT               |
      | UNMATCHED_STUB_ERROR         | 400  | body  | RULE_INCORRECT_GOV_TEST_SCENARIO  |
