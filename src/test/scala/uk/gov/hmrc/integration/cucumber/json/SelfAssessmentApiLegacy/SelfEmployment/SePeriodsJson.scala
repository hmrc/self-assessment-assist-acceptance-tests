/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfAssessmentApiLegacy.SelfEmployment

object SePeriodsJson {

  val fullExpensesBody: String =
    """
      |{
      |  "from": "2017-04-06",
      |  "to": "2017-07-05",
      |  "incomes": {
      |    "turnover": { "amount": 100.25 },
      |    "other": { "amount": 100.25 }
      |  },
      |  "expenses": {
      |    "costOfGoodsBought": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "cisPaymentsToSubcontractors": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "staffCosts": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "travelCosts": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "premisesRunningCosts": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "maintenanceCosts": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "adminCosts": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "advertisingCosts": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "businessEntertainmentCosts": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "interest": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "financialCharges": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "badDebt": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "professionalFees": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    },
      |    "depreciation": {
      |      "amount": 100.25,
      |      "disallowableAmount": 100.25
      |    },
      |    "other": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    }
      |  }
      |}
    """.stripMargin

  val consolidatedExpensesBody: String =
    """
      |{
      |  "from": "2017-04-06",
      |  "to": "2017-07-05",
      |  "incomes": {
      |    "turnover": {
      |      "amount": 100.25
      |    },
      |    "other": {
      |      "amount": 100.25
      |    }
      |  },
      |  "consolidatedExpenses": 100.25
      |}
    """.stripMargin

  val noIncomesAndExpensesBody: String =
    """
      |{
      |  "from": "2017-07-06",
      |  "to": "2017-10-05",
      |  "incomes": {
      |  },
      |  "expenses": {
      |  }
      |}
    """.stripMargin

  val NO_INCOMES_AND_EXPENSES: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |      {
      |         "code": "NO_INCOMES_AND_EXPENSES",
      |         "message": "No incomes and expenses are supplied",
      |         "path": ""
      |      }
      |   ]
      |}
    """.stripMargin

  val fullAndConsolidatedExpensesBody: String =
    """
      |{
      |  "from": "2017-07-06",
      |  "to": "2017-10-05",
      |  "incomes": {
      |    "turnover": { "amount": 100.25 },
      |    "other": { "amount": 100.25 }
      |  },
      |  "expenses": {
      |    "costOfGoodsBought": {
      |      "amount": 100.25,
      |      "disallowableAmount": 50.25
      |    }
      |  },
      |  "consolidatedExpenses": 100.25
      |}
    """.stripMargin

  val BOTH_EXPENSES_SUPPLIED: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |      {
      |         "code": "BOTH_EXPENSES_SUPPLIED",
      |         "message": "Both expenses and consolidatedExpenses elements cannot be present at the same time",
      |         "path": ""
      |      }
      |   ]
      |}
    """.stripMargin

}
