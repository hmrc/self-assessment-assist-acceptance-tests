/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V2

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage.taxPayer

object V2ListBsasJson {

  val LIST_BSAS_DEFAULT: String =
    s"""
       |{
       |   "businessSourceSummaries": [
       |      {
       |         "typeOfBusiness":"self-employment",
       |         "businessId":"XBIS12345678901",
       |         "accountingPeriod":{
       |            "startDate":"2019-04-06",
       |            "endDate":"2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789010",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/self-employment/12345678-1234-1234-8123-123456789010",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      },
       |      {
       |         "typeOfBusiness": "uk-property-non-fhl",
       |         "accountingPeriod": {
       |            "startDate": "2019-04-06",
       |            "endDate": "2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789011",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "invalid",
       |               "adjustedSummary": false,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/property/12345678-1234-1234-8123-123456789011",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      },
       |      {
       |         "typeOfBusiness": "foreign-property-fhl-eea",
       |         "accountingPeriod": {
       |            "startDate": "2019-04-06",
       |            "endDate": "2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789012",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/12345678-1234-1234-8123-123456789012",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      },
       |      {
       |         "typeOfBusiness": "uk-property-fhl",
       |         "accountingPeriod": {
       |            "startDate": "2019-04-06",
       |            "endDate": "2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789013",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/property/12345678-1234-1234-8123-123456789013",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      },
       |      {
       |         "typeOfBusiness": "foreign-property",
       |         "accountingPeriod": {
       |            "startDate": "2019-04-06",
       |            "endDate": "2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789014",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/12345678-1234-1234-8123-123456789014",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      }
       |   ],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
       |       "method": "POST",
       |       "rel": "trigger-business-source-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val LIST_BSAS_SE: String =
    s"""
       |{
       |   "businessSourceSummaries": [
       |      {
       |         "typeOfBusiness":"self-employment",
       |         "businessId":"XBIS12345678901",
       |         "accountingPeriod":{
       |            "startDate":"2019-04-06",
       |            "endDate":"2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789013",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/self-employment/12345678-1234-1234-8123-123456789013",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      }
       |   ],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
       |       "method": "POST",
       |       "rel": "trigger-business-source-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val LIST_BSAS_UK_PROPERTY_FHL: String =
    s"""
       |{
       |   "businessSourceSummaries": [
       |      {
       |         "typeOfBusiness": "uk-property-fhl",
       |         "accountingPeriod": {
       |            "startDate": "2019-04-06",
       |            "endDate": "2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789010",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/property/12345678-1234-1234-8123-123456789010",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      }
       |   ],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
       |       "method": "POST",
       |       "rel": "trigger-business-source-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val LIST_BSAS_UK_PROPERTY_NON_FHL: String =
    s"""
       |{
       |   "businessSourceSummaries": [
       |      {
       |         "typeOfBusiness": "uk-property-non-fhl",
       |         "accountingPeriod": {
       |            "startDate": "2019-04-06",
       |            "endDate": "2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789010",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/property/12345678-1234-1234-8123-123456789010",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      }
       |   ],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
       |       "method": "POST",
       |       "rel": "trigger-business-source-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val LIST_BSAS_FOREIGN_PROPERTY: String =
    s"""
       |{
       |   "businessSourceSummaries": [
       |      {
       |         "typeOfBusiness":"foreign-property",
       |         "businessId" : "XFIS12345678903",
       |         "accountingPeriod":{
       |            "startDate":"2019-04-06",
       |            "endDate":"2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789010",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/12345678-1234-1234-8123-123456789010",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      }
       |   ],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
       |       "method": "POST",
       |       "rel": "trigger-business-source-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val LIST_BSAS_FOREIGN_PROPERTY_FHL_EEA: String =
    s"""
       |{
       |   "businessSourceSummaries": [
       |      {
       |         "typeOfBusiness":"foreign-property-fhl-eea",
       |         "businessId" : "XFIS12345678901",
       |         "accountingPeriod":{
       |            "startDate":"2019-04-06",
       |            "endDate":"2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789010",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/12345678-1234-1234-8123-123456789010",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      }
       |   ],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
       |       "method": "POST",
       |       "rel": "trigger-business-source-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val LIST_BSAS_MULTIPLE_SE: String =
    s"""
     |{
     |   "businessSourceSummaries":[
     |      {
     |         "typeOfBusiness":"self-employment",
     |         "businessId":"XBIS12345678901",
     |         "accountingPeriod":{
     |            "startDate":"2019-04-06",
     |            "endDate":"2020-04-05"
     |         },
     |         "bsasEntries":[
     |            {
     |               "bsasId":"12345678-1234-1234-8123-123456789014",
     |               "requestedDateTime":"2020-04-05T23:59:59.000Z",
     |               "summaryStatus":"valid",
     |               "adjustedSummary":true,
     |               "links": [
     |                 {
     |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/self-employment/12345678-1234-1234-8123-123456789014",
     |                   "method": "GET",
     |                   "rel": "self"
     |                 }
     |              ]
     |            }
     |         ]
     |      },
     |      {
     |         "typeOfBusiness":"self-employment",
     |         "businessId":"XBIS12345678902",
     |         "accountingPeriod":{
     |            "startDate":"2019-04-06",
     |            "endDate":"2020-04-05"
     |         },
     |         "bsasEntries":[
     |            {
     |               "bsasId":"12345678-1234-1234-8123-123456789015",
     |               "requestedDateTime":"2020-04-05T23:59:59.000Z",
     |               "summaryStatus":"valid",
     |               "adjustedSummary":true,
     |               "links": [
     |                 {
     |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/self-employment/12345678-1234-1234-8123-123456789015",
     |                   "method": "GET",
     |                   "rel": "self"
     |                 }
     |              ]
     |            }
     |         ]
     |      }
     |   ],
     |   "links": [
     |     {
     |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
     |       "method": "POST",
     |       "rel": "trigger-business-source-adjustable-summary"
     |     },
     |     {
     |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
     |       "method": "GET",
     |       "rel": "self"
     |     }
     |   ]
     |}
     |""".stripMargin

  val LIST_BSAS_MULTIPLE_PROPERTY: String =
    s"""
       |{
       |   "businessSourceSummaries": [
       |      {
       |         "typeOfBusiness": "uk-property-non-fhl",
       |         "accountingPeriod": {
       |            "startDate": "2019-04-06",
       |            "endDate": "2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789012",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": false,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/property/12345678-1234-1234-8123-123456789012",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      },
       |      {
       |         "typeOfBusiness": "uk-property-fhl",
       |         "accountingPeriod": {
       |            "startDate": "2019-04-06",
       |            "endDate": "2020-04-05"
       |         },
       |         "bsasEntries": [
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789022",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/property/12345678-1234-1234-8123-123456789022",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            },
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789022",
       |               "requestedDateTime": "2020-04-04T23:59:59.000Z",
       |               "summaryStatus": "superseded",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                    "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/property/12345678-1234-1234-8123-123456789022",
       |                    "method": "GET",
       |                    "rel": "self"
       |                 }
       |               ]
       |           }
       |         ]
       |      }
       |   ],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
       |       "method": "POST",
       |       "rel": "trigger-business-source-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val LIST_BSAS_MULTIPLE_FOREIGN_PROPERTY: String =
    s"""
       |{
       |   "businessSourceSummaries":[
       |      {
       |         "typeOfBusiness":"foreign-property-fhl-eea",
       |         "businessId" : "XFIS12345678901",
       |         "accountingPeriod":{
       |            "startDate":"2019-04-06",
       |            "endDate":"2020-04-05"
       |         },
       |         "bsasEntries":[
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789012",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": false,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/12345678-1234-1234-8123-123456789012",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      },
       |      {
       |         "typeOfBusiness":"foreign-property",
       |         "businessId" : "XFIS12345678902",
       |         "accountingPeriod":{
       |            "startDate":"2019-04-06",
       |            "endDate":"2020-04-05"
       |         },
       |         "bsasEntries":[
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789022",
       |               "requestedDateTime": "2020-04-05T23:59:59.000Z",
       |               "summaryStatus": "valid",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/12345678-1234-1234-8123-123456789022",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            },
       |            {
       |               "bsasId": "12345678-1234-1234-8123-123456789022",
       |               "requestedDateTime": "2020-04-04T23:59:59.000Z",
       |               "summaryStatus": "superseded",
       |               "adjustedSummary": true,
       |               "links": [
       |                 {
       |                   "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/12345678-1234-1234-8123-123456789022",
       |                   "method": "GET",
       |                   "rel": "self"
       |                 }
       |              ]
       |            }
       |         ]
       |      }
       |   ],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/trigger",
       |       "method": "POST",
       |       "rel": "trigger-business-source-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

}
