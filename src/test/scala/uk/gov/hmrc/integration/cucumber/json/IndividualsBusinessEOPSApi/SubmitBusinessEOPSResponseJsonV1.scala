/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsBusinessEOPSApi

object SubmitBusinessEOPSResponseJsonV1 {

  val RULE_ALREADY_SUBMITTED: String =
    """
      |{
      | "code": "RULE_ALREADY_SUBMITTED",
      | "message": "An End of Period Statement already exists for this business' accounting period"
      |}
    """.stripMargin

  val RULE_EARLY_SUBMISSION: String =
    """
      |{
      | "code": "RULE_EARLY_SUBMISSION",
      | "message": "An End Of Period Statement cannot be submitted before the end of the accounting period"
      |}
    """.stripMargin

  val RULE_LATE_SUBMISSION: String =
    """
      |{
      | "code": "RULE_LATE_SUBMISSION",
      | "message": "The period to finalise has passed"
      |}
    """.stripMargin

  val RULE_CONSOLIDATED_EXPENSES: String =
    """
      |{
      | "code": "RULE_CONSOLIDATED_EXPENSES",
      | "message": "Consolidated expenses not allowed, threshold exceeded"
      |}
    """.stripMargin

  val RULE_MISMATCHED_START_DATE: String =
    """
      |{
      | "code": "RULE_MISMATCHED_START_DATE",
      | "message": "The period submission start date must match the accounting period start date"
      |}
    """.stripMargin

  val RULE_MISMATCHED_END_DATE: String =
    """
      |{
      | "code": "RULE_MISMATCHED_END_DATE",
      | "message": "The period submission end date must match the accounting period end date"
      |}
    """.stripMargin

  val RULE_CLASS4_OVER_16: String =
    """
      |{
      | "code": "RULE_CLASS4_OVER_16",
      | "message": "Class 4 exemption is not allowed because the individual’s age is greater than or equal to 16 years old on the 6th April of the current tax year"
      |}
    """.stripMargin

  val RULE_CLASS4_PENSION_AGE: String =
    """
      |{
      | "code": "RULE_CLASS4_PENSION_AGE",
      | "message": "Class 4 exemption is not allowed because the individual’s age is less than their State Pension age on the 6th April of the current tax year"
      |}
    """.stripMargin

  val RULE_FHL_PRIVATE_USE_ADJUSTMENT: String =
    """
      |{
      | "code": "RULE_FHL_PRIVATE_USE_ADJUSTMENT",
      | "message": "For UK Furnished Holiday Lettings, the private use adjustment must not exceed the total allowable expenses"
      |}
    """.stripMargin

  val RULE_NON_FHL_PRIVATE_USE_ADJUSTMENT: String =
    """
      |{
      | "code": "RULE_NON_FHL_PRIVATE_USE_ADJUSTMENT",
      | "message": "For UK non-Furnished Holiday Lettings, the private use adjustment must not exceed the total allowable expenses"
      |}
    """.stripMargin

  val RULE_NON_MATCHING_PERIOD: String =
    """
      |{
      | "code": "RULE_NON_MATCHING_PERIOD",
      | "message": "An End of Period Statement without a matching accounting period cannot be submitted"
      |}
    """.stripMargin

  val RULE_BUSINESS_VALIDATION_FAILURE: String =
    """
      |{
      |    "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      |    "message": "Business validation rule failures. Please see tax calculation for details"
      |}
    """.stripMargin

}
