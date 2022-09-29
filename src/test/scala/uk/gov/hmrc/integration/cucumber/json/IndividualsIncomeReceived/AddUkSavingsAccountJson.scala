/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

object AddUkSavingsAccountJson {

  val iirUkSavingsAccountAddRequest: String =
    """
      |{
      |   "accountName": "Shares savings account"
      |}
    """.stripMargin

  val RULE_MAXIMUM_SAVINGS_ACCOUNTS_LIMIT: String =
    """
      |{
      | "code" : "RULE_MAXIMUM_SAVINGS_ACCOUNTS_LIMIT",
      | "message" : "The 1000 savings account limit exceeded"
      |}
    """.stripMargin

  val RULE_DUPLICATE_ACCOUNT_NAME: String =
    """
      |{
      | "code" : "RULE_DUPLICATE_ACCOUNT_NAME",
      | "message" : "Duplicate account name given for supplied NINO"
      |}
    """.stripMargin


}
