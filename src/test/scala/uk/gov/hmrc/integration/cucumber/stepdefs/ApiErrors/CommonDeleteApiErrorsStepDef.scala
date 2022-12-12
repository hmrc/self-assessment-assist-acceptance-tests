/*
 * Copyright 2022 HM Revenue & Customs
 *
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
