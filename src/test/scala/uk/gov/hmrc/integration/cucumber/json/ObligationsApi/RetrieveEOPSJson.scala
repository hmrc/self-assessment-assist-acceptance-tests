/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.ObligationsApi

object RetrieveEOPSJson {

  val NO_OBLIGATIONS_FOUND: String =
    """
      |{
      | "code" : "NO_OBLIGATIONS_FOUND",
      | "message" : "No obligations found using this filter"
      |}
    """.stripMargin

}
