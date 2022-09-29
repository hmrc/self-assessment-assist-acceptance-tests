/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsStateBenefitsApi

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendStateBenefitJson {

  val iStateBenefitsAmendRequest: String =
    """
      |{
      |  "startDate": "2019-04-06",
      |  "endDate": "2020-01-01"
      |}
    """.stripMargin

  val iStateBenefitsAmendMinimumFieldsRequest: String =
    """
      |{
      |  "startDate": "2019-04-06"
      |}
    """.stripMargin

  val iStateBenefitsAmendInvalidBodyRequest: String =
    """
      |{
      |  "endDate": true
      |}
    """.stripMargin

  val iStateBenefitsAmendEmptyBodyRequest: String =
    """
      |{
      |}
    """.stripMargin

  val iStateBenefitsAmendValueErrorsRequest: String =
    """
      |{
      |  "startDate": "2019-04-064",
      |  "endDate": "2019-04-065"
      |}
    """.stripMargin

  val iStateBenefitsAmendValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors":[
      |      {
      |        "code": "FORMAT_START_DATE",
      |        "message": "The provided start date is invalid"
      |      },
      |      {
      |        "code": "FORMAT_END_DATE",
      |        "message": "The provided end date is invalid"
      |      }
      |   ]
      |}
    """.stripMargin

  val iStateBenefitsAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/endDate",
      "/startDate"
    )
  )

}
