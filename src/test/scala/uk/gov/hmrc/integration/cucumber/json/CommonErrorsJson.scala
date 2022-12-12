/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json

import play.api.libs.json.Json

object CommonErrorsJson {

  val CLIENT_OR_AGENT_NOT_AUTHORISED: String =
    """
      |{
      | "code" : "CLIENT_OR_AGENT_NOT_AUTHORISED",
      | "message" : "The client and/or agent is not authorised"
      |}
    """.stripMargin

  val CLIENT_OR_AGENT_NOT_AUTHORISED_v2: String =
    """
      |{
      | "code" : "CLIENT_OR_AGENT_NOT_AUTHORISED",
      | "message" : "The client or agent is not authorised"
      |}
    """.stripMargin

  val CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API: String =
    """
      |{
      | "code" : "CLIENT_OR_AGENT_NOT_AUTHORISED",
      | "message" : "The client and/or agent is not authorised."
      |}
    """.stripMargin

  val ACCEPT_HEADER_INVALID: String =
    """
      |{
      | "code" : "ACCEPT_HEADER_INVALID",
      | "message" : "The accept header is missing or invalid"
      |}
     """.stripMargin

  val CLIENT_NOT_SUBSCRIBED: String =
    """
      |{
      | "code": "CLIENT_NOT_SUBSCRIBED",
      | "message": "The client is not subscribed to MTD"
      |}
    """.stripMargin

  val UNAUTHORIZED: String =
    """
      |{
      | "code": "UNAUTHORIZED",
      | "message": "Bearer token is missing or not authorized"
      |}
    """.stripMargin

  val MISSING_CREDENTIALS: String =
    """
      |{
      | "code": "MISSING_CREDENTIALS",
      | "message": "Authentication information is not provided"
      |}
    """.stripMargin

  val INVALID_BODY_TYPE: String =
    """
      |{
      | "code" : "INVALID_BODY_TYPE",
      | "message" : "Expecting text/json or application/json body"
      |}
    """.stripMargin

  val AGENT_NOT_AUTHORIZED: String =
    """
      |{
      | "code": "AGENT_NOT_AUTHORIZED",
      | "message": "The agent is not authorized"
      |}
    """.stripMargin

  val INTERNAL_SERVER_ERROR: String =
    """
      |{
      | "code": "INTERNAL_SERVER_ERROR",
      | "message": "An internal server error occurred"
      |}
    """.stripMargin

  val FORMAT_REPORT_ID: String =
    """
      |{
      |    "code": "FORMAT_REPORT_ID",
      |    "message": "The provided Report ID is invalid"
      |}
    """.stripMargin

  val RULE_INSOLVENT_TRADER: String =
    """
      |{
      | "code": "RULE_INSOLVENT_TRADER",
      | "message": "The remote endpoint has indicated that the Trader is insolvent"
      |}
    """.stripMargin

  val RULE_INCORRECT_GOV_TEST_SCENARIO: String =
    """
      |{
      | "code": "RULE_INCORRECT_GOV_TEST_SCENARIO",
      | "message": "The Gov-Test-Scenario was not found"
      |}
    """.stripMargin

  val MATCHING_RESOURCE_NOT_FOUND: String =
    """
      |{
      | "code": "MATCHING_RESOURCE_NOT_FOUND",
      | "message": "Matching resource not found"
      |}
    """.stripMargin

  val MATCHING_RESOURCE_NOT_FOUND_AP: String =
    """
      |{
      | "code": "MATCHING_RESOURCE_NOT_FOUND",
      | "message": "A resource with the name in the request can not be found in the API"
      |}
    """.stripMargin

  val NOT_FOUND: String =
    """
      |{
      | "code": "NOT_FOUND",
      | "message": "The remote endpoint has indicated that no data can be found"
      |}
    """.stripMargin

  val NOT_FOUND_ALTERNATE: String =
    """
      |{
      | "code": "NOT_FOUND",
      | "message": "The remote endpoint has indicated that no data can be found."
      |}
    """.stripMargin

  val NOT_FOUND_API_GATEWAY: String =
    """
      |{
      | "code" : "NOT_FOUND",
      | "message" : "The requested resource could not be found"
      |}
    """.stripMargin

  val NINO_NOT_FOUND: String =
    """
      |{
      | "code": "NINO_NOT_FOUND",
      | "message": "The remote endpoint has indicated that no data can be found for the nino."
      |}
    """.stripMargin

  val TAX_YEAR_NOT_FOUND: String =
    """
      |{
      | "code": "TAX_YEAR_NOT_FOUND",
      | "message": "The remote endpoint has indicated that no data can be found for the TaxYear."
      |}
    """.stripMargin

  val TAX_YEAR_NOT_FOUND_ALTERNATE: String =
    """
      |{
      | "code":"TAX_YEAR_NOT_FOUND",
      | "message":"The remote endpoint has indicated that no data can be found for the tax year."
      |}
    """.stripMargin

  val RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED: String =
    """
      |{
      | "code" : "RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED",
      | "message" : "An empty or non-matching body was submitted"
      |}
    """.stripMargin

  def incorrectOrEmptyBodyWithPaths(paths: Seq[String]): String =
    s"""
       |{
       | "code": "RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED",
       | "message": "An empty or non-matching body was submitted",
       | "paths": ${Json.toJson(paths)}
       |}
      """.stripMargin

  val FORMAT_NINO: String =
    """
      |{
      | "code" : "FORMAT_NINO",
      | "message" : "The provided NINO is invalid"
      |}
    """.stripMargin

  val FORMAT_TAX_YEAR: String =
    """
      |{
      | "code" : "FORMAT_TAX_YEAR",
      | "message" : "The provided tax year is invalid"
      |}
    """.stripMargin

  val INVALID_CORRELATIONID: String =
    """
      |{
      | "code" : "INTERNAL_SERVER_ERROR",
      | "message" : "Submission has not passed validation. Invalid Header parameter CorrelationId."
      |}
    """.stripMargin

  val RULE_SUBMISSION_FAILED: String =
    """
      |{
      | "code": "RULE_SUBMISSION_FAILED",
      | "message": "The submission cannot be completed due to validation failures"
      |}
    """.stripMargin

}
