/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualLossesApi

object IndividualLossesJsonV3 {

  // -- CREATE --------------------------

  val UK_FHL_PROPERTY_V3: String =
    """
      |{
      |   "businessId": "XPIS12345678901",
      |   "typeOfLoss": "uk-property-fhl",
      |   "lossAmount": 99999999999.99,
      |   "taxYearBroughtForwardFrom": "2019-20"
      |}
    """.stripMargin

  val UK_NON_FHL_PROPERTY_V3: String =
    """
      |{
      |   "businessId": "XPIS12345678901",
      |   "typeOfLoss": "uk-property-non-fhl",
      |   "lossAmount": 99999999999.99,
      |   "taxYearBroughtForwardFrom": "2019-20"
      |}
    """.stripMargin

  val FOREIGN_PROPERTY_V3: String =
    """
      |{
      |   "businessId": "XFIS00000000988",
      |   "typeOfLoss": "foreign-property",
      |   "lossAmount": 99999999999.99,
      |   "taxYearBroughtForwardFrom": "2019-20"
      |}
    """.stripMargin

  val FOREIGN_PROPERTY_FHL_EEA_V3: String =
    """
      |{
      |   "businessId": "XFIS12345678901",
      |   "typeOfLoss": "foreign-property-fhl-eea",
      |   "lossAmount": 99999999999.99,
      |   "taxYearBroughtForwardFrom": "2019-20"
      |}
    """.stripMargin

  val SELF_EMPLOYMENT_V3: String =
    """
      |{
      |   "businessId": "XBIS12345678901",
      |   "typeOfLoss": "self-employment",
      |   "lossAmount": 99999999999.99,
      |   "taxYearBroughtForwardFrom": "2019-20"
      |}
    """.stripMargin

  val SELF_EMPLOYMENT_CLASS4_V3: String =
    """
      |{
      |   "businessId": "XBIS12345678901",
      |   "typeOfLoss": "self-employment-class4",
      |   "lossAmount": 99999999999.99,
      |   "taxYearBroughtForwardFrom": "2019-20"
      |}
    """.stripMargin

  // -- AMEND --------------------------

  val AMEND_LOSS_AMOUNT: String =
    """
      |{
      | "lossAmount": 100.56
      |}
    """.stripMargin

  val AMEND_BF_LOSS_RULE_NO_CHANGE: String =
    """
      |{
      | "code" : "RULE_NO_CHANGE",
      | "message" : "The brought forward loss amount has not changed"
      |}
    """.stripMargin

  // -- ERRORS --------------------------

  val RULE_DUPLICATE_SUBMISSION_V3: String =
    """
      |{
      | "code" : "RULE_DUPLICATE_SUBMISSION",
      | "message" : "Submission already exists"
      |}
    """.stripMargin

  val RULE_DELETE_AFTER_FINAL_DECLARATION: String =
    """
      |{
      | "code" : "RULE_DELETE_AFTER_FINAL_DECLARATION",
      | "message" : "This loss cannot be deleted after final declaration"
      |}
    """.stripMargin

  val AMEND_LOSS_CLAIM_SELF_EMPLOYMENT: String =
    """
      |{
      |    "typeOfClaim": "carry-forward"
      |}
    """.stripMargin

  val AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL: String =
    """
      |{
      |    "typeOfClaim": "carry-forward-to-carry-sideways"
      |}
    """.stripMargin

  val AMEND_LOSS_CLAIM_RULE_TYPE_OF_CLAIM_INVALID_V3: String =
    """
      |{
      | "code" : "RULE_TYPE_OF_CLAIM_INVALID",
      | "message" : "The claim type selected is not available for this type of loss"
      |}
    """.stripMargin

  val RULE_NO_CHANGE: String =
    """
      |{
      | "code" : "RULE_NO_CHANGE",
      | "message" : "This claim matches a previous submission"
      |}
    """.stripMargin

  val LOSS_CLAIM_SELF_EMPLOYMENT_V3: String =
    """
      |{
      |    "typeOfLoss": "self-employment",
      |    "businessId": "XBIS12356589871",
      |    "typeOfClaim": "carry-sideways",
      |    "taxYearClaimedFor": "2019-20"
      |}
    """.stripMargin

  val LOSS_CLAIM_UK_PROPERTY_V3: String =
    """
      |{
      |    "typeOfLoss": "uk-property-non-fhl",
      |    "businessId": "XPIS12356589871",
      |    "typeOfClaim": "carry-forward-to-carry-sideways",
      |    "taxYearClaimedFor": "2019-20"
      |}
    """.stripMargin

  val LOSS_CLAIM_FOREIGN_PROPERTY_V3: String =
    """
      |{
      |    "typeOfLoss": "foreign-property",
      |    "businessId": "XFIS12356589871",
      |    "typeOfClaim": "carry-sideways",
      |    "taxYearClaimedFor": "2019-20"
      |}
    """.stripMargin

  val RULE_DUPLICATE_SUBMISSION_LOSS_CLAIMS: String =
    """
      |{
      | "code" : "RULE_DUPLICATE_SUBMISSION",
      | "message" : "This claim matches a previous submission"
      |}
    """.stripMargin

  val RULE_ACCOUNTING_PERIOD_NOT_ENDED: String =
    """
      |{
      | "code" : "RULE_ACCOUNTING_PERIOD_NOT_ENDED",
      | "message" : "The accounting period has not yet ended"
      |}
    """.stripMargin

  val NO_ACCOUNTING_PERIOD: String =
    """
      |{
      | "code" : "RULE_NO_ACCOUNTING_PERIOD",
      | "message" : "For the year of the claim there is no accounting period"
      |}
    """.stripMargin

  val AMEND_LOSS_CLAIM_ORDER_V3: String =
    """
      |{
      |   "typeOfClaim": "carry-sideways",
      |   "listOfLossClaims": [
      |      {
      |      "claimId": "123456789ABCDE0",
      |      "sequence":2
      |      },
      |      {
      |      "claimId": "123456789ABCDE1",
      |      "sequence":3
      |      },
      |      {
      |      "claimId": "123456789ABCDE2",
      |      "sequence":1
      |      }
      |   ]
      |}
    """.stripMargin

  val RULE_LOSS_CLAIMS_MISSING: String =
    """
      |{
      | "code" : "RULE_LOSS_CLAIMS_MISSING",
      | "message" : "One or more loss claims missing from this request"
      |}
    """.stripMargin

}
