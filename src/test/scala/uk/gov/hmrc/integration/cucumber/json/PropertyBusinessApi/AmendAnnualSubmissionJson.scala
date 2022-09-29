/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

object AmendAnnualSubmissionJson {

  val amendAnnualSubmissionDefault: String =
    """
      |{
      |   "foreignFhlEea":
      |      {
      |         "adjustments": {
      |            "privateUseAdjustment": 100.25,
      |            "balancingCharge": 100.25,
      |            "periodOfGraceAdjustment": true
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "propertyAllowance": 100.25,
      |            "electricChargePointAllowance": 100.25
      |         }
      |      },
      |   "foreignProperty": [
      |      {
      |         "countryCode": "FRA",
      |         "adjustments": {
      |               "privateUseAdjustment": 100.25,
      |               "balancingCharge": 100.25
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "costOfReplacingDomesticItems": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "propertyAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "structureAndBuildingAllowance": 110.99,
      |            "electricChargePointAllowance": 100.25
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val amendAnnualSubmissionWithMultipleProperties: String =
    """
      |{
      |   "foreignProperty": [
      |      {
      |         "countryCode": "FRA",
      |         "adjustments": {
      |               "privateUseAdjustment": 100.25,
      |               "balancingCharge": 100.25
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "costOfReplacingDomesticItems": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "propertyAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "structureAndBuildingAllowance": 120.99,
      |            "electricChargePointAllowance": 100.25
      |         }
      |      },
      |      {
      |         "countryCode": "FRA",
      |         "adjustments": {
      |               "privateUseAdjustment": 200.25,
      |               "balancingCharge": 200.25
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 200.25,
      |            "costOfReplacingDomesticItems": 200.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 200.25,
      |            "propertyAllowance": 200.25,
      |            "otherCapitalAllowance": 200.25,
      |            "structureAndBuildingAllowance": 130.99,
      |            "electricChargePointAllowance": 200.25
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val amendAnnualSubmissionMinimumFields: String =
    """
      |{
      |   "foreignProperty": [
      |      {
      |         "countryCode": "FRA"
      |      }
      |   ]
      |}
    """.stripMargin

  val amendAnnualSubmissionMissingErrorsRequest: String =
    """
      |{
      |   "foreignProperty": [
      |      {
      |         "adjustments": {
      |               "privateUseAdjustment": 100.25,
      |               "balancingCharge": 100.25
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "costOfReplacingDomesticItems": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "propertyAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "structureAndBuildingAllowance": 140.99,
      |            "electricChargePointAllowance": 100.25
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val amendAnnualSubmissionValueErrorsRequest: String =
    """
      |{
      |   "foreignFhlEea":
      |      {
      |         "adjustments": {
      |            "privateUseAdjustment": 100.254,
      |            "balancingCharge": 100.25,
      |            "periodOfGraceAdjustment": true
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "propertyAllowance": 100.253,
      |            "electricChargePointAllowance": 100.25
      |         }
      |      },
      |   "foreignProperty": [
      |      {
      |         "countryCode": "FRANCE",
      |         "adjustments": {
      |               "privateUseAdjustment": 100.25,
      |               "balancingCharge": 100.253
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "costOfReplacingDomesticItems": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "propertyAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "structureAndBuildingAllowance": 150.99,
      |            "electricChargePointAllowance": 100.25
      |         }
      |      },
      |      {
      |         "countryCode": "SBT",
      |         "adjustments": {
      |               "privateUseAdjustment": 100.125,
      |               "balancingCharge": 100.23
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "costOfReplacingDomesticItems": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "propertyAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "structureAndBuildingAllowance": -160.99,
      |            "electricChargePointAllowance": 100.215
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val amendAnnualSubmissionValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |     {
      |        "code": "FORMAT_COUNTRY_CODE",
      |        "message": "The provided Country code is invalid",
      |        "paths": [
      |            "/foreignProperty/0/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "RULE_COUNTRY_CODE",
      |        "message": "The country code is not a valid ISO 3166-1 alpha-3 country code",
      |        "paths": [
      |            "/foreignProperty/1/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "FORMAT_VALUE",
      |        "message": "One or more monetary fields are invalid",
      |        "paths": [
      |            "/foreignFhlEea/adjustments/privateUseAdjustment",
      |            "/foreignFhlEea/allowances/propertyAllowance",
      |            "/foreignProperty/0/adjustments/balancingCharge",
      |            "/foreignProperty/1/adjustments/privateUseAdjustment",
      |            "/foreignProperty/1/allowances/structureAndBuildingAllowance",
      |            "/foreignProperty/1/allowances/electricChargePointAllowance"
      |        ]
      |     }
      |   ]
      |}
    """.stripMargin

}
