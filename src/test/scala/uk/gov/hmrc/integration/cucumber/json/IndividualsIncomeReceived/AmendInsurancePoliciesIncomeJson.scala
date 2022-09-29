/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendInsurancePoliciesIncomeJson {

  val iirInsurancePoliciesAmendRequest: String =
    """
      |{
      |   "lifeInsurance": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.23,
      |         "taxPaid": false,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1,
      |         "deficiencyRelief": 1.23
      |      }
      |   ],
      |   "capitalRedemption": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.23,
      |         "taxPaid": false,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1,
      |         "deficiencyRelief": 1.23
      |      }
      |   ],
      |   "lifeAnnuity": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.23,
      |         "taxPaid": true,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1,
      |         "deficiencyRelief": 1.23
      |      }
      |   ],
      |   "voidedIsa": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.23,
      |         "taxPaidAmount": 1.23,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1
      |      }
      |   ],
      |   "foreign": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "gainAmount": 1.23,
      |         "taxPaidAmount": 1.23,
      |         "yearsHeld": 2
      |      }
      |   ]
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendRequestAgain: String =
    """
      |{
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
      |   ]
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendMinimumFieldsRequest: String =
    """
      |{
      |   "lifeInsurance": [
      |      {
      |        "gainAmount": 0.01,
      |        "taxPaid": false
      |      }
      |   ]
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendInvalidBodyRequest: String =
    """
      |{
      |   "lifeInsurance": [
      |      {
      |         "gainAmount": "no",
      |         "taxPaid": "false"
      |      }
      |   ]
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendEmptyBodyRequest: String =
    """
      |{
      |  "capitalRedemption": []
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendRefAndEventErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors":[
      |      {
      |         "code": "FORMAT_EVENT",
      |         "message": "The provided policy event is invalid",
      |         "paths":[
      |            "/lifeInsurance/1/event",
      |            "/capitalRedemption/0/event",
      |            "/lifeAnnuity/1/event",
      |            "/voidedIsa/0/event"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_CUSTOMER_REF",
      |         "message": "The provided customer reference is invalid",
      |         "paths":[
      |            "/lifeInsurance/1/customerReference",
      |            "/capitalRedemption/0/customerReference",
      |            "/lifeAnnuity/0/customerReference",
      |            "/lifeAnnuity/1/customerReference",
      |            "/voidedIsa/0/customerReference",
      |            "/foreign/0/customerReference"
      |         ]
      |      }
      |   ]
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendRefAndEventErrorsRequest: String =
    """
      |{
      |   "lifeInsurance": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.23,
      |         "taxPaid": false,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1,
      |         "deficiencyRelief": 1.23
      |      },
      |      {
      |         "customerReference": "This string is 91 characters long ------------------------------------------------------ 91",
      |         "event": "This string is 91 characters long ------------------------------------------------------ 91",

      |         "gainAmount": 1.23,
      |         "taxPaid": false,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1,
      |         "deficiencyRelief": 1.23
      |      }
      |   ],
      |   "capitalRedemption": [
      |      {
      |         "customerReference": "This string is invalid ------- #!@",
      |         "event": "This string is invalid ------- #!@",
      |         "gainAmount": 1.23,
      |         "taxPaid": true,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1,
      |         "deficiencyRelief": 1.23
      |      }
      |   ],
      |   "lifeAnnuity": [
      |      {
      |         "customerReference": "This string is 91 characters long ------------------------------------------------------ 91",
      |         "event": "Policy matured",
      |         "gainAmount": 1.23,
      |         "taxPaid": false,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1,
      |         "deficiencyRelief": 1.23
      |      },
      |      {
      |         "customerReference": "This string is 91 characters long ------------------------------------------------------ 91",
      |         "event": "This string is invalid ------- #!@",
      |         "gainAmount": 1.23,
      |         "taxPaid": false,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1,
      |         "deficiencyRelief": 1.23
      |      }
      |   ],
      |   "voidedIsa": [
      |      {
      |         "customerReference": "This string is invalid ------- #!@",
      |         "event": "This string is 91 characters long ------------------------------------------------------ 91",
      |         "gainAmount": 1.23,
      |         "taxPaidAmount": 1.23,
      |         "yearsHeld": 2,
      |         "yearsHeldSinceLastGain": 1
      |      }
      |   ],
      |   "foreign": [
      |      {
      |         "customerReference": "This string is 91 characters long ------------------------------------------------------ 91",
      |         "gainAmount": 1.23,
      |         "taxPaidAmount": 1.23,
      |         "yearsHeld": 2
      |      }
      |   ]
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendValueErrorsRequest: String =
    """
      |{
      |   "lifeInsurance": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.23,
      |         "taxPaid": false,
      |         "yearsHeld": 20,
      |         "yearsHeldSinceLastGain": 200,
      |         "deficiencyRelief": 100000000000.00
      |      },
      |      {
      |         "customerReference": "INPOLY123B",
      |         "event": "Policy matured",
      |         "gainAmount": -0.01,
      |         "taxPaid": false,
      |         "yearsHeld": 200,
      |         "yearsHeldSinceLastGain": 20,
      |         "deficiencyRelief": 1.23
      |      }
      |   ],
      |   "capitalRedemption": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.234,
      |         "taxPaid": true,
      |         "yearsHeld": 200,
      |         "yearsHeldSinceLastGain": 200,
      |         "deficiencyRelief": 1.234
      |      }
      |   ],
      |   "lifeAnnuity": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.234,
      |         "taxPaid": false,
      |         "yearsHeld": 200,
      |         "yearsHeldSinceLastGain": 200,
      |         "deficiencyRelief": 1.234
      |      }
      |   ],
      |   "voidedIsa": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "event": "Policy matured",
      |         "gainAmount": 1.234,
      |         "taxPaidAmount": 1.234,
      |         "yearsHeld": 200,
      |         "yearsHeldSinceLastGain": 200
      |      }
      |   ],
      |   "foreign": [
      |      {
      |         "customerReference": "INPOLY123A",
      |         "gainAmount": 1.234,
      |         "taxPaidAmount": 1.234,
      |         "yearsHeld": 200
      |      }
      |   ]
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |      {
      |         "code": "FORMAT_VALUE",
      |         "message": "The value must be between 0 and 99999999999.99",
      |         "paths": [
      |            "/lifeInsurance/0/deficiencyRelief",
      |            "/lifeInsurance/1/gainAmount",
      |            "/capitalRedemption/0/gainAmount",
      |            "/capitalRedemption/0/deficiencyRelief",
      |            "/lifeAnnuity/0/gainAmount",
      |            "/lifeAnnuity/0/deficiencyRelief",
      |            "/voidedIsa/0/gainAmount",
      |            "/voidedIsa/0/taxPaidAmount",
      |            "/foreign/0/gainAmount",
      |            "/foreign/0/taxPaidAmount"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_VALUE",
      |         "message": "The value must be between 0 and 99",
      |         "paths": [
      |            "/lifeInsurance/0/yearsHeldSinceLastGain",
      |            "/lifeInsurance/1/yearsHeld",
      |            "/capitalRedemption/0/yearsHeld",
      |            "/capitalRedemption/0/yearsHeldSinceLastGain",
      |            "/lifeAnnuity/0/yearsHeld",
      |            "/lifeAnnuity/0/yearsHeldSinceLastGain",
      |            "/voidedIsa/0/yearsHeld",
      |            "/voidedIsa/0/yearsHeldSinceLastGain",
      |            "/foreign/0/yearsHeld"
      |         ]
      |      }
      |   ]
      |}
    """.stripMargin

  val iirInsurancePoliciesAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/lifeInsurance/0/taxPaid",
      "/lifeInsurance/0/gainAmount"
    )
  )

}
