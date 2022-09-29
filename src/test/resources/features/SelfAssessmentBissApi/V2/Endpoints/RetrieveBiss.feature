@SaBissApiV2 @SaBissApi @All

Feature: Retrieve A Business Income Source Summary

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Retrieve Biss for <Scenario>

    When a request is made to GET to url: <Url>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
     | Url                          | Scenario                    | Code | Item  | Response                              |
     | RetrieveSEBissUrlV2          | None                        | 200  | model | RetrieveBissResponseV2                |
     | RetrieveSEBissUrlV2          | LOSS                        | 200  | model | RetrieveBissResponseV2                |
     | RetrieveSEBissUrlV2          | NO_INCOME_SUBMISSIONS_EXIST | 403  | body  | BISS_RULE_NO_INCOME_SUBMISSIONS_EXIST |
     | RetrieveSEBissUrlV2          | NOT_FOUND                   | 404  | body  | MATCHING_RESOURCE_NOT_FOUND           |
     | RetrieveUkPropBissUrlV2      | None                        | 200  | model | RetrieveBissResponseV2                |
     | RetrieveUkPropBissUrlV2      | LOSS                        | 200  | model | RetrieveBissResponseV2                |
     | RetrieveUkPropBissUrlV2      | NO_INCOME_SUBMISSIONS_EXIST | 403  | body  | BISS_RULE_NO_INCOME_SUBMISSIONS_EXIST |
     | RetrieveUkPropBissUrlV2      | NOT_FOUND                   | 404  | body  | MATCHING_RESOURCE_NOT_FOUND           |
     | RetrieveForeignPropBissUrlV2 | None                        | 200  | model | RetrieveBissResponseV2                |
     | RetrieveForeignPropBissUrlV2 | LOSS                        | 200  | model | RetrieveBissResponseV2                |
     | RetrieveForeignPropBissUrlV2 | NO_INCOME_SUBMISSIONS_EXIST | 403  | body  | BISS_RULE_NO_INCOME_SUBMISSIONS_EXIST |
     | RetrieveForeignPropBissUrlV2 | NOT_FOUND                   | 404  | body  | MATCHING_RESOURCE_NOT_FOUND           |


