/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.stepdefs

import play.api.libs.json.Json
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.ResponseBodies._
import uk.gov.hmrc.integration.cucumber.endpoints.ResponseModels._
import uk.gov.hmrc.integration.cucumber.models.Obligations.RetrieveEOPS.RetrieveEOPSResponse
import uk.gov.hmrc.integration.cucumber.models.Obligations.RetrievePeriodicObligations.RetrievePeriodicObligationsResponse
import uk.gov.hmrc.integration.cucumber.utils.json.JsonTools
import uk.gov.hmrc.webdriver.SingletonDriver

import scala.util.Try

class CommonStepDef extends BaseStepDef with JsonTools {

  When("""^generate report POSt call url: (.*), invoked with valid nino with request body: (.*)$""") {
    (url: String, scenario:String) =>

      if (scenario != "None")response = requestEmptyPOST(url, requestHeaders,Some(scenario))
      else response = requestEmptyPOST(url, requestHeaders, None)
  }

  When("""^generate report POSt call url: (.*), invoked with invalid nino with request body: (.*)$""") {
    (url: String, scenario:String) =>
      if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
      else response = requestEmptyPOST(url, requestHeaders, None)
  }

  When("""^acknowledge report POSt call url: (.*), invoked with valid nino with request body: (.*)$""") {
    (url: String, scenario: String) =>

      if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
      else response = requestEmptyPOST(url, requestHeaders, None)
  }

  When("""^generate report POSt call url: (.*), invoked with invalid calculationID with request body: (.*)$""") {
    (url: String, scenario: String) =>

      if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
      else response = requestEmptyPOST(url, requestHeaders, None)
  }


  When("""^a request is made to GET to url: (.*), invoked with invalid nino with request body: (.*)$""") { (url: String, scenario: String) =>
    if (scenario != "None") response = requestGET(url, requestHeaders, Some(scenario))
    else response = requestGET(url, requestHeaders, None)
  }

  When("""^acknowledge report POSt call url: (.*), invoked with invalid reportID with request body: (.*)$""") {
    (url: String, scenario: String) =>

      if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
      else response = requestEmptyPOST(url, requestHeaders, None)
  }


//
//      When("""^a request is made to POST to url: (.*), with the JSON body: (.*), and the gov-test-scenario: (.*)$"""){
//        (url: String, jsonBody: String, scenario: String) =>
//
//          if (scenario != "None") response = requestPOST(url, jsonBody, requestHeaders, Some(scenario))
//          else response = requestPOST(url, jsonBody, requestHeaders, None)
//      }








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

  Then("""^the (.*) body contains no empty arrays$""") { endpoint: String =>
    endpoint match {
      case "EOPS" =>
        val model = Json.parse(response.body).as[RetrieveEOPSResponse]
        assert(model.obligations.nonEmpty && model.obligations.forall(_.obligationDetails.nonEmpty))
      case "Periodic" =>
        val model = Json.parse(response.body).as[RetrievePeriodicObligationsResponse]
        assert(model.obligations.nonEmpty && model.obligations.forall(_.obligationDetails.nonEmpty))
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
