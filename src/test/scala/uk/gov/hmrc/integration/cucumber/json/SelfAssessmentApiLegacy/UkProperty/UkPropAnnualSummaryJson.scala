/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfAssessmentApiLegacy.UkProperty

object UkPropAnnualSummaryJson {

  val nonFhlAnnualSummary: String =
    """
      |{
      |  "allowances": {
      |    "annualInvestmentAllowance": 100.25,
      |    "otherCapitalAllowance": 100.25,
      |    "costOfReplacingDomesticItems": 100.25,
      |    "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |    "businessPremisesRenovationAllowance": 100.25,
      |    "propertyAllowance": 100.25
      |  },
      |  "adjustments": {
      |    "privateUseAdjustment": 100.25,
      |    "balancingCharge": 100.25,
      |    "bpraBalancingCharge": 100.25
      |  },
      |  "other": {
      |    "nonResidentLandlord": false,
      |    "rarJointLet": true
      |  }
      |}
    """.stripMargin

  val fhlAnnualSummary: String =
    """
      |{
      |	"allowances": {
      |		"annualInvestmentAllowance": 1000.89,
      |		"otherCapitalAllowance": 150.45,
      |    "businessPremisesRenovationAllowance": 120.12,
      |		"propertyAllowance": 122.12
      |	},
      |	"adjustments": {
      |		"privateUseAdjustment": 200,
      |		"balancingCharge": 50.9,
      |		"bpraBalancingCharge": 100.12,
      |		"periodOfGraceAdjustment": true
      |	},
      |	"other": {
      |		"nonResidentLandlord": false,
      |		"rarJointLet": true
      |	}
      |}
    """.stripMargin

  val annualSummaryEmpty: String =
    """
      |{
      |}
    """.stripMargin

}
