/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrievePensionsIncomeJson {

  def iirPensionsAmendRetrieval: String =
    s"""
       |{
       |   "submittedOn": "UNCHECKED",
       |   "foreignPensions": [
       |      {
       |         "countryCode": "IND",
       |         "amountBeforeTax": 1000.23,
       |         "taxTakenOff": 10.23,
       |         "specialWithholdingTax": 22.23,
       |         "foreignTaxCreditRelief": true,
       |         "taxableAmount": 3.23
       |      }
       |   ],
       |   "overseasPensionContributions": [
       |      {
       |         "customerReference": "PENSIONINCOME246",
       |         "exemptEmployersPensionContribs": 250.23,
       |         "migrantMemReliefQopsRefNo": "QOPS000000",
       |         "dblTaxationRelief": 4.23,
       |         "dblTaxationCountryCode": "BEL",
       |         "dblTaxationArticle": "AB3211-1",
       |         "dblTaxationTreaty": "Treaty",
       |         "sf74reference": "SF74-123456"
       |      }
       |   ],
       |   "links": [
       |      {
       |         "href": "/individuals/income-received/pensions/${taxPayer.nino}/2019-20",
       |         "method": "PUT",
       |         "rel": "create-and-amend-pensions-income"
       |      },
       |      {
       |         "href": "/individuals/income-received/pensions/${taxPayer.nino}/2019-20",
       |         "method": "GET",
       |         "rel": "self"
       |      },
       |      {
       |         "href": "/individuals/income-received/pensions/${taxPayer.nino}/2019-20",
       |         "method": "DELETE",
       |         "rel": "delete-pensions-income"
       |      }
       |   ]
       |}
     """.stripMargin

}
