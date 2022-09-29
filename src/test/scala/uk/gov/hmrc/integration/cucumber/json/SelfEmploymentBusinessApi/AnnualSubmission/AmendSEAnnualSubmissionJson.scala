/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfEmploymentBusinessApi.AnnualSubmission

object AmendSEAnnualSubmissionJson {

  val CreateOrAmendAnnualSubmission: String =
    """
      |{
      |  "adjustments": {
      |    "includedNonTaxableProfits": 216.12,
      |    "basisAdjustment": 626.53,
      |    "overlapReliefUsed": 153.89,
      |    "accountingAdjustment": 514.24,
      |    "averagingAdjustment": 124.98,
      |    "outstandingBusinessIncome": 751.03,
      |    "balancingChargeBpra": 719.23,
      |    "balancingChargeOther": 956.47,
      |    "goodsAndServicesOwnUse": 157.43
      |  },
      |  "allowances": {
      |    "annualInvestmentAllowance": 561.32,
      |    "capitalAllowanceMainPool": 198.45,
      |    "capitalAllowanceSpecialRatePool": 825.34,
      |    "zeroEmissionsGoodsVehicleAllowance": 647.12,
      |    "businessPremisesRenovationAllowance": 173.64,
      |    "enhancedCapitalAllowance": 115.98,
      |    "allowanceOnSales": 548.15,
      |    "capitalAllowanceSingleAssetPool": 901.67,
      |    "electricChargePointAllowance": 521.34,
      |    "zeroEmissionsCarAllowance": 785.34,
      |    "structuredBuildingAllowance": [
      |      {
      |        "amount": 465.23,
      |        "firstYear": {
      |          "qualifyingDate": "2020-01-01",
      |          "qualifyingAmountExpenditure": 7645.35
      |        },
      |        "building": {
      |          "name": "My Building",
      |          "number": "23A",
      |          "postcode": "AB36 8XB"
      |        }
      |      }
      |    ],
      |    "enhancedStructuredBuildingAllowance": [
      |      {
      |        "amount": 465.23,
      |        "firstYear": {
      |          "qualifyingDate": "2020-01-01",
      |          "qualifyingAmountExpenditure": 7645.35
      |        },
      |        "building": {
      |          "name": "My Second Building",
      |          "number": "23B",
      |          "postcode": "AB36 8XB"
      |        }
      |      }
      |    ]
      |  },
      |  "nonFinancials": {
      |    "businessDetailsChangedRecently": true,
      |    "class4NicsExemptionReason": "diver"
      |  }
      |}
    """.stripMargin

  val CreateOrAmendAnnualSubmissionTradingAllowances: String =
    """
      |{
      |  "adjustments": {
      |    "includedNonTaxableProfits": 216.12,
      |    "basisAdjustment": 626.53,
      |    "overlapReliefUsed": 153.89,
      |    "accountingAdjustment": 514.24,
      |    "averagingAdjustment": 124.98,
      |    "outstandingBusinessIncome": 751.03,
      |    "balancingChargeBpra": 719.23,
      |    "balancingChargeOther": 956.47,
      |    "goodsAndServicesOwnUse": 157.43
      |  },
      |  "allowances": {
      |    "tradingIncomeAllowance": 98.34
      |  },
      |  "nonFinancials": {
      |    "businessDetailsChangedRecently": true,
      |    "class4NicsExemptionReason": "ITTOIA-2005"
      |  }
      |}
    """.stripMargin

  val allowanceNotSupportedErrorResponse: String = {
    """
      |{
      |   "code" : "RULE_ALLOWANCE_NOT_SUPPORTED",
      |   "message" : "One or more of the supplied allowances is not supported for the supplied tax year"
      |}
      |""".stripMargin
  }

}
