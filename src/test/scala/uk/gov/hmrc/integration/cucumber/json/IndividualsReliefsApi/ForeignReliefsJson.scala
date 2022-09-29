/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsReliefsApi

object ForeignReliefsJson {

  val AMEND_FOREIGN_RELIEFS: String =
    """
      |{
      |   "foreignTaxCreditRelief": {
      |     "amount" : 2123.22
      |   },
      |  "foreignIncomeTaxCreditRelief": [
      |      {
      |          "countryCode": "FRA",
      |          "foreignTaxPaid": 1640.32,
      |          "taxableAmount": 1204.78,
      |          "employmentLumpSum": false
      |      }
      |  ],
      |  "foreignTaxForFtcrNotClaimed": {
      |      "amount": 1749.98
      |  }
      |}
    """.stripMargin

  val foreignReliefsAmendMissingErrorsRequest: String =
    """
      |{
      |   "foreignTaxCreditRelief": {}
      |}
    """.stripMargin

  val foreignReliefsAmendValueErrorsRequest: String =
    """
      |{
      |   "foreignTaxCreditRelief": {
      |     "amount" : 123.222
      |   },
      |   "foreignIncomeTaxCreditRelief": [
      |      {
      |          "countryCode": "FRA",
      |          "foreignTaxPaid": 1640.32,
      |          "taxableAmount": 1204.781,
      |          "employmentLumpSum": false
      |      }
      |  ],
      |  "foreignTaxForFtcrNotClaimed": {
      |      "amount": 1749.983
      |  }
      |}
    """.stripMargin

  val foreignReliefsAmendValueErrorsResponse: String =
    """
      |{
      |  "code": "FORMAT_VALUE",
      |  "message": "The field should be between 0 and 99999999999.99",
      |  "paths": [
      |    "/foreignTaxCreditRelief/amount",
      |    "/foreignIncomeTaxCreditRelief/0/taxableAmount",
      |    "/foreignTaxForFtcrNotClaimed/amount"
      |  ]
      |}
    """.stripMargin

}
