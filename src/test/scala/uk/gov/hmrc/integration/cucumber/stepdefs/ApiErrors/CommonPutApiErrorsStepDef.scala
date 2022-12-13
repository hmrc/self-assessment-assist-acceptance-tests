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
