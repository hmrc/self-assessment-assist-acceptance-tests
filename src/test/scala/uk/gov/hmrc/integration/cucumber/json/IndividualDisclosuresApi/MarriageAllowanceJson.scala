/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualDisclosuresApi

object MarriageAllowanceJson {

  val marriageAllowanceRequest: String =
    """
      |{
      |    "spouseOrCivilPartnerNino": "TC663795B",
      |    "spouseOrCivilPartnerFirstName": "John",
      |    "spouseOrCivilPartnerSurname": "Smith",
      |    "spouseOrCivilPartnerDateOfBirth": "1987-10-18"
      |}
    """.stripMargin

  val marriageAllowanceMinimumFields: String =
    """
      |{
      |    "spouseOrCivilPartnerNino": "TC663795B",
      |    "spouseOrCivilPartnerSurname": "Smith"
      |}
    """.stripMargin

  val marriageAllowanceEmptyBodyRequest: String =
    """
      |{
      |}
    """.stripMargin

  val RULE_ACTIVE_MARRIAGE_ALLOWANCE_CLAIM: String =
    """
      |{
      | "code": "RULE_ACTIVE_MARRIAGE_ALLOWANCE_CLAIM",
      | "message": "Marriage Allowance has already been transferred to a spouse or civil partner"
      |}
    """.stripMargin

  val RULE_DECEASED_RECIPIENT: String =
    """
      |{
      | "code": "RULE_DECEASED_RECIPIENT",
      | "message": "The provided spouse or civil partner is deceased"
      |}
    """.stripMargin

  val RULE_INVALID_REQUEST: String =
    """
      |{
      | "code": "RULE_INVALID_REQUEST",
      | "message": "The NINO supplied is invalid"
      |}
    """.stripMargin

}
