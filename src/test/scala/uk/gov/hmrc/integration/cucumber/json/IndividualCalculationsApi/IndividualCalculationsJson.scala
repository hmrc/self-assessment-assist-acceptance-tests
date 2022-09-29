/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualCalculationsApi

object IndividualCalculationsJson {

  val triggerTaxCalc: String =
    """
      | {
      |  "taxYear": "2018-19"
      | }
    """.stripMargin

  val RULE_CALCULATION_ERROR_MESSAGES_EXIST: String =
    """
      |{
      | "code" : "RULE_CALCULATION_ERROR_MESSAGES_EXIST",
      | "message" : "Calculation error messages exist for the supplied calculation ID"
      |}
    """.stripMargin

  val NO_MESSAGES_PRESENT: String =
    """
      |{
      | "code" : "NO_MESSAGES_PRESENT",
      | "message" : "No messages present"
      |}
    """.stripMargin

  val END_OF_YEAR_ESTIMATE_NOT_PRESENT: String =
    """
      |{
      | "code" : "END_OF_YEAR_ESTIMATE_NOT_PRESENT",
      | "message" : "End of year estimate data will only be returned for an in-year calculation"
      |}
    """.stripMargin

  val NO_ALLOWANCES_DEDUCTIONS_RELIEFS_EXIST: String =
    """
      |{
      | "code": "NO_ALLOWANCES_DEDUCTIONS_RELIEFS_EXIST",
      | "message": "No allowances, deductions and reliefs data exists"
      |}
    """.stripMargin

  val RULE_FINAL_DECLARATION_RECEIVED: String =
    """
      |{
      | "code" : "RULE_FINAL_DECLARATION_RECEIVED",
      | "message" : "Crystallisation declaration has already been received"
      |}
    """.stripMargin

  val v3_RULE_FINAL_DECLARATION_RECEIVED: String =
    """
      |{
      | "code" : "RULE_FINAL_DECLARATION_RECEIVED",
      | "message" : "Final declaration has already been received"
      |}
    """.stripMargin

  val RULE_NO_SUBMISSIONS_EXIST: String =
    """
      |{
      | "code" : "RULE_NO_SUBMISSIONS_EXIST",
      | "message" : "No periodic or annual income data has been submitted"
      |}
    """.stripMargin

  val RULE_NO_INCOME_SUBMISSION_EXIST: String =
    """
      |{
      | "code": "RULE_NO_INCOME_SUBMISSIONS_EXIST",
      | "message": "No income submissions exist for the tax year"
      |}
      |""".stripMargin

  val RULE_INCOME_SOURCES_CHANGED: String =
    """
      |{
      | "code": "RULE_INCOME_SOURCES_CHANGED",
      | "message": "Income sources data has changed. Perform an Intent to submit a final declaration"
      |}
      |""".stripMargin

  val RULE_RECENT_SUBMISSIONS_EXIST: String =
    """
      |{
      | "code": "RULE_RECENT_SUBMISSIONS_EXIST",
      | "message": "More recent submissions exist. Perform an Intent to submit a final declaration"
      |}
      |""".stripMargin

  val RULE_RESIDENCY_CHANGED: String =
    """
      |{
      | "code": "RULE_RESIDENCY_CHANGED",
      | "message": "Residency has changed. Trigger a new calculation"
      |}
      |""".stripMargin

  val V3_RULE_FINAL_DECLARATION_RECEIVED: String =
    """
      |{
      | "code": "RULE_FINAL_DECLARATION_RECEIVED",
      | "message": "Final declaration has already been received"
      |}
      |""".stripMargin

  val RULE_INCOME_SOURCES_INVALID: String =
    """
      |{
      | "code": "RULE_INCOME_SOURCES_INVALID",
      | "message": "No valid income sources could be found"
      |}
      |""".stripMargin

  val RULE_NO_INCOME_SUBMISSIONS_EXIST: String =
  """
    |{
    | "code": "RULE_NO_INCOME_SUBMISSIONS_EXIST",
    | "message": "No income submissions exist for the tax year"
    |}
    |""".stripMargin

  val RULE_SUBMISSION_FAILED: String =
    """
      |{
      | "code": "RULE_SUBMISSION_FAILED",
      | "message": "The submission cannot be completed due to validation failures"
      |}
      |""".stripMargin



}
