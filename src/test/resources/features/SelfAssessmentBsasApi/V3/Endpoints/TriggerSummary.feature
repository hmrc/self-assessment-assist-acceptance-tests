@SaBsasApi @All @V3

Feature: Trigger a Business Source Adjustable Summary

  Scenario: Setup

    Given an individual is authorised
    And I set the API version to 3.0

  Scenario Outline: Trigger a Business Source Adjustable Summary for <Scenario>

    When a request is made to POST to url: TriggerBsasUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
      | RequestBody                              | Scenario                    | Code | Item  | Response                            |
      | V3_TRIGGER_BSAS_SELF_EMPLOYMENT          | None                        | 200  | model | TriggerBsasResponseV3               |
      | V3_TRIGGER_BSAS_UK_FHL_PROPERTY          | None                        | 200  | model | TriggerBsasResponseV3               |
      | V3_TRIGGER_BSAS_UK_NON_FHL_PROPERTY      | None                        | 200  | model | TriggerBsasResponseV3               |
      | V3_TRIGGER_BSAS_FOREIGN_PROPERTY         | None                        | 200  | model | TriggerBsasResponseV3               |
      | V3_TRIGGER_BSAS_FOREIGN_PROPERTY_FHL_EEA | None                        | 200  | model | TriggerBsasResponseV3               |
      | V3_TRIGGER_BSAS_SELF_EMPLOYMENT          | NO_ACCOUNTING_PERIOD        | 403  | body  | V3_BSAS_RULE_NO_ACCOUNTING_PERIOD   |
      | V3_TRIGGER_BSAS_SELF_EMPLOYMENT          | PERIODIC_DATA_INCOMPLETE    | 403  | body  | V3_RULE_PERIODIC_DATA_INCOMPLETE    |
      | V3_TRIGGER_BSAS_SELF_EMPLOYMENT          | ACCOUNTING_PERIOD_NOT_ENDED | 403  | body  | V3_RULE_ACCOUNTING_PERIOD_NOT_ENDED |
      | V3_TRIGGER_BSAS_SELF_EMPLOYMENT          | NOT_FOUND                   | 404  | body  | MATCHING_RESOURCE_NOT_FOUND         |
