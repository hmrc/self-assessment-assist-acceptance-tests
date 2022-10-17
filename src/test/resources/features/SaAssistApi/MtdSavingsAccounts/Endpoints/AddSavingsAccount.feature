@AddSavings @MtdSavingsAccounts @All @AllSA

Feature: Add a UK savings account

  Scenario: Setup user

    Given an individual is authorised
    And I set the API version to 2.0

  Scenario Outline: Add savings account with name <RequestBody>

    When a request is made to POST to url: AddSavingsAccount, with the JSON body: <RequestBody>, and the gov-test-scenario: None
    Then the response code is <Code>
    And the response <Item> is <Response>
    And the X-CorrelationId header is not empty

    Examples:
    | RequestBody                  | Code | Item  | Response                   |
    | SavingsName32Characters      | 201  | model | AddSavingsAccountResponse  |
    | SavingsNameValidSymbols      | 201  | model | AddSavingsAccountResponse  |
    | SavingsNameSpace             | 201  | model | AddSavingsAccountResponse  |
    | SavingsName33Characters      | 400  | body  | FORMAT_ACCOUNT_NAME        |
    | SavingsNameInvalidSymbols    | 400  | body  | FORMAT_ACCOUNT_NAME        |
    | SavingsNameEmpty             | 400  | body  | FORMAT_ACCOUNT_NAME        |
    | SavingsNameEmojis            | 400  | body  | FORMAT_ACCOUNT_NAME        |
    | SavingsNameForeignCharacters | 400  | body  | FORMAT_ACCOUNT_NAME        |
