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

import scalaj.http.HttpResponse
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.URLs.retrieveRequestUrl

object CommonEmptyPostApiErrors {

  // Used for error testing on the api
  def emptyPostSampleEndpointWithErrors(accept: String = s"application/vnd.hmrc.$apiVersion+json",
                                   authorization: String = s"${taxPayer.accessToken}",
                                   contentType: String = "application/json",
                                   requestUrl: String = "url",
                                   httpMethod: Boolean = true,
                                   incorrectUrl: Boolean = false): HttpResponse[String] = {

    val url: String = if (incorrectUrl) retrieveRequestUrl(requestUrl) + "/a" else retrieveRequestUrl(requestUrl)

    def headers: Map[String, String] = {
      if (accept == "") Map("Authorization" -> authorization, "Content-Type" -> contentType)
      else if (authorization == "") Map("Accept" -> accept, "Content-Type" -> contentType)
      else if (contentType == "") Map("Accept" -> accept, "Authorization" -> authorization)
      else Map("Accept"                        -> accept, "Authorization" -> authorization, "Content-Type" -> contentType)
    }

    val govTestScenario: Map[String, String] = None.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    if (httpMethod) {
      request = Request("POST", url, None, headers, Some(govTestScenario))
      response = getHttpWithTimeout(url).method("POST").headers(headers ++ govTestScenario).copy(proxyConfig = proxy).asString
    } else {
      request = Request("PUT", url, None, headers, Some(govTestScenario))
      response = getHttpWithTimeout(url).method("PUT").headers(headers ++ govTestScenario).copy(proxyConfig = proxy).asString
    }
    response
  }

}
