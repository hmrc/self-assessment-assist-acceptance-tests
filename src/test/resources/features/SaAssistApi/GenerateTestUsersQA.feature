@GenerateTestUsersQA

Feature: Utility to generate access tokens for given nino and mtditid

  Scenario Outline: Generate QA access tokens

    Then generate an access token for nino <nino> with desc <desc>

    Examples:
      | nino       | desc                                                       |
      # 2022 Release 7c
      | PW871633A  | R7c Tax Calc CL222 CL224                                   |
      | PW871733A  | R7c Tax Calc CL222 CL224  1xstatePensionLumpSum2xother     |
      | PW871833A  | R7c Tax Calc CL222 CL224  No statePensionLumpSum           |
      | PW872433A  | R7c Tax Calc CL222 CL224  Only statePensionLumpSum         |
      | AT960395D  | R7c Coding Out Underpayments                               |
      | NW893857C  | R7c Coding Out Underpayments                               |
      | JY688141A  | R7c Coding Out Underpayments                               |
      | OB678244A  | R7c No Coding Out Underpayments                            |
      | HR699779B  | R7c No Coding Out Underpayments                            |
#      | ZC855078C | R7c Coding Out Underpayments                 |
#      | GZ351916B | R7c Coding Out Underpayments                 |
#      | JG089965D | R7c Coding Out Underpayments                 |
#      | JA780032B | R7c Coding Out Underpayments                 |
#      | PW851333A | R7c Tax Calc CL222 CL224                     |

#       # 2022 Release 7b
#      | PW438033A | R7b Tax Calc CL176 Retest                    |
#      | BE396033A | Tax Calc                                     |
#      | BE294833A | Tax Calc                                     |
#      | BE115333A | No Tax Calc                                  |
#
#      #R6 IF Migration endpoints
#      | BE252233A | HMRC Held Employment 2020-21                 |
#      | KC501690C | Customer Employment 2020-21                  |
#
#      # February 2022 Release 7a - Round 2
#      | BE009133A | Self Employment 2020-21                      |
#      | BE009333A | Self Employment 2020-21                      |
#      | BE011733A | Self Employment 2020-21                      |
#      | BE034833A | UK Property 2020-21                          |
#      | BE034933A | UK Property 2020-21                          |
#      | BE035033A | Foreign Property 2020-21                     |
#      | BE035133A | Foreign Property 2020-21                     |
#      | BE035333A | UK Property 2019-20                          |
#      | BE035433A | UK Property 2019-20                          |
#      | BE035533A | Foreign Property 2019-20                     |
#      | BE035633A | Foreign Property 2019-20                     |

      # February 2022 Release 7a - Round 1
#      | BE017133A | UK Property 2019-20                          |
#      | BE017233A | UK Property 2019-20                          |
#      | BE017333A | UK Property 2019-20                          |
#      | BE017433A | Foreign Property 2019-20                     |
#      | BE018533A | Foreign Property 2019-20                     |
#      | BE018633A | Foreign Property 2019-20                     |
#      | BE009133A | Self Employment 2020-21                      |
#      | BE009333A | Self Employment 2020-21                      |
#      | BE011733A | Self Employment 2020-21                      |
#      | BE011833A | Self Employment 2020-21                      |
#      | BE011933A | Self Employment 2020-21                      |
#      | BE013433A | UK Property 2020-21                          |
#      | BE013633A | UK Property 2020-21                          |
#      | BE013833A | UK Property 2020-21                          |
#      | BE014033A | UK Property 2020-21                          |
#      | BE014233A | UK Property 2020-21                          |
#      | BE014433A | Foreign Property 2020-21                     |
#      | BE014533A | Foreign Property 2020-21                     |
#      | BE014633A | Foreign Property 2020-21                     |
#      | BE014733A | Foreign Property 2020-21                     |
#      | BE014833A | Foreign Property 2020-21                     |

      # October 2021 Release 6
#      | RC101011A | As Is (test IF without new fields)           |
#      | PW301133A | Pension Charges                              |
#      | PW301233A | Crystallisation                              |
#      | PW302633A | State Benefits                               |
#      | PW302833A | State Benefits                               |
#      | PW300133A | CGT with PPD data                            |
#      | PW300333A | CGT 2 "single property" disposals            |
#      | PW300733A | CGT 2 "multiple property" disposals          |
#      | PW222333A | Employment with Finances /2020-21            |
#      | PW155433A | Calc R6                                      |
#      | PW211333A | Calc R6                                      |
#      | PW301533A | Calc R6                                      |
#      | PW211733A | Calc R6                                      |
#      | PW301733A | Calc R6                                      |
#      | LB254867B | Calc R6                                      |
#      | PW301533A | Calc R6                                      |
#      | OB629638A | Calc R6                                      |
#      | LM210728D | Marriage Allowance                           |
#      | BT643319A | Marriage Allowance                           |
#      | AW791493C | Marriage Allowance                           |
#      | EM836006A | Marriage Allowance                           |
#      | PW216033A | Marriage Allowance                           |
#      | OL137372D | Marriage Allowance                           |
#      | PW155433A | Coding Out                                   |
#      | PW178133A | Coding Out                                   |
#      | PW179033A | Non PAYE Income                              |
#      | PW172633A | Non PAYE Income                              |

      # March 2021 Release 5
#      | PW158933A | Calc                                         |
#      | PW136133A | Calc                                         |
#      | PW138033A | Calc                                         |
#      | PW138633A | Calc                                         |
#      | PW142933A | Calc                                         |
#      | JH339351D | v1.0 Calc                                    |
#      | PW134633A | v1.0 Calc                                    |
#      | PW132833A | v1.0 Calc                                    |
#      | PW135133A | v1.0 Calc                                    |
#      | PW135033A | v1.0 Calc                                    |
#      | PW133333A | v1.0 Calc                                    |
#      | PW133233A | v1.0 Calc                                    |
#      | PW132033A | v1.0 Calc                                    |
#      | PW132733A | v1.0 Calc                                    |
#      | HE010217C | v1.0 Calc                                    |
#      | PW133233A | v2.0 Calc                                    |
#      | PW132033A | v2.0 Calc                                    |
#      | PW131633A | v2.0 Calc                                    |
#      | WT939689B | v2.0 Calc                                    |
#      | HE010217C | v2.0 Calc                                    |
#      | PW132833A | v2.0 Calc                                    |
#      | PW132233A | v2.0 Calc                                    |
#      | MS359686D | v2.0 Calc                                    |
#      | WT939689B | v2.0 Calc                                    |
#      | PW136733A | v2.0 Calc                                    |
#      | EG455782A | Calc 2021-22 - TC001 - Insurance Policies    |
#      | CE353079D | Calc 2021-22 - TC001a - Insurance Policies   |
#      | EY568932D | Calc 2021-22 - TC002 - Employments Income    |
#      | WP580281C | Calc 2021-22 - TC003 - Other Income          |
#      | OX870804B | Calc 2021-22 - TC004 - Other Expenses        |
#      | TX412523A | Calc 2021-22 - TC005 - Deductions            |
#      | KH721379C | Calc 2021-22 - TC006 - Investment Reliefs    |
#      | CT545749B | Calc 2021-22 - TC007 - Other Reliefs         |
#      | EP988269C | Calc 2021-22 - TC008 - Foreign Reliefs       |
#      | KR749863B | Calc 2021-22 - TC010 - Savings Income        |
#      | HC620428C | Calc 2021-22 - TC011 - Dividends             |
#      | BE806352B | Calc 2021-22 - TC012 - Pensions              |
#      | PW148833A | EOPS - UKP RULE_CONSOLIDATED_EXPENSES        |
#      | PW147433A | EOPS - RULE_NON_FHL_PRIVATE_USE_ADJUSTMENT   |
#      | PW149933A | EOPS - RULE_FHL_PRIVATE_USE_ADJUSTMENT       |
#      | PW141933A | EOPS - NON_MATCHING_PERIOD                   |
#      | PW151533A | EOPS - RULE_CLASS4_OVER_16                   |
#      | PW154933A | EOPS - RULE_CLASS4_PENSION_AGE               |
#      | PW149333A | EOPS - SE RULE_CONSOLIDATED_EXPENSES         |
#      | PW155333A | EOPS - RULE_MISMATCHED_START_DATE            |
#      | PW155633A | EOPS - RULE_MISMATCHED_END_DATE              |
#      | PW141833A | Losses - Contains multiple income sources    |
#      | PW141533A | Intent to Crystallise                        |
#      | PW141433A | Intent to Crystallise                        |
#      | PW141633A | Crystallisation                              |
#      | PW141733A | Crystallisation                              |
#      | PW131133A | Crystallisation Errors                       |
#      | PW130233A | Crystallisation Errors                       |
#      | PW130533A | Crystallisation Errors                       |
#      | PW141933A | EOPS - NON_MATCHING_PERIOD 19-04-07/20-04-05 |
#      | PW105633A | Disclosures - delete error scenario          |
#      | XP121214C | State Benefits - with Financial Data         |
#      | EE537604B | State Benefits - with No Financial Data      |
#      | PW104833A | State Benefits - No HMRC Held Data           |
#      | PW106133A | Employments - No HMRC Held Data              |
#      | PW106233A | Employments - No HMRC Held Data              |
#      | PW106333A | Employments - No HMRC Held Data              |
#      | HW048618A | Employments - HMRC Held Data  19/20          |
#      | PW106433A | Employment Expenses - No HMRC Held Data      |
#      | PW106533A | Employment Expenses - No HMRC Held Data      |
#      | PW106933A | Employment Expenses - HMRC Held Data 19/20   |
#      | PW108233A | 2019-20 - Self-Employment                    |
#      | PW108333A | 2019-20 - Self-Employment                    |
#      | PW108433A | 2019-20 - Self-Employment                    |
#      | PW108533A | 2019-20 - Self-Employment                    |
#      | PW108633A | 2019-20 - Self-Employment                    |
#      | PW108733A | 2019-20 - UK Property                        |
#      | PW108833A | 2019-20 - UK Property                        |
#      | PW108933A | 2019-20 - UK Property                        |
#      | PW109033A | 2019-20 - UK Property                        |
#      | PW101833A | 2021-22 - Self-Employment                    |
#      | PW101933A | 2021-22 - Self-Employment                    |
#      | PW102033A | 2021-22 - Self-Employment                    |
#      | PW102133A | 2021-22 - Self-Employment                    |
#      | PW102233A | 2021-22 - Self-Employment                    |
#      | PW102333A | 2021-22 - Self-Employment                    |
#      | PW102433A | 2021-22 - Self-Employment                    |
#      | PW102533A | 2021-22 - Self-Employment                    |
#      | PW102633A | 2021-22 - Self-Employment                    |
#      | PW102733A | 2021-22 - Self-Employment                    |
#      | PW102833A | 2021-22 - Foreign Property                   |
#      | PW102933A | 2021-22 - Foreign Property                   |
#      | PW103033A | 2021-22 - Foreign Property                   |
#      | PW103133A | 2021-22 - Foreign Property                   |
#      | PW103233A | 2021-22 - Foreign Property                   |
#      | PW103333A | 2021-22 - Foreign Property                   |
#      | PW103433A | 2021-22 - Foreign Property                   |
#      | PW103533A | 2021-22 - Foreign Property                   |
#      | PW103633A | 2021-22 - Foreign Property                   |
#      | JB100013A | SA Accounts API - charge due                 |
#      | MK000047B | SA Accounts API - charges overdue            |
#      | MK000025B | SA Accounts API - payment allocations        |
#      | WE714700A | XML responses investigation (19/20)          |
#      | HE411104D | XML responses investigation (19/20)          |

  Scenario: Close browser

    Then close the browser
