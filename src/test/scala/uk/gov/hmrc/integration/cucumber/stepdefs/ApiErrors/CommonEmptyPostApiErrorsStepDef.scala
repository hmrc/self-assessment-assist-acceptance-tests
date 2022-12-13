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
import uk.gov.hmrc.integration.cucumber.endpoints.CommonEmptyPostApiErrors.emptyPostSampleEndpointWithErrors
import uk.gov.hmrc.integration.cucumber.stepdefs.BaseStepDef

class CommonEmptyPostApiErrorsStepDef extends BaseStepDef {

  // API Error Scenarios
  When("""^a request is made to post to (.*) with no body, and with an incorrect URL$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(incorrectUrl = true, requestUrl = url)
  }

  When("""^a request is made to post to (.*) with no body, and with an incorrect http method$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(requestUrl = url, httpMethod = false)
  }

  When("""^a request is made to post to (.*) with no body, and v1.0 accept header$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(accept = "application/vnd.hmrc.1.0+json", requestUrl = url)
  }

  When("""^a request is made to post to (.*) with no body, and v1.9 accept header$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(accept = "application/vnd.hmrc.1.9+json", requestUrl = url)
  }

  When("""^a request is made to post to (.*) with no body, and v2.0 accept header$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(accept = "application/vnd.hmrc.2.0+json", requestUrl = url)
  }

  When("""^a request is made to post to (.*) with no body, and with an invalid accept header$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(accept = "INVALID", requestUrl = url)
  }

  When("""^a request is made to post to (.*) with no body, and with missing accept header$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(accept = "", requestUrl = url)
  }

  When("""^a request is made to post to (.*) with no body, and with missing authorization header$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(authorization = "", requestUrl = url)
  }

  When("""^a request is made to post to (.*) with no body, and with invalid content type header$""") { (url: String) =>
    response = emptyPostSampleEndpointWithErrors(contentType = "application/xml", requestUrl = url)
  }

}
