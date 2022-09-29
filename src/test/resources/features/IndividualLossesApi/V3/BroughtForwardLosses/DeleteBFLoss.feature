@DeleteLosses @BroughtForwardLosses @IndividualLossesApi @IndividualLossesApiV3 @All

Feature: Delete a brought forward loss

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Delete Brought Forward Loss with Gov-Test-Scenario <Gov-Test-Scenario>

    When a request is made to DELETE to url: DeleteBFLossesUrl, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response body is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | Gov-Test-Scenario              | Code | Response                            |
      | None                           | 204  | empty                               |
      | DELETE_AFTER_FINAL_DECLARATION | 403  | RULE_DELETE_AFTER_FINAL_DECLARATION |
      | NOT_FOUND                      | 404  | MATCHING_RESOURCE_NOT_FOUND         |
