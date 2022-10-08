/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.ApiErrors

import scalaj.http.HttpResponse
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object IndividualLossesApi {

  // Used for error testing on the individual losses api only
  def createBFLossesWithErrors(accept: String = s"application/vnd.hmrc.$apiVersion+json",
                               authorization: String = s"${taxPayer.accessToken}",
                               contentType: String = "application/json",
                               url: String = s"$individualLossesApiUrl/${taxPayer.nino}/brought-forward-losses",
                               httpMethod: Boolean = true): HttpResponse[String] = {

    val body: String = s"""{ "typeOfLoss": "uk-property-fhl", "taxYear": "2019-20", "lossAmount": 1.00 }"""

    def headers: Map[String, String] = {
      if (accept == "") Map("Authorization" -> authorization, "Content-Type" -> contentType)
      else if (authorization == "") Map("Accept" -> accept, "Content-Type" -> contentType)
      else if (contentType == "") Map("Accept" -> accept, "Authorization" -> authorization)
      else Map("Accept"                        -> accept, "Authorization" -> authorization, "Content-Type" -> contentType)
    }

    val govTestScenario: Map[String, String] = None.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    if (httpMethod) {
      request = Request("POST", url, Some(body), headers, Some(govTestScenario))
      response = getHttpWithTimeout(url).postData(body).headers(headers ++ govTestScenario).copy(proxyConfig = proxy).asString
    } else {
      request = Request("PUT", url, Some(body), headers, Some(govTestScenario))
      response = getHttpWithTimeout(url).put(body).headers(headers ++ govTestScenario).copy(proxyConfig = proxy).asString
    }

    response
  }

}