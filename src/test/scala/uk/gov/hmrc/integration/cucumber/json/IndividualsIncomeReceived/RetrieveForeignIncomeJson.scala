/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrieveForeignIncomeJson {

  def iirForeignAmendRetrieval: String =
    s"""
       |{
       |   "submittedOn": "UNCHECKED",
       |   "foreignEarnings": {
       |     "customerReference": "FOREIGNINCME123A",
       |     "earningsNotTaxableUK": 5999.99
       |   },
       |   "unremittableForeignIncome": [
       |     {
       |       "countryCode": "FRA",
       |       "amountInForeignCurrency": 2000.99,
       |       "amountTaxPaid": 1234.56
       |     },
       |     {
       |       "countryCode": "DEU",
       |       "amountInForeignCurrency": 4999.99,
       |       "amountTaxPaid": 1000.55
       |     }
       |   ],
       |   "links":[
       |      {
       |         "href": "/individuals/income-received/foreign/${taxPayer.nino}/2019-20",
       |         "method": "GET",
       |         "rel": "self"
       |      },
       |      {
       |         "href": "/individuals/income-received/foreign/${taxPayer.nino}/2019-20",
       |         "method": "PUT",
       |         "rel": "create-and-amend-foreign-income"
       |      },
       |      {
       |         "href": "/individuals/income-received/foreign/${taxPayer.nino}/2019-20",
       |         "method": "DELETE",
       |         "rel": "delete-foreign-income"
       |      }
       |   ]
       |}
     """.stripMargin

}
