/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.HistoricPropertyBusinessApi

object CreateAmendHistoricFhlUKPropAnnualSubmissionJson {

  val historicFhlUKPropertyBusinessAmendRequest: String =
    """
      |{
      |   "annualAdjustments": {
      |      "lossBroughtForward": 200.00,
      |      "balancingCharge": 200.00,
      |      "privateUseAdjustment": 200.00,
      |      "periodOfGraceAdjustment": true,
      |      "businessPremisesRenovationAllowanceBalancingCharges": 200.02,
      |      "nonResidentLandlord": true,
      |      "rentARoom": {
      |         "jointlyLet": true
      |      }
      |   },
      |   "annualAllowances": {
      |      "annualInvestmentAllowance": 200.00,
      |      "otherCapitalAllowance": 200.00,
      |      "businessPremisesRenovationAllowance": 100.02,
      |      "propertyIncomeAllowance": 10.02
      |   }
      |}
    """.stripMargin

}
