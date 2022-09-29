/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.OtherDeductionsApi

object OtherDeductionsJson {

  val AMEND_OTHER_DEDUCTIONS: String =
    """
      |{
      |    "seafarers": [
      |      {
      |      "customerReference": "SEAFARERS1234",
      |      "amountDeducted": 2342.22,
      |      "nameOfShip": "Blue Bell",
      |      "fromDate": "2018-08-17",
      |      "toDate":"2018-10-02"
      |      }
      |    ]
      |}
    """.stripMargin

  val AMEND_OTHER_DEDUCTIONS_MULTIPLE_ITEMS: String =
    """
      |{
      |    "seafarers": [
      |      {
      |      "customerReference": "SEAFARERS1234",
      |      "amountDeducted": 2342.22,
      |      "nameOfShip": "Blue Bell",
      |      "fromDate": "2018-08-17",
      |      "toDate":"2018-10-02"
      |      },
      |      {
      |      "customerReference": "SEAFARERS1235",
      |      "amountDeducted": 2342.22,
      |      "nameOfShip": "Royal",
      |      "fromDate": "2018-08-17",
      |      "toDate":"2018-10-02"
      |      }
      |    ]
      |}
    """.stripMargin

  val AMEND_OTHER_DEDUCTIONS_MINIMUM_FIELDS: String =
    """
      |{
      |    "seafarers": [
      |      {
      |      "amountDeducted": 2342.22,
      |      "nameOfShip": "Blue Bell",
      |      "fromDate": "2018-08-17",
      |      "toDate":"2018-10-02"
      |      }
      |    ]
      |}
    """.stripMargin

  val AMEND_OTHER_DEDUCTIONS_FIELDS_MISSING: String =
    """
      |{
      |    "seafarers": [
      |      {
      |      "customerReference": "SEAFARERS1234",
      |      "amountDeducted": 2342.22,
      |      "toDate":"2018-10-02"
      |      }
      |    ]
      |}
    """.stripMargin

}
