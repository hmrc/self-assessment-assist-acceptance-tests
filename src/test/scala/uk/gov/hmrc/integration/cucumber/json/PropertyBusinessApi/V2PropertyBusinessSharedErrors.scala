/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

object V2PropertyBusinessSharedErrors {

  val RULE_TYPE_OF_BUSINESS_INCORRECT_RESPONSE: String =
    """
      |{
      | "code": "RULE_TYPE_OF_BUSINESS_INCORRECT",
      | "message": "The businessId is for a different type of business"
      |}
    """.stripMargin

}
