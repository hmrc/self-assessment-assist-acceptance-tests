/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfAssessmentAssistAPI.SelfEmployment

object SeIncomeSourceJson {

  val seBusiness: String =
    """
      |{
      |   "accountingPeriod": {
      |    "start": "2017-04-06",
      |    "end": "2018-04-05"
      |  },
      |  "accountingType": "CASH",
      |  "commencementDate": "2016-02-02",
      |  "tradingName": "1st Business Ltd.",
      |  "businessAddressLineOne": "1 Acme Rd.",
      |  "businessAddressLineTwo": "London",
      |  "businessAddressLineThree": "Greater London",
      |  "businessAddressLineFour": "United Kingdom",
      |  "businessPostcode": "A9 9AA"
      |}
    """.stripMargin

  val seBusiness2nd: String =
    """
      |{
      |   "accountingPeriod": {
      |    "start": "2017-04-06",
      |    "end": "2018-04-05"
      |  },
      |  "accountingType": "CASH",
      |  "commencementDate": "2016-02-02",
      |  "tradingName": "2nd Business Ltd.",
      |  "businessAddressLineOne": "1 Acme Rd.",
      |  "businessAddressLineTwo": "London",
      |  "businessAddressLineThree": "Greater London",
      |  "businessAddressLineFour": "United Kingdom",
      |  "businessPostcode": "A9 9AA"
      |}
    """.stripMargin

}
