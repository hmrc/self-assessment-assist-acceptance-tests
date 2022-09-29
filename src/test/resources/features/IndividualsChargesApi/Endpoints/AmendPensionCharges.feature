@AmendPensionCharges @IndividualsChargesApi @Staging
Feature: Amend Pension Charges

  Background:
    Given an individual is authorised on the API Platform
    And I set the API version to 1.0

  Scenario Outline: Successfully amend Pensions Charges with request body <RequestBody> and Gov-Test-Scenario <Gov-Test-Scenario>
    When a request is made to PUT to url: PensionChargesUrl, with the JSON body: <RequestBody>, and the gov-test-scenario: <Gov-Test-Scenario>
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty


    Examples:
      | RequestBody                                                 | Gov-Test-Scenario  | Code | Item    | Response      |
      | AmendIndividualsChargesPensionsMaximum                      | None               | 200  | model   | HateoasLinks  |
      | AmendIndividualsChargesPensionsMinimum                      | None               | 200  | model   | HateoasLinks  |
