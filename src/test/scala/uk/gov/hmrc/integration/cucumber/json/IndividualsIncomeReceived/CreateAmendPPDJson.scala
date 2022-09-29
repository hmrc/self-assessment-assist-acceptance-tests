/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object CreateAmendPPDJson {

  val CREATE_AND_AMEND_PPD: String =
    """
      |{
      |    "multiplePropertyDisposals": [
      |         {
      |            "ppdSubmissionId": "AB0000000092",
      |            "amountOfNetGain": 1234.78
      |         },
      |         {
      |            "ppdSubmissionId": "AB0000000098",
      |            "amountOfNetLoss": 134.99
      |         }
      |    ],
      |    "singlePropertyDisposals": [
      |         {
      |             "ppdSubmissionId": "AB0000000099",
      |             "completionDate": "2020-02-28",
      |             "disposalProceeds": 454.24,
      |             "acquisitionDate": "2020-03-29",
      |             "acquisitionAmount": 3434.45,
      |             "improvementCosts": 233.45,
      |             "additionalCosts": 423.34,
      |             "prfAmount": 2324.67,
      |             "otherReliefAmount": 3434.23,
      |             "lossesFromThisYear": 436.23,
      |             "lossesFromPreviousYear": 234.23,
      |             "amountOfNetGain": 4567.89
      |         },
      |         {
      |             "ppdSubmissionId": "AB0000000091",
      |             "completionDate": "2020-02-28",
      |             "disposalProceeds": 454.24,
      |             "acquisitionDate": "2020-03-29",
      |             "acquisitionAmount": 3434.45,
      |             "improvementCosts": 233.45,
      |             "additionalCosts": 423.34,
      |             "prfAmount": 2324.67,
      |             "otherReliefAmount": 3434.23,
      |             "lossesFromThisYear": 436.23,
      |             "lossesFromPreviousYear": 234.23,
      |             "amountOfNetLoss": 4567.89
      |         }
      |    ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_PPD_MINIMUM_FIELDS: String =
    """
      |{
      |    "singlePropertyDisposals": [
      |         {
      |             "ppdSubmissionId": "AB0000000098",
      |             "completionDate": "2020-02-28",
      |             "disposalProceeds": 454.24,
      |             "acquisitionAmount": 3434.45,
      |             "improvementCosts": 233.45,
      |             "additionalCosts": 423.34,
      |             "prfAmount": 2324.67,
      |             "otherReliefAmount": 3434.23,
      |             "amountOfNetGain": 1234.78
      |         }
      |    ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_PPD_MISSING_FIELDS: String =
    """
      |{
      |    "singlePropertyDisposals": [
      |         {
      |             "disposalProceeds": 454.24,
      |             "acquisitionDate": "2020-03-29",
      |             "acquisitionAmount": 3434.45,
      |             "improvementCosts": 233.45,
      |             "additionalCosts": 423.34,
      |             "prfAmount": 2324.67,
      |             "otherReliefAmount": 3434.23,
      |             "amountOfNetGain": 1234.78
      |         }
      |    ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_PPD_INVALID_REQUEST: String =
    """
      |{
      |    "singlePropertyDisposals": [
      |         {
      |             "ppdSubmissionId": true,
      |             "completionDate": "2020-02-28",
      |             "disposalProceeds": 454.24,
      |             "acquisitionDate": "2020-03-29",
      |             "acquisitionAmount": 3434.45,
      |             "improvementCosts": 233.45,
      |             "additionalCosts": 423.34,
      |             "prfAmount": 2324.67,
      |             "otherReliefAmount": 3434.23,
      |             "amountOfNetGain": 1234.78
      |         }
      |    ]
      |}
    """.stripMargin

  val PPD_SUBMISSION_ID_NOT_FOUND: String =
    """
      |{
      | "code": "PPD_SUBMISSION_ID_NOT_FOUND",
      | "message": "Matching resource not found"
      |}
    """.stripMargin

  val DUPLICATED_PPD_SUBMISSION_ID: String =
    """
      |{
      | "code": "RULE_DUPLICATED_PPD_SUBMISSION_ID",
      | "message": "A provided ppdSubmissionId is duplicated"
      |}
    """.stripMargin

  val INCORRECT_DISPOSAL_TYPE: String =
    """
      |{
      | "code": "RULE_INCORRECT_DISPOSAL_TYPE",
      | "message": "A provided ppdSubmissionId is being used for the incorrect disposal type"
      |}
    """.stripMargin

  val CREATE_AND_AMEND_PPD_MISSING_FIELD_RESPONSE: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/singlePropertyDisposals/0/ppdSubmissionId",
      "/singlePropertyDisposals/0/completionDate"
    )
  )

  val CREATE_AND_AMEND_PPD_INVALID_REQUEST_RESPONSE: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/singlePropertyDisposals/0/ppdSubmissionId"
    )
  )

}
