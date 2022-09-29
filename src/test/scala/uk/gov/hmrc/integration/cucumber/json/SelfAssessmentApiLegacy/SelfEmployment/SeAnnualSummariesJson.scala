/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfAssessmentApiLegacy.SelfEmployment

object SeAnnualSummariesJson {

  val annualSummaryBothAllowancesSupplied: String =
    s"""|{
        |   "adjustments": {
        |      "includedNonTaxableProfits":500.25,
        |      "basisAdjustment":500.25,
        |      "overlapReliefUsed":500.25,
        |      "accountingAdjustment":500.25,
        |      "averagingAdjustment":500.25,
        |      "outstandingBusinessIncome":500.25,
        |      "balancingChargeBPRA":500.25,
        |      "balancingChargeOther":500.25,
        |      "goodsAndServicesOwnUse":500.25
        |   },
        |   "allowances": {
        |      "annualInvestmentAllowance":500.25,
        |      "capitalAllowanceMainPool":500.25,
        |      "capitalAllowanceSpecialRatePool":500.25,
        |      "enhancedCapitalAllowance":500.25,
        |      "allowanceOnSales":500.25,
        |      "zeroEmissionGoodsVehicleAllowance":500.25,
        |      "capitalAllowanceSingleAssetPool":500.25,
        |      "tradingAllowance":500.25
        |   },
        |   "nonFinancials": {
        |      "class4NicInfo": {
        |         "isExempt":true,
        |         "exemptionCode":"003"
        |      }
        |   }
        |}
      """.stripMargin

  val annualSummaryWithTradingAllowance: String =
    s"""|{
        |   "adjustments":{
        |      "includedNonTaxableProfits":500.25,
        |      "basisAdjustment":500.25,
        |      "overlapReliefUsed":500.25,
        |      "accountingAdjustment":500.25,
        |      "averagingAdjustment":500.25,
        |      "outstandingBusinessIncome":500.25,
        |      "balancingChargeBPRA":500.25,
        |      "balancingChargeOther":500.25,
        |      "goodsAndServicesOwnUse":500.25
        |   },
        |   "allowances":{
        |      "tradingAllowance":500.25
        |   },
        |   "nonFinancials":{
        |      "class4NicInfo":{
        |         "isExempt":true,
        |         "exemptionCode":"003"
        |      }
        |   }
        |}
      """.stripMargin

  val annualSummaryWithOnlyAllowances: String =
    s"""|{
        |   "adjustments":{
        |      "includedNonTaxableProfits":500.25,
        |      "basisAdjustment":500.25,
        |      "overlapReliefUsed":500.25,
        |      "accountingAdjustment":500.25,
        |      "averagingAdjustment":500.25,
        |      "outstandingBusinessIncome":500.25,
        |      "balancingChargeBPRA":500.25,
        |      "balancingChargeOther":500.25,
        |      "goodsAndServicesOwnUse":500.25
        |   },
        |   "allowances":{
        |      "annualInvestmentAllowance":500.25,
        |      "businessPremisesRenovationAllowance":500.25,
        |      "capitalAllowanceMainPool":500.25,
        |      "capitalAllowanceSpecialRatePool":500.25,
        |      "zeroEmissionGoodsVehicleAllowance":500.25,
        |      "enhancedCapitalAllowance":500.25,
        |      "allowanceOnSales":500.25,
        |      "capitalAllowanceSingleAssetPool":500.25
        |   },
        |   "nonFinancials":{
        |      "class4NicInfo":{
        |         "isExempt":true,
        |         "exemptionCode":"003"
        |      }
        |   }
        |}
      """.stripMargin

  val annualSummaryEmpty: String =
    """
      |{
      |}
    """.stripMargin

  val annualSummaryEmptyObjects: String =
    """
      |{
      |   "adjustments": {
      |   },
      |   "allowances": {
      |   },
      |   "nonFinancials": {
      |   }
      |}
    """.stripMargin

  val RULE_BOTH_ALLOWANCES_SUPPLIED: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |      {
      |         "code": "RULE_BOTH_ALLOWANCES_SUPPLIED",
      |         "message": "Both allowances and trading income allowance must not be present at the same time",
      |         "path": ""
      |      }
      |   ]
      |}
  """.stripMargin

}
