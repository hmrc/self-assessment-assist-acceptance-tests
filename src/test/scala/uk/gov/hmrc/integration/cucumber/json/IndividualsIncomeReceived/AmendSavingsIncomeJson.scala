/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendSavingsIncomeJson {

  val iirSavingsAmendRequest: String =
    """
      |{
      |  "securities": {
      |    "taxTakenOff": 100.34,
      |    "grossAmount": 1455.45,
      |    "netAmount": 123.22
      |  },
      |  "foreignInterest": [
      |    {
      |      "amountBeforeTax": 1232.45,
      |      "countryCode": "FRA",
      |      "taxTakenOff": 22.56,
      |      "specialWithholdingTax": 22.67,
      |      "taxableAmount": 2321.78,
      |      "foreignTaxCreditRelief": false
      |    },
      |    {
      |      "amountBeforeTax": 1232.22,
      |      "countryCode": "DEU",
      |      "taxTakenOff": 22.22,
      |      "specialWithholdingTax": 22.22,
      |      "taxableAmount": 2321.22,
      |      "foreignTaxCreditRelief": true
      |    }
      |  ]
      |}
    """.stripMargin

  val iirSavingsAmendRequestAgain: String =
    """
      |{
      |  "securities": {
      |    "taxTakenOff": 1000.34,
      |    "grossAmount": 1455.45,
      |    "netAmount": 123.22
      |  },
      |  "foreignInterest": [
      |    {
      |      "amountBeforeTax": 1232.45,
      |      "countryCode": "ESP",
      |      "taxTakenOff": 223.56,
      |      "specialWithholdingTax": 22.67,
      |      "taxableAmount": 2324.78,
      |      "foreignTaxCreditRelief": false
      |    },
      |    {
      |      "amountBeforeTax": 1232.22,
      |      "countryCode": "NGA",
      |      "taxTakenOff": 223.22,
      |      "specialWithholdingTax": 223.22,
      |      "taxableAmount": 2321.22,
      |      "foreignTaxCreditRelief": true
      |    }
      |  ]
      |}
    """.stripMargin

  val iirSavingsAmendMinimumFieldsRequest: String =
    """
      |{
      |  "securities": {
      |    "grossAmount": 1455.45
      |  },
      |  "foreignInterest": [
      |    {
      |      "countryCode": "DEU",
      |      "taxableAmount": 0.01,
      |      "foreignTaxCreditRelief": true
      |    }
      |  ]
      |}
    """.stripMargin

  val iirSavingsAmendValueErrorsRequest: String =
    """
      |{
      |  "securities": {
      |    "taxTakenOff": 0.999,
      |    "grossAmount": 0.99,
      |    "netAmount": 0.999
      |  },
      |  "foreignInterest": [
      |    {
      |      "amountBeforeTax": 0.99,
      |      "countryCode": "FRAN",
      |      "taxTakenOff": 0.999,
      |      "specialWithholdingTax": 0.999,
      |      "taxableAmount": 0.999,
      |      "foreignTaxCreditRelief": false
      |    },
      |    {
      |      "amountBeforeTax": 0.999,
      |      "countryCode": "DEU",
      |      "taxTakenOff": 0.999,
      |      "specialWithholdingTax": 0.99,
      |      "taxableAmount": 0.999,
      |      "foreignTaxCreditRelief": true
      |    }
      |  ]
      |}
    """.stripMargin

  val iirSavingsAmendInvalidBodyRequest: String =
    """
      |{
      |  "foreignInterest": [
      |    {
      |      "foreignTaxCreditRelief": "true"
      |    }
      |  ]
      |}
    """.stripMargin

  val iirSavingsAmendEmptyBodyRequest: String =
    """
      |{
      |  "foreignInterest": []
      |}
    """.stripMargin

  val iirSavingsAmendValueErrorsResponse: String =
    """
      |{
      |  "code": "INVALID_REQUEST",
      |  "message": "Invalid request",
      |  "errors": [
      |    {
      |      "code": "FORMAT_VALUE",
      |       "message": "The value must be between 0 and 99999999999.99",
      |       "paths": [
      |         "/securities/taxTakenOff",
      |         "/securities/netAmount",
      |         "/foreignInterest/0/taxTakenOff",
      |         "/foreignInterest/0/specialWithholdingTax",
      |         "/foreignInterest/0/taxableAmount",
      |         "/foreignInterest/1/amountBeforeTax",
      |         "/foreignInterest/1/taxTakenOff",
      |         "/foreignInterest/1/taxableAmount"
      |      ]
      |    },
      |    {
      |      "code": "FORMAT_COUNTRY_CODE",
      |      "message": "The format of the country code is invalid",
      |      "paths": [
      |        "/foreignInterest/0/countryCode"
      |      ]
      |      }
      |   ]
      |}
    """.stripMargin

  val iirSavingsAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/foreignInterest/0/taxableAmount",
      "/foreignInterest/0/foreignTaxCreditRelief",
      "/foreignInterest/0/countryCode"
    )
  )

}
