/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsBusinessEOPSApi

object SubmitBusinessEOPSRequestJsonV1 {

  val submitEOPSStatementSelfEmployment: String =
    """
      |{
      |  "typeOfBusiness": "self-employment",
      |  "businessId": "XAIS12345678910",
      |  "accountingPeriod" : {
      |     "startDate": "2021-04-06",
      |     "endDate": "2022-04-05"
      |  },
      |  "finalised": true
      |}
    """.stripMargin

  val submitEOPSStatementUkProperty: String =
    """
      |{
      |  "typeOfBusiness": "uk-property",
      |  "businessId": "XAIS12345678910",
      |  "accountingPeriod" : {
      |     "startDate": "2021-04-06",
      |     "endDate": "2022-04-05"
      |  },
      |  "finalised": true
      |}
    """.stripMargin

  val submitEOPSStatementForeignProperty: String =
    """
      |{
      |  "typeOfBusiness": "foreign-property",
      |  "businessId": "XAIS12345678910",
      |  "accountingPeriod" : {
      |     "startDate": "2021-04-06",
      |     "endDate": "2022-04-05"
      |  },
      |  "finalised": true
      |}
    """.stripMargin

}
