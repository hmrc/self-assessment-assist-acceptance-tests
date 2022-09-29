/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json

object StateBenefitsErrorsJson {

  val RULE_DELETE_FORBIDDEN: String =
    """
      |{
      | "code" : "RULE_DELETE_FORBIDDEN",
      | "message" : "A deletion of a HMRC held state benefit is not permitted"
      |}
    """.stripMargin

  val RULE_IGNORE_FORBIDDEN: String =
    """
      |{
      | "code" : "RULE_IGNORE_FORBIDDEN",
      | "message" : "A customer added state benefit cannot be ignored"
      |}
    """.stripMargin

  val RULE_UNIGNORE_FORBIDDEN: String =
    """
      |{
      | "code" : "RULE_UNIGNORE_FORBIDDEN",
      | "message" : "A customer added state benefit cannot be unignored"
      |}
    """.stripMargin

}
