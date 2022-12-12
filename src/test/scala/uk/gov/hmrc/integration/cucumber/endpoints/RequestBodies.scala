/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints


object RequestBodies {

  def retrieveRequestBody(body: String): String = {
    body match {


      // ----- Self Employment Business API -----
      case "CREATE_OR_AMEND_ANNUAL_SUBMISSION"                    => "AmendSEAnnualSubmissionJson.CreateOrAmendAnnualSubmission"



    }
  }

}
