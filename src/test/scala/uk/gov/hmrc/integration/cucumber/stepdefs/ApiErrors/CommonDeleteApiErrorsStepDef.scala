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
import uk.gov.hmrc.integration.cucumber.endpoints.CommonDeleteApiErrors.deleteSampleEndpointWithErrors
import uk.gov.hmrc.integration.cucumber.stepdefs.BaseStepDef

class CommonDeleteApiErrorsStepDef extends BaseStepDef {

  // API Error Scenarios
  When("""^a request is made to DELETE to (.*) with an incorrect URL$""") { url: String =>
    response = deleteSampleEndpointWithErrors(incorrectUrl = true, requestUrl = url)
  }

  When("""^a request is made to DELETE to (.*) with an incorrect http method$""") { url: String =>
    response = deleteSampleEndpointWithErrors(requestUrl = url, httpMethod = false)
  }

  When("""^a request is made to DELETE to (.*) with v1.0 accept header$""") { url: String =>
    response = deleteSampleEndpointWithErrors(accept = "application/vnd.hmrc.1.0+json", requestUrl = url)
  }

  When("""^a request is made to DELETE to (.*) with v2.0 accept header$""") { url: String =>
    response = deleteSampleEndpointWithErrors(accept = "application/vnd.hmrc.2.0+json", requestUrl = url)
  }

  When("""^a request is made to DELETE to (.*) with an invalid accept header$""") { url: String =>
    response = deleteSampleEndpointWithErrors(accept = "INVALID", requestUrl = url)
  }

  When("""^a request is made to DELETE to (.*) with missing accept header$""") { url: String =>
    response = deleteSampleEndpointWithErrors(accept = "", requestUrl = url)
  }

  When("""^a request is made to DELETE to (.*) with missing authorization header$""") { url: String =>
    response = deleteSampleEndpointWithErrors(authorization = "", requestUrl = url)
  }

}
