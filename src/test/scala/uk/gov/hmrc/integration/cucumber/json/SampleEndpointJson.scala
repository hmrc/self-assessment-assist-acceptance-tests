/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object SampleEndpointJson {

  def STATE_BENEFITS_API_TEMPLATE_RESPONSE: String =
    s"""
       |{
       |  "links" : [ {
       |    "href" : "/individuals/state-benefits/sample/${taxPayer.nino}/$getTaxYear",
       |    "method" : "PUT",
       |    "rel" : "amend-sample-rel"
       |  }, {
       |    "href" : "/individuals/state-benefits/sample/${taxPayer.nino}/$getTaxYear",
       |    "method" : "GET",
       |    "rel" : "self"
       |  }, {
       |    "href" : "/individuals/state-benefits/sample/${taxPayer.nino}/$getTaxYear",
       |    "method" : "DELETE",
       |    "rel" : "delete-sample-rel"
       |  } ]
       |}
     """.stripMargin

  val API_TEMPLATE_REQUEST: String =
    """
      |{
      |  "data" : "request"
      |}
    """.stripMargin

  def INCOME_API_TEMPLATE_RESPONSE: String =
    s"""
       |{
       |    "responseData": "success",
       |    "links": [
       |        {
       |            "href": "/individuals/income-received/${taxPayer.nino}/sample-endpoint",
       |            "method": "GET",
       |            "rel": "sample-rel"
       |        }
       |    ]
       |}
     """.stripMargin

  def DEDUCTIONS_API_TEMPLATE_RESPONSE: String =
    s"""
       |{
       |    "responseData": "success",
       |    "links": [
       |        {
       |            "href": "/individuals/deductions/other/${taxPayer.nino}/sample-endpoint",
       |            "method": "GET",
       |            "rel": "sample-rel"
       |        }
       |    ]
       |}
     """.stripMargin

  def DISCLOSURES_API_TEMPLATE_RESPONSE: String =
    s"""
      |{
      |   "responseData": "success",
      |   "links":[
      |      {
      |         "href": "/individuals/disclosures/${taxPayer.nino}/sample-endpoint",
      |         "method": "GET",
      |         "rel": "sample-rel"
      |      }
      |   ]
      |}
    """.stripMargin

}
