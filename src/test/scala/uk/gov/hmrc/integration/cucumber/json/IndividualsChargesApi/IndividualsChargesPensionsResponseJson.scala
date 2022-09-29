/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsChargesApi

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object IndividualsChargesPensionsResponseJson {

  def GET_PENSION_CHARGES_DEFAULT: String =
    s"""
       |{
       |  "pensionSavingsTaxCharges": {
       |    "pensionSchemeTaxReference": [
       |      "00123456RA"
       |    ],
       |    "lumpSumBenefitTakenInExcessOfLifetimeAllowance": {
       |      "amount": 123.45,
       |      "taxPaid": 12.45
       |    },
       |    "benefitInExcessOfLifetimeAllowance": {
       |      "amount": 123.45,
       |      "taxPaid": 12.34
       |    },
       |    "isAnnualAllowanceReduced": true,
       |    "taperedAnnualAllowance": true,
       |    "moneyPurchasedAllowance": false
       |  },
       |  "pensionSchemeOverseasTransfers": {
       |    "overseasSchemeProvider": [
       |      {
       |        "providerName": "Overseas Pensions Plc",
       |        "providerAddress": "111 Main Street, George Town, Grand Cayman",
       |        "providerCountryCode": "ESP",
       |        "qualifyingRecognisedOverseasPensionScheme": [
       |          "Q123456"
       |        ]
       |      }
       |    ],
       |    "transferCharge": 123.45,
       |    "transferChargeTaxPaid": 0
       |  },
       |  "pensionSchemeUnauthorisedPayments": {
       |    "pensionSchemeTaxReference": [
       |      "00123456RA"
       |    ],
       |    "surcharge": {
       |      "amount": 123.45,
       |      "foreignTaxPaid": 123.45
       |    },
       |    "noSurcharge": {
       |      "amount": 123.45,
       |      "foreignTaxPaid": 123.45
       |    }
       |  },
       |  "pensionContributions": {
       |    "pensionSchemeTaxReference": [
       |      "00123456RA"
       |    ],
       |    "inExcessOfTheAnnualAllowance": 123.45,
       |    "annualAllowanceTaxPaid": 123.45
       |  },
       |  "overseasPensionContributions": {
       |    "overseasSchemeProvider": [
       |      {
       |        "providerName": "Overseas Pensions Plc",
       |        "providerAddress": "111 Main Street, George Town, Grand Cayman",
       |        "providerCountryCode": "ESP",
       |        "qualifyingRecognisedOverseasPensionScheme": [
       |          "Q123456"
       |        ]
       |      }
       |    ],
       |    "shortServiceRefund": 123.45,
       |    "shortServiceRefundTaxPaid": 0
       |  },
       |  "links": [
       |    {
       |      "href": "/individuals/charges/pensions/${taxPayer.nino}/2021-22",
       |      "method": "GET",
       |      "rel": "self"
       |    },
       |    {
       |      "href": "/individuals/charges/pensions/${taxPayer.nino}/2021-22",
       |      "method": "PUT",
       |      "rel": "create-and-amend-charges-pensions"
       |    },
       |    {
       |      "href": "/individuals/charges/pensions/${taxPayer.nino}/2021-22",
       |      "method": "DELETE",
       |      "rel": "delete-charges-pensions"
       |    }
       |  ]
       |}
     """.stripMargin

  def GET_PENSION_CHARGES_OPTIONAL: String =
    s"""{
       |  "overseasPensionContributions": {
       |    "overseasSchemeProvider": [
       |      {
       |        "providerName": "Overseas Pensions Plc",
       |        "providerAddress": "111 Main Street, George Town, Grand Cayman",
       |        "providerCountryCode": "ESP",
       |        "qualifyingRecognisedOverseasPensionScheme": [
       |          "Q123456"
       |        ]
       |      }
       |    ],
       |    "shortServiceRefund": 123.45,
       |    "shortServiceRefundTaxPaid": 0
       |  },
       |  "links": [
       |    {
       |      "href": "/individuals/charges/pensions/${taxPayer.nino}/2021-22",
       |      "method": "GET",
       |      "rel": "self"
       |    },
       |    {
       |      "href": "/individuals/charges/pensions/${taxPayer.nino}/2021-22",
       |      "method": "PUT",
       |      "rel": "create-and-amend-charges-pensions"
       |    },
       |    {
       |      "href": "/individuals/charges/pensions/${taxPayer.nino}/2021-22",
       |      "method": "DELETE",
       |      "rel": "delete-charges-pensions"
       |    }
       |  ]
       |}
     """.stripMargin

}
