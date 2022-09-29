/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json

object IncomeReceivedErrorsJson {

  val RULE_CUSTOM_EMPLOYMENT_IGNORE: String =
    """
      |{
      | "code" : "RULE_CUSTOM_EMPLOYMENT",
      | "message" : "A custom employment cannot be ignored"
      |}
    """.stripMargin

  val RULE_CUSTOM_EMPLOYMENT_UNIGNORE: String =
    """
      |{
      | "code" : "RULE_CUSTOM_EMPLOYMENT",
      | "message" : "A custom employment cannot be unignored"
      |}
    """.stripMargin

}
