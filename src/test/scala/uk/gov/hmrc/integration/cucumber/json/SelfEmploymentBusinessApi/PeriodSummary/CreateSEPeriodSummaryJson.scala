/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfEmploymentBusinessApi.PeriodSummary

object CreateSEPeriodSummaryJson {

  val CREATE_SE_PERIOD_SUMMARY: String =
    """
      |{
      |     "periodDates": {
      |           "periodStartDate": "2019-08-24",
      |           "periodEndDate": "2019-08-24"
      |     },
      |     "periodIncome": {
      |          "turnover": 1000.99,
      |          "other": 1000.09
      |     },
      |     "periodAllowableExpenses": {
      |          "costOfGoodsAllowable": 1000.99,
      |          "paymentsToSubcontractorsAllowable": 1000.99,
      |          "wagesAndStaffCostsAllowable": 1000.99,
      |          "carVanTravelExpensesAllowable": 1000.99,
      |          "premisesRunningCostsAllowable": -99999.99,
      |          "maintenanceCostsAllowable": -1000.99,
      |          "adminCostsAllowable": 1000.99,
      |          "businessEntertainmentCostsAllowable": 1000.99,
      |          "advertisingCostsAllowable": 1000.99,
      |          "interestOnBankOtherLoansAllowable": -1000.99,
      |          "financeChargesAllowable": -1000.99,
      |          "irrecoverableDebtsAllowable": -1000.99,
      |          "professionalFeesAllowable": -99999999999.99,
      |          "depreciationAllowable": -1000.99,
      |          "otherExpensesAllowable": 1000.99
      |      },
      |     "periodDisallowableExpenses": {
      |          "costOfGoodsDisallowable": 91000.99,
      |          "paymentsToSubcontractorsDisallowable": 1000.99,
      |          "wagesAndStaffCostsDisallowable": 1000.99,
      |          "carVanTravelExpensesDisallowable": 1000.99,
      |          "premisesRunningCostsDisallowable": -1000.99,
      |          "maintenanceCostsDisallowable": -999.99,
      |          "adminCostsDisallowable": 1000.99,
      |          "businessEntertainmentCostsDisallowable": 1000.99,
      |          "advertisingCostsDisallowable": 1000.99,
      |          "interestOnBankOtherLoansDisallowable": -1000.99,
      |          "financeChargesDisallowable": -9999.99,
      |          "irrecoverableDebtsDisallowable": 1000.99,
      |          "professionalFeesDisallowable": 999999999.99,
      |          "depreciationDisallowable": -99999999999.99,
      |          "otherExpensesDisallowable": 1000.99
      |      }
      |}
    """.stripMargin

  val createSEOverlappingPeriod: String =
    """
      |{
      | "code": "RULE_OVERLAPPING_PERIOD",
      | "message": "Period summary overlaps with any of the existing period summaries"
      |}
    """.stripMargin

  val createSEMisalignedPeriod: String =
    """
      |{
      | "code": "RULE_MISALIGNED_PERIOD",
      | "message": "Period summary is not within the accounting period"
      |}
    """.stripMargin

  val createSENotContiguousPeriod: String =
    """
      |{
      | "code": "RULE_NOT_CONTIGUOUS_PERIOD",
      | "message": "Period summaries are not contiguous"
      |}
    """.stripMargin

  val createSENotAllowedConsolidatedExpenses: String =
    """
      |{
      | "code": "RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES",
      | "message": "Consolidated expenses are not allowed if the accumulative turnover amount exceeds the threshold"
      |}
    """.stripMargin

}
