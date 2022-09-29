/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V2

object SubmitBsasJson {

  val NON_FHL_BREAKDOWN: String =
    """
     |{
     |  "nonFurnishedHolidayLet": {
     |    "income": {
     |      "rentIncome": 1000.49,
     |      "premiumsOfLeaseGrant": 1000.49,
     |      "reversePremiums": 1000.49,
     |      "otherPropertyIncome": 1000.49
     |    },
     |    "expenses": {
     |      "premisesRunningCosts": -1000.49,
     |      "repairsAndMaintenance": 1000.49,
     |      "financialCosts": 1000.49,
     |      "professionalFees": 1000.49,
     |      "travelCosts": 1000.49,
     |      "costOfServices": -1000.49,
     |      "residentialFinancialCost": 1000.49,
     |      "other": 1000.49
     |    }
     |  }
     |}
   """.stripMargin

  val NON_FHL_CONSOLIDATED: String =
    """
      |{
      |  "nonFurnishedHolidayLet": {
      |    "income": {
      |      "rentIncome": 1000.49,
      |      "premiumsOfLeaseGrant": 1000.49,
      |      "reversePremiums": 1000.49,
      |      "otherPropertyIncome": 1000.49
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 1000.49,
      |      "residentialFinancialCost": 1000.49
      |    }
      |  }
      |}
    """.stripMargin

  val NON_FHL_BOTH_EXPENSES: String =
    """
      |{
      |  "nonFurnishedHolidayLet": {
      |    "income": {
      |      "rentIncome": 1000.49,
      |      "premiumsOfLeaseGrant": 1000.49,
      |      "reversePremiums": 1000.49,
      |      "otherPropertyIncome": 1000.49
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 1000.49,
      |      "residentialFinancialCost": 1000.49,
      |      "travelCosts": 1000.49
      |    }
      |  }
      |}
    """.stripMargin

  val FHL_BREAKDOWN: String =
    """
      |{
      |  "furnishedHolidayLet": {
      |    "income": {
      |      "rentIncome": 1000.49
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": -1000.49,
      |      "repairsAndMaintenance": 1000.49,
      |      "financialCosts": 1000.49,
      |      "professionalFees": 1000.49,
      |      "travelCosts": 1000.49,
      |      "costOfServices": -1000.49,
      |      "other": 1000.49
      |    }
      |  }
      |}
    """.stripMargin

  val FHL_CONSOLIDATED: String =
    """
      |{
      |  "furnishedHolidayLet": {
      |    "income": {
      |      "rentIncome": 1000.49
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 1000.49
      |    }
      |  }
      |}
    """.stripMargin

  val FHL_BOTH_EXPENSES: String =
    """
      |{
      |  "furnishedHolidayLet": {
      |    "income": {
      |      "rentIncome": 1000.49
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 1000.49,
      |      "travelCosts": 1000.49
      |    }
      |  }
      |}
    """.stripMargin

  val INVALID_FHL_AND_NON_FHL: String =
    """
      |{
      |  "nonFurnishedHolidayLet": {
      |    "income": {
      |      "rentIncome": 1000.49,
      |      "premiumsOfLeaseGrant": 1000.49,
      |      "reversePremiums": 1000.49,
      |      "otherPropertyIncome": 1000.49
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": -1000.49,
      |      "repairsAndMaintenance": 1000.49,
      |      "financialCosts": 1000.49,
      |      "professionalFees": 1000.49,
      |      "travelCosts": 1000.49,
      |      "costOfServices": -1000.49,
      |      "residentialFinancialCost": 1000.49,
      |      "other": 1000.49
      |    }
      |  },
      |  "furnishedHolidayLet": {
      |    "income": {
      |      "rentIncome": 1000.49
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": -1000.49,
      |      "repairsAndMaintenance": 1000.49,
      |      "financialCosts": 1000.49,
      |      "professionalFees": 1000.49,
      |      "travelCosts": 1000.49,
      |      "costOfServices": -1000.49,
      |      "other": 1000.49
      |    }
      |  }
      |}
    """.stripMargin

  val SELF_EMPLOYMENT_BREAKDOWN: String =
    """
      |{
      |   "income": {
      |     "turnover": "1000.49",
      |     "other": "1000.49"
      |   },
      |   "expenses": {
      |     "costOfGoodsBought": "-1000.49",
      |     "cisPaymentsToSubcontractors": "1000.49",
      |     "staffCosts": "1000.49",
      |     "travelcosts": "1000.49",
      |     "premisesRunningCosts": "1000.49",
      |     "maintenanceCosts": "-1000.49",
      |     "adminCosts": "1000.49",
      |     "advertisingCosts": "1000.49",
      |     "businessEntertainmentCosts": "1000.49",
      |     "interest": "1000.49",
      |     "financeCharges": "1000.49",
      |     "badDebt": "1000.49",
      |     "professionalFees": "1000.49",
      |     "depreciation": "1000.49",
      |     "otherExpensesAllowable": "1000.49"
      |
      |   },
      |   "additions": {
      |     "costOfGoodsBoughtDisallowable": "1000.49",
      |     "cisPaymentsToSubcontractorsDisallowable": "1000.49",
      |     "staffCostsDisallowable": "1000.49",
      |     "travelcostsDisallowable": "1000.49",
      |     "premisesRunningCostsDisallowable": "1000.49",
      |     "maintenanceCostsDisallowable": "1000.49",
      |     "adminCostsDisallowable": "-1000.49",
      |     "advertisingCostsDisallowable": "-1000.49",
      |     "businessEntertainmentCostsDisallowable": "1000.49",
      |     "interestDisallowable": "1000.49",
      |     "financialChargesDisallowable": "1000.49",
      |     "badDebtsDisallowable": "1000.49",
      |     "professionalFeesDisallowable": "1000.49",
      |     "depreciationDisallowable": "1000.49",
      |     "otherDisallowable": "1000.49"
      |   }
      |}
    """.stripMargin

  val SELF_EMPLOYMENT_CONSOLIDATED: String =
    """
      |{
      |   "income": {
      |     "turnover": "1000.49",
      |     "other": "1000.49"
      |   },
      |   "expenses": {
      |     "consolidatedExpenses": "-1000.49"
      |   }
      |}
    """.stripMargin

  val INVALID_SELF_EMPLOYMENT: String =
    """
      |{
      |   "income": {
      |
      |   },
      |   "expenses": {
      |
      |   },
      |   "additions": {
      |
      |   }
      |}
    """.stripMargin

  val SELF_EMPLOYMENT_BOTH_EXPENSES_SUPPLIED: String =
    """
      |{
      |   "income": {
      |     "turnover": "1000.49",
      |     "other": "1000.49"
      |   },
      |    "expenses": {
      |     "consolidatedExpenses": "-1000.49",
      |     "costOfGoodsBought": "-1000.49"
      |   }
      |}
    """.stripMargin

  val FOREIGN_PROP_BREAKDOWN: String =
    """
      |{
      |    "foreignProperty": [
      |        {
      |            "countryCode": "FRA",
      |            "income": {
      |                "rentIncome": 123.12,
      |                "premiumsOfLeaseGrant": 123.12,
      |                "otherPropertyIncome": 123.12
      |            },
      |            "expenses": {
      |                "premisesRunningCosts": 123.12,
      |                "repairsAndMaintenance": 123.12,
      |                "financialCosts": 123.12,
      |                "professionalFees": 123.12,
      |                "travelCosts": 123.12,
      |                "costOfServices": 123.12,
      |                "residentialFinancialCost": 123.12,
      |                "other": 123.12
      |            }
      |        }
      |    ]
      |}
    """.stripMargin

  val FOREIGN_PROP_CONSOLIDATED: String =
    """
      |{
      |    "foreignProperty": [
      |        {
      |            "countryCode": "FRA",
      |            "income": {
      |                "rentIncome": 123.12,
      |                "premiumsOfLeaseGrant": 123.12,
      |                "otherPropertyIncome": 123.12
      |            },
      |            "expenses": {
      |                "consolidatedExpenses": "-1000.49"
      |            }
      |        }
      |    ]
      |}
    """.stripMargin

  val FOREIGN_PROP_BOTH_EXPENSES: String =
    """
      |{
      |    "foreignProperty": [
      |        {
      |            "countryCode": "FRA",
      |            "income": {
      |                "rentIncome": 123.12,
      |                "premiumsOfLeaseGrant": 123.12,
      |                "otherPropertyIncome": 123.12
      |            },
      |            "expenses": {
      |                "premisesRunningCosts": 123.12,
      |                "consolidatedExpenses": "-1000.49"
      |            }
      |        }
      |    ]
      |}
    """.stripMargin

  val FOREIGN_FHL_EEA_BREAKDOWN: String =
    """
      |{
      |    "foreignFhlEea": {
      |        "income": {
      |            "rentIncome": 123.12
      |        },
      |        "expenses": {
      |            "premisesRunningCosts": 123.12,
      |            "repairsAndMaintenance": 123.12,
      |            "financialCosts": 123.12,
      |            "professionalFees": 123.12,
      |            "costOfServices": 123.12,
      |            "travelCosts": 123.12,
      |            "other": 123.12
      |        }
      |    }
      |}
    """.stripMargin

  val FOREIGN_FHL_EEA_CONSOLIDATED: String =
    """
      |{
      |    "foreignFhlEea": {
      |        "income": {
      |            "rentIncome": 123.12
      |        },
      |        "expenses": {
      |            "consolidatedExpenses": "-1000.49"
      |        }
      |    }
      |}
    """.stripMargin

  val FOREIGN_FHL_EEA_BOTH_EXPENSES: String =
    """
      |{
      |    "foreignFhlEea": {
      |        "income": {
      |            "rentIncome": 123.12
      |        },
      |        "expenses": {
      |            "premisesRunningCosts": 123.12,
      |            "consolidatedExpenses": "-1000.49"
      |        }
      |    }
      |}
    """.stripMargin

  val INVALID_FOREIGN_AND_FHL_EEA: String =
    """
      |{
      |    "foreignProperty": [
      |        {
      |            "countryCode": "FRA",
      |            "income": {
      |                "rentIncome": 123.12,
      |                "premiumsOfLeaseGrant": 123.12,
      |                "otherPropertyIncome": 123.12
      |            },
      |            "expenses": {
      |                "premisesRunningCosts": 123.12,
      |                "repairsAndMaintenance": 123.12,
      |                "financialCosts": 123.12,
      |                "professionalFees": 123.12,
      |                "travelCosts": 123.12,
      |                "costOfServices": 123.12,
      |                "residentialFinancialCost": 123.12,
      |                "other": 123.12,
      |                "consolidatedExpenses": 123.12
      |            }
      |        }
      |    ],
      |    "foreignFhlEea": {
      |        "income": {
      |            "rentIncome": 123.12
      |        },
      |        "expenses": {
      |            "premisesRunningCosts": 123.12,
      |            "repairsAndMaintenance": 123.12,
      |            "financialCosts": 123.12,
      |            "professionalFees": 123.12,
      |            "costOfServices": 123.12,
      |            "travelCosts": 123.12,
      |            "other": 123.12,
      |            "consolidatedExpenses": 123.12
      |        }
      |    }
      |}
    """.stripMargin

  val BSAS_RULE_BOTH_EXPENSES_SUPPLIED: String =
    """
      |{
      | "code" : "RULE_BOTH_EXPENSES_SUPPLIED",
      | "message" : "Both expenses and consolidated expenses cannot be present at the same time"
      |}
    """.stripMargin

  val BSAS_RULE_SELF_EMPLOYMENT_ADJUSTED: String =
    """
      |{
      | "code" : "RULE_SELF_EMPLOYMENT_ADJUSTED",
      | "message" : "A self-employment business type was adjusted. Re-trigger an adjustable summary for the self-employment to correct"
      |}
    """.stripMargin

  val BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT: String =
    """
      |{
      | "code" : "RULE_TYPE_OF_BUSINESS_INCORRECT",
      | "message" : "The submission is for a different type of business"
      |}
    """.stripMargin

  val BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED: String =
    """
      |{
      | "code" : "RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED",
      | "message" : "A claim for property income allowance was made. Cannot also have expenses"
      |}
    """.stripMargin

  val BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD: String =
    """
      |{
      | "code" : "RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD",
      | "message" : "The cumulative turnover amount exceeds the consolidated expenses threshold"
      |}
    """.stripMargin

  val BSAS_RULE_SUMMARY_STATUS_SUPERSEDED: String =
    """
      |{
      | "code" : "RULE_SUMMARY_STATUS_SUPERSEDED",
      | "message" : "A newer summary calculation exists for this accounting period"
      |}
    """.stripMargin

  val BSAS_RULE_SUMMARY_STATUS_INVALID: String =
    """
      |{
      | "code" : "RULE_SUMMARY_STATUS_INVALID",
      | "message" : "Periodic data has changed. Request a new summary"
      |}
    """.stripMargin

  val BSAS_RULE_BSAS_ALREADY_ADJUSTED: String =
    """
      |{
      | "code" : "RULE_BSAS_ALREADY_ADJUSTED",
      | "message" : "A summary may only be adjusted once. Request a new summary"
      |}
    """.stripMargin

  val BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED: String =
    """
      |{
      | "code" : "RULE_TRADING_INCOME_ALLOWANCE_CLAIMED",
      | "message" : "A claim for trading income allowance was made. Cannot also have expenses"
      |}
    """.stripMargin

  val BSAS_RULE_NOT_SELF_EMPLOYMENT: String =
    """
      |{
      | "code" : "RULE_NOT_SELF_EMPLOYMENT",
      | "message" : "The summary calculation requested is not for a self-employment business"
      |}
    """.stripMargin

  val BSAS_RULE_UK_PROPERTY_ADJUSTED: String =
    """
      |{
      | "code" : "RULE_UK_PROPERTY_ADJUSTED",
      | "message" : "A UK Property business type was adjusted. Re-trigger an adjustable summary for the affected UK Property business to correct"
      |}
    """.stripMargin

  val BSAS_RULE_INCORRECT_PROPERTY_ADJUSTED: String =
    """
      |{
      | "code" : "RULE_INCORRECT_PROPERTY_ADJUSTED",
      | "message" : "An adjustment has been made to an incorrect property type. Re-trigger an adjustable summary for this BSAS ID to correct"
      |}
    """.stripMargin

  val BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED: String =
    """
      |{
      | "code" : "RULE_RESULTING_VALUE_NOT_PERMITTED",
      | "message" : "The adjustments provided would produce an unacceptable negative monetary value"
      |}
    """.stripMargin

}
