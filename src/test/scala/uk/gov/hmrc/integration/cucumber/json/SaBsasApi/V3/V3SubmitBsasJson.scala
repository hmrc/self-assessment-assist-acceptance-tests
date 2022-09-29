/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V3

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object V3SubmitBsasJson {

  val V3_FOREIGN_PROPERTY_BREAKDOWN: String =
    """
      |{
      |   "nonFurnishedHolidayLet":  [
      |       {
      |          "countryCode": "FRA",
      |          "income": {
      |              "totalRentsReceived": 1000.45,
      |              "premiumsOfLeaseGrant": -99.99,
      |              "otherPropertyIncome": 1000.00
      |          },
      |          "expenses": {
      |              "premisesRunningCosts": 1000.45,
      |              "repairsAndMaintenance": -99999.99,
      |              "financialCosts": 5000.45,
      |              "professionalFees": 300.99,
      |              "costOfServices": 500.00,
      |              "residentialFinancialCost": 9000.00,
      |              "other": 1000.00,
      |              "travelCosts": 99.99
      |          }
      |       }
      |    ]
      |}
    """.stripMargin

  val V3_FOREIGN_PROPERTY_CONSOLIDATED: String =
    """
      |{
      |   "nonFurnishedHolidayLet": [
      |      {
      |              "countryCode": "FRA",
      |              "income": {
      |              "totalRentsReceived": 1000.45,
      |              "premiumsOfLeaseGrant": -99.99,
      |              "otherPropertyIncome": 1000.00
      |          },
      |          "expenses": {
      |              "consolidatedExpenses": 999.99
      |           }
      |      }
      |   ]
      |}
    """.stripMargin

  val V3_FOREIGN_PROPERTY_BOTH_EXPENSES: String =
    """
      |{
      |   "nonFurnishedHolidayLet":  [
      |       {
      |          "countryCode": "FRA",
      |          "income": {
      |              "totalRentsReceived": 1000.45,
      |              "premiumsOfLeaseGrant": -99.99,
      |              "otherPropertyIncome": 1000.00
      |          },
      |          "expenses": {
      |                "premisesRunningCosts": 123.12,
      |                "consolidatedExpenses": 999.99
      |          }
      |       }
      |   ]
      |}
    """.stripMargin

  val V3_FOREIGN_FHL_EEA_BREAKDOWN: String =
    """
      |{
      |   "foreignFhlEea": {
      |     "income": {
      |        "totalRentsReceived": 1000.45
      |     },
      |     "expenses": {
      |        "premisesRunningCosts": 1001.00,
      |        "repairsAndMaintenance": -99999.99,
      |        "financialCosts": 200.50,
      |        "professionalFees": -99999.99,
      |        "costOfServices": -1000.45,
      |        "other": 500.00,
      |        "travelCosts": 100.00
      |     }
      |   }
      |}
    """.stripMargin

  val V3_FOREIGN_FHL_EEA_CONSOLIDATED: String =
    """
      |{
      |   "foreignFhlEea": {
      |      "income": {
      |        "totalRentsReceived": 1000.45
      |     },
      |     "expenses": {
      |        "consolidatedExpenses": 1000.45
      |     }
      |  }
      |}
    """.stripMargin

  val V3_FOREIGN_FHL_EEA_BOTH_EXPENSES: String =
    """
      |{
      |    "foreignFhlEea": {
      |        "income": {
      |            "totalRentsReceived": 123.12
      |        },
      |        "expenses": {
      |            "premisesRunningCosts": 123.12,
      |            "consolidatedExpenses": 1000.45
      |        }
      |    }
      |}
    """.stripMargin

  val UK_FHL_BREAKDOWN: String =
    """
      |{
      |   "furnishedHolidayLet": {
      |      "income": {
      |         "totalRentsReceived": 1000.45
      |      },
      |      "expenses": {
      |         "premisesRunningCosts": 1000.45,
      |         "repairsAndMaintenance": 1000.45,
      |         "financialCosts": 1000.45,
      |         "professionalFees": 1000.45,
      |         "costOfServices": 1000.45,
      |         "other": 1000.45,
      |         "travelCosts": 1000.45
      |      }
      |   }
      |}
    """.stripMargin

  val UK_FHL_CONSOLIDATED: String =
    """
      |{
      |   "furnishedHolidayLet": {
      |      "income": {
      |         "totalRentsReceived": 1000.45
      |      },
      |      "expenses": {
      |         "consolidatedExpenses": 1000.45
      |      }
      |   }
      |}
    """.stripMargin

  val UK_FHL_BOTH_EXPENSES: String =
    """
      |{
      |  "furnishedHolidayLet": {
      |    "income": {
      |      "totalRentsReceived": 1000.49
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 1000.49,
      |      "travelCosts": 1000.49
      |    }
      |  }
      |}
    """.stripMargin

  val UK_NON_FHL_BREAKDOWN: String =
    """
      |{
      |   "nonFurnishedHolidayLet": {
      |      "income": {
      |         "totalRentsReceived": 1000.45,
      |         "premiumsOfLeaseGrant": 1000.45,
      |         "reversePremiums": 1000.45,
      |         "otherPropertyIncome": 1000.45
      |      },
      |      "expenses": {
      |         "premisesRunningCosts": 1000.45,
      |         "repairsAndMaintenance": 1000.45,
      |         "financialCosts": 1000.45,
      |         "professionalFees": 1000.45,
      |         "costOfServices": 1000.45,
      |         "residentialFinancialCost": 1000.45,
      |         "other": 1000.45,
      |         "travelCosts": 1000.45
      |      }
      |   }
      |}
  """.stripMargin

  val UK_NON_FHL_CONSOLIDATED: String =
    """
      |{
      |   "nonFurnishedHolidayLet": {
      |      "income": {
      |         "totalRentsReceived": 1000.45,
      |         "premiumsOfLeaseGrant": 1000.45,
      |         "reversePremiums": 1000.45,
      |         "otherPropertyIncome": 1000.45
      |      },
      |      "expenses": {
      |         "consolidatedExpenses": 1000.45
      |      }
      |   }
      |}
    """.stripMargin

  val UK_NON_FHL_BOTH_EXPENSES: String =
    """
      |{
      |  "nonFurnishedHolidayLet": {
      |      "income": {
      |         "totalRentsReceived": 1000.45,
      |         "premiumsOfLeaseGrant": 1000.45,
      |         "reversePremiums": 1000.45,
      |         "otherPropertyIncome": 1000.45
      |      },
      |      "expenses": {
      |         "consolidatedExpenses": 1000.49,
      |         "residentialFinancialCost": 1000.49,
      |         "travelCosts": 1000.49
      |      }
      |  }
      |}
    """.stripMargin

  val INVALID_UK_FHL_AND_NON_FHL: String =
    """
      |{
      |   "nonFurnishedHolidayLet": {
      |      "income": {
      |         "totalRentsReceived": 1000.45,
      |         "premiumsOfLeaseGrant": 1000.45,
      |         "reversePremiums": 1000.45,
      |         "otherPropertyIncome": 1000.45
      |      },
      |      "expenses": {
      |         "premisesRunningCosts": 1000.45,
      |         "repairsAndMaintenance": 1000.45,
      |         "financialCosts": 1000.45,
      |         "professionalFees": 1000.45,
      |         "costOfServices": 1000.45,
      |         "residentialFinancialCost": 1000.45,
      |         "other": 1000.45,
      |         "travelCosts": 1000.45
      |      }
      |   },
      |   "furnishedHolidayLet": {
      |      "income": {
      |         "totalRentsReceived": 1000.45
      |      },
      |      "expenses": {
      |         "premisesRunningCosts": 1000.45,
      |         "repairsAndMaintenance": 1000.45,
      |         "financialCosts": 1000.45,
      |         "professionalFees": 1000.45,
      |         "costOfServices": 1000.45,
      |         "other": 1000.45,
      |         "travelCosts": 1000.45
      |      }
      |   }
      |}
    """.stripMargin

  val EMPTY_UK_NON_FHL_INCOME_OBJECT: String =
    """
      |{
      |   "nonFurnishedHolidayLet": {
      |      "income": { }
      |   }
      |}
    """.stripMargin

  val V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_PROPERTY: String =
    """
      |{
      | "code" : "RULE_BOTH_EXPENSES_SUPPLIED",
      | "message" : "Both expenses and consolidated expenses cannot be present at the same time",
      | "paths" : [ "/nonFurnishedHolidayLet/0/expenses" ]
      |}
    """.stripMargin

  val V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_FHL_EEA: String =
    """
      |{
      | "code" : "RULE_BOTH_EXPENSES_SUPPLIED",
      | "message" : "Both expenses and consolidated expenses cannot be present at the same time",
      | "paths" : [ "/foreignFhlEea/expenses" ]
      |}
    """.stripMargin

  val V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_FHL: String =
    """
      |{
      | "code": "RULE_BOTH_EXPENSES_SUPPLIED",
      | "message": "Both expenses and consolidated expenses cannot be present at the same time",
      | "paths": [
      |     "/furnishedHolidayLet/expenses"
      |  ]
      |}
    """.stripMargin

  val V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_NON_FHL: String =
    """
      |{
      | "code": "RULE_BOTH_EXPENSES_SUPPLIED",
      | "message": "Both expenses and consolidated expenses cannot be present at the same time",
      | "paths": [
      |     "/nonFurnishedHolidayLet/expenses"
      |  ]
      |}
    """.stripMargin

  val V3_BSAS_RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED_WITH_PATHS: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/nonFurnishedHolidayLet/income"
    )
  )

  val V3_SELF_EMPLOYMENT_BREAKDOWN: String =
    """
      |{
      |   "income": {
      |      "turnover": 1000.45,
      |      "other": 1000.45
      |    },
      |    "expenses": {
      |       "costOfGoodsAllowable": "1000.49",
      |       "paymentsToSubcontractorsAllowable": "1000.49",
      |       "wagesAndStaffCostsAllowable": "1000.49",
      |       "carVanTravelExpensesAllowable": "1000.49",
      |       "premisesRunningCostsAllowable": "-1000.49",
      |       "maintenanceCostsAllowable": "1000.49",
      |       "adminCostsAllowable": "1000.49",
      |       "interestOnBankOtherLoansAllowable": "1000.49",
      |       "financeChargesAllowable": "1000.49",
      |       "irrecoverableDebtsAllowable": "1000.49",
      |       "professionalFeesAllowable": "1000.49",
      |       "depreciationAllowable": "1000.49",
      |       "otherExpensesAllowable": "1000.49",
      |       "advertisingCostsAllowable": "1000.49",
      |       "businessEntertainmentCostsAllowable": "1000.49"
      |    },
      |    "additions": {
      |       "costOfGoodsDisallowable": "1000.49",
      |       "paymentsToSubcontractorsDisallowable": "1000.49",
      |       "wagesAndStaffCostsDisallowable": "1000.49",
      |       "carVanTravelExpensesDisallowable": "1000.49",
      |       "premisesRunningCostsDisallowable": "1000.49",
      |       "maintenanceCostsDisallowable": "1000.49",
      |       "adminCostsDisallowable": "-1000.49",
      |       "interestOnBankOtherLoansDisallowable": "-1000.49",
      |       "financeChargesDisallowable": "1000.49",
      |       "irrecoverableDebtsDisallowable": "1000.49",
      |       "professionalFeesDisallowable": "1000.49",
      |       "depreciationDisallowable": "1000.49",
      |       "otherExpensesDisallowable": "1000.49",
      |       "advertisingCostsDisallowable": "1000.49",
      |       "businessEntertainmentCostsDisallowable": "1000.49"
      |    }
      |}
    """.stripMargin

  val V3_SELF_EMPLOYMENT_CONSOLIDATED: String =
    """
      |{
      |   "income": {
      |      "turnover": 1000.45,
      |      "other": 1000.45
      |    },
      |    "expenses": {
      |       "consolidatedExpenses": "1000.49"
      |    }
      |}
    """.stripMargin

  val V3_SELF_EMPLOYMENT_BOTH_EXPENSES: String =
    """
      |{
      |   "income": {
      |      "turnover": 1000.45,
      |      "other": 1000.45
      |    },
      |    "expenses": {
      |       "consolidatedExpenses": "-1000.49",
      |       "costOfGoodsAllowable": "1000.49",
      |       "paymentsToSubcontractorsAllowable": "1000.49",
      |       "wagesAndStaffCostsAllowable": "1000.49",
      |       "carVanTravelExpensesAllowable": "1000.49",
      |       "premisesRunningCostsAllowable": "-1000.49",
      |       "maintenanceCostsAllowable": "1000.49",
      |       "adminCostsAllowable": "1000.49",
      |       "interestOnBankOtherLoansAllowable": "1000.49",
      |       "financeChargesAllowable": "1000.49",
      |       "irrecoverableDebtsAllowable": "1000.49",
      |       "professionalFeesAllowable": "1000.49",
      |       "depreciationAllowable": "1000.49",
      |       "otherExpensesAllowable": "1000.49",
      |       "advertisingCostsAllowable": "1000.49",
      |       "businessEntertainmentCostsAllowable": "1000.49"
      |    },
      |    "additions": {
      |       "costOfGoodsDisallowable": "1000.49",
      |       "paymentsToSubcontractorsDisallowable": "1000.49",
      |       "wagesAndStaffCostsDisallowable": "1000.49",
      |       "carVanTravelExpensesDisallowable": "1000.49",
      |       "premisesRunningCostsDisallowable": "1000.49",
      |       "maintenanceCostsDisallowable": "1000.49",
      |       "adminCostsDisallowable": "-1000.49",
      |       "interestOnBankOtherLoansDisallowable": "-1000.49",
      |       "financeChargesDisallowable": "1000.49",
      |       "irrecoverableDebtsDisallowable": "1000.49",
      |       "professionalFeesDisallowable": "1000.49",
      |       "depreciationDisallowable": "1000.49",
      |       "otherExpensesDisallowable": "1000.49",
      |       "advertisingCostsDisallowable": "1000.49",
      |       "businessEntertainmentCostsDisallowable": "1000.49"
      |    }
      |}
    """.stripMargin

  val V3_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED: String =
    """
      |{
      | "code": "RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED",
      | "message": "A claim for property income allowance was made. Cannot also have expenses"
      |}
    """.stripMargin

  val V3_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD: String =
    """
      |{
      | "code": "RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD",
      | "message": "The cumulative turnover amount exceeds the consolidated expenses threshold"
      |}
    """.stripMargin

  val V3_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED: String =
    """
      |{
      | "code": "RULE_SUMMARY_STATUS_SUPERSEDED",
      | "message": "A newer summary calculation exists for this accounting period"
      |}
    """.stripMargin

  val V3_BSAS_RULE_SUMMARY_STATUS_INVALID: String =
    """
      |{
      | "code": "RULE_SUMMARY_STATUS_INVALID",
      | "message": "Periodic data has changed. Request a new summary"
      |}
    """.stripMargin

  val V3_BSAS_RULE_ALREADY_ADJUSTED: String =
    """
      |{
      | "code": "RULE_ALREADY_ADJUSTED",
      | "message": "A summary may only be adjusted once. Request a new summary"
      |}
    """.stripMargin

  val V3_BSAS_RULE_BOTH_PROPERTIES_SUPPLIED: String =
    """
      |{
      | "code": "RULE_BOTH_PROPERTIES_SUPPLIED",
      | "message": "Both FHL and Non-FHL properties cannot be present at the same time"
      |}
    """.stripMargin

  val V3_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED: String =
    """
      |{
      | "code": "RULE_RESULTING_VALUE_NOT_PERMITTED",
      | "message": "The adjustments provided would produce an unacceptable negative monetary value"
      |}
    """.stripMargin

  val V3_BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED: String =
    """
      |{
      | "code" : "RULE_TRADING_INCOME_ALLOWANCE_CLAIMED",
      | "message" : "A claim for trading income allowance was made. Cannot also have expenses"
      |}
    """.stripMargin

  val V3_BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT: String =
    """
      |{
      | "code" : "RULE_TYPE_OF_BUSINESS_INCORRECT",
      | "message" : "The calculation ID supplied relates to a different type of business"
      |}
    """.stripMargin

  val V3_BSAS_RULE_SELF_EMPLOYMENT_BOTH_EXPENSES: String =
    """
      |{
      |  "code" : "RULE_BOTH_EXPENSES_SUPPLIED",
      |  "message" : "Both expenses and consolidated expenses cannot be present at the same time",
      |  "paths" : [ "/expenses" ]
      |}
    """.stripMargin

}
