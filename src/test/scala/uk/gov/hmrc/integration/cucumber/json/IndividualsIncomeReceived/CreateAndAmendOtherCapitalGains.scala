/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object CreateAndAmendOtherCapitalGains {

  val CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_REQUEST: String =
    """
      |{
      |  "disposals": [
      |    {
      |      "assetType": "otherProperty",
      |      "assetDescription": "Property Sale",
      |      "acquisitionDate": "2021-05-01",
      |      "disposalDate": "2021-06-01",
      |      "disposalProceeds": 1000.12,
      |      "allowableCosts": 1000.12,
      |      "gain": 1000.12,
      |      "claimOrElectionCodes": [
      |        "PRR"
      |      ],
      |      "gainAfterRelief": 1000.12,
      |      "rttTaxPaid": 1000.12
      |    }
      |  ],
      |  "nonStandardGains": {
      |    "carriedInterestGain": 1000.12,
      |    "carriedInterestRttTaxPaid": 1000.12,
      |    "attributedGains": 1000.12,
      |    "attributedGainsRttTaxPaid": 1000.12,
      |    "otherGains": 1000.12,
      |    "otherGainsRttTaxPaid": 1000.12
      |  },
      |  "losses": {
      |    "broughtForwardLossesUsedInCurrentYear": 1000.12,
      |    "setAgainstInYearGains": 1000.12,
      |    "setAgainstInYearGeneralIncome": 1000.12,
      |    "setAgainstEarlierYear": 1000.12
      |  },
      |  "adjustments": 1000.12
      |}
    """.stripMargin

  val CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MINIMUM_FIELDS: String =
    """
      |{
      |  "disposals": [
      |    {
      |      "assetType": "otherProperty",
      |      "assetDescription": "Property Sale",
      |      "acquisitionDate": "2021-05-01",
      |      "disposalDate": "2021-06-01",
      |      "disposalProceeds": 1000.12,
      |      "allowableCosts": 1000.12
      |    }
      |  ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MISSING_FIELDS: String =
    """
      |{
      |  "disposals": [
      |    {
      |      "acquisitionDate": "2021-05-01",
      |      "disposalDate": "2021-06-01",
      |      "disposalProceeds": 1000.12,
      |      "allowableCosts": 1000.12
      |    }
      |  ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_INVALID_REQUEST: String =
    """
      |{
      |  "disposals": [
      |    {
      |      "assetType": true,
      |      "assetDescription": "Property Sale",
      |      "acquisitionDate": "2021-05-01",
      |      "disposalDate": "2021-06-01",
      |      "disposalProceeds": 1000.12,
      |      "allowableCosts": 1000.12
      |    }
      |  ]
      |}
    """.stripMargin

  val CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MISSING_FIELDS_RESPONSE: String =
    CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
      Seq(
        "/disposals/0/assetType",
        "/disposals/0/assetDescription"
      )
    )

  val CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_INVALID_REQUEST_RESPONSE: String =
    CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
      Seq(
        "/disposals/0/assetType"
      )
    )

}
