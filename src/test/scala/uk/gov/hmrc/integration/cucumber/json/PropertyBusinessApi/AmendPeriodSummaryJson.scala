/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

object AmendPeriodSummaryJson {

  val amendPeriodSummaryDefault: String =
    """
      |{
      |  "foreignFhlEea": {
      |    "income": {
      |      "rentAmount": 567.83,
      |      "taxDeducted": 4321.92
      |    },
      |    "expenditure": {
      |      "premisesRunningCosts": 4567.98,
      |      "repairsAndMaintenance": 98765.67,
      |      "financialCosts": 4566.95,
      |      "professionalFees": 23.65,
      |      "costsOfServices": 4567.77,
      |      "travelCosts": 456.77,
      |      "other": 567.67
      |    }
      |  },
      |  "foreignProperty": [
      |    {
      |      "countryCode": "FRA",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 34456.30,
      |          "taxDeducted": 6334.34
      |        },
      |        "foreignTaxCreditRelief": true,
      |        "premiumOfLeaseGrant": 2543.43,
      |        "otherPropertyIncome": 54325.30,
      |        "foreignTaxTakenOff": 6543.01,
      |        "specialWithholdingTaxOrUKTaxPaid": 643245.00
      |      },
      |      "expenditure": {
      |        "premisesRunningCosts": 5635.43,
      |        "repairsAndMaintenance": 3456.65,
      |        "financialCosts": 34532.21,
      |        "professionalFees": 32465.32,
      |        "costsOfServices": 2567.21,
      |        "travelCosts": 2345.76,
      |        "residentialFinancialCost": 21235.22,
      |        "broughtFwdResidentialFinancialCost": 12556.00,
      |        "other": 2425.11
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val amendPeriodSummaryConsolidated: String =
    """
      |{
      |  "foreignFhlEea": {
      |    "income": {
      |      "rentAmount": 643.59,
      |      "taxDeducted": 3762.99
      |    },
      |    "expenditure": {
      |      "consolidatedExpenses": 456.98
      |    }
      |  },
      |  "foreignProperty": [
      |    {
      |      "countryCode": "GBR",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 28972.56,
      |          "taxDeducted": 5326.23
      |        },
      |        "foreignTaxCreditRelief": true,
      |        "premiumOfLeaseGrant": 2823.44,
      |        "otherPropertyIncome": 67481.90,
      |        "foreignTaxTakenOff": 8552.46,
      |        "specialWithholdingTaxOrUKTaxPaid": 622873.00
      |      },
      |      "expenditure": {
      |        "consolidatedExpenses": 352.66
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val amendPeriodSummaryMinimumFields: String =
    """
      |{
      |  "foreignProperty": [
      |    {
      |      "countryCode": "FRA",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 34456.30,
      |          "taxDeducted": 6334.34
      |        },
      |        "foreignTaxCreditRelief": true
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val amendPeriodSummaryMissingErrorsRequest: String =
    """
      |{
      |  "foreignFhlEea": {
      |    "expenditure": {
      |      "premisesRunningCosts": 4567.98,
      |      "repairsAndMaintenance": 98765.67,
      |      "financialCosts": 4566.95,
      |      "professionalFees": 23.65,
      |      "costsOfServices": 4567.77,
      |      "travelCosts": 456.77,
      |      "other": 567.67
      |    }
      |  },
      |  "foreignProperty": [
      |    {
      |      "income": {
      |        "premiumOfLeaseGrant": 2543.43,
      |        "otherPropertyIncome": 54325.30,
      |        "foreignTaxTakenOff": 6543.01,
      |        "specialWithholdingTaxOrUKTaxPaid": 643245.00
      |      },
      |      "expenditure": {
      |        "premisesRunningCosts": 5635.43,
      |        "repairsAndMaintenance": 3456.65,
      |        "financialCosts": 34532.21,
      |        "professionalFees": 32465.32,
      |        "costsOfServices": 2567.21,
      |        "travelCosts": 2345.76,
      |        "residentialFinancialCost": 21235.22,
      |        "broughtFwdResidentialFinancialCost": 12556.00,
      |        "other": 2425.11
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val amendPeriodSummaryValueErrorsRequest: String =
    """
      |{
      |  "foreignFhlEea": {
      |    "income": {
      |      "rentAmount": 567.830,
      |      "taxDeducted": 4321.92
      |    },
      |    "expenditure": {
      |      "premisesRunningCosts": 4567.98,
      |      "repairsAndMaintenance": 98765.67,
      |      "financialCosts": 4566.95,
      |      "professionalFees": 23.65,
      |      "costsOfServices": 4567.777,
      |      "travelCosts": 456.77,
      |      "other": 567.67
      |    }
      |  },
      |  "foreignProperty": [
      |    {
      |      "countryCode": "FRANCE",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 34456.32,
      |          "taxDeducted": 6334.340
      |        },
      |        "foreignTaxCreditRelief": true,
      |        "premiumOfLeaseGrant": 2543.43,
      |        "otherPropertyIncome": 54325.30,
      |        "foreignTaxTakenOff": 6543.01,
      |        "specialWithholdingTaxOrUKTaxPaid": 643245.001
      |      },
      |      "expenditure": {
      |        "premisesRunningCosts": 5635.43,
      |        "repairsAndMaintenance": 3456.65,
      |        "financialCosts": 34532.21,
      |        "professionalFees": 32465.32,
      |        "costsOfServices": 2567.21,
      |        "travelCosts": 2345.76,
      |        "residentialFinancialCost": 21235.223,
      |        "broughtFwdResidentialFinancialCost": 12556.00,
      |        "other": 2425.11
      |      }
      |    },
      |    {
      |      "countryCode": "SBT",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 25156.301,
      |          "taxDeducted": 5734.34
      |        },
      |        "foreignTaxCreditRelief": true
      |      },
      |      "expenditure": {
      |        "premisesRunningCosts": 3735.43,
      |        "repairsAndMaintenance": 2656.95,
      |        "financialCosts": 25685.43,
      |        "professionalFees": 27184.024,
      |        "costsOfServices": 2483.28,
      |        "travelCosts": 1948.39,
      |        "residentialFinancialCost": 24857.22,
      |        "broughtFwdResidentialFinancialCost": 10396.00,
      |        "other": 1993.38
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val amendPeriodSummaryValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |     {
      |        "code": "FORMAT_COUNTRY_CODE",
      |        "message": "The provided Country code is invalid",
      |        "paths": [
      |            "/foreignProperty/0/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "RULE_COUNTRY_CODE",
      |        "message": "The country code is not a valid ISO 3166-1 alpha-3 country code",
      |        "paths": [
      |            "/foreignProperty/1/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "FORMAT_VALUE",
      |        "message": "One or more monetary fields are invalid",
      |        "paths": [
      |            "/foreignFhlEea/income/rentAmount",
      |            "/foreignFhlEea/expenditure/costsOfServices",
      |            "/foreignProperty/0/income/specialWithholdingTaxOrUKTaxPaid",
      |            "/foreignProperty/0/expenditure/residentialFinancialCost",
      |            "/foreignProperty/1/income/rentIncome/rentAmount",
      |            "/foreignProperty/1/expenditure/professionalFees"
      |        ]
      |     }
      |   ]
      |}
    """.stripMargin

  val amendPeriodSummaryValueErrorsResponseV2: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |     {
      |        "code": "FORMAT_COUNTRY_CODE",
      |        "message": "The provided Country code is invalid",
      |        "paths": [
      |            "/foreignProperty/0/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "RULE_COUNTRY_CODE",
      |        "message": "The country code is not a valid ISO 3166-1 alpha-3 country code",
      |        "paths": [
      |            "/foreignProperty/1/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "FORMAT_VALUE",
      |        "message": "The value must be between 0 and 99999999999.99",
      |        "paths": [
      |            "/foreignFhlEea/income/rentAmount",
      |            "/foreignFhlEea/expenditure/costsOfServices",
      |            "/foreignProperty/0/income/specialWithholdingTaxOrUKTaxPaid",
      |            "/foreignProperty/0/expenditure/residentialFinancialCost",
      |            "/foreignProperty/1/income/rentIncome/rentAmount",
      |            "/foreignProperty/1/expenditure/professionalFees"
      |        ]
      |     }
      |   ]
      |}
    """.stripMargin

}
