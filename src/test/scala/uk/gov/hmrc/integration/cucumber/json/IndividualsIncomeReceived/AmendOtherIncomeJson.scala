/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendOtherIncomeJson {

  val iirOtherAmendRequest: String =
    """
      |{
      |   "businessReceipts": [
      |      {
      |         "grossAmount": 1999.99,
      |         "taxYear": "2019-20"
      |      }
      |   ],
      |   "allOtherIncomeReceivedWhilstAbroad": [
      |      {
      |         "countryCode": "FRA",
      |         "amountBeforeTax": 1999.99,
      |         "taxTakenOff": 1999.99,
      |         "specialWithholdingTax": 1999.99,
      |         "foreignTaxCreditRelief": true,
      |         "taxableAmount": 1999.99,
      |         "residentialFinancialCostAmount": 1999.99,
      |         "broughtFwdResidentialFinancialCostAmount": 1999.99
      |      }
      |   ],
      |   "overseasIncomeAndGains": {
      |      "gainAmount": 1999.99
      |   },
      |   "chargeableForeignBenefitsAndGifts": {
      |      "transactionBenefit": 1999.99,
      |      "protectedForeignIncomeSourceBenefit": 1999.99,
      |      "protectedForeignIncomeOnwardGift": 1999.99,
      |      "benefitReceivedAsASettler": 1999.99,
      |      "onwardGiftReceivedAsASettler": 1999.99
      |   },
      |   "omittedForeignIncome": {
      |      "amount": 1999.99
      |   }
      |}
    """.stripMargin

  val iirOtherAmendRequestAgain: String =
    """
      |{
      |   "businessReceipts": [
      |      {
      |         "grossAmount": 2000.50,
      |         "taxYear": "2019-20"
      |      }
      |   ],
      |   "allOtherIncomeReceivedWhilstAbroad": [
      |      {
      |         "countryCode": "ESP",
      |         "amountBeforeTax": 1999.99,
      |         "taxTakenOff": 1999.99,
      |         "specialWithholdingTax": 1999.99,
      |         "foreignTaxCreditRelief": true,
      |         "taxableAmount": 1999.99,
      |         "residentialFinancialCostAmount": 1000.99,
      |         "broughtFwdResidentialFinancialCostAmount": 1000.99
      |      }
      |   ],
      |   "overseasIncomeAndGains": {
      |      "gainAmount": 2000.50
      |   },
      |   "chargeableForeignBenefitsAndGifts": {
      |      "transactionBenefit": 2000.50,
      |      "protectedForeignIncomeSourceBenefit": 1999.99,
      |      "protectedForeignIncomeOnwardGift": 1999.99,
      |      "benefitReceivedAsASettler": 1999.99,
      |      "onwardGiftReceivedAsASettler": 500.50
      |   },
      |   "omittedForeignIncome": {
      |      "amount": 2000.50
      |   }
      |}
    """.stripMargin

  val iirOtherAmendMinimumFieldsRequest: String =
    """
      |{
      |   "businessReceipts": [
      |      {
      |         "grossAmount": 5000.99,
      |         "taxYear": "2018-19"
      |      }
      |   ],
      |   "allOtherIncomeReceivedWhilstAbroad": [
      |      {
      |         "countryCode": "FRA",
      |         "taxableAmount": 4.23,
      |         "foreignTaxCreditRelief": true
      |      }
      |   ],
      |   "overseasIncomeAndGains": {
      |      "gainAmount": 3000.99
      |   },
      |   "omittedForeignIncome": {
      |      "amount": 4000.99
      |   }
      |}
    """.stripMargin

  val iirOtherAmendInvalidBodyRequest: String =
    """
      |{
      |   "businessReceipts": [
      |     {
      |        "grossAmount": "No"
      |     }
      |   ]
      |}
    """.stripMargin

  val iirOtherAmendValueErrorsRequest: String =
    """
      |{
      |   "businessReceipts": [
      |      {
      |         "grossAmount": 5000.999,
      |         "taxYear": "2019"
      |      },
      |      {
      |         "grossAmount": 6000.999,
      |         "taxYear": "2019-21"
      |      }
      |   ],
      |   "allOtherIncomeReceivedWhilstAbroad": [
      |      {
      |         "countryCode": "FRANCE",
      |         "amountBeforeTax": -1999.99,
      |         "taxTakenOff": -2.23,
      |         "specialWithholdingTax": 3.233,
      |         "foreignTaxCreditRelief": false,
      |         "taxableAmount": 4.233,
      |         "residentialFinancialCostAmount": -2999.99,
      |         "broughtFwdResidentialFinancialCostAmount": 1999.995
      |      },
      |      {
      |         "countryCode": "SBT",
      |         "amountBeforeTax": -2999.99,
      |         "taxTakenOff": -3.23,
      |         "specialWithholdingTax": 4.235,
      |         "foreignTaxCreditRelief": true,
      |         "taxableAmount": 5.253,
      |         "residentialFinancialCostAmount": 3999.959,
      |         "broughtFwdResidentialFinancialCostAmount": -2999.99
      |      }
      |   ],
      |   "overseasIncomeAndGains": {
      |      "gainAmount": 3000.993
      |   },
      |   "chargeableForeignBenefitsAndGifts": {
      |      "transactionBenefit": 1999.992,
      |      "protectedForeignIncomeSourceBenefit": 2999.999,
      |      "protectedForeignIncomeOnwardGift": -3999.99,
      |      "benefitReceivedAsASettler": -4999.99,
      |      "onwardGiftReceivedAsASettler": 5999.996
      |   },
      |   "omittedForeignIncome": {
      |      "amount": -4000.99
      |   }
      |}
    """.stripMargin

  val iirOtherIncomeAmendEmptyBodyRequest: String =
    """
      |{
      |   "businessReceipts": [
      |   ],
      |   "allOtherIncomeReceivedWhilstAbroad": [
      |   ]
      |}
    """.stripMargin

  val iirOtherAmendValueErrorsResponse: String =
    """
      |{
      |  "code": "INVALID_REQUEST",
      |  "errors": [
      |    {
      |    "code": "FORMAT_TAX_YEAR",
      |      "message": "The provided tax year is invalid",
      |      "paths": [
      |        "/businessReceipts/0/taxYear"
      |      ]
      |    },
      |    {
      |      "code": "RULE_COUNTRY_CODE",
      |      "message": "The country code is not a valid ISO 3166-1 alpha-3 country code",
      |      "paths": [
      |        "/allOtherIncomeReceivedWhilstAbroad/1/countryCode"
      |      ]
      |    },
      |    {
      |      "code": "RULE_TAX_YEAR_RANGE_INVALID",
      |      "message": "Tax year range invalid. A tax year range of one year is required",
      |      "paths": [
      |        "/businessReceipts/1/taxYear"
      |      ]
      |    },
      |    {
      |      "code": "FORMAT_COUNTRY_CODE",
      |      "message": "The format of the country code is invalid",
      |      "paths": [
      |        "/allOtherIncomeReceivedWhilstAbroad/0/countryCode"
      |      ]
      |    },
      |    {
      |      "code": "FORMAT_VALUE",
      |      "message": "The value must be between 0 and 99999999999.99",
      |      "paths": [
      |        "/businessReceipts/0/grossAmount",
      |        "/businessReceipts/1/grossAmount",
      |        "/allOtherIncomeReceivedWhilstAbroad/0/amountBeforeTax",
      |        "/allOtherIncomeReceivedWhilstAbroad/0/taxTakenOff",
      |        "/allOtherIncomeReceivedWhilstAbroad/0/specialWithholdingTax",
      |        "/allOtherIncomeReceivedWhilstAbroad/0/taxableAmount",
      |        "/allOtherIncomeReceivedWhilstAbroad/0/residentialFinancialCostAmount",
      |        "/allOtherIncomeReceivedWhilstAbroad/0/broughtFwdResidentialFinancialCostAmount",
      |        "/allOtherIncomeReceivedWhilstAbroad/1/amountBeforeTax",
      |        "/allOtherIncomeReceivedWhilstAbroad/1/taxTakenOff",
      |        "/allOtherIncomeReceivedWhilstAbroad/1/specialWithholdingTax",
      |        "/allOtherIncomeReceivedWhilstAbroad/1/taxableAmount",
      |        "/allOtherIncomeReceivedWhilstAbroad/1/residentialFinancialCostAmount",
      |        "/allOtherIncomeReceivedWhilstAbroad/1/broughtFwdResidentialFinancialCostAmount",
      |        "/overseasIncomeAndGains/gainAmount",
      |        "/chargeableForeignBenefitsAndGifts/transactionBenefit",
      |        "/chargeableForeignBenefitsAndGifts/protectedForeignIncomeSourceBenefit",
      |        "/chargeableForeignBenefitsAndGifts/protectedForeignIncomeOnwardGift",
      |        "/chargeableForeignBenefitsAndGifts/benefitReceivedAsASettler",
      |        "/chargeableForeignBenefitsAndGifts/onwardGiftReceivedAsASettler",
      |        "/omittedForeignIncome/amount"
      |      ]
      |    }
      |  ],
      |  "message": "Invalid request"
      |}
    """.stripMargin

  val iirOtherAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/businessReceipts/0/taxYear",
      "/businessReceipts/0/grossAmount"
    )
  )

}
