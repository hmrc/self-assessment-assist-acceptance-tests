/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsBusinessEOPSApi

object SubmitBusinessEOPSResponseJsonV2 {

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

  val RULE_BVR_MISMATCHED_START_DATE: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55008",
      | "message": "Period submission does not align to accounting period start date of 01-01-2020. Please amend and resubmit"
      |}
    """.stripMargin

  val RULE_NON_MATCHING_PERIOD: String =
    """
      |{
      | "code": "RULE_NON_MATCHING_PERIOD",
      | "message": "An End of Period Statement without a matching accounting period cannot be submitted"
      |}
    """.stripMargin

  val RULE_RULE_BVR_CLASS4_OVER_16: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55317",
      | "message": "Class 4 exemption can not be accepted as Individual’s age is equal to or greater than 16 years old on the 6th April of current tax year. Please amend and resubmit."
      |}
    """.stripMargin

  val RULE_BVR_CLASS4_PENSION_AGE: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55318",
      | "message": "Class 4 exemption can not be accepted as individual's age is less than their State Pension age on the 6th April of current tax year. Please amend and resubmit."
      |}
    """.stripMargin

  val RULE_BVR_CONSOLIDATED_EXPENSES: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55316",
      | "message": "Self employment - Cannot submit data for consolidated expenses if the cumulative turnover amount exceeds the threshold. Please amend and resubmit."
      |}
    """.stripMargin

  val RULE_BVR_CONSOLIDATED_EXPENSES_UK_TEST_ONLY: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55503",
      | "message": "UK Property - Cannot submit data for consolidated expenses if the cumulative turnover amount exceeds the threshold. Please amend and resubmit"
      |}
    """.stripMargin

  val RULE_BVR_CONSOLIDATED_EXPENSES_FOREIGN_TEST_ONLY: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55525",
      | "message": "Foreign Property - Cannot submit data for consolidated expenses if the cumulative turnover amount exceeds the threshold. Please amend and resubmit"
      |}
    """.stripMargin

  val RULE_BVR_END_DATE_SHORT: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55013",
      | "message": "Period submissions do not align to accounting period end date of 01-01-2020. Please amend and resubmit"
      |}
    """.stripMargin

  val RULE_BVR_END_DATE_EXCEEDS: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55014",
      | "message": "Period submission must not exceed the accounting period end date of 01-01-2020. Please amend and resubmit"
      |}
    """.stripMargin

  val RULE_BVR_FHL_PRIVATE_USE_ADJUSTMENT: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55501",
      | "message": "UK Furnished holiday lettings - Private use adjustment must not exceed the total allowable expenses. Please amend and resubmit"
      |}
    """.stripMargin

  val RULE_BVR_NON_FHL_PRIVATE_USE_ADJUSTMENT: String =
    """
      |{
      | "code": "RULE_BUSINESS_VALIDATION_FAILURE",
      | "errorId":"C55502",
      | "message": "UK non Furnished holiday lettings - Private use adjustment must not exceed the total allowable expenses. Please amend and resubmit"
      |}
    """.stripMargin

  val RULE_BVR_UK_PROPERTY_MULTIPLE_ERRORS: String =
    """
      |{
      | "code":"INVALID_REQUEST",
      | "message":"Invalid request",
      | "errors":[
      |    {
      |       "code":"RULE_BUSINESS_VALIDATION_FAILURE",
      |       "message":"UK Property - Cannot submit data for consolidated expenses if the cumulative turnover amount exceeds the threshold. Please amend and resubmit",
      |       "errorId": "C55503"
      |
      |    },
      |    {
      |       "code":"RULE_BUSINESS_VALIDATION_FAILURE",
      |       "message":"UK Property - Property Income Allowance claimed cannot exceed turnover. Please amend and resubmit.",
      |       "errorId": "C15507"
      |    }
      |  ]
      |}
     """.stripMargin

}
