/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

object AmendUkPropertyPeriodSummaryJson {

  val defaultRequest: String =
    """
      |{
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": 0,
      |      "taxDeducted": 0,
      |      "rentARoom": {
      |        "rentsReceived": 0
      |      }
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 0,
      |      "repairsAndMaintenance": 0,
      |      "financialCosts": 0,
      |      "professionalFees": 0,
      |      "costOfServices": 0,
      |      "other": 0,
      |      "travelCosts": 0,
      |      "rentARoom": {
      |        "amountClaimed": 0
      |      }
      |    }
      |  },
      |  "ukNonFhlProperty": {
      |    "income": {
      |      "premiumsOfLeaseGrant": 0,
      |      "reversePremiums": 0,
      |      "periodAmount": 0,
      |      "taxDeducted": 0,
      |      "otherIncome": 0,
      |      "rentARoom": {
      |        "rentsReceived": 0
      |      }
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 0,
      |      "repairsAndMaintenance": 0,
      |      "financialCosts": 0,
      |      "professionalFees": 0,
      |      "costOfServices": 0,
      |      "other": 0,
      |      "residentialFinancialCost": 0,
      |      "travelCosts": 0,
      |      "residentialFinancialCostsCarriedForward": 0,
      |      "rentARoom": {
      |        "amountClaimed": 0
      |      }
      |    }
      |  }
      |}
    """.stripMargin

  val minimumRequest: String =
    """
      |{
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": 0
      |    }
      |  }
      |}
    """.stripMargin

  val consolidatedRequest: String =
    """
      |{
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": 0,
      |      "taxDeducted": 0,
      |      "rentARoom": {
      |        "rentsReceived": 0
      |      }
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 0
      |    }
      |  },
      |  "ukNonFhlProperty": {
      |    "income": {
      |      "premiumsOfLeaseGrant": 0,
      |      "reversePremiums": 0,
      |      "periodAmount": 0,
      |      "taxDeducted": 0,
      |      "otherIncome": 0,
      |      "rentARoom": {
      |        "rentsReceived": 0
      |      }
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 0
      |    }
      |  }
      |}
    """.stripMargin

  val bothExpensesSuppliedRequest: String =
    """
      |{
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": 0,
      |      "taxDeducted": 0,
      |      "rentARoom": {
      |        "rentsReceived": 0
      |      }
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 0,
      |      "repairsAndMaintenance": 0,
      |      "financialCosts": 0,
      |      "professionalFees": 0,
      |      "costOfServices": 0,
      |      "other": 0,
      |      "travelCosts": 0,
      |      "rentARoom": {
      |        "amountClaimed": 0
      |      },
      |      "consolidatedExpenses": 0
      |    }
      |  },
      |  "ukNonFhlProperty": {
      |    "income": {
      |      "premiumsOfLeaseGrant": 0,
      |      "reversePremiums": 0,
      |      "periodAmount": 0,
      |      "taxDeducted": 0,
      |      "otherIncome": 0,
      |      "rentARoom": {
      |        "rentsReceived": 0
      |      }
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 0,
      |      "repairsAndMaintenance": 0,
      |      "financialCosts": 0,
      |      "professionalFees": 0,
      |      "costOfServices": 0,
      |      "other": 0,
      |      "residentialFinancialCost": 0,
      |      "travelCosts": 0,
      |      "residentialFinancialCostsCarriedForward": 0,
      |      "rentARoom": {
      |        "amountClaimed": 0
      |      },
      |      "consolidatedExpenses": 0
      |    }
      |  }
      |}
    """.stripMargin

  val bothExpensesSuppliedResponse: String =
    """
      |{
      | "code" : "RULE_BOTH_EXPENSES_SUPPLIED",
      | "message" : "Both Expenses and Consolidated Expenses must not be present at the same time",
      | "paths" : ["/ukFhlProperty/expenses", "/ukNonFhlProperty/expenses"]
      |}
    """.stripMargin

  val valueFormatRequest: String =
    """
      |{
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": -1,
      |      "taxDeducted": -1,
      |      "rentARoom": {
      |        "rentsReceived": 0.002
      |      }
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 999999999999,
      |      "repairsAndMaintenance": -12,
      |      "financialCosts": -23.444,
      |      "professionalFees": 33.3333,
      |      "costOfServices": 5.123,
      |      "other": 43135.555,
      |      "travelCosts": -23123123,
      |      "rentARoom": {
      |        "amountClaimed": 33333333333333333333
      |      }
      |    }
      |  },
      |  "ukNonFhlProperty": {
      |    "income": {
      |      "premiumsOfLeaseGrant": -2,
      |      "reversePremiums": 3.33333,
      |      "periodAmount": -3,
      |      "taxDeducted": -23123,
      |      "otherIncome": -3214.4444,
      |      "rentARoom": {
      |        "rentsReceived": 33333.3333
      |      }
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 23.4342234,
      |      "repairsAndMaintenance": -123,
      |      "financialCosts": -44444,
      |      "professionalFees": 0.3123124124,
      |      "costOfServices": 0.33333,
      |      "other": 0.235234234,
      |      "residentialFinancialCost": -12,
      |      "travelCosts": -2,
      |      "residentialFinancialCostsCarriedForward": 0.555555,
      |      "rentARoom": {
      |        "amountClaimed": 17171717171771717171717171
      |      }
      |    }
      |  }
      |}
    """.stripMargin

  val valueFormatResponse: String =
    """
      |{
      | "code" : "FORMAT_VALUE",
      | "message" : "The value must be between 0 and 99999999999.99",
      | "paths" : [
      |   "/ukFhlProperty/income/periodAmount",
      |   "/ukFhlProperty/income/taxDeducted",
      |   "/ukFhlProperty/income/rentARoom/rentsReceived",
      |   "/ukFhlProperty/expenses/premisesRunningCosts",
      |   "/ukFhlProperty/expenses/repairsAndMaintenance",
      |   "/ukFhlProperty/expenses/financialCosts",
      |   "/ukFhlProperty/expenses/professionalFees",
      |   "/ukFhlProperty/expenses/costOfServices",
      |   "/ukFhlProperty/expenses/other",
      |   "/ukFhlProperty/expenses/travelCosts",
      |   "/ukFhlProperty/expenses/rentARoom/amountClaimed",
      |   "/ukNonFhlProperty/income/premiumsOfLeaseGrant",
      |   "/ukNonFhlProperty/income/reversePremiums",
      |   "/ukNonFhlProperty/income/periodAmount",
      |   "/ukNonFhlProperty/income/taxDeducted",
      |   "/ukNonFhlProperty/income/otherIncome",
      |   "/ukNonFhlProperty/income/rentARoom/rentsReceived",
      |   "/ukNonFhlProperty/expenses/premisesRunningCosts",
      |   "/ukNonFhlProperty/expenses/repairsAndMaintenance",
      |   "/ukNonFhlProperty/expenses/financialCosts",
      |   "/ukNonFhlProperty/expenses/professionalFees",
      |   "/ukNonFhlProperty/expenses/costOfServices",
      |   "/ukNonFhlProperty/expenses/other",
      |   "/ukNonFhlProperty/expenses/residentialFinancialCost",
      |   "/ukNonFhlProperty/expenses/travelCosts",
      |   "/ukNonFhlProperty/expenses/residentialFinancialCostsCarriedForward",
      |   "/ukNonFhlProperty/expenses/rentARoom/amountClaimed"
      | ]
      |}
    """.stripMargin

  val emptyItemsRequest: String =
    """
      |{
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": 0,
      |      "taxDeducted": 0,
      |      "rentARoom": {
      |        "rentsReceived": 0
      |      }
      |    },
      |    "expenses": {
      |    }
      |  },
      |  "ukNonFhlProperty": {
      |    "income": {
      |      "premiumsOfLeaseGrant": 0,
      |      "reversePremiums": 0,
      |      "periodAmount": 0,
      |      "taxDeducted": 0,
      |      "otherIncome": 0,
      |      "rentARoom": {
      |        "rentsReceived": 0
      |      }
      |    },
      |    "expenses": {
      |    }
      |  }
      |}
    """.stripMargin

  val emptyItemsResponse: String =
    """
      |{
      | "code" : "RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED",
      | "message" : "An empty or non-matching body was submitted",
      | "paths" : ["/ukFhlProperty/expenses", "/ukNonFhlProperty/expenses"]
      |}
    """.stripMargin

}
