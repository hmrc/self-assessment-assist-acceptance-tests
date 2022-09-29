/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaAccountsApi

object TransactionDetailsJson {

  val NO_DETAILS_FOUND: String =
    """
      |{
      | "code": "NO_DETAILS_FOUND",
      | "message": "No transaction details found"
      |}
    """.stripMargin

}
