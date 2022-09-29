/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfAssessmentApiLegacy

object ErrorsJson {

  val NINO_NOT_FOUND: String =
    """
      |{
      | "code": "NINO_NOT_FOUND",
      | "message": "The remote endpoint has indicated that no data can be found for the nino."
      |}
    """.stripMargin

  val SELF_EMPLOYMENT_ID_NOT_FOUND: String =
    """
      |{
      | "code": "SELF_EMPLOYMENT_ID_NOT_FOUND",
      | "message": "The remote endpoint has indicated that no data can be found for the self-employment ID"
      |}
    """.stripMargin

  val RESOURCE_GONE: String =
    """
      |{
      | "code": "RESOURCE_GONE",
      | "message": "This resource is no longer available"
      |}
    """.stripMargin

  val TAX_YEAR_NOT_FOUND: String =
    """
      |{
      | "code": "TAX_YEAR_NOT_FOUND",
      | "message": "The remote endpoint has indicated that no data can be found for the TaxYear."
      |}
    """.stripMargin

  val TAX_YEAR_NOT_FOUND_ALTERNATE: String =
    """
      |{
      | "code":"TAX_YEAR_NOT_FOUND",
      | "message":"The remote endpoint has indicated that no data can be found for the tax year."
      |}
    """.stripMargin

  val MULTIPLE_ERRORS_ALTERNATE: String =
    """
       | {
       |    "code": "INVALID_REQUEST",
       |    "message": "Invalid request",
       |    "errors": [
       |      {
       |        "code": "NINO_INVALID",
       |        "message": "The provided Nino is invalid"
       |      },
       |      {
       |        "code": "TAX_YEAR_INVALID",
       |        "message": "Invalid tax year"
       |      }
       |    ]
       |  }
     """.stripMargin

}
