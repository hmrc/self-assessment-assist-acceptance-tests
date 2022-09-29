/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

object DeleteCustomEmploymentJson {

  val RULE_DELETE_FORBIDDEN_INCOME_RECEIVED: String =
    """
      |{
      |   "code": "RULE_DELETE_FORBIDDEN",
      |   "message": "A deletion of an HMRC held employment is not permitted"
      |}
    """.stripMargin

}
