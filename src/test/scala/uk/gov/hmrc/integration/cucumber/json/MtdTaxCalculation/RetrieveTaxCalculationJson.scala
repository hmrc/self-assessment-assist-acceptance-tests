/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.MtdTaxCalculation

object RetrieveTaxCalculationJson {

  val taxCalculationV2AllFieldsTestOnly: String =
    """
      |{
      |   "year": 2018,
      |   "intentToCrystallise": false,
      |   "crystallised": false,
      |   "validationMessageCount": 2,
      |   "incomeTaxAndNicYTD": 29063.44,
      |   "nationalRegime": "UK",
      |   "taxableIncome": {
      |      "employments": {
      |         "totalIncome": 102.12,
      |         "totalPay": 103.12,
      |         "totalBenefitsAndExpenses": 104.12,
      |         "totalAllowableExpenses": 105.12,
      |         "employment": [
      |            {
      |               "employmentId": "XMIS00000000102",
      |               "netPay": 107.12,
      |               "benefitsAndExpenses": 108.12,
      |               "allowableExpenses": 109.99
      |            }
      |         ]
      |      },
      |      "selfEmployments": {
      |         "totalIncome": 95200.12,
      |         "selfEmployment": [
      |            {
      |               "selfEmploymentId": "XTIS00000000203",
      |               "taxableIncome": 94800.12,
      |               "finalised": false,
      |               "losses": 1.24
      |            }
      |         ]
      |      },
      |      "ukProperty": {
      |         "totalIncome": 113.12,
      |         "nonFurnishedHolidayLettingsTaxableProfit": 114.12,
      |         "furnishedHolidayLettingsTaxableProfit": 115.12,
      |         "finalised": false,
      |         "nonFurnishedHolidayLettingsLoss": 116.12,
      |         "furnishedHolidayLettingsLoss": 117.12
      |      },
      |      "savings": {
      |         "totalIncome": 116.99,
      |         "taxedAccounts": [
      |         {
      |             "gross": 100.97,
      |             "savingsAccountId": "SAV100000000115",
      |             "name": "Savings account 1",
      |             "net": 100.96,
      |             "taxDeducted": 100.95
      |         }
      |         ],
      |         "totalTaxedInterestIncome": 200.91,
      |         "totalUntaxedInterestIncome": 200.92,
      |         "untaxedAccounts": [
      |         {
      |         "gross": 100.97,
      |         "savingsAccountId": "SAV100000000115",
      |         "name": "Savings account 2"
      |         }
      |         ]
      |      },
      |      "ukDividends": {
      |         "totalIncome": 116.99,
      |         "otherUkDividends": 217.98,
      |         "ukDividends": 216.98
      |      },
      |      "totalIncomeReceived": 90030.12,
      |      "allowancesAndDeductions": {
      |         "totalAllowancesAndDeductions": 11500.12,
      |         "giftOfInvestmentsAndPropertyToCharity": 311.12,
      |         "apportionedPersonalAllowance": 11501.12
      |      },
      |      "totalTaxableIncome": 78500.12
      |   },
      |   "incomeTax": {
      |      "taxableIncome": 78531.12,
      |      "payAndPensionsProfit": {
      |         "totalAmount": 24700.12,
      |         "band": [
      |            {
      |               "name": "ART",
      |               "rate": 17.51,
      |               "threshold": 45016,
      |               "apportionedThreshold": 45011,
      |               "income": 33510.12,
      |               "amount": 6340.12,
      |               "apportionedBandLimit": 100000,
      |               "bandLimit": 100000
      |            }
      |         ],
      |         "personalAllowanceUsed": 14.21,
      |         "taxableIncome": 90031.12
      |      },
      |      "savingsAndGains": {
      |         "totalAmount": 24700,
      |         "band":[
      |            {
      |               "name": "BRT",
      |               "rate": 18.15,
      |               "threshold": 45020,
      |               "apportionedThreshold": 45010,
      |               "income": 33550.12,
      |               "amount": 6700.12,
      |               "apportionedBandLimit": 100000,
      |               "bandLimit": 100000
      |            }
      |         ],
      |         "personalAllowanceUsed": 12.16,
      |         "taxableIncome": 9002.36
      |      },
      |      "dividends": {
      |         "totalAmount": 24700.15,
      |         "band": [
      |            {
      |               "name": "ZRT",
      |               "rate": 19.12,
      |               "threshold": 47100,
      |               "apportionedThreshold": 48100,
      |               "income": 33560.12,
      |               "amount": 6900.12,
      |               "apportionedBandLimit": 100000,
      |               "bandLimit": 100000
      |            }
      |         ],
      |         "personalAllowanceUsed": 412.12,
      |         "taxableIncome": 97900.12
      |      },
      |      "allowancesAndReliefs":{
      |      "totalAllowancesAndReliefs": 52.13,
      |      "propertyFinanceRelief": 53.13
      |      },
      |      "totalBeforeReliefs": 24740.12,
      |      "totalAfterReliefs": 24700.13,
      |      "giftAid":{
      |         "paymentsMade": 100.13,
      |         "rate": 10.13,
      |         "taxableAmount": 20.13
      |      },
      |      "totalAfterGiftAid": 12.13,
      |      "totalIncomeTax": 24750.12,
      |      "residentialFinanceCosts": {
      |      "amountClaimed": 1123.12,
      |      "allowableAmount": 1123.13,
      |      "rate": 10.88
      |      }
      |   },
      |   "nic":{
      |      "totalNic": 4363.44,
      |      "class2": {
      |         "amount": 148.27,
      |         "weekRate": 2.85,
      |         "weeks": 51,
      |         "limit": 6026,
      |         "apportionedLimit": 6022
      |      },
      |      "class4": {
      |         "totalAmount": 4215.24,
      |         "band": [
      |            {
      |               "name": "ZRT",
      |               "rate": 12.41,
      |               "threshold": 8164,
      |               "apportionedThreshold": 8163,
      |               "income": 8164.15,
      |               "amount": 4.14
      |            }
      |         ]
      |      }
      |   },
      |   "totalBeforeTaxDeducted": 11241.45,
      |   "taxDeducted": {
      |      "savings": 1451.33,
      |      "ukLandAndProperty": 1451.32,
      |      "totalTaxDeducted": 12411.32
      |   },
      |   "eoyEstimate": {
      |      "selfEmployments": [
      |         {
      |            "selfEmploymentId": "XTIS00000000213",
      |            "taxableIncome": 90128.32,
      |            "supplied": true,
      |            "finalised": false
      |         }
      |      ],
      |      "ukProperty": {
      |         "taxableIncome": 90128.33,
      |         "supplied": true,
      |         "finalised": false
      |      },
      |      "savings": [
      |         {
      |            "savingsAccountId": "SAV100000000215",
      |            "taxableIncome": 90128.34,
      |            "supplied": true
      |         }
      |      ],
      |      "ukDividends": {
      |         "taxableIncome": 90128.35,
      |         "supplied": true,
      |         "finalised": false
      |      },
      |      "totalTaxableIncome": 90061.24,
      |      "incomeTaxAmount": 24700.62,
      |      "nic2": 148.28,
      |      "nic4": 4215.24,
      |      "totalNicAmount": 4363.44,
      |      "incomeTaxNicAmount": 29063.44
      |   },
      |   "calculationMessageCount": 1,
      |   "calculationMessages": [
      |      {
      |         "type": "information",
      |         "text": "Your basic rate limit has been increased by £5.00 to £10.00 for Gift Aid payments."
      |      }
      |   ],
      |   "annualAllowances": {
      |      "personalAllowance": 11531,
      |      "personalAllowanceThreshold": 100200,
      |      "reducedPersonalAllowance": 234,
      |      "giftAidExtender": 231
      |   }
      |}
    """.stripMargin

  val taxCalculationV2WithWarnings: String =
    """
      |{
      |    "year": 2019,
      |    "intentToCrystallise": false,
      |    "crystallised": false,
      |    "validationMessageCount": 14,
      |    "incomeTaxAndNicYTD": 765.39,
      |    "nationalRegime": "UK",
      |    "taxableIncome": {
      |        "selfEmployments": {
      |            "totalIncome": 5197,
      |            "selfEmployment": [
      |                {
      |                    "selfEmploymentId": "XXID00000000001",
      |                    "taxableIncome": 5197
      |                }
      |            ]
      |        },
      |        "totalIncomeReceived": 5197,
      |        "allowancesAndDeductions": {
      |            "totalAllowancesAndDeductions": 2955,
      |            "apportionedPersonalAllowance": 2955
      |        },
      |        "totalTaxableIncome": 2242
      |    },
      |    "incomeTax": {
      |        "taxableIncome": 2242,
      |        "payAndPensionsProfit": {
      |            "totalAmount": 448.4,
      |            "band": [
      |                {
      |                    "name": "BRT",
      |                    "rate": 20,
      |                    "threshold": 46350,
      |                    "apportionedThreshold": 11556,
      |                    "income": 2242,
      |                    "amount": 448.4
      |                }
      |            ],
      |            "personalAllowanceUsed": 2955,
      |            "taxableIncome": 5197
      |        },
      |        "totalBeforeReliefs": 448.4,
      |        "totalAfterReliefs": 448.4,
      |        "totalIncomeTax": 448.4
      |    },
      |    "nic": {
      |        "totalNic": 316.99,
      |        "class2": {
      |            "amount": 38.35,
      |            "weekRate": 2.95,
      |            "weeks": 13,
      |            "limit": 6205,
      |            "apportionedLimit": 1547
      |        },
      |        "class4": {
      |            "totalAmount": 278.64,
      |            "band": [
      |                {
      |                    "name": "ZRT",
      |                    "rate": 0,
      |                    "threshold": 8424,
      |                    "apportionedThreshold": 2101,
      |                    "income": 2101,
      |                    "amount": 0
      |                },
      |                {
      |                    "name": "BRT",
      |                    "rate": 9,
      |                    "threshold": 46350,
      |                    "apportionedThreshold": 11556,
      |                    "income": 3096,
      |                    "amount": 278.64
      |                }
      |            ]
      |        }
      |    },
      |    "eoyEstimate": {
      |        "selfEmployments": [
      |            {
      |                "selfEmploymentId": "XXID00000000001",
      |                "taxableIncome": 31615,
      |                "supplied": true
      |            }
      |        ],
      |        "totalTaxableIncome": 31615,
      |        "incomeTaxAmount": 3953,
      |        "nic2": 153.4,
      |        "nic4": 2087.19,
      |        "totalNicAmount": 2240.59,
      |        "incomeTaxNicAmount": 6193.59
      |    },
      |    "calculationMessageCount": 0,
      |    "annualAllowances": {
      |        "personalAllowance": 11850,
      |        "personalAllowanceThreshold": 100000
      |    }
      |}
    """.stripMargin

  val taxCalculationV2SeIncome: String =
    """
      |{
      |   "year": 2018,
      |   "intentToCrystallise": false,
      |   "crystallised": false,
      |   "validationMessageCount": 0,
      |   "incomeTaxAndNicYTD": 29063.44,
      |   "nationalRegime": "UK",
      |   "taxableIncome": {
      |      "selfEmployments": {
      |         "totalIncome": 90000,
      |         "selfEmployment": [
      |            {
      |               "selfEmploymentId": "XTIS00000000208",
      |               "taxableIncome": 90000,
      |               "losses": 0
      |            }
      |         ]
      |      },
      |      "totalIncomeReceived": 90000,
      |      "allowancesAndDeductions": {
      |         "totalAllowancesAndDeductions": 11500,
      |         "apportionedPersonalAllowance": 11500
      |      },
      |      "totalTaxableIncome": 78500
      |   },
      |   "incomeTax": {
      |      "taxableIncome": 78500,
      |      "payAndPensionsProfit": {
      |         "totalAmount": 24700,
      |         "band": [
      |            {
      |               "name": "BRT",
      |               "rate": 20,
      |               "threshold": 45000,
      |               "apportionedThreshold": 45000,
      |               "income": 33500,
      |               "amount": 6700
      |            },
      |            {
      |               "name": "HRT",
      |               "rate": 40,
      |               "threshold": 150000,
      |               "apportionedThreshold": 150000,
      |               "income": 45000,
      |               "amount": 18000
      |            }
      |         ],
      |         "personalAllowanceUsed": 0,
      |         "taxableIncome": 90000
      |      },
      |      "totalBeforeReliefs": 24700,
      |      "totalAfterReliefs": 24700,
      |      "totalIncomeTax": 24700
      |   },
      |   "nic":{
      |      "totalNic": 4363.44,
      |      "class2": {
      |         "amount": 148.2,
      |         "weekRate": 2.85,
      |         "weeks": 52,
      |         "limit": 6025,
      |         "apportionedLimit": 6025
      |      },
      |      "class4": {
      |         "totalAmount": 4215.24,
      |         "band": [
      |            {
      |               "name": "ZRT",
      |               "rate": 0,
      |               "threshold": 8164,
      |               "apportionedThreshold": 8164,
      |               "income": 8164,
      |               "amount": 0
      |            },
      |            {
      |               "name": "BRT",
      |               "rate": 9,
      |               "threshold": 45000,
      |               "apportionedThreshold": 45000,
      |               "income": 36836,
      |               "amount": 3315.24
      |            },
      |            {
      |               "name": "HRT",
      |               "rate": 2,
      |               "threshold": 99999999,
      |               "apportionedThreshold": 99999999,
      |               "income": 45000,
      |               "amount": 900
      |            }
      |         ]
      |      }
      |   },
      |   "eoyEstimate": {
      |      "selfEmployments": [
      |         {
      |            "selfEmploymentId": "XTIS00000000208",
      |            "taxableIncome": 90000,
      |            "supplied": true
      |         }
      |      ],
      |      "totalTaxableIncome": 90000,
      |      "incomeTaxAmount": 24700,
      |      "nic2": 148.2,
      |      "nic4": 4215.24,
      |      "totalNicAmount": 4363.44,
      |      "incomeTaxNicAmount": 29063.44
      |   },
      |   "calculationMessageCount": 0,
      |   "annualAllowances": {
      |      "personalAllowance": 11500,
      |      "personalAllowanceThreshold": 100000
      |   }
      |}
    """.stripMargin

  val taxCalculationV2BvrErrors: String =
    """
      |{
      |    "intentToCrystallise": false,
      |    "crystallised": false,
      |    "validationMessageCount": 5
      |}
    """.stripMargin

  val taxCalculationV2ErrorsAndWarnings: String =
    """
      |{
      |    "warningCount": 1,
      |    "errorCount": 4,
      |    "messages": [
      |        {
      |            "id": "C11101",
      |            "type": "warning",
      |            "text": "You have entered a large amount in total Gift Aid payments. Please check."
      |        },
      |        {
      |            "id": "C15102",
      |            "type": "error",
      |            "text": "Total amount of one-off Gift Aid payments cannot exceed the total gift aid payments. Please check."
      |        },
      |        {
      |            "id": "C15103",
      |            "type": "error",
      |            "text": "Gift aid payments made this year treated as paid in the previous year cannot exceed the total gift aid payments. Please check."
      |        },
      |        {
      |            "id": "C15104",
      |            "type": "error",
      |            "text": "Value of qualifying investments gifted to non-UK charities cannot exceed the sum of 'Value of qualifying shares and securities gifted to charity' and 'Value of qualifying land and buildings gifted to charity'. Please check."
      |        },
      |        {
      |            "id": "C15105",
      |            "type": "error",
      |            "text": "Gift aid payments to non-UK charities cannot exceed the total gift aid payments. Please check."
      |        }
      |    ]
      |}
    """.stripMargin

  val taxCalculationV2WarningsOnly: String =
    """
      |{
      |    "warningCount": 14,
      |    "errorCount": 0,
      |    "messages": [
      |        {
      |            "id": "C11301",
      |            "type": "warning",
      |            "text": "Cost of goods disallowable expenses should not exceed the cost of goods allowable expenses"
      |        },
      |        {
      |            "id": "C11302",
      |            "type": "warning",
      |            "text": "Payments to subcontractor disallowable expenses should not exceed the payments to subcontractors allowable expenses"
      |        },
      |        {
      |            "id": "C11303",
      |            "type": "warning",
      |            "text": "Staff Costs disallowable expenses should not exceed the staff costs allowable expenses"
      |        },
      |        {
      |            "id": "C11304",
      |            "type": "warning",
      |            "text": "Vehicle Travel disallowable expenses should not exceed the vehicle travel allowable expenses"
      |        },
      |        {
      |            "id": "C11305",
      |            "type": "warning",
      |            "text": "Rents, rates etc disallowable expenses should not exceed the rents, rates etc allowable expenses"
      |        },
      |        {
      |            "id": "C11306",
      |            "type": "warning",
      |            "text": "Repairs, renewals of property etc disallowable expenses should not exceed the repairs, renewals of property allowable expenses"
      |        },
      |        {
      |            "id": "C11307",
      |            "type": "warning",
      |            "text": "Phone, fax etc disallowable expenses should not exceed the phone, fax etc allowable expenses"
      |        },
      |        {
      |            "id": "C11308",
      |            "type": "warning",
      |            "text": "Advertising etc disallowable expenses should not exceed the advertising etc allowable expenses"
      |        },
      |        {
      |            "id": "C11309",
      |            "type": "warning",
      |            "text": "Interest on bank and other loans disallowable expenses should not exceed the interest on bank and other loan allowable expenses"
      |        },
      |        {
      |            "id": "C11310",
      |            "type": "warning",
      |            "text": "Bank, credit card charges disallowable expenses should not exceed the bank, credit card charges allowable expenses"
      |        },
      |        {
      |            "id": "C11311",
      |            "type": "warning",
      |            "text": "Debts written off disallowable expenses should not exceed the debts written off allowable expenses"
      |        },
      |        {
      |            "id": "C11312",
      |            "type": "warning",
      |            "text": "Depreciation on sale of assets disallowable expenses should not exceed the depreciation on sale of assets allowable expenses"
      |        },
      |        {
      |            "id": "C11313",
      |            "type": "warning",
      |            "text": "Other business expenses disallowable expenses should not exceed the other business expenses allowable expenses"
      |        },
      |        {
      |            "id": "C11314",
      |            "type": "warning",
      |            "text": "Accountancy, legal and other professional fees disallowable expenses should not exceed the accountancy, legal and other professional fees allowable expenses"
      |        }
      |    ]
      |}
    """.stripMargin

  val taxCalculationV2ErrorsOnly: String =
    """
      |{
      |    "warningCount": 0,
      |    "errorCount": 5,
      |    "messages": [
      |        {
      |            "id": "C55013",
      |            "type": "error",
      |            "text": "Period submission do not cover the full accounting period (falls short of defined accounting period end)"
      |        },
      |        {
      |            "id": "C15102",
      |            "type": "error",
      |            "text": "Total amount of one-off Gift Aid payments cannot exceed the total gift aid payments. Please check."
      |        },
      |        {
      |            "id": "C15103",
      |            "type": "error",
      |            "text": "Gift aid payments made this year treated as paid in the previous year cannot exceed the total gift aid payments. Please check."
      |        },
      |        {
      |            "id": "C15104",
      |            "type": "error",
      |            "text": "Value of qualifying investments gifted to non-UK charities cannot exceed the sum of 'Value of qualifying shares and securities gifted to charity' and 'Value of qualifying land and buildings gifted to charity'. Please check."
      |        },
      |        {
      |            "id": "C15105",
      |            "type": "error",
      |            "text": "Gift aid payments to non-UK charities cannot exceed the total gift aid payments. Please check."
      |        }
      |    ]
      |}
    """.stripMargin

}
