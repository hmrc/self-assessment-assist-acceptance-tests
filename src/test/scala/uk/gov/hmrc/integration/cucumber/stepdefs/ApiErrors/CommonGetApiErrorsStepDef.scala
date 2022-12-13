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

/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.stepdefs.ApiErrors

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.CommonGetApiErrors.getSampleEndpointWithErrors
import uk.gov.hmrc.integration.cucumber.stepdefs.BaseStepDef

class CommonGetApiErrorsStepDef extends BaseStepDef {

  // API Error Scenarios
  When("""^a request is made to get (.*) with an incorrect URL$""") { url: String =>
    response = getSampleEndpointWithErrors(incorrectUrl = true, requestUrl = url)
  }

  When("""^a request is made to get (.*) with an incorrect http method$""") { url: String =>
    response = getSampleEndpointWithErrors(requestUrl = url, httpMethod = false)
  }

  When("""^a request is made to get (.*) with v1.0 accept header$""") { url: String =>
    response = getSampleEndpointWithErrors(accept = "application/vnd.hmrc.1.0+json", requestUrl = url)
  }

  When("""^a request is made to get (.*) with v(.*) accept header$""") { (url: String, version: String) =>
    response = getSampleEndpointWithErrors(accept = s"application/vnd.hmrc.$version+json", requestUrl = url)
  }

  When("""^a request is made to get (.*) with an invalid accept header$""") { url: String =>
    response = getSampleEndpointWithErrors(accept = "INVALID", requestUrl = url)
  }

  When("""^a request is made to get (.*) with missing accept header$""") { url: String =>
    response = getSampleEndpointWithErrors(accept = "", requestUrl = url)
  }

  When("""^a request is made to get (.*) with missing authorization header$""") { url: String =>
    response = getSampleEndpointWithErrors(authorization = "", requestUrl = url)
  }

}
