/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

object AmendPeriodSummaryJsonV2 {

  val amendPeriodSummaryDefault: String =
    """
      |{
      |  "foreignFhlEea": {
      |    "income": {
      |      "rentAmount": 567.83
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 4567.98,
      |      "repairsAndMaintenance": 98765.67,
      |      "financialCosts": 4566.95,
      |      "professionalFees": 23.65,
      |      "costOfServices": 4567.77,
      |      "travelCosts": 456.77,
      |      "other": 567.67
      |    }
      |  },
      |  "foreignNonFhlProperty": [
      |    {
      |      "countryCode": "FRA",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 34456.30
      |        },
      |        "foreignTaxCreditRelief": true,
      |        "premiumsOfLeaseGrant": 2543.43,
      |        "otherPropertyIncome": 54325.30,
      |        "foreignTaxPaidOrDeducted": 6543.01,
      |        "specialWithholdingTaxOrUkTaxPaid": 643245.00
      |      },
      |      "expenses": {
      |        "premisesRunningCosts": 5635.43,
      |        "repairsAndMaintenance": 3456.65,
      |        "financialCosts": 34532.21,
      |        "professionalFees": 32465.32,
      |        "costOfServices": 2567.21,
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
      |  "foreignNonFhlProperty": {
      |    "income": {
      |      "rentAmount": 643.59
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 456.98
      |    }
      |  },
      |  "foreignNonFhlProperty": [
      |    {
      |      "countryCode": "GBR",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 28972.56
      |        },
      |        "foreignTaxCreditRelief": true,
      |        "premiumsOfLeaseGrant": 2823.44,
      |        "otherPropertyIncome": 67481.90,
      |        "foreignTaxPaidOrDeducted": 8552.46,
      |        "specialWithholdingTaxOrUkTaxPaid": 622873.00
      |      },
      |      "expenses": {
      |        "consolidatedExpenses": 352.66
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val amendPeriodSummaryMinimumFields: String =
    """
      |{
      |  "foreignNonFhlProperty": [
      |    {
      |      "countryCode": "FRA",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 34456.30
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
      |    "expenses": {
      |      "premisesRunningCosts": 4567.98,
      |      "repairsAndMaintenance": 98765.67,
      |      "financialCosts": 4566.95,
      |      "professionalFees": 23.65,
      |      "costOfServices": 4567.77,
      |      "travelCosts": 456.77,
      |      "other": 567.67
      |    }
      |  },
      |  "foreignNonFhlProperty": [
      |    {
      |      "income": {
      |        "premiumsOfLeaseGrant": 2543.43,
      |        "otherPropertyIncome": 54325.30,
      |        "foreignTaxPaidOrDeducted": 6543.01,
      |        "specialWithholdingTaxOrUkTaxPaid": 643245.00
      |      },
      |      "expenses": {
      |        "premisesRunningCosts": 5635.43,
      |        "repairsAndMaintenance": 3456.65,
      |        "financialCosts": 34532.21,
      |        "professionalFees": 32465.32,
      |        "costOfServices": 2567.21,
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
      |      "rentAmount": 567.830
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 4567.98,
      |      "repairsAndMaintenance": 98765.67,
      |      "financialCosts": 4566.95,
      |      "professionalFees": 23.65,
      |      "costOfServices": 4567.777,
      |      "travelCosts": 456.77,
      |      "other": 567.67
      |    }
      |  },
      |  "foreignNonFhlProperty": [
      |    {
      |      "countryCode": "FRANCE",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 34456.32
      |        },
      |        "foreignTaxCreditRelief": true,
      |        "premiumOfLeaseGrant": 2543.43,
      |        "otherPropertyIncome": 54325.30,
      |        "foreignTaxTakenOff": 6543.01,
      |        "specialWithholdingTaxOrUkTaxPaid": 643245.001
      |      },
      |      "expenses": {
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
      |          "rentAmount": 25156.301
      |        },
      |        "foreignTaxCreditRelief": true
      |      },
      |      "expenses": {
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
      |            "/foreignNonFhlProperty/0/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "RULE_COUNTRY_CODE",
      |        "message": "The country code is not a valid ISO 3166-1 alpha-3 country code",
      |        "paths": [
      |            "/foreignNonFhlProperty/1/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "FORMAT_VALUE",
      |        "message": "The value must be between 0 and 99999999999.99",
      |        "paths": [
      |            "/foreignFhlEea/income/rentAmount",
      |            "/foreignFhlEea/expenses/costOfServices",
      |            "/foreignNonFhlProperty/0/income/specialWithholdingTaxOrUkTaxPaid",
      |            "/foreignNonFhlProperty/0/expenses/residentialFinancialCost",
      |            "/foreignNonFhlProperty/1/income/rentIncome/rentAmount",
      |            "/foreignNonFhlProperty/1/expenses/professionalFees"
      |        ]
      |     }
      |   ]
      |}
    """.stripMargin

  val RULE_INCORRECT_OR_EMPTY_BODY_PATH_RESPONSE: String =
    """
      |{
      |   "code" : "RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED",
      |   "message" : "An empty or non-matching body was submitted",
      |   "paths" : [ "/foreignNonFhlProperty/0/countryCode", "/foreignNonFhlProperty/0/income/foreignTaxCreditRelief" ]
      |}
    """.stripMargin

}
