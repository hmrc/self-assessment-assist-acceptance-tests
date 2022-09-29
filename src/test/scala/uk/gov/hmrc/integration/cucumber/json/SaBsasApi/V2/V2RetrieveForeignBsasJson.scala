/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V2

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage.taxPayer

object V2RetrieveForeignBsasJson {

  val FOREIGN_PROP_FHL_EEA_ADJUSTED: String =
    s"""
       |{
       |   "metadata": {
       |      "typeOfBusiness": "foreign-property-fhl-eea",
       |      "businessId": "XFIS12345678901",
       |      "accountingPeriod": {
       |         "startDate": "2019-04-06",
       |         "endDate": "2020-04-05"
       |      },
       |      "taxYear": "2019-20",
       |      "requestedDateTime": "2020-10-14T11:33:27Z",
       |      "bsasId": "717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4",
       |      "summaryStatus": "valid",
       |      "adjustedSummary": true
       |   },
       |   "adjustments": [{
       |      "incomes": {
       |         "rentIncome": 542.43
       |      },
       |      "expenses": {
       |         "premisesRunningCosts": 839.67,
       |         "repairsAndMaintenance": 372.59,
       |         "financialCosts": 639.03,
       |         "professionalFees": 483.39,
       |         "travelCosts": 692.04,
       |         "costOfServices": 384.29,
       |         "other": 482.58
       |      }
       |   }],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4",
       |       "method": "GET",
       |       "rel": "retrieve-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4/adjust",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val FOREIGN_PROP_FHL_EEA_CONSOLIDATED: String =
    s"""
       |{
       |   "metadata": {
       |      "typeOfBusiness": "foreign-property-fhl-eea",
       |      "businessId": "XFIS12345678901",
       |      "accountingPeriod": {
       |         "startDate": "2019-04-06",
       |         "endDate": "2020-04-05"
       |      },
       |      "taxYear": "2019-20",
       |      "requestedDateTime": "2020-10-14T11:33:27Z",
       |      "bsasId": "717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4",
       |      "summaryStatus": "valid",
       |      "adjustedSummary": true
       |   },
       |   "adjustments": [{
       |      "incomes": {
       |         "rentIncome": 631.63
       |      },
       |      "expenses": {
       |         "consolidatedExpenses": 643.11
       |      }
       |   }],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4",
       |       "method": "GET",
       |       "rel": "retrieve-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4/adjust",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val FOREIGN_PROP_ADJUSTED: String =
    s"""
       |{
       |   "metadata": {
       |      "typeOfBusiness": "foreign-property",
       |      "businessId": "XFIS12345678901",
       |      "accountingPeriod": {
       |         "startDate": "2019-04-06",
       |         "endDate": "2020-04-05"
       |      },
       |      "taxYear": "2019-20",
       |      "requestedDateTime": "2020-10-14T11:33:27Z",
       |      "bsasId": "717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4",
       |      "summaryStatus": "valid",
       |      "adjustedSummary": true
       |   },
       |   "adjustments": [{
       |      "countryCode": "CYM",
       |      "incomes": {
       |         "rentIncome": 755.00,
       |         "premiumsOfLeaseGrant": 734.19,
       |         "otherPropertyIncome": 817.98
       |      },
       |      "expenses": {
       |         "premisesRunningCosts": 728.47,
       |         "repairsAndMaintenance": 931.28,
       |         "financialCosts": 835.39,
       |         "professionalFees": 526.37,
       |         "travelCosts": 692.84,
       |         "costOfServices": 533.99,
       |         "residentialFinancialCost": 835.11,
       |         "other": 533.28
       |      }
       |   }],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4",
       |       "method": "GET",
       |       "rel": "retrieve-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4/adjust",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val FOREIGN_PROP_CONSOLIDATED: String =
    s"""
       |{
       |   "metadata": {
       |      "typeOfBusiness": "foreign-property",
       |      "businessId": "XFIS12345678901",
       |      "accountingPeriod": {
       |         "startDate": "2019-04-06",
       |         "endDate": "2020-04-05"
       |      },
       |      "taxYear": "2019-20",
       |      "requestedDateTime": "2020-10-14T11:33:27Z",
       |      "bsasId": "717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4",
       |      "summaryStatus": "valid",
       |      "adjustedSummary": true
       |   },
       |   "adjustments": [{
       |      "countryCode": "CYM",
       |      "incomes": {
       |         "rentIncome": 574.27
       |      },
       |      "expenses": {
       |         "consolidatedExpenses": 863.75
       |      }
       |   }],
       |   "links": [
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4",
       |       "method": "GET",
       |       "rel": "retrieve-adjustable-summary"
       |     },
       |     {
       |       "href": "/individuals/self-assessment/adjustable-summary/${taxPayer.nino}/foreign-property/717f3a7a-db8e-11e9-8a34-2a2ae2dbcce4/adjust",
       |       "method": "GET",
       |       "rel": "self"
       |     }
       |   ]
       |}
     """.stripMargin

  val RULE_NOT_FOREIGN_PROPERTY: String =
    """
      |{
      | "code": "RULE_NOT_FOREIGN_PROPERTY",
      | "message": "The summary calculation requested is not for a foreign property business"
      |}
    """.stripMargin

}
