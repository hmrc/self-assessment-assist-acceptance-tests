/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.integration.cucumber.endpoints

import play.api.libs.json.{Json, Reads}
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.json._

object ResponseBodies {

  def checkResponseBodyStructure[A](body: String)(implicit rds: Reads[A]): Unit =
    Json
      .parse(body)
      .validate[A]
      .fold(
        invalid =>
          Predef
            .assert(assertion = false, s"JSON Response did not match the expected format and could not be parsed.\nErrors: $invalid\n${errorLog()}"),
        _ => Predef.assert(assertion = true)
      )

  def findKeyAndMatchValue[T](key: String, value: String)(implicit reads: Reads[T]): Boolean = {
    request.body.exists(b =>
      (Json.parse(b) \\ key).headOption
        .exists(_.as[T].toString == value))
  }

  def retrieveExpectedResponse(responseName: String): String = {
    responseName match {

      // Common Errors
      case "CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API" => CommonErrorsJson.CLIENT_OR_AGENT_NOT_AUTHORISED_SA_API
      case "CLIENT_OR_AGENT_NOT_AUTHORISED"        => CommonErrorsJson.CLIENT_OR_AGENT_NOT_AUTHORISED
      case "CLIENT_OR_AGENT_NOT_AUTHORISED_v2"     => CommonErrorsJson.CLIENT_OR_AGENT_NOT_AUTHORISED_v2
      case "CLIENT_NOT_SUBSCRIBED"                 => CommonErrorsJson.CLIENT_NOT_SUBSCRIBED
      case "UNAUTHORIZED"                          => CommonErrorsJson.UNAUTHORIZED
      case "AGENT_NOT_AUTHORIZED"                  => CommonErrorsJson.AGENT_NOT_AUTHORIZED
      case "INVALID_BODY_TYPE"                     => CommonErrorsJson.INVALID_BODY_TYPE
      case "INTERNAL_SERVER_ERROR"                 => CommonErrorsJson.INTERNAL_SERVER_ERROR
      case "FORMAT_REPORT_ID"                      => CommonErrorsJson.FORMAT_REPORT_ID
      case "NOT_FOUND"                             => CommonErrorsJson.NOT_FOUND
      case "NOT_FOUND_ALTERNATE"                   => CommonErrorsJson.NOT_FOUND_ALTERNATE
      case "NOT_FOUND_API_GATEWAY"                 => CommonErrorsJson.NOT_FOUND_API_GATEWAY
      case "RULE_INSOLVENT_TRADER"                 => CommonErrorsJson.RULE_INSOLVENT_TRADER
      case "MATCHING_RESOURCE_NOT_FOUND"           => CommonErrorsJson.MATCHING_RESOURCE_NOT_FOUND
      case "RULE_INCORRECT_GOV_TEST_SCENARIO"      => CommonErrorsJson.RULE_INCORRECT_GOV_TEST_SCENARIO
      case "ACCEPT_HEADER_INVALID"                 => CommonErrorsJson.ACCEPT_HEADER_INVALID
      case "FORMAT_NINO"                           => CommonErrorsJson.FORMAT_NINO
      case "FORMAT_TAX_YEAR"                       => CommonErrorsJson.FORMAT_TAX_YEAR
      case "INVALID_CORRELATIONID"                 => CommonErrorsJson.INVALID_CORRELATIONID
      case "RULE_SUBMISSION_FAILED"                => CommonErrorsJson.RULE_SUBMISSION_FAILED

      // Common Errors API Platform
      case "MATCHING_RESOURCE_NOT_FOUND_AP" => CommonErrorsJson.MATCHING_RESOURCE_NOT_FOUND_AP
      case "MISSING_CREDENTIALS"            => CommonErrorsJson.MISSING_CREDENTIALS
    }
  }

}
