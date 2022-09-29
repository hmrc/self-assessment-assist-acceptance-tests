/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsStateBenefitsApi

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendStateBenefitAmountsJson {

  val iStateBenefitsAmendAmountsRequest: String =
    """
      |{
      |  "amount": 123.00,
      |  "taxPaid": 123.00
      |}
    """.stripMargin

  val iStateBenefitsAmendAmountsMinimumFieldsRequest: String =
    """
      |{
      |  "amount": 123.00
      |}
    """.stripMargin

  val iStateBenefitsAmendAmountsInvalidBodyRequest: String =
    """
      |{
      |  "amount": true
      |}
    """.stripMargin

  val iStateBenefitsAmendAmountsEmptyBodyRequest: String =
    """
      |{
      |}
    """.stripMargin

  val iStateBenefitsAmendAmountsValueErrorsRequest: String =
    """
      |{
      |  "amount": -99.99,
      |  "taxPaid": -999999999999.999
      |}
    """.stripMargin

  val iStateBenefitsAmendAmountsValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors":[
      |        {
      |            "code": "FORMAT_VALUE",
      |            "message": "The field should be between 0 and 99999999999.99",
      |            "paths": ["/amount"]
      |        },
      |        {
      |            "code": "FORMAT_VALUE",
      |            "message": "The field should be between -99999999999.99 and 99999999999.99",
      |            "paths": ["/taxPaid"]
      |        }
      |   ]
      |}
    """.stripMargin

  val iStateBenefitsAmendAmountsInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/amount"
    )
  )

  val RULE_TAX_YEAR_NOT_ENDED: String =
    """
      |{
      | "code" : "RULE_TAX_YEAR_NOT_ENDED",
      | "message" : "Tax year not ended"
      |}
    """.stripMargin

}
