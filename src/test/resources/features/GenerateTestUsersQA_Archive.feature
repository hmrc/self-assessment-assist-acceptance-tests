#GenerateTestUsersQA

Feature: Generate access tokens for given nino and mtditid

  Scenario Outline: Generate QA access tokens

    Then generate an access token for <affinityGroup> with nino <nino> and mtditid <mtditid>

    Examples:
    | affinityGroup | nino      | mtditid         |
    # Nov 2020: R3.3 SA Accounts API (Payments and Charges)
    | Individual    | PW012233A | XGIT00000000829 |
    | Individual    | PW067033A | XQIT00000001254 |
    | Individual    | PW069733A | XTIT00000001281 |
    | Individual    | RC101011A | XTIT00000002431 |
    # Nov 2020: R4 Tax Calc Fields (Dec 2020 release)
    | Individual    | SK011533A | XEIT00000002277 |


  Scenario: Close browser

    Then close the browser
