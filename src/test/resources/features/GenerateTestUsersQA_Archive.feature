#GenerateTestUsersQA

Feature: Utility to generate access tokens for given nino and mtditid

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
    | Individual    | SK011433A | XDIT00000002276 |
    | Individual    | XS209220D | XTIT00000002334 |
    | Individual    | XE230496A | XVIS00000003706 |
    | Individual    | SK020333A | XQIT00000002331 |
    | Individual    | SK011333A | XCIT00000002275 |
    | Individual    | SK020233A | XPIT00000002330 |
    # Oct 2020: Pension Reliefs (2020-21 in year)
    | Individual    | ZP241208B | XNIT00000002126 |
    | Individual    | SC064249C | XTIT00000002148 |
    # Oct 2020: Pension Charges (2020-21 in year)
    | Individual    | ZM950285C | XWIT00000002175 |
    | Individual    | YG482054B | XBIT00000002177 |
    | Individual    | TG415673C | XCIT00000002178 |
    # Oct 2020: State Benefits (2020-21 in year)
    | Individual    | BB417489D | XTIT00000002253 |
    | Individual    | BP274037D | XZIT00000002254 |
    # Oct 2020: State Benefits (2019-20 EOY)
    | Individual    | MN053787D | XQIT00000001859 |
    # Oct 2020: Pension Relief (2019-20 EOY)
    | Individual    | XG013610D | XMIT00000001693 |
    | Individual    | AR745188C | XNIT00000001694 |
    # Oct 2020: Pension Charges (2019-20 EOY)
    | Individual    | BJ291573B | XRIT00000001698 |
    | Individual    | RE255784D | XYIT00000001695 |
    | Individual    | HA856609C | XQIT00000001697 |
    # Oct 2020: Multiple Businesses and Obligations
    | Individual    | OY523704B | XNIT00000001686 |
    | Individual    | HB642677C | XJIT00000001496 |
    | Individual    | ZN454513D | XQIT00000001505 |
    | Individual    | PS717832A | XZIT00000001525 |
    # Aug 2020: Amend Loss Claim Order
    | Individual    | RP741095B | XWIT00000001446 |
    | Individual    | PW065333A | XHIT00000001205 |
    | Individual    | PW065433A | XJIT00000001207 |
    # Aug 2020: CIS Tax Calc
    | Individual    | PW012333A | XCIT00000000833 |
    # Jan 2020: BISS
    | Individual    | PW049233A | XFIT00000000909 |
    | Individual    | PW047133A | XAIT00000000912 |
    | Individual    | PW049333A | XFIT00000000925 |
    # Jan 2020: BSAS(ASC)
    | Individual    | PW047333A | XAIT00000000904 |
    | Individual    | PW047433A | XCIT00000000914 |
    | Individual    | PW047533A | XDIT00000000915 |
    | Individual    | PW048933A | XXIT00000000928 |
    | Individual    | PW047733A | XFIT00000000917 |
    | Individual    | PW047833A | XGIT00000000918 |
    | Individual    | PW047933A | XHIT00000000919 |
    | Individual    | PW048133A | XBIT00000000921 |
    | Individual    | PW048333A | XGIT00000000926 |
    | Individual    | PW048433A | XHIT00000000927 |
    | Individual    | PW048533A | XCIT00000000922 |
    | Individual    | PW048633A | XDIT00000000923 |
    | Individual    | PW048733A | XBIT00000000913 |
    | Individual    | PW048833A | XEIT00000000924 |
    # Oct 2019: Tax Calc
    | Individual    | AE154815C | XZIT00000000820 |
    | Individual    | AA000039C | XWIT00000000822 |
    | Individual    | JR729479B | XMIT00000000610 |
    | Individual    | NA000364C | XTIT00000000633 |
    | Individual    | YP795315A | XZIT00000000634 |
    | Individual    | GY003436D | XWIT00000000636 |
    | Individual    | ZR898913B | XQIT00000000703 |
    | Individual    | HY200074D | XEIT00000000592 |
    | Individual    | JT162014B | XRIT00000000720 |
    | Individual    | YP992615C | XSIT00000000632 |
    | Individual    | PW012233A | XGIT00000000829 |
    | Individual    | SY379571A | XNIT00000000611 |
    | Individual    | PW012333A | XCIT00000000833 |
    # Aug 2019: Losses and Claims Self-employment
    | Individual    | PW001333A | XHIT00000000765 |
    | Individual    | PW001433A | XXIT00000000766 |
    # Aug 2019: Losses and Claims UK Property
    | Individual    | PW001733A | XLIT00000000769 |
    | Individual    | PW001533A | XKIT00000000768 |
    # Sept 2018 E2E: Self-employment
    | Individual    | MM383015D | XPIT00000000613 |
    | Individual    | RX211382B | XJIT00000000597 |
    | Individual    | SY379571A | XNIT00000000611 |
    | Individual    | JX513115A | XZIT00000000618 |
    # Sept 2018 E2E: UK Property
    | Individual    | JR729479B | XMIT00000000610 |
    | Individual    | NA000364C | XTIT00000000633 |
    | Individual    | YP795315A | XZIT00000000634 |
    | Individual    | GY003436D | XWIT00000000636 |
    # Oct 2018 EOPS - SE, UKP
    | Individual    | MM383015D | XPIT00000000613 |
    | Individual    | NA000364C | XTIT00000000633 |
    #    # Unknown
    | Individual    | KM781313D | XDIT00000680641 |
    # Tax Calc v3.2
    | Individual    | NG442614D | XPIT00000000184 |
    | Individual    | HW392714B | XKIT00000000252 |
    | Individual    | NG543013D | XSIT00000000187 |
    | Individual    | NG899113D | XDIT00000000205 |
    | Individual    | NG940613D | XJIT00000000243 |
    | Individual    | AA204513C | XDIT00000680641 |

  Scenario: Close browser

    Then close the browser
