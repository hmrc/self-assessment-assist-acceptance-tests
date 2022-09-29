/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V3

object V3CommonBsasJson {

  val BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT: String =
    """
      |{
      | "code" : "RULE_TYPE_OF_BUSINESS_INCORRECT",
      | "message" : "The calculation ID supplied relates to a different type of business"
      |}
    """.stripMargin

}
