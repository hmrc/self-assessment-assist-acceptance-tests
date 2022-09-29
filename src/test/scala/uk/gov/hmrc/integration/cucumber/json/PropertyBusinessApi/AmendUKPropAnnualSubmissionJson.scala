/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendUKPropAnnualSubmissionJson {

  val createAmendUKPropAnnualSubmissionDefault: String =
    """
      |{
      |   "ukFhlProperty":
      |      {
      |         "adjustments": {
      |            "privateUseAdjustment": 100.25,
      |            "balancingCharge": 100.25,
      |            "periodOfGraceAdjustment": true,
      |            "businessPremisesRenovationAllowanceBalancingCharges": 100.25,
      |            "nonResidentLandlord": false,
      |            "rentARoom": {
      |               "jointlyLet": true
      |            }
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25
      |         }
      |      },
      |   "ukNonFhlProperty":
      |      {
      |         "adjustments": {
      |            "balancingCharge": 100.25,
      |            "privateUseAdjustment": 100.25,
      |            "businessPremisesRenovationAllowanceBalancingCharges": 100.25,
      |            "nonResidentLandlord": false,
      |            "rentARoom": {
      |               "jointlyLet": true
      |            }
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "businessPremisesRenovationAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "costOfReplacingDomesticGoods": 100.25,
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 100.25,
      |            "structuredBuildingAllowance": [
      |              {
      |               "amount": 100.25,
      |               "firstYear": {
      |                   "qualifyingDate": "2021-06-02",
      |                   "qualifyingAmountExpenditure": 100.25
      |               },
      |               "building": {
      |                   "name": "Green Oak's",
      |                   "number": "16AD",
      |                   "postcode": "GF49JH"
      |               }
      |              }
      |            ],
      |            "enhancedStructuredBuildingAllowance": [
      |              {
      |               "amount": 100.25,
      |               "firstYear": {
      |                   "qualifyingDate": "2021-06-02",
      |                   "qualifyingAmountExpenditure": 100.25
      |               },
      |               "building": {
      |                   "name": "Red Oak's",
      |                   "number": "17AD",
      |                   "postcode": "GF49JH"
      |               }
      |              }
      |            ]
      |         }
      |      }
      |}
    """.stripMargin

  val createAmendUKPropAnnualSubmissionMinimumFields: String =
    """
      |{
      |   "ukNonFhlProperty": {
      |     "adjustments": {
      |           "nonResidentLandlord": false
      |     }
      |   }
      |}
    """.stripMargin

  val createAmendUKPropAnnualSubmissionEmptyBodyRequest: String =
    """
      |{
      |}
    """.stripMargin

  val createAmendUKPropAnnualSubmissionRulePropIncomeAllowanceRequest: String =
    """
      |{
      |   "ukFhlProperty":
      |      {
      |         "adjustments": {
      |            "privateUseAdjustment": 100.25,
      |            "balancingCharge": 100.25,
      |            "periodOfGraceAdjustment": true,
      |            "businessPremisesRenovationAllowanceBalancingCharges": 100.25,
      |            "nonResidentLandlord": false,
      |            "rentARoom": {
      |               "jointlyLet": true
      |            }
      |         },
      |         "allowances": {
      |            "propertyIncomeAllowance": 100.25
      |         }
      |      },
      |   "ukNonFhlProperty":
      |      {
      |         "adjustments": {
      |            "balancingCharge": 100.25,
      |            "privateUseAdjustment": 100.25,
      |            "businessPremisesRenovationAllowanceBalancingCharges": 100.25,
      |            "nonResidentLandlord": false,
      |            "rentARoom": {
      |               "jointlyLet": true
      |            }
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "businessPremisesRenovationAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "costOfReplacingDomesticGoods": 100.25,
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 100.25,
      |            "structuredBuildingAllowance": [
      |              {
      |               "amount": 100.25,
      |               "firstYear": {
      |                   "qualifyingDate": "2021-06-02",
      |                   "qualifyingAmountExpenditure": 100.25
      |               },
      |               "building": {
      |                   "name": "Green Oak's",
      |                   "number": "16AD",
      |                   "postcode": "GF49JH"
      |               }
      |              }
      |            ],
      |            "enhancedStructuredBuildingAllowance": [
      |              {
      |               "amount": 100.25,
      |               "firstYear": {
      |                   "qualifyingDate": "2021-06-02",
      |                   "qualifyingAmountExpenditure": 100.25
      |               },
      |               "building": {
      |                   "name": "Red Oak's",
      |                   "number": "17AD",
      |                   "postcode": "GF49JH"
      |               }
      |              }
      |            ]
      |         }
      |      }
      |}
      |""".stripMargin

  val createAmendUKPropAnnualSubmissionInvalidBodyRequest: String =
    """
      |{
      |   "ukFhlProperty":
      |      {
      |         "adjustments": {
      |            "privateUseAdjustment": 100.25,
      |            "balancingCharge": 100.25,
      |            "businessPremisesRenovationAllowanceBalancingCharges": 100.25,
      |            "nonResidentLandlord": false,
      |            "rentARoom": {
      |               "jointlyLet": true
      |            }
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25
      |         }
      |      },
      |   "ukNonFhlProperty":
      |      {
      |         "adjustments": {
      |            "balancingCharge": 100.25,
      |            "privateUseAdjustment": 100.25,
      |            "businessPremisesRenovationAllowanceBalancingCharges": 100.25,
      |            "rentARoom": {
      |               "jointlyLet": 100.25
      |            }
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "businessPremisesRenovationAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "costOfReplacingDomesticGoods": 100.25,
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 100.25,
      |            "structuredBuildingAllowance": [
      |              {
      |               "amount": 100.25,
      |               "firstYear": {
      |                   "qualifyingDate": "2021-06-02",
      |                   "qualifyingAmountExpenditure": 100.25
      |               },
      |               "building": {
      |                   "name": "Green Oak's",
      |                   "number": "16AD",
      |                   "postcode": "GF49JH"
      |               }
      |              }
      |            ],
      |            "enhancedStructuredBuildingAllowance": [
      |              {
      |               "amount": 100.25,
      |               "firstYear": {
      |                   "qualifyingDate": "2021-06-02",
      |                   "qualifyingAmountExpenditure": 100.25
      |               },
      |               "building": {
      |                   "name": "Red Oak's",
      |                   "number": "17AD",
      |                   "postcode": "GF49JH"
      |               }
      |              }
      |            ]
      |         }
      |      }
      |}
    """.stripMargin

  val createAmendUKPropAnnualSubmissionValueErrorsRequest: String =
    """
      |{
      |   "ukFhlProperty":
      |      {
      |         "adjustments": {
      |            "privateUseAdjustment": 100.25,
      |            "balancingCharge": 100.25,
      |            "periodOfGraceAdjustment": true,
      |            "businessPremisesRenovationAllowanceBalancingCharges": 100.25,
      |            "nonResidentLandlord": false,
      |            "rentARoom": {
      |               "jointlyLet": true
      |            }
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.251
      |         }
      |      },
      |   "ukNonFhlProperty":
      |      {
      |         "adjustments": {
      |            "balancingCharge": 100.251,
      |            "privateUseAdjustment": 100.25,
      |            "businessPremisesRenovationAllowanceBalancingCharges": 100.25,
      |            "nonResidentLandlord": false,
      |            "rentARoom": {
      |               "jointlyLet": true
      |            }
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.251,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "businessPremisesRenovationAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "costOfReplacingDomesticGoods": 100.25,
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 100.25,
      |            "structuredBuildingAllowance": [
      |              {
      |               "amount": 100.25,
      |               "firstYear": {
      |                   "qualifyingDate": "2021-06-02",
      |                   "qualifyingAmountExpenditure": 100.251
      |               },
      |               "building": {
      |                   "name": "Green Oak's",
      |                   "number": "16AD",
      |                   "postcode": "GF49JH"
      |               }
      |              }
      |            ],
      |            "enhancedStructuredBuildingAllowance": [
      |              {
      |               "amount": 100.25,
      |               "firstYear": {
      |                   "qualifyingDate": "2021-06-02",
      |                   "qualifyingAmountExpenditure": 100.251
      |               },
      |               "building": {
      |                   "name": "Red Oak's",
      |                   "number": "17AD",
      |                   "postcode": "GF49JH"
      |               }
      |              }
      |            ]
      |         }
      |      }
      |}
    """.stripMargin

  val createAmendUKPropAnnualSubmissionValueErrorsResponse: String =
    """
      |{
      |        "code": "FORMAT_VALUE",
      |        "message": "The value must be between 0 and 99999999999.99",
      |        "paths": [
      |            "/ukFhlProperty/allowances/annualInvestmentAllowance",
      |            "/ukNonFhlProperty/adjustments/balancingCharge",
      |            "/ukNonFhlProperty/allowances/annualInvestmentAllowance",
      |            "/ukNonFhlProperty/allowances/structuredBuildingAllowance/0/firstYear/qualifyingAmountExpenditure",
      |            "/ukNonFhlProperty/allowances/enhancedStructuredBuildingAllowance/0/firstYear/qualifyingAmountExpenditure"
      |        ]
      |}
    """.stripMargin

  val createAmendUKPropAnnualSubmissionInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/ukFhlProperty/adjustments/periodOfGraceAdjustment",
      "/ukNonFhlProperty/adjustments/nonResidentLandlord",
      "/ukNonFhlProperty/adjustments/rentARoom/jointlyLet"
    )
  )

  val PROPERTY_BUSINESS_V2_RULE_TYPE_OF_BUSINESS_INCORRECT: String =
    """
      |{
      | "code" : "RULE_TYPE_OF_BUSINESS_INCORRECT",
      | "message" : "The businessId is for a different type of business"
      |}
      |""".stripMargin

  val RULE_PROPERTY_INCOME_ALLOWANCE: String =
    """
      |{
      |  "code" : "RULE_PROPERTY_INCOME_ALLOWANCE",
      |  "message" : "The propertyIncomeAllowance cannot be submitted if privateUseAdjustment is supplied",
      |  "paths" : [ "/ukFhlProperty" ]
      |}
      |""".stripMargin

}
