/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints

import scalaj.http.HttpResponse
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.URLs.retrieveRequestUrl

object CommonGetApiErrors {

  // Used for error testing on the api
  def getSampleEndpointWithErrors(accept: String = s"application/vnd.hmrc.$apiVersion+json",
                                  authorization: String = s"${taxPayer.accessToken}",
                                  requestUrl: String = "url",
                                  httpMethod: Boolean = true,
                                  incorrectUrl: Boolean = false): HttpResponse[String] = {

    val url: String = if (incorrectUrl) retrieveRequestUrl(requestUrl) + "/INCORRECT" else retrieveRequestUrl(requestUrl)

    def headers: Map[String, String] = {
      if (accept == "") Map("Authorization" -> authorization)
      else if (authorization == "") Map("Accept" -> accept)
      else Map("Accept"                          -> accept, "Authorization" -> authorization)
    }

    val govTestScenario: Map[String, String] = None.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    if (httpMethod) {
      request = Request("GET", url, None, headers, Some(govTestScenario))
      response = getHttpWithTimeout(url).headers(headers ++ govTestScenario).copy(proxyConfig = proxy).asString
    } else {
      request = Request("PATCH", url, None, headers, Some(govTestScenario))
      response = getHttpWithTimeout(url).method("PATCH").headers(headers ++ govTestScenario).copy(proxyConfig = proxy).asString
    }
    response
  }

}
