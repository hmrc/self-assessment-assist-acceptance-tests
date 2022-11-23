/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfAssessmentAssistAPI.TaxCalculations

object TaxCalculationsJson {

  val triggerTaxCalculationBody: String =
    """
      |{
      |  "taxYear": "2018-19"
      |}
    """.stripMargin

}