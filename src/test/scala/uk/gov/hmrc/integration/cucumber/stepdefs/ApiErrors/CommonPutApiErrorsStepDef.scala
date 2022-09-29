/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.stepdefs.ApiErrors

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.CommonPutApiErrors.putSampleEndpointWithErrors
import uk.gov.hmrc.integration.cucumber.stepdefs.BaseStepDef

class CommonPutApiErrorsStepDef extends BaseStepDef {

  // API Error Scenarios
  When("""^a request is made to put to (.*) with body (.*) with an incorrect URL$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(incorrectUrl = true, requestUrl = url, requestBody = requestBody)
  }

  When("""^a request is made to put to (.*) with body (.*) with an incorrect http method$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(requestUrl = url, requestBody = requestBody, httpMethod = false)
  }

  When("""^a request is made to put to (.*) with body (.*) and v1.0 accept header$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(accept = "application/vnd.hmrc.1.0+json", requestUrl = url, requestBody = requestBody)
  }

  When("""^a request is made to put to (.*) with body (.*) and v2.0 accept header$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(accept = "application/vnd.hmrc.2.0+json", requestUrl = url, requestBody = requestBody)
  }

  When("""^a request is made to put to (.*) with body (.*) with an invalid accept header$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(accept = "INVALID", requestUrl = url, requestBody = requestBody)
  }

  When("""^a request is made to put to (.*) with body (.*) with missing accept header$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(accept = "", requestUrl = url, requestBody = requestBody)
  }

  When("""^a request is made to put to (.*) with body (.*) with missing authorization header$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(authorization = "", requestUrl = url, requestBody = requestBody)
  }

  When("""^a request is made to put to (.*) with body (.*) with invalid content type header$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(contentType = "application/xml", requestUrl = url, requestBody = requestBody)
  }

  When("""^a request is made to put to (.*) with body (.*) with missing content type header$""") { (url: String, requestBody: String) =>
    response = putSampleEndpointWithErrors(contentType = "", requestUrl = url, requestBody = requestBody)
  }

}
