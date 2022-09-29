/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrieveOtherIncomeJson {

  def iirOtherAmendRetrieval: String =
    s"""
       |{
       |   "submittedOn":"UNCHECKED",
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
       |    "transactionBenefit": 2000.50,
       |      "protectedForeignIncomeSourceBenefit": 1999.99,
       |      "protectedForeignIncomeOnwardGift": 1999.99,
       |      "benefitReceivedAsASettler": 1999.99,
       |      "onwardGiftReceivedAsASettler": 500.50
       |   },
       |   "omittedForeignIncome": {
       |      "amount": 2000.50
       |   },
       |   "links": [
       |      {
       |         "href": "/individuals/income-received/other/${taxPayer.nino}/2019-20",
       |         "method": "PUT",
       |         "rel": "create-and-amend-other-income"
       |      },
       |      {
       |         "href": "/individuals/income-received/other/${taxPayer.nino}/2019-20",
       |         "method": "GET",
       |         "rel": "self"
       |      },
       |      {
       |         "href": "/individuals/income-received/other/${taxPayer.nino}/2019-20",
       |         "method": "DELETE",
       |         "rel": "delete-other-income"
       |      }
       |   ]
       |}
     """.stripMargin

}
