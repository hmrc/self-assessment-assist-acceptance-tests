/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.MtdSelfEmployment

object SubmitSeEopsJson {

  val submitEopsTrue: String =
    """
      |{
      |  "finalised": true
      |}
    """.stripMargin

  val submitEopsFalse: String =
    """
      |{
      |  "finalised": false
      |}
    """.stripMargin

}
