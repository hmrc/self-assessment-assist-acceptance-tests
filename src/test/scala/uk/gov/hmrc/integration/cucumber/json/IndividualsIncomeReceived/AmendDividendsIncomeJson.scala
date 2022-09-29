/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendDividendsIncomeJson {

  val iirDividendsAmendRequest: String =
    """
      |{
      |    "foreignDividend": [
      |      {
      |        "countryCode": "DEU",
      |        "amountBeforeTax": 1232.22,
      |        "taxTakenOff": 22.22,
      |        "specialWithholdingTax": 22.22,
      |        "foreignTaxCreditRelief": true,
      |        "taxableAmount": 2321.22
      |      }
      |    ],
      |    "dividendIncomeReceivedWhilstAbroad": [
      |      {
      |        "countryCode": "DEU",
      |        "amountBeforeTax": 1232.22,
      |        "taxTakenOff": 22.22,
      |        "specialWithholdingTax": 22.22,
      |        "foreignTaxCreditRelief": true,
      |        "taxableAmount": 2321.22
      |      }
      |    ],
      |    "stockDividend": {
      |       "customerReference": "my divs",
      |       "grossAmount": 12321.22
      |    },
      |    "redeemableShares": {
      |       "customerReference": "my shares",
      |       "grossAmount": 12321.22
      |    },
      |    "bonusIssuesOfSecurities": {
      |       "customerReference": "my secs",
      |       "grossAmount": 12321.22
      |    },
      |    "closeCompanyLoansWrittenOff": {
      |       "customerReference": "write off",
      |       "grossAmount": 12321.22
      |    }
      |}
    """.stripMargin

  val iirDividendsAmendMinimumFieldsRequest: String =
    """
      |{
      |   "foreignDividend":[
      |      {
      |         "countryCode": "DEU",
      |         "foreignTaxCreditRelief": true,
      |         "taxableAmount": 2321.22
      |      }
      |   ],
      |   "dividendIncomeReceivedWhilstAbroad":[
      |      {
      |         "countryCode": "DEU",
      |         "foreignTaxCreditRelief": true,
      |         "taxableAmount": 2321.22
      |      }
      |   ],
      |   "stockDividend": {
      |      "grossAmount": 12321.22
      |      },
      |   "redeemableShares": {
      |      "grossAmount": 12321.22
      |      },
      |   "bonusIssuesOfSecurities": {
      |      "grossAmount": 12321.22
      |      },
      |   "closeCompanyLoansWrittenOff": {
      |      "grossAmount": 12321.22
      |      }
      |}
    """.stripMargin

  val iirDividendsAmendInvalidBodyRequest: String =
    """
      |{
      |   "foreignDividend":[
      |      {
      |         "taxableAmount": "false"
      |      }
      |   ]
      |}
    """.stripMargin

  val iirDividendsAmendValueErrorsRequest: String =
    """
      |{
      |    "foreignDividend": [
      |      {
      |        "countryCode": "SBT",
      |        "amountBeforeTax": 1232.222,
      |        "taxTakenOff": 22.220,
      |        "specialWithholdingTax": -22.222,
      |        "foreignTaxCreditRelief": true,
      |        "taxableAmount": 2321.222
      |      }
      |    ],
      |    "dividendIncomeReceivedWhilstAbroad": [
      |      {
      |        "countryCode": "GERMANY",
      |        "amountBeforeTax": 1232.226,
      |        "taxTakenOff": 22.222,
      |        "specialWithholdingTax": 2212.122,
      |        "foreignTaxCreditRelief": true,
      |        "taxableAmount": 2321.212
      |      }
      |    ],
      |    "stockDividend": {
      |      "customerReference": "DIVIDENDSINCOME246#!",
      |      "grossAmount": 12321.222
      |      },
      |    "redeemableShares": {
      |      "customerReference": "my divs",
      |      "grossAmount": 12321.221
      |    },
      |      "bonusIssuesOfSecurities": {
      |        "customerReference": "my secs",
      |        "grossAmount": 12321.222
      |    },
      |    "closeCompanyLoansWrittenOff": {
      |      "customerReference": "write off",
      |      "grossAmount": 12321.221
      |    }
      |}
    """.stripMargin

  val iirDividendsAmendValueErrorsResponse: String =
    """
      |{
      |    "code": "INVALID_REQUEST",
      |    "errors": [
      |        {
      |            "code": "RULE_COUNTRY_CODE",
      |            "message": "The country code is not a valid ISO 3166-1 alpha-3 country code",
      |            "paths": [
      |                "/foreignDividend/0/countryCode"
      |            ]
      |        },
      |        {
      |            "code": "FORMAT_COUNTRY_CODE",
      |            "message": "The format of the country code is invalid",
      |            "paths": [
      |            "/dividendIncomeReceivedWhilstAbroad/0/countryCode"
      |            ]
      |        },
      |        {
      |         "code":"FORMAT_CUSTOMER_REF",
      |         "message":"The provided customer reference is invalid",
      |         "paths":[
      |            "/stockDividend/customerReference"
      |         ]
      |        },
      |        {
      |            "code": "FORMAT_VALUE",
      |            "message": "The value must be between 0 and 99999999999.99",
      |            "paths": [
      |                "/foreignDividend/0/amountBeforeTax",
      |                "/foreignDividend/0/taxTakenOff",
      |                "/foreignDividend/0/specialWithholdingTax",
      |                "/foreignDividend/0/taxableAmount",
      |                "/dividendIncomeReceivedWhilstAbroad/0/amountBeforeTax",
      |                "/dividendIncomeReceivedWhilstAbroad/0/taxTakenOff",
      |                "/dividendIncomeReceivedWhilstAbroad/0/specialWithholdingTax",
      |                "/dividendIncomeReceivedWhilstAbroad/0/taxableAmount",
      |                "/stockDividend/grossAmount",
      |                "/redeemableShares/grossAmount",
      |                "/bonusIssuesOfSecurities/grossAmount",
      |                "/closeCompanyLoansWrittenOff/grossAmount"
      |            ]
      |        }
      |    ],
      |    "message": "Invalid request"
      |}
    """.stripMargin

  val iirDividendsAmendEmptyBodyRequest: String =
    """
      |{
      |   "foreignDividend":[
      |   ],
      |   "dividendIncomeReceivedWhilstAbroad":[
      |   ]
      |}
    """.stripMargin

  val iirDividendsAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/foreignDividend/0/taxableAmount",
      "/foreignDividend/0/foreignTaxCreditRelief",
      "/foreignDividend/0/countryCode"
    )
  )

}
