/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsBusinessEOPSApi

object SubmitBusinessEOPSRequestJsonV2 {

  val submitEOPSStatementSelfEmploymentV2: String =
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

  val submitEOPSStatementUkPropertyV2: String =
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

  val submitEOPSStatementForeignPropertyV2: String =
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
