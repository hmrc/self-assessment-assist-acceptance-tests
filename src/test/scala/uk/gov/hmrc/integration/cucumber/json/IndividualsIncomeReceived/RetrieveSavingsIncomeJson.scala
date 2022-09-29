/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrieveSavingsIncomeJson {

  def iirSavingsAmendRetrieval: String =
    s"""
       |{
       |   "submittedOn": "UNCHECKED",
       |   "securities": {
       |      "taxTakenOff": 1000.34,
       |      "grossAmount": 1455.45,
       |      "netAmount": 123.22
       |   },
       |   "foreignInterest": [
       |      {
       |         "amountBeforeTax": 1232.45,
       |         "countryCode": "ESP",
       |         "taxTakenOff": 223.56,
       |         "specialWithholdingTax": 22.67,
       |         "taxableAmount": 2324.78,
       |         "foreignTaxCreditRelief": false
       |      },
       |      {
       |         "amountBeforeTax": 1232.22,
       |         "countryCode": "NGA",
       |         "taxTakenOff": 223.22,
       |         "specialWithholdingTax": 223.22,
       |         "taxableAmount": 2321.22,
       |         "foreignTaxCreditRelief": true
       |      }
       |   ],
       |   "links": [
       |      {
       |         "href": "/individuals/income-received/savings/${taxPayer.nino}/2019-20",
       |         "method": "PUT",
       |         "rel": "create-and-amend-savings-income"
       |      },
       |      {
       |         "href": "/individuals/income-received/savings/${taxPayer.nino}/2019-20",
       |         "method": "GET",
       |         "rel": "self"
       |      },
       |      {
       |         "href": "/individuals/income-received/savings/${taxPayer.nino}/2019-20",
       |         "method": "DELETE",
       |         "rel": "delete-savings-income"
       |      }
       |   ]
       |}
     """.stripMargin

}
