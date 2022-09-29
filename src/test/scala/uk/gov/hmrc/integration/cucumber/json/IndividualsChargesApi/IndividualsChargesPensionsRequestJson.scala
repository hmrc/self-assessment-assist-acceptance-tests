/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsChargesApi

object IndividualsChargesPensionsRequestJson {

  val AMEND_PENSIONS_CHARGES_MAXIMUM_DEFAULT: String =
    """
       |{
       |"pensionSavingsTaxCharges": {
       |    "isAnnualAllowanceReduced": true,
       |    "taperedAnnualAllowance": true,
       |    "moneyPurchasedAllowance": false,
       |    "pensionSchemeTaxReference": ["00123456RA"],
       |    "lumpSumBenefitTakenInExcessOfLifetimeAllowance": {
       |      "amount": 150.50,
       |      "taxPaid": 230.30
       |    }
       |  },
       |"pensionSchemeOverseasTransfers": {
       |    "overseasSchemeProvider": [
       |        {
       |          "providerName": "Overseas Pensions Plc",
       |          "providerAddress": "111 Main Street, Any Town, Any City",
       |          "providerCountryCode": "CYM",
       |          "qualifyingRecognisedOverseasPensionScheme": ["Q123456"]
       |        }
       |     ],
       |     "transferCharge": 100.00,
       |     "transferChargeTaxPaid": 50.00
       |  },
       |"pensionSchemeUnauthorisedPayments": {
       |    "pensionSchemeTaxReference": ["00123456RA"],
       |    "surcharge": {
       |      "amount": 10.50,
       |      "foreignTaxPaid": 13.25
       |    },
       |    "noSurcharge": {
       |      "amount": 5.00,
       |      "foreignTaxPaid": 7.80
       |    }
       |  },
       |"pensionContributions": {
       |    "pensionSchemeTaxReference": ["00123456RA"],
       |    "inExcessOfTheAnnualAllowance": 50.00,
       |    "annualAllowanceTaxPaid": 20.00
       |  },
       |"overseasPensionContributions": {
       |    "overseasSchemeProvider": [
       |      {
       |        "providerName": "Overseas Pensions Plc",
       |        "providerAddress": "111 Main Street, Any Town, Any City",
       |        "providerCountryCode": "CYM",
       |        "qualifyingRecognisedOverseasPensionScheme": ["Q123456"]
       |      }
       |    ],
       |    "shortServiceRefund": 40.00,
       |    "shortServiceRefundTaxPaid": 25.00
       |  }
       |}
    """.stripMargin

  val AMEND_PENSIONS_CHARGES_MINIMUM_DEFAULT: String =
    """
       |{
       |	"pensionContributions": {
       |		"pensionSchemeTaxReference": [
       |			"00123456RA"
       |		],
       |		"inExcessOfTheAnnualAllowance": 0,
       |		"annualAllowanceTaxPaid": 0
       |	}
       |}
    """.stripMargin

}
