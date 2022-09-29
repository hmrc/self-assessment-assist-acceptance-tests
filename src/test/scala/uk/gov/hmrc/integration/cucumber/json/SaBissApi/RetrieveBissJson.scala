/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaBissApi

object RetrieveBissJson {

  val BISS_RULE_NO_INCOME_SUBMISSIONS_EXIST: String =
    """
      |{
      | "code": "RULE_NO_INCOME_SUBMISSIONS_EXIST",
      | "message": "No income submissions exist"
      |}
    """.stripMargin

}
