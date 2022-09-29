/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

object AmendUkSavingsAccountIncomeJson {

  val iirUkSavingsAccountAmendRequest: String =
    """
      |{
      | "taxedUkInterest": 31554452289.99,
      | "untaxedUkInterest": 91523009816.00
      |}
    """.stripMargin
}
