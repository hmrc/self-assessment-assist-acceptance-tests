/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendCustomEmploymentJson {

  val iirCustomEmploymentAmendRequest: String =
    """
      |{
      |  "employerRef": "123/AB56797",
      |  "employerName": "AMD infotech Ltd",
      |  "startDate": "2019-01-01",
      |  "cessationDate": "2020-06-01",
      |  "payrollId": "124214112412",
      |  "occupationalPension": false
      |}
    """.stripMargin

  val iirCustomEmploymentAmendMinimumFieldsRequest: String =
    """
      |{
      |  "employerName": "AMD infotech Ltd",
      |  "startDate": "2019-01-01",
      |  "occupationalPension": false
      |}
    """.stripMargin

  val iirCustomEmploymentAmendInvalidBodyRequest: String =
    """
      |{
      |  "employerRef": true
      |}
    """.stripMargin

  val iirCustomEmploymentAmendValueErrorsRequest: String =
    s"""
       |{
       |  "employerRef": "1234/AB56797",
       |  "employerName": "${stringCreator(length = 75)}",
       |  "startDate": "2019-01-013",
       |  "cessationDate": "2020-06-013",
       |  "payrollId": "${stringCreator(length = 75)}",
       |  "occupationalPension": true
       |}
     """.stripMargin

  val iirCustomEmploymentAmendErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors":[
      |      {
      |       "code": "FORMAT_EMPLOYER_REF",
      |       "message": "The provided employer ref is invalid"
      |      },
      |      {
      |       "code": "FORMAT_EMPLOYER_NAME",
      |       "message": "The provided employer name is invalid"
      |      },
      |      {
      |       "code": "FORMAT_START_DATE",
      |       "message": "The provided start date is invalid"
      |      },
      |      {
      |       "code": "FORMAT_CESSATION_DATE",
      |       "message": "The provided cessation date is invalid"
      |      },
      |      {
      |       "code": "FORMAT_PAYROLL_ID",
      |       "message": "The provided payroll ID is invalid"
      |      }
      |   ]
      |}
    """.stripMargin

  val iirCustomEmploymentAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/employerRef",
      "/startDate",
      "/employerName",
      "/occupationalPension"
    )
  )

  def stringCreator(length: Int): String = "-" * length

  val RULE_UPDATE_FORBIDDEN: String =
    """
      |{
      | "code" : "RULE_UPDATE_FORBIDDEN",
      | "message" : "The update for an HMRC held employment is not permitted"
      |}
    """.stripMargin

}
