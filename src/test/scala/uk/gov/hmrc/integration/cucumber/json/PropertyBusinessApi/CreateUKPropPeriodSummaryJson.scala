/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

object CreateUKPropPeriodSummaryJson {

  val createUKPropPeriodSummaryMinFields: String =
    """
      |{
      |  "fromDate": "2020-01-01",
      |  "toDate": "2020-01-31",
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": 5000.99
      |    }
      |  }
      |}
    """.stripMargin

  val createUKPropPeriodSummaryWithExpenditure: String =
    """
      |{
      |  "fromDate": "2020-01-01",
      |  "toDate": "2020-01-31",
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": 5000.99,
      |      "taxDeducted": 5000.99,
      |      "rentARoom": {
      |       "rentsReceived": 5000.99
      |      }
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": 5000.99,
      |      "repairsAndMaintenance": 5000.99,
      |      "financialCosts": 5000.99,
      |      "professionalFees": 5000.99,
      |      "costsOfServices": 5000.99,
      |      "travelCosts": 5000.99,
      |      "other": 5000.99,
      |      "rentARoom": {
      |       "amountClaimed": 5000.99
      |      }
      |    }
      |  },
      |  "ukNonFhlProperty": {
      |     "income": {
      |       "premiumsOfLeaseGrant": 5000.99,
      |       "reversePremiums": 5000.99,
      |       "periodAmount": 5000.99,
      |       "taxDeducted": 5000.99,
      |       "otherIncome": 5000.99,
      |       "rentARoom": {
      |         "rentsReceived": 5000.99
      |       }
      |     },
      |     "expenditure": {
      |       "premisesRunningCosts": 5000.99,
      |       "repairsAndMaintenance": 5000.99,
      |       "financialCosts": 5000.99,
      |       "professionalFees": 5000.99,
      |       "costsOfServices": 5000.99,
      |       "travelCosts": 5000.99,
      |       "residentialFinancialCost": 5000.99,
      |       "residentialFinancialCostsCarriedForward": 5000.99,
      |       "other": 5000.99,
      |       "rentARoom": {
      |         "amountClaimed": 5000.99
      |       }
      |     }
      |  }
      |}
    """.stripMargin

  val createUKPropPeriodSummaryWithConsolidatedExpenditure: String =
    """
      |{
      |  "fromDate": "2020-01-01",
      |  "toDate": "2020-01-31",
      |  "ukFhlProperty": {
      |    "income": {
      |      "periodAmount": 5000.99,
      |      "taxDeducted": 5000.99,
      |      "rentARoom": {
      |       "rentsReceived": 5000.99
      |      }
      |    },
      |    "expenses": {
      |      "consolidatedExpenses": 5000.99
      |    }
      |  },
      |  "ukNonFhlProperty": {
      |     "income": {
      |       "premiumsOfLeaseGrant": 5000.99,
      |       "reversePremiums": 5000.99,
      |       "periodAmount": 5000.99,
      |       "taxDeducted": 5000.99,
      |       "otherIncome": 5000.99,
      |       "rentARoom": {
      |         "rentsReceived": 5000.99
      |       }
      |     },
      |     "expenses": {
      |       "consolidatedExpenses": 5000.99
      |     }
      |  }
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

}
