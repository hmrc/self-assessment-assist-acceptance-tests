/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.MtdDividendsIncome

object DividendsJson {

  val emptyBody: String =
    """
     |{
     |}
   """.stripMargin

  val fullDividends: String =
    """
      |{
      |  "ukDividends": 1000.12,
      |  "otherUkDividends": 2000.01
      |}
    """.stripMargin

  val ukDividendsOnly: String =
    """
      |{
      |  "ukDividends": 1000
      |}
    """.stripMargin

  val otherUkDividendsOnly: String =
    """
      |{
      |  "otherUkDividends": 2000.5
      |}
    """.stripMargin

  val RETRIEVE_DEFAULT: String =
    """
      |{
      |      "ukDividends": 1000.5,
      |      "otherUkDividends": 2000.35
      |}
    """.stripMargin

  val RETRIEVE_ONLY_UK: String =
    """
      |{
      |      "ukDividends": 600.05
      |}
    """.stripMargin

  val RETRIEVE_ONLY_OTHER: String =
    """
      |{
      |      "otherUkDividends": 800
      |}
    """.stripMargin

  val RETRIEVE_TEST_ONLY_MULTIPLE_ERRORS: String =
    """
      |{
      |    "code": "INVALID_REQUEST",
      |    "message": "Invalid request",
      |    "errors": [
      |        {
      |          "code": "FORMAT_NINO",
      |          "message": "The provided NINO is invalid"
      |        },
      |        {
      |          "code": "FORMAT_TAX_YEAR",
      |          "message": "The provided tax year is invalid"
      |        }
      |    ]
      |}
    """.stripMargin

}
