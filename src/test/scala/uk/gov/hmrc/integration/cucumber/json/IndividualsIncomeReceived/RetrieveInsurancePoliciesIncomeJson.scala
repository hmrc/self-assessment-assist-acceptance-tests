/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrieveInsurancePoliciesIncomeJson {

  def iirInsurancePoliciesAmendRetrieval: String =
    s"""
       |{
       |   "submittedOn": "UNCHECKED",
       |   "lifeInsurance": [
       |      {
       |         "customerReference": "INPOLY235B",
       |         "event": "Policy matured",
       |         "gainAmount": 10.23,
       |         "taxPaid": false,
       |         "yearsHeld": 20,
       |         "yearsHeldSinceLastGain": 10,
       |         "deficiencyRelief": 125.25
       |      }
       |   ],
       |   "capitalRedemption": [
       |      {
       |         "customerReference": "INPOLY235B",
       |         "event": "Policy matured",
       |         "gainAmount": 15.45,
       |         "taxPaid": false,
       |         "yearsHeld": 22,
       |         "yearsHeldSinceLastGain": 18,
       |         "deficiencyRelief": 19.75
       |      }
       |   ],
       |   "lifeAnnuity": [
       |      {
       |         "customerReference": "INPOLY235B",
       |         "event": "Policy matured",
       |         "gainAmount": 14.95,
       |         "taxPaid": true,
       |         "yearsHeld": 17,
       |         "yearsHeldSinceLastGain": 15,
       |         "deficiencyRelief": 17.99
       |      }
       |   ],
       |   "voidedIsa": [
       |      {
       |         "customerReference": "INPOLY235B",
       |         "event": "Policy matured",
       |         "gainAmount": 30.99,
       |         "taxPaidAmount": 13.25,
       |         "yearsHeld": 24,
       |         "yearsHeldSinceLastGain": 12
       |      }
       |   ],
       |   "foreign": [
       |      {
       |         "customerReference": "INPOLY235B",
       |         "gainAmount": 1.23,
       |         "taxPaidAmount": 1.23,
       |         "yearsHeld": 11
       |      }
       |   ],
       |   "links": [
       |      {
       |         "href": "/individuals/income-received/insurance-policies/${taxPayer.nino}/2019-20",
       |         "method": "PUT",
       |         "rel": "create-and-amend-insurance-policies-income"
       |      },
       |      {
       |         "href": "/individuals/income-received/insurance-policies/${taxPayer.nino}/2019-20",
       |         "method": "GET",
       |         "rel": "self"
       |      },
       |      {
       |         "href": "/individuals/income-received/insurance-policies/${taxPayer.nino}/2019-20",
       |         "method": "DELETE",
       |         "rel": "delete-insurance-policies-income"
       |      }
       |   ]
       |}
     """.stripMargin

}
