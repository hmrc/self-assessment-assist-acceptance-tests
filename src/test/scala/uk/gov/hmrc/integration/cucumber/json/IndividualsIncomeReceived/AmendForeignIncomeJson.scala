/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendForeignIncomeJson {

  val iirForeignAmendRequest: String =
    """
      |{
      |    "foreignEarnings": {
      |        "customerReference": "FOREIGNINCME123A",
      |        "earningsNotTaxableUK": 1999.99
      |    },
      |    "unremittableForeignIncome": [
      |        {
      |            "countryCode": "FRA",
      |            "amountInForeignCurrency": 1999.99,
      |            "amountTaxPaid": 1999.99
      |        },
      |        {
      |            "countryCode": "IND",
      |            "amountInForeignCurrency": 2999.99,
      |            "amountTaxPaid": 2999.99
      |        }
      |    ]
      |}
    """.stripMargin

  val iirForeignAmendRequestAgain: String =
    """
      |{
      |    "foreignEarnings": {
      |        "customerReference": "FOREIGNINCME123A",
      |        "earningsNotTaxableUK": 5999.99
      |    },
      |    "unremittableForeignIncome": [
      |        {
      |            "countryCode": "FRA",
      |            "amountInForeignCurrency": 2000.99,
      |            "amountTaxPaid": 1234.56
      |        },
      |        {
      |            "countryCode": "DEU",
      |            "amountInForeignCurrency": 4999.99,
      |            "amountTaxPaid": 1000.55
      |        }
      |    ]
      |}
    """.stripMargin

  val iirForeignIncomeAmendMinimumFieldsRequest: String =
    """
      |{
      |    "unremittableForeignIncome": [
      |        {
      |            "amountInForeignCurrency": 1999.99,
      |            "countryCode": "FRA"
      |        },
      |        {
      |            "amountInForeignCurrency": 3210.99,
      |            "countryCode": "IND"
      |        }
      |    ]
      |}
    """.stripMargin

  val iirForeignIncomeAmendInvalidBodyRequest: String =
    """
      |{
      |    "foreignEarnings": {
      |        "customerReference": true,
      |        "earningsNotTaxableUK": "nope"
      |    }
      |}
    """.stripMargin

  val iirForeignIncomeAmendValueErrorsRequest: String =
    """
      |{
      |    "foreignEarnings": {
      |        "customerReference": "FOREIGNINCME123A",
      |        "earningsNotTaxableUK": 1999.99
      |    },
      |    "unremittableForeignIncome": [
      |        {
      |            "countryCode": "FRA",
      |            "amountInForeignCurrency": 1999.999,
      |            "amountTaxPaid": 1999.99
      |        },
      |        {
      |            "countryCode": "IND",
      |            "amountInForeignCurrency": 2999.99,
      |            "amountTaxPaid": 2999.999
      |        }
      |    ]
      |}
    """.stripMargin

  val iirForeignIncomeAmendEmptyBodyRequest: String =
    """
      |{
      |  "unremittableForeignIncome": []
      |}
    """.stripMargin

  val iirForeignIncomeAmendValueErrorsResponse: String =
    """
      |{
      |  "code": "FORMAT_VALUE",
      |  "message": "The value must be between 0 and 99999999999.99",
      |  "paths": [
      |    "/unremittableForeignIncome/0/amountInForeignCurrency",
      |    "/unremittableForeignIncome/1/amountTaxPaid"
      |  ]
      |}
    """.stripMargin

  val iirForeignIncomeAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/foreignEarnings/earningsNotTaxableUK",
      "/foreignEarnings/customerReference"
    )
  )

}
