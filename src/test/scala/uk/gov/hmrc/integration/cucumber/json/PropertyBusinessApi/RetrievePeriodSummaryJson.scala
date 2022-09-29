/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrievePeriodSummaryJson {

  def PeriodSummaryDefaultResponse: String =
    s"""
       |{
       |  "fromDate": "2019-04-06",
       |  "toDate": "2019-07-06",
       |  "foreignFhlEea": {
       |    "income": {
       |      "rentAmount": 2340.30
       |    },
       |    "expenditure": {
       |      "premisesRunningCosts": 101.50,
       |      "repairsAndMaintenance": 3.25,
       |      "financialCosts": 459.99,
       |      "professionalFees": 583.99,
       |      "costsOfServices": 300.99,
       |      "travelCosts": 8201.10,
       |      "other": 83.19
       |    }
       |  },
       |  "foreignProperty": [
       |    {
       |      "countryCode": "ALB",
       |      "income": {
       |        "rentIncome": {
       |          "rentAmount": 459.99
       |        },
       |        "foreignTaxCreditRelief": true,
       |        "premiumOfLeaseGrant": 490.20,
       |        "otherPropertyIncome": 1000.29,
       |        "foreignTaxTakenOff": 440.21,
       |        "specialWithholdingTaxOrUKTaxPaid": 23.78
       |      },
       |      "expenditure": {
       |        "premisesRunningCosts": 49291.50,
       |        "repairsAndMaintenance": 54.30,
       |        "financialCosts": 2090.35,
       |        "professionalFees": 90.20,
       |        "costsOfServices": 100.83,
       |        "travelCosts": 560.99,
       |        "residentialFinancialCost": 4820.49,
       |        "broughtFwdResidentialFinancialCost": 5600.10,
       |        "other": 230.20
       |      }
       |    }
       |  ],
       |  "links": [
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period/$randomSubmissionId",
       |      "method": "PUT",
       |      "rel": "amend-property-period-summary"
       |    },
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period/$randomSubmissionId",
       |      "method": "GET",
       |      "rel": "self"
       |    },
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period",
       |      "method": "GET",
       |      "rel": "list-property-period-summaries"
       |    }
       |  ]
       |}
     """.stripMargin

  def PeriodSummaryConsolidatedExpenditureResponse: String =
    s"""
       |{
       |  "fromDate": "2019-04-06",
       |  "toDate": "2019-07-06",
       |  "foreignFhlEea": {
       |    "income": {
       |      "rentAmount": 200.22
       |    },
       |    "expenditure": {
       |      "consolidatedExpenses": 3021.25
       |    }
       |  },
       |  "foreignProperty": [
       |    {
       |      "countryCode": "ALB",
       |      "income": {
       |        "rentIncome": {
       |          "rentAmount": 31315.40
       |        },
       |        "foreignTaxCreditRelief": true,
       |        "premiumOfLeaseGrant": 56.32,
       |        "otherPropertyIncome": 123.99,
       |        "foreignTaxTakenOff": 44.21,
       |        "specialWithholdingTaxOrUKTaxPaid": 9540.45
       |      },
       |      "expenditure": {
       |        "residentialFinancialCost": 231.10,
       |        "broughtFwdResidentialFinancialCost": 670.20,
       |        "consolidatedExpenses": 87.30
       |      }
       |    }
       |  ],
       |  "links": [
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period/$randomSubmissionId",
       |      "method": "PUT",
       |      "rel": "amend-property-period-summary"
       |    },
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period/$randomSubmissionId",
       |      "method": "GET",
       |      "rel": "self"
       |    },
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period",
       |      "method": "GET",
       |      "rel": "list-property-period-summaries"
       |    }
       |  ]
       |}
     """.stripMargin

  def PeriodSummaryNoExpenditureResponse: String =
    s"""
       |{
       |  "fromDate": "2019-04-06",
       |  "toDate": "2019-07-06",
       |  "foreignFhlEea": {
       |    "income": {
       |      "rentAmount": 3490.10
       |    }
       |  },
       |  "foreignProperty": [
       |    {
       |      "countryCode": "ALB",
       |      "income": {
       |        "rentIncome": {
       |          "rentAmount": 3820.50
       |        },
       |        "foreignTaxCreditRelief": true,
       |        "premiumOfLeaseGrant": 12.25,
       |        "otherPropertyIncome": 8391.99,
       |        "foreignTaxTakenOff": 45.50,
       |        "specialWithholdingTaxOrUKTaxPaid": 67.80
       |      }
       |    }
       |  ],
       |  "links": [
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period/$randomSubmissionId",
       |      "method": "PUT",
       |      "rel": "amend-property-period-summary"
       |    },
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period/$randomSubmissionId",
       |      "method": "GET",
       |      "rel": "self"
       |    },
       |    {
       |      "href": "/individuals/business/property/${taxPayer.nino}/$randomBusinessId/period",
       |      "method": "GET",
       |      "rel": "list-property-period-summaries"
       |    }
       |  ]
       |}
     """.stripMargin

}
