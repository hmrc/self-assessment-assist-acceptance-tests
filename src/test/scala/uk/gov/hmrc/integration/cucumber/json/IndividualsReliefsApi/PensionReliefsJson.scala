/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsReliefsApi

object PensionReliefsJson {

  val AMEND_PENSION_RELIEFS: String =
    """
      |{
      |  "pensionReliefs": {
      |    "regularPensionContributions": 1999.99,
      |    "oneOffPensionContributionsPaid": 1999.99,
      |    "retirementAnnuityPayments": 1999.99,
      |    "paymentToEmployersSchemeNoTaxRelief": 1999.99,
      |    "overseasPensionSchemeContributions": 1999.99
      |  }
      |}
    """.stripMargin

  val pensionReliefsAmendMinimumFields: String =
    """
      |{
      |  "pensionReliefs": {
      |    "regularPensionContributions": 1999.99
      |  }
      |}
    """.stripMargin

  val pensionReliefsAmendMissingErrorsRequest: String =
    """
      |{
      |  "pensionReliefs": {}
      |}
    """.stripMargin

  val pensionReliefsAmendValueErrorsRequest: String =
    """
      |{
      |  "pensionReliefs": {
      |    "regularPensionContributions": 1999.99,
      |    "oneOffPensionContributionsPaid": 1999.99,
      |    "retirementAnnuityPayments": 1999.991,
      |    "paymentToEmployersSchemeNoTaxRelief": 1999.99,
      |    "overseasPensionSchemeContributions": 1999.991
      |  }
      |}
    """.stripMargin

  val pensionReliefsAmendValueErrorsResponse: String =
    """
      |{
      |  "code": "FORMAT_VALUE",
      |  "message": "The field should be between 0 and 99999999999.99",
      |  "paths": [
      |    "/pensionReliefs/retirementAnnuityPayments",
      |    "/pensionReliefs/overseasPensionSchemeContributions"
      |  ]
      |}
    """.stripMargin

}
