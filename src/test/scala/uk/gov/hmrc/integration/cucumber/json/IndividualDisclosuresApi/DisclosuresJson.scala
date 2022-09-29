/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualDisclosuresApi

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.URLs

object DisclosuresJson {

  val iDisclosuresAmend: String =
    """
      |{
      |  "taxAvoidance": [
      |    {
      |      "srn": "14211123",
      |      "taxYear": "2020-21"
      |    }
      |  ],
      |    "class2Nics": {
      |     "class2VoluntaryContributions": true
      |  }
      |}
    """.stripMargin

  val iDisclosuresAmendAgain: String =
    """
      |{
      |  "taxAvoidance": [
      |    {
      |      "srn": "14211124",
      |      "taxYear": "2020-21"
      |    }
      |  ],
      |    "class2Nics": {
      |     "class2VoluntaryContributions": true
      |  }
      |}
    """.stripMargin

  def iDisclosuresAmendRetrieval: String =
    s"""
       |{
       |  "taxAvoidance": [
       |    {
       |      "srn": "14211124",
       |      "taxYear": "2020-21"
       |    }
       |  ],
       |  "class2Nics": {
       |    "class2VoluntaryContributions": true
       |  },
       |  "submittedOn": "UNCHECKED",
       |  "links":[
       |      {
       |         "href": "/individuals/disclosures/${taxPayer.nino}/${URLs.getNextTaxYear}",
       |
       |         "rel": "create-and-amend-disclosures",
       |         "method": "PUT"
       |      },
       |      {
       |         "href": "/individuals/disclosures/${taxPayer.nino}/${URLs.getNextTaxYear}",
       |         "rel": "self",
       |         "method": "GET"
       |      },
       |      {
       |         "href": "/individuals/disclosures/${taxPayer.nino}/${URLs.getNextTaxYear}",
       |         "rel": "delete-disclosures",
       |         "method": "DELETE"
       |      }
       |   ]
       |}
     """.stripMargin

  val iDisclosuresAmendMinimumFields: String =
    """
      |{
      |  "taxAvoidance": [
      |    {
      |      "srn": "14211123",
      |      "taxYear": "2020-21"
      |    }
      |  ]
      |}
    """.stripMargin

  val iDisclosuresAmendMissingErrors: String =
    """
      |{
      |  "taxAvoidance": [
      |    {
      |      "taxYear": "2020-21"
      |    }
      |  ]
      |}
    """.stripMargin

  val iDisclosuresAmendValueErrorsRequest: String =
    """
      |{
      |  "taxAvoidance": [
      |    {
      |      "srn": "ABC142111235D",
      |      "taxYear": "2020"
      |    },
      |    {
      |      "srn": "CDE345226789F",
      |      "taxYear": "2020-22"
      |    }
      |  ],
      |  "class2Nics": {
      |     "class2VoluntaryContributions": false
      |  }
      |}
    """.stripMargin

  val RULE_VOLUNTARY_CLASS2_CANNOT_BE_CHANGED: String =
    """
      |{
      | "code": "RULE_VOLUNTARY_CLASS2_CANNOT_BE_CHANGED",
      | "message": "Voluntary Class 2 NICs cannot be changed after 31st Jan following the year of submission"
      |}
    """.stripMargin

  val iDisclosuresAmendErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors":[
      |      {
      |         "code": "FORMAT_SRN_INVALID",
      |         "message": "The provided scheme reference number is invalid",
      |         "paths":[
      |            "/taxAvoidance/0/srn",
      |            "/taxAvoidance/1/srn"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_TAX_YEAR",
      |         "message": "The provided tax year is invalid",
      |         "paths":[
      |            "/taxAvoidance/0/taxYear"
      |         ]
      |      },
      |      {
      |         "code": "RULE_TAX_YEAR_RANGE_INVALID",
      |         "message": "Tax year range invalid. A tax year range of one year is required",
      |         "paths":[
      |            "/taxAvoidance/1/taxYear"
      |         ]
      |      },
      |      {
      |         "code": "RULE_VOLUNTARY_CLASS2_VALUE_INVALID",
      |         "message": "Voluntary Class 2 Contributions can only be set to true",
      |         "paths": [
      |            "/class2Nics/class2VoluntaryContributions"
      |         ]
      |      }
      |   ]
      |}
    """.stripMargin

  val iDisclosuresAmendEmptyBodyRequest: String =
    """
      |{
      |}
    """.stripMargin

  val iDisclosuresAmendMissingFieldResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq("/taxAvoidance/0/srn")
  )

}
