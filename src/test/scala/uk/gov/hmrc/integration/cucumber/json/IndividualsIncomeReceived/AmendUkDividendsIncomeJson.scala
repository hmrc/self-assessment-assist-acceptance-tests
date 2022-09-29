/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

object AmendUkDividendsIncomeJson {

  val iirUkDividendsAmendRequest: String =
    """
      |{
      | "ukDividends": 55844806400.99,
      | "otherUkDividends": 60267421355.99
      |}
    """.stripMargin

}
