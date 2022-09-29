/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrieveDividendsIncomeJson {

  def iirDividendsAmendRetrieval: String =
    s"""
       |{
       |   "submittedOn": "UNCHECKED",
       |   "foreignDividend": [
       |     {
       |       "countryCode": "BRA",
       |       "amountBeforeTax": 1231.22,
       |       "taxTakenOff": 222.22,
       |       "specialWithholdingTax": 2234.22,
       |       "foreignTaxCreditRelief": false,
       |       "taxableAmount": 2325.22
       |     }
       |   ],
       |   "dividendIncomeReceivedWhilstAbroad": [
       |     {
       |       "countryCode": "FIN",
       |       "amountBeforeTax": 1232.22,
       |       "taxTakenOff": 22.22,
       |       "specialWithholdingTax": 22.22,
       |       "foreignTaxCreditRelief": true,
       |       "taxableAmount": 2321.22
       |     }
       |   ],
       |   "stockDividend": {
       |      "customerReference": "my dividends",
       |      "grossAmount": 12322.22
       |   },
       |   "redeemableShares": {
       |      "customerReference": "my shares",
       |      "grossAmount": 12323.22
       |   },
       |   "bonusIssuesOfSecurities": {
       |      "customerReference": "my securities",
       |      "grossAmount": 12324.22
       |   },
       |   "closeCompanyLoansWrittenOff": {
       |      "customerReference": "write off",
       |      "grossAmount": 12325.22
       |   },
       |   "links": [
       |      {
       |         "href": "/individuals/income-received/dividends/${taxPayer.nino}/2019-20",
       |         "method": "PUT",
       |         "rel": "create-and-amend-dividends-income"
       |      },
       |      {
       |         "href": "/individuals/income-received/dividends/${taxPayer.nino}/2019-20",
       |         "method": "GET",
       |         "rel": "self"
       |      },
       |      {
      |         "href": "/individuals/income-received/dividends/${taxPayer.nino}/2019-20",
       |         "method": "DELETE",
       |         "rel": "delete-dividends-income"
       |      }
       |   ]
       |}
     """.stripMargin

}
