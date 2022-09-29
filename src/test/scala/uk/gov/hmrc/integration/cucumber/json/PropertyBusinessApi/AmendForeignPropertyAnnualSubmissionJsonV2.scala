/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendForeignPropertyAnnualSubmissionJsonV2 {

  val createAmendAnnualSubmissionDefault: String =
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
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 100.25
      |         }
      |      },
      |   "foreignNonFhlProperty": [
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
      |            "otherCapitalAllowance": 100.25,
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 110.99,
      |            "structuredBuildingAllowance": [
      |            {
      |               "amount": 100.25,
      |               "firstYear": {
      |                 "qualifyingDate": "2020-01-01",
      |                 "qualifyingAmountExpenditure": 100.25
      |               },
      |               "building": {
      |                 "name": "Green Oak's",
      |                 "number": "16AD",
      |                 "postcode": "GF49JH"
      |               }
      |             }]
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val createAmendAnnualSubmissionWithMultipleProperties: String =
    """
      |{
      |   "foreignNonFhlProperty": [
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
      |            "otherCapitalAllowance": 100.25,
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 110.99
      |         }
      |      },
      |      {
      |         "countryCode": "GBR",
      |         "adjustments": {
      |               "privateUseAdjustment": 100.25,
      |               "balancingCharge": 100.25
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "costOfReplacingDomesticItems": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 110.99
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val createAmendAnnualSubmissionMinimumFields: String =
    """
      |{
      |   "foreignNonFhlProperty": [
      |      {
      |         "countryCode": "FRA"
      |      }
      |   ]
      |}
    """.stripMargin

  val createAmendAnnualSubmissionEmptyBodyRequest: String =
    """
      |{
      |}
    """.stripMargin

  val createAmendAnnualSubmissionInvalidBodyRequest: String =
    """
      |{
      |   "foreignNonFhlProperty": [
      |      {
      |         "adjustments": {
      |               "privateUseAdjustment": 100.25,
      |               "balancingCharge": 100.25
      |         },
      |         "allowances": {
      |            "annualInvestmentAllowance": 100.25,
      |            "costOfReplacingDomesticItems": 100.25,
      |            "zeroEmissionsGoodsVehicleAllowance": 100.25,
      |            "otherCapitalAllowance": 100.25,
      |            "electricChargePointAllowance": 100.25,
      |            "zeroEmissionsCarAllowance": 140.99,
      |            "structuredBuildingAllowance": [
      |             {
      |               "firstYear": {
      |                 "qualifyingDate": "2020-01-01"
      |               },
      |               "building": {
      |                 "name": "Green Oak's",
      |                 "number": "16AD"
      |               }
      |             }]
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val createAmendAnnualSubmissionValueErrorsRequest: String =
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
      |            "otherCapitalAllowance": 100.251,
      |            "electricChargePointAllowance": 100.25
      |         }
      |      },
      |   "foreignNonFhlProperty": [
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
      |            "otherCapitalAllowance": 100.25,
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
      |            "otherCapitalAllowance": 100.25,
      |            "electricChargePointAllowance": 100.215
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val createAmendAnnualSubmissionValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |     {
      |        "code": "FORMAT_COUNTRY_CODE",
      |        "message": "The provided Country code is invalid",
      |        "paths": [
      |            "/foreignNonFhlProperty/0/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "RULE_COUNTRY_CODE",
      |        "message": "The country code is not a valid ISO 3166-1 alpha-3 country code",
      |        "paths": [
      |            "/foreignNonFhlProperty/1/countryCode"
      |        ]
      |     },
      |     {
      |        "code": "FORMAT_VALUE",
      |        "message": "The value must be between 0 and 99999999999.99",
      |        "paths": [
      |            "/foreignFhlEea/adjustments/privateUseAdjustment",
      |            "/foreignFhlEea/allowances/otherCapitalAllowance",
      |            "/foreignNonFhlProperty/0/adjustments/balancingCharge",
      |            "/foreignNonFhlProperty/1/adjustments/privateUseAdjustment",
      |            "/foreignNonFhlProperty/1/allowances/electricChargePointAllowance"
      |        ]
      |     }
      |   ]
      |}
    """.stripMargin

  val createAmendForeignPropAnnualSubmissionInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/foreignNonFhlProperty/0/countryCode",
      "/foreignNonFhlProperty/0/allowances/structuredBuildingAllowance/0/amount",
      "/foreignNonFhlProperty/0/allowances/structuredBuildingAllowance/0/firstYear/qualifyingAmountExpenditure",
      "/foreignNonFhlProperty/0/allowances/structuredBuildingAllowance/0/building/postcode"
    )
  )

}
