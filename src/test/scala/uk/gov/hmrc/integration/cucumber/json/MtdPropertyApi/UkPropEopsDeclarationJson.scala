/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.MtdPropertyApi

object UkPropEopsDeclarationJson {

  val EopsDeclarationTrue: String =
    """
      |{
      |  "finalised": true
      |}
    """.stripMargin

  val EopsDeclarationFalse: String =
    """
      |{
      |  "finalised": false
      |}
    """.stripMargin

}
