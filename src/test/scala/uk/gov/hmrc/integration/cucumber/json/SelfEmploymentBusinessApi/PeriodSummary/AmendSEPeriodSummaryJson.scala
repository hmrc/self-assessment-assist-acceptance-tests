/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfEmploymentBusinessApi.PeriodSummary

object AmendSEPeriodSummaryJson {

  val amendSEPeriodSummaryDefault: String =
    """
      |{
      |    "periodIncome": {
      |        "turnover": 1000.99,
      |        "other": 1000.99
      |    },
      |    "periodAllowableExpenses": {
      |        "costOfGoodsAllowable": 1000.99,
      |        "paymentsToSubcontractorsAllowable": 1000.99,
      |        "wagesAndStaffCostsAllowable": 1000.99,
      |        "carVanTravelExpensesAllowable": 1000.99,
      |        "premisesRunningCostsAllowable": 1000.99,
      |        "maintenanceCostsAllowable": 1000.99,
      |        "adminCostsAllowable": 1000.99,
      |        "businessEntertainmentCostsAllowable": 1000.99,
      |        "advertisingCostsAllowable": 1000.99,
      |        "interestOnBankOtherLoansAllowable": 1000.99,
      |        "financeChargesAllowable": 1000.99,
      |        "irrecoverableDebtsAllowable": 1000.99,
      |        "professionalFeesAllowable": 1000.99,
      |        "depreciationAllowable": 1000.99,
      |        "otherExpensesAllowable": 1000.99
      |    },
      |    "periodDisallowableExpenses": {
      |        "costOfGoodsDisallowable": 1000.99,
      |        "paymentsToSubcontractorsDisallowable": 1000.99,
      |        "wagesAndStaffCostsDisallowable": 1000.99,
      |        "carVanTravelExpensesDisallowable": 1000.99,
      |        "premisesRunningCostsDisallowable": 1000.99,
      |        "maintenanceCostsDisallowable": 1000.99,
      |        "adminCostsDisallowable": 1000.99,
      |        "businessEntertainmentCostsDisallowable": 1000.99,
      |        "advertisingCostsDisallowable": 1000.99,
      |        "interestOnBankOtherLoansDisallowable": 1000.99,
      |        "financeChargesDisallowable": 1000.99,
      |        "irrecoverableDebtsDisallowable": 1000.99,
      |        "professionalFeesDisallowable": 1000.99,
      |        "depreciationDisallowable": 1000.99,
      |        "otherExpensesDisallowable": 1000.99
      |    }
      |}
    """.stripMargin

  val amendSEPeriodSummaryConsolidated: String =
    """
      |{
      |    "periodIncome": {
      |        "turnover": 1000.99,
      |        "other": 1000.99
      |    },
      |    "periodAllowableExpenses": {
      |        "consolidatedExpenses": 1000.99
      |    }
      |}
    """.stripMargin

  val amendSEPeriodSummaryConsolidatedExceeded: String =
    """
      |{
      |    "periodIncome": {
      |        "turnover": 1000.99,
      |        "other": 1000.99
      |    },
      |    "periodAllowableExpenses": {
      |        "consolidatedExpenses": 99999999980.99
      |    }
      |}
    """.stripMargin

  val RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES: String =
    """
      |{
      | "code": "RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES",
      | "message": "Consolidated expenses are not allowed if the accumulative turnover amount exceeds the threshold"
      |}
    """.stripMargin

}