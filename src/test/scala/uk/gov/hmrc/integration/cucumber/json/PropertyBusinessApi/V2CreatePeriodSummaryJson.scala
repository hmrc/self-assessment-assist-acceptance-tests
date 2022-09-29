/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

object V2CreatePeriodSummaryJson {

  val createHistoricNonFhlUKPropertyPeriodWithExpensesV2: String =
    """
      |{
      |  "fromDate": "2017-04-06",
      |  "toDate": "2017-07-05",
      |  "income": {
      |    "periodAmount": 100.25,
      |    "taxDeducted": 100.25,
      |    "rentARoom": {
      |      "rentsReceived": 100.25
      |    }
      |  },
      |  "expenses": {
      |    "premisesRunningCosts": 100.25,
      |    "repairsAndMaintenance": 100.25,
      |    "financialCosts": 100.25,
      |    "professionalFees": 100.25,
      |    "costOfServices": 100.25,
      |    "travelCosts": 100.25,
      |    "other": 100.25,
      |    "rentARoom": {
      |      "amountClaimed": 100.25
      |    }
      |  }
      |}
    """.stripMargin

  val createHistoricNonFhlUKPropertyPeriodWithConsolidatedExpensesV2: String =
    """
      |{
      |  "fromDate": "2017-04-06",
      |  "toDate": "2017-07-05",
      |  "income": {
      |    "periodAmount": 100.25,
      |    "taxDeducted": 100.25,
      |    "rentARoom": {
      |      "rentsReceived": 100.25
      |    }
      |  },
      |  "expenses": {
      |    "consolidatedExpenses": 100.25
      |  }
      |}
    """.stripMargin

  val createPeriodSummaryMinFields: String =
    """
      |{
      |  "fromDate": "2022-01-01",
      |  "toDate": "2022-01-31",
      |  "foreignFhlEea": {
      |    "income": {
      |      "rentAmount": 5000.99
      |    }
      |  }
      |}
    """.stripMargin

  val createPeriodSummaryWithExpenses: String =
    """
      |{
      |  "fromDate": "2020-01-01",
      |  "toDate": "2020-01-31",
      |  "foreignFhlEea": {
      |    "income": {
      |      "rentAmount": 5000.99
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 5000.99,
      |      "repairsAndMaintenance": 5000.99,
      |      "financialCosts": 5000.99,
      |      "professionalFees": 5000.99,
      |      "costOfServices": 5000.99,
      |      "travelCosts": 5000.99,
      |      "other": 5000.99
      |    }
      |  },
      |  "foreignNonFhlProperty": [
      |    {
      |      "countryCode": "FRA",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 5000.99
      |        },
      |        "foreignTaxCreditRelief": false,
      |        "premiumsOfLeaseGrant": 5000.99,
      |        "otherPropertyIncome": 5000.99,
      |        "foreignTaxPaidOrDeducted": 5000.99,
      |        "specialWithholdingTaxOrUkTaxPaid": 5000.99
      |      },
      |      "expenses": {
      |        "premisesRunningCosts": 5000.99,
      |        "repairsAndMaintenance": 5000.99,
      |        "financialCosts": 5000.99,
      |        "professionalFees": 5000.99,
      |        "costOfServices": 5000.99,
      |        "travelCosts": 5000.99,
      |        "residentialFinancialCost": 5000.99,
      |        "broughtFwdResidentialFinancialCost": 5000.99,
      |        "other": 5000.99
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val createPeriodSummaryWithConsolidatedExpenses: String =
    """
      |{
      |  "fromDate": "2020-01-01",
      |  "toDate": "2020-01-31",
      |  "foreignFhlEea": {
      |    "income": {
      |      "rentAmount": 5000.99
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 5000.99
      |    }
      |  },
      |  "foreignNonFhlProperty": [
      |    {
      |      "countryCode": "FRA",
      |      "income": {
      |        "rentIncome": {
      |          "rentAmount": 5000.99
      |        },
      |        "foreignTaxCreditRelief": false,
      |        "premiumsOfLeaseGrant": 5000.99,
      |        "otherPropertyIncome": 5000.99,
      |        "foreignTaxPaidOrDeducted": 5000.99,
      |        "specialWithholdingTaxOrUkTaxPaid": 5000.99
      |      },
      |      "expenses": {
      |        "consolidatedExpenses": 5000.99
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val RULE_OVERLAPPING_PERIOD: String =
    """
      |{
      | "code" : "RULE_OVERLAPPING_PERIOD",
      | "message" : "Period summary overlaps with any of the existing period summaries"
      |}
    """.stripMargin

  val RULE_MISALIGNED_PERIOD: String =
    """
      |{
      | "code" : "RULE_MISALIGNED_PERIOD",
      | "message" : "Period summary is not within the accounting period"
      |}
    """.stripMargin

  val RULE_NOT_CONTIGUOUS_PERIOD: String =
    """
      |{
      | "code" : "RULE_NOT_CONTIGUOUS_PERIOD",
      | "message" : "Period summaries are not contiguous"
      |}
    """.stripMargin

  val RULE_DUPLICATE_SUBMISSION: String =
    """
      |{
      | "code" : "RULE_DUPLICATE_SUBMISSION",
      | "message" : "A summary has already been submitted for the period specified"
      |}
    """.stripMargin

  val createHistoricFhlUKPropertyPeriodSummary: String = {
    """
      |{
      |  "fromDate": "2017-04-06",
      |  "toDate": "2017-07-05",
      |  "income": {
      |    "periodAmount": 100.25,
      |    "taxDeducted": 100.25,
      |    "rentARoom": {
      |      "rentsReceived": 100.25
      |    }
      |  },
      |  "expenses": {
      |    "premisesRunningCosts": 100.25,
      |    "repairsAndMaintenance": 100.25,
      |    "financialCosts": 100.25,
      |    "professionalFees": 100.25,
      |    "costOfServices": 100.25,
      |    "travelCosts": 100.25,
      |    "other": 100.25,
      |    "rentARoom": {
      |      "amountClaimed": 100.25
      |    }
      |  }
      |}
    """.stripMargin
  }

  val RULE_TAX_YEAR_NOT_SUPPORTED: String =
    """
      |{
      | "code" : "RULE_TAX_YEAR_NOT_SUPPORTED",
      | "message" : "The tax year specified does not lie within the supported range"
      |}
      |""".stripMargin
}
