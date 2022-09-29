/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V2

object V2RetrieveBsasJson {

  val RULE_NOT_UK_PROPERTY: String =
    """
      |{
      | "code": "RULE_NOT_UK_PROPERTY",
      | "message": "The summary calculation requested is not for a UK property business"
      |}
    """.stripMargin

  val RULE_NO_ADJUSTMENTS_MADE: String =
    """
      |{
      | "code": "RULE_NO_ADJUSTMENTS_MADE",
      | "message": "An adjusted summary calculation does not exist"
      |}
    """.stripMargin

  val RULE_NOT_SELF_EMPLOYMENT: String =
    """
      |{
      | "code": "RULE_NOT_SELF_EMPLOYMENT",
      | "message": "The summary calculation requested is not for a self-employment business"
      |}
    """.stripMargin

}
