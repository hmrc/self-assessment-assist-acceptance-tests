/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object CreateAndAmendCgtResidentialPropertyDisposals {

  val CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_REQUEST: String =
    """
      |{
      |    "disposals" : [
      |        {
      |            "customerReference" : "ABC-2345",
      |            "disposalDate" : "2021-03-29",
      |            "completionDate" : "2021-04-02",
      |            "disposalProceeds" : 2345.67,
      |            "acquisitionDate" : "2021-03-22",
      |            "acquisitionAmount" : 2341.45,
      |            "improvementCosts" : 345.34,
      |            "additionalCosts" : 234.89,
      |            "prfAmount" : 67.9,
      |            "otherReliefAmount" : 123.89,
      |            "lossesFromThisYear" : 456.89,
      |            "lossesFromPreviousYear" : 124.87,
      |            "amountOfNetGain" : 567.9
      |        },
      |        {
      |            "customerReference" : "AB3456789012",
      |            "disposalDate" : "2021-03-19",
      |            "completionDate" : "2021-03-20",
      |            "disposalProceeds" : 234.32,
      |            "acquisitionDate" : "2021-02-21",
      |            "acquisitionAmount" : 345.23,
      |            "improvementCosts" : 456.23,
      |            "additionalCosts" : 234.34,
      |            "prfAmount" : 238.34,
      |            "otherReliefAmount" : 267.12,
      |            "lossesFromThisYear" : 361.89,
      |            "lossesFromPreviousYear" : 123.89,
      |            "amountOfNetLoss" : 345.89
      |        }
      |    ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MISSING_FIELDS: String =
    """
      |{
      |    "disposals" : [
      |        {
      |            "customerReference" : "ABC-2345",
      |            "disposalDate" : "2021-01-29",
      |            "completionDate" : "2021-04-02",
      |            "acquisitionDate" : "2021-03-22",
      |            "improvementCosts" : 345.34,
      |            "additionalCosts" : 234.89,
      |            "prfAmount" : 67.9,
      |            "otherReliefAmount" : 123.89,
      |            "lossesFromThisYear" : 456.89,
      |            "lossesFromPreviousYear" : 124.87,
      |            "amountOfNetGain" : 567.9
      |        }
      |    ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MINIMUM_FIELDS: String =
    """
      |{
      |    "disposals" : [
      |        {
      |            "disposalDate" : "2021-01-29",
      |            "completionDate" : "2021-04-02",
      |            "disposalProceeds" : 2345.67,
      |            "acquisitionDate" : "2021-01-22",
      |            "acquisitionAmount" : 2341.45
      |        }
      |    ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_INVALID_REQUEST: String =
    """
      |{
      |    "disposals" : [
      |        {
      |            "customerReference" : "ABC-2345",
      |            "disposalDate" : "2021-01-29",
      |            "completionDate" : "2021-04-25",
      |            "disposalProceeds" : 2345.672,
      |            "acquisitionDate" : "2021-03-22",
      |            "acquisitionAmount" : 2341.45,
      |            "improvementCosts" : 345.34,
      |            "additionalCosts" : 234.89,
      |            "prfAmount" : 67.9,
      |            "otherReliefAmount" : 123.89,
      |            "lossesFromThisYear" : 456.89,
      |            "lossesFromPreviousYear" : 124.87,
      |            "amountOfNetGain" : 567.9
      |        },
      |        {
      |            "customerReference" : "AB3456789012",
      |            "disposalDate" : "2021-01-21",
      |            "completionDate" : "2021-03-20",
      |            "disposalProceeds" : 234.32,
      |            "acquisitionDate" : "2021-02-21",
      |            "acquisitionAmount" : 345.231,
      |            "improvementCosts" : 456.23,
      |            "additionalCosts" : 234.34,
      |            "prfAmount" : 238.34,
      |            "otherReliefAmount" : 267.12,
      |            "lossesFromThisYear" : 361.89,
      |            "lossesFromPreviousYear" : 123.89,
      |            "amountOfNetLoss" : 345.89
      |        }
      |    ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MISSING_FIELDS_RESPONSE: String =
    CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
      Seq(
        "/disposals/0/disposalProceeds",
        "/disposals/0/acquisitionAmount"
      )
    )

  val CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_INVALID_REQUEST_RESPONSE: String =
    """
      |{
      |  "code": "FORMAT_VALUE",
      |   "message": "The value must be between 0 and 99999999999.99",
      |   "paths": [
      |     "/disposals/0/disposalProceeds",
      |     "/disposals/1/acquisitionAmount"
      |  ]
      |}
    """.stripMargin

}
