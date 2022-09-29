/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsExpensesApi

object OtherExpensesJson {

  val amendOtherExpenses: String =
    """
      |{
      |    "paymentsToTradeUnionsForDeathBenefits": {
      |       "customerReference": "TRADE UNION PAYMENTS",
      |       "expenseAmount": 123.50
      |    },
      |    "patentRoyaltiesPayments": {
      |       "customerReference": "ROYALTIES PAYMENTS",
      |       "expenseAmount": 493.99
      |    }
      |}
    """.stripMargin

  val amendOtherExpensesMinimumFields: String =
    """
      |{
      |    "paymentsToTradeUnionsForDeathBenefits": {
      |       "expenseAmount": 123.50
      |    },
      |    "patentRoyaltiesPayments":{
      |       "expenseAmount": 493.99
      |    }
      |}
    """.stripMargin

  val amendOtherExpensesMissingErrorsRequest: String =
    """
      |{
      |    "paymentsToTradeUnionsForDeathBenefits": {
      |       "customerReference": "TRADE UNION PAYMENTS"
      |    },
      |    "patentRoyaltiesPayments": {
      |       "customerReference": "ROYALTIES PAYMENTS"
      |    }
      |}
    """.stripMargin

  val amendOtherExpensesValueErrorsRequest: String =
    """
      |{
      |    "paymentsToTradeUnionsForDeathBenefits": {
      |       "customerReference": "TRADE UNION PAYMENTS",
      |       "expenseAmount": 123.500
      |    },
      |    "patentRoyaltiesPayments": {
      |       "customerReference": "ROYALTIES PAYMENTS",
      |       "expenseAmount": 493.999
      |    }
      |}
    """.stripMargin

  val amendOtherExpensesValueErrorsResponse: String =
    """
      |{
      |  "code": "FORMAT_VALUE",
      |  "message": "The field should be between 0 and 99999999999.99",
      |  "paths": [
      |    "/paymentsToTradeUnionsForDeathBenefits/expenseAmount",
      |    "/patentRoyaltiesPayments/expenseAmount"
      |  ]
      |}
    """.stripMargin

}
