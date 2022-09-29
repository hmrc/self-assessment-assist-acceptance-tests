/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaAccountsApi

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object CreateAmendCodingOutJson {

  val createAmendCodingOutRequest: String =
    """
      |{
      |  "taxCodeComponents": {
      |    "payeUnderpayment": [
      |      {
      |        "amount": 123.45,
      |        "id": 12345
      |      }
      |    ],
      |    "selfAssessmentUnderpayment": [
      |      {
      |        "amount": 123.46,
      |        "id": 12346
      |      }
      |    ],
      |    "debt": [
      |      {
      |        "amount": 123.47,
      |        "id": 12347
      |      }
      |    ],
      |    "inYearAdjustment": {
      |      "amount": 123.48,
      |      "id": 12348
      |    }
      |  }
      |}
    """.stripMargin

  val createAmendCodingOutValueErrorsRequest: String =
    """
      |{
      |  "taxCodeComponents": {
      |    "payeUnderpayment": [
      |      {
      |        "amount": -123.45,
      |        "id": -12345
      |      }
      |    ],
      |    "selfAssessmentUnderpayment": [
      |      {
      |        "amount": 123.469,
      |        "id": 12346.2
      |      },
      |      {
      |        "amount": 123.469,
      |        "id": 12346.23546436
      |      }
      |    ],
      |    "debt": [
      |      {
      |        "amount": 112435436346457634567123.47,
      |        "id": 648365879875754245712347
      |      }
      |    ],
      |    "inYearAdjustment": {
      |      "amount": 123.648,
      |      "id": 12348.68
      |    }
      |  }
      |}
    """.stripMargin

  val createAmendCodingOutInvalidBodyTaxCodeComponentsRequest: String =
    """
      |{
      |  "taxCodeComponents": {}
      |}
    """.stripMargin

  val createAmendCodingOutInvalidBodyTaxCodeComponentsInnerRequest: String =
    """
      |{
      |  "taxCodeComponents": {
      |    "payeUnderpayment": [],
      |    "selfAssessmentUnderpayment": [],
      |    "debt": []
      |  }
      |}
    """.stripMargin

  val createAmendCodingOutEmptyBodyRequest: String =
    """
      |{
      |}
    """.stripMargin

  val createAmendCodingOutValueErrorsResponse: String =
    """
      |{
      |  "code" : "INVALID_REQUEST",
      |  "message" : "Invalid request",
      |  "errors" : [
      |    {
      |      "code" : "FORMAT_VALUE",
      |      "message" : "The value must be between 0.00 and 99999999999.99",
      |      "paths" : [
      |        "/taxCodeComponents/payeUnderpayment/0/amount",
      |        "/taxCodeComponents/selfAssessmentUnderpayment/0/amount",
      |        "/taxCodeComponents/selfAssessmentUnderpayment/1/amount",
      |        "/taxCodeComponents/debt/0/amount",
      |        "/taxCodeComponents/inYearAdjustment/amount"
      |      ]
      |    }, {
      |      "code" : "FORMAT_ID",
      |      "message" : "The format of the ID is invalid",
      |      "paths" : [
      |        "/taxCodeComponents/payeUnderpayment/0/id",
      |        "/taxCodeComponents/selfAssessmentUnderpayment/0/id",
      |        "/taxCodeComponents/selfAssessmentUnderpayment/1/id",
      |        "/taxCodeComponents/debt/0/id",
      |        "/taxCodeComponents/inYearAdjustment/id"
      |      ]
      |    }
      |  ]
      |}
    """.stripMargin

  val createAmendCodingOutInvalidBodyTaxCodeComponentsResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/taxCodeComponents"
    )
  )

  val createAmendCodingOutInvalidBodyTaxCodeComponentsInnerResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/taxCodeComponents/payeUnderpayment",
      "/taxCodeComponents/selfAssessmentUnderpayment",
      "/taxCodeComponents/debt"
    )
  )

}
