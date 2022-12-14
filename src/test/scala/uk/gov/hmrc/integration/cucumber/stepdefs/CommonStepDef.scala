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

package uk.gov.hmrc.integration.cucumber.stepdefs

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.ResponseBodies._
import uk.gov.hmrc.integration.cucumber.endpoints.ResponseModels._
import uk.gov.hmrc.integration.cucumber.utils.json.JsonTools
import uk.gov.hmrc.webdriver.SingletonDriver

import scala.util.Try

class CommonStepDef extends BaseStepDef with JsonTools {

  When("""^I make a POST call to (.*) url to generate report with invalid nino and request body (.*)$""") {
    (url: String, scenario:String) =>
      if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
      else response = requestEmptyPOST(url, requestHeaders, None)
  }

  When("""^I make a POST call to (.*) url with invalid calculationID and request body (.*)$""") {
    (url: String, scenario: String) =>

      if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
      else response = requestEmptyPOST(url, requestHeaders, None)
  }

  When("""^I make a POST call to (.*) url with invalid reportID and request body (.*)$""") {
    (url: String, scenario: String) =>

      if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
      else response = requestEmptyPOST(url, requestHeaders, None)
  }

  Then("""^close the browser$""") { () =>
    Try(SingletonDriver.closeInstance)
  }

  Then("""^I set the API version to (.*)$""") { version: String =>
    apiVersion = version
  }

  Then("""^the response (.*) is (.*)$""") { (item: String, value: String) =>
    item match {

      case "code" =>
        withClue(errorLog()) {
          response.code shouldBe value.toInt
        }
      case "body" =>
        value match {
          case "empty" => response.body isEmpty ()
          case _ =>
            val expectedBody = retrieveExpectedResponse(value)
            withClue(errorLog(Some(expectedBody))) {
              compareResponseAsJson(response.body, expectedBody)
            }
        }
      case "model" => checkAgainstExpectedModel(value)
    }
  }

  Then("""^the response body contains (.*) - (.*) as a (.*)$""") { (key: String, value: String, t: String) =>
    t match {
      case "String" =>
        response.body.nonEmpty && findKeyAndMatchValue[String](key, value)
      case "Boolean" =>
        response.body.nonEmpty && findKeyAndMatchValue[Boolean](key, value)
    }
  }

  Then("""^save the Self-Employment ID$""") { () =>
    selfEmploymentId = response.header("Location").get.split("self-employments/")(1)
  }

  Then("""^save the 2nd Self-Employment ID$""") { () =>
    selfEmploymentId2nd = response.header("Location").get.split("self-employments/")(1)
  }

  Then("""^the (.*) header is not empty$""") { header: String =>
    response.headers(header).head shouldNot be(empty)
  }

  When("""^a request is made to POST to url: (.*), with the JSON body: (.*), and the gov-test-scenario: (.*)$""") {
    (url: String, jsonBody: String, scenario: String) =>
      if (scenario != "None") response = requestPOST(url, jsonBody, requestHeaders, Some(scenario))
      else response = requestPOST(url, jsonBody, requestHeaders, None)
  }

  When("""^a request is made to DELETE to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    if (scenario != "None") response = requestDELETE(url, requestHeaders, Some(scenario))
    else response = requestDELETE(url, requestHeaders, None)
  }

  When("""^a request is made to GET to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    if (scenario != "None") response = requestGET(url, requestHeaders, Some(scenario))
    else response = requestGET(url, requestHeaders, None)
  }

  When("""^a request is made to PUT to url: (.*), with the JSON body: (.*), and the gov-test-scenario: (.*)$""") {
    (url: String, jsonBody: String, scenario: String) =>
      if (scenario != "None") response = requestPUT(url, jsonBody, requestHeaders, Some(scenario))
      else response = requestPUT(url, jsonBody, requestHeaders, None)
  }

  When("""^a request is made to do an empty POST to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
    else response = requestEmptyPOST(url, requestHeaders, None)
  }

  When("""^an request is made to GET to url: (.*) with FromDate: (.*) & ToDate: (.*) & Source: (.*), and the gov-test-scenario: (.*)$""") {
    (url: String, fromDate: String, toDate: String, source: String, scenario: String) =>
      val sourceParam = if (source == "none") "" else s"&source=$source"
      newSource = source
      val fromDateParam = if (fromDate == "empty") "" else s"fromDate=$fromDate"
      val toDateParam   = if (toDate == "empty") "" else s"toDate=$toDate"
      val params        = s"?$toDateParam&$fromDateParam$sourceParam"
      if (scenario != "None") response = requestGETWithQueryParams(url, params, requestHeaders, Some(scenario))
      else response = requestGETWithQueryParams(url, params, requestHeaders, None)
  }

}
