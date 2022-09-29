/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsStateBenefitsApi

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object CreateStateBenefitJson {

  val iStateBenefitsAddRequest: String =
    """
      {
      |  "benefitType": "incapacityBenefit",
      |  "startDate": "2019-04-06",
      |  "endDate": "2020-01-01"
      |}
    """.stripMargin

  val iStateBenefitsAddMinimumFieldsRequest: String =
    """
      |{
      |  "benefitType": "incapacityBenefit",
      |  "startDate": "2019-04-06"
      |}
    """.stripMargin

  val iStateBenefitsAddInvalidBodyRequest: String =
    """
      |{
      |  "benefitType": 123
      |}
    """.stripMargin

  val iStateBenefitsAddValueErrorsRequest: String =
    """
      |{
      |  "benefitType": "randomBenefit",
      |  "startDate": "2020-08-013",
      |  "endDate": "2020-12-013"
      |}
     """.stripMargin

  val iStateBenefitsAddValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |      {
      |        "code": "FORMAT_BENEFIT_TYPE",
      |        "message": "The provided benefit type is invalid"
      |      },
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

  val iStateBenefitsAddInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/startDate",
      "/benefitType"
    )
  )

  val RULE_BENEFIT_TYPE_EXISTS: String =
    """
      |{
      | "code" : "RULE_BENEFIT_TYPE_EXISTS",
      | "message" : "A benefit of this type has already been created"
      |}
      |""".stripMargin

}
