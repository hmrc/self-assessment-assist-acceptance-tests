/*
 * Copyright 2022 HM Revenue & Customs
 *
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
