/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaAccountsApi

object CodingOutJson {

  val CODING_OUT_NOT_FOUND: String = {
    """
      |{
      | "code": "MATCHING_RESOURCE_NOT_FOUND",
      | "message": "Coding out amounts could not be found for the supplied nino and taxYear"
      |}
    """.stripMargin
  }

}
