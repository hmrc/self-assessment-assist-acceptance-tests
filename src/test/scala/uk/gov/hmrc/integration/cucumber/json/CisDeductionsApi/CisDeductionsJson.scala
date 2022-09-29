/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.CisDeductionsApi

object CisDeductionsJson {

  val CIS_CREATE_REQUEST: String =
    """
      |{
      |  "fromDate": "2020-04-06",
      |  "toDate": "2021-04-05",
      |  "contractorName": "ContractorA",
      |  "employerRef": "123/AB56797",
      |  "periodData": [
      |    {
      |      "deductionAmount": 355.00,
      |      "deductionFromDate": "2020-04-06",
      |      "deductionToDate": "2020-05-05",
      |      "costOfMaterials": 35.00,
      |      "grossAmountPaid": 1457.00
      |    }
      |  ]
      |}
    """.stripMargin

  val CIS_AMEND_REQUEST: String =
    """
      |{
      |  "periodData": [
      |    {
      |      "deductionAmount": 355.00,
      |      "deductionFromDate": "2019-06-06",
      |      "deductionToDate": "2019-07-05",
      |      "costOfMaterials": 35.00,
      |      "grossAmountPaid": 1457.00
      |    },
      |    {
      |      "deductionAmount": 355.00,
      |      "deductionFromDate": "2019-07-06",
      |      "deductionToDate": "2019-08-05",
      |      "costOfMaterials": 35.00,
      |      "grossAmountPaid": 1457.00
      |    }
      |  ]
      |}
    """.stripMargin

  val CIS_AMEND_DEDUCTIONS_DATE_RANGE_INVALID: String =
    """
      |{
      | "code": "RULE_DEDUCTIONS_DATE_RANGE_INVALID",
      | "message": "The deductions period must align from the 6th of one month to the 5th of the following month"
      |}
    """.stripMargin

  val CIS_AMEND_DUPLICATE_PERIOD: String =
    """
      |{
      | "code": "RULE_DUPLICATE_PERIOD",
      | "message": "More than one deduction period has been supplied for the same month or period"
      |}
    """.stripMargin

  val CIS_AMEND_UNALIGNED_DEDUCTIONS_PERIOD: String =
    """
      |{
      | "code": "RULE_UNALIGNED_DEDUCTIONS_PERIOD",
      | "message": "The deductions periods do not align with the tax year supplied"
      |}
    """.stripMargin

  val CIS_CREATE_DEDUCTIONS_DATE_RANGE_INVALID: String =
    """
      |{
      | "code": "RULE_DEDUCTIONS_DATE_RANGE_INVALID",
      | "message": "The deductions period must align from the 6th of one month to the 5th of the following month"
      |}
    """.stripMargin

  val CIS_CREATE_DUPLICATE_PERIOD: String =
    """
      |{
      | "code": "RULE_DUPLICATE_PERIOD",
      | "message": "More than one deduction period has been supplied for the same month or period"
      |}
    """.stripMargin

  val CIS_CREATE_DUPLICATE_SUBMISSION: String =
    """
      |{
      | "code": "RULE_DUPLICATE_SUBMISSION",
      | "message": "CIS deduction already exists for this tax year"
      |}
    """.stripMargin

  val CIS_CREATE_TAX_YEAR_NOT_ENDED: String =
    """
      |{
      | "code": "RULE_TAX_YEAR_NOT_ENDED",
      | "message": "The submission has been made before the tax year has ended"
      |}
    """.stripMargin

  val CIS_CREATE_UNALIGNED_DEDUCTIONS_PERIOD: String =
    """
      |{
      | "code": "RULE_UNALIGNED_DEDUCTIONS_PERIOD",
      | "message": "The deductions periods do not align with the tax year supplied"
      |}
    """.stripMargin

  val CIS_RULE_DATE_RANGE_OUT_OF_DATE: String =
    """
      |{
      | "code": "RULE_DATE_RANGE_OUT_OF_DATE",
      | "message": "The specified date range is outside the allowable tax years (the current tax year minus four years)"
      |}
    """.stripMargin

}
