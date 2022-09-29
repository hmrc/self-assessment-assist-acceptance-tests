/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SaBsasApi.V3

object V3TriggerBsasJson {

  val SELF_EMPLOYMENT: String =
    """
      |{
      |    "accountingPeriod": {
      |      "startDate": "2019-05-01",
      |      "endDate": "2020-04-30"
      |    },
      |    "typeOfBusiness": "self-employment",
      |    "businessId": "X9IS98470026982"
      |}
    """.stripMargin

  val UK_FHL_PROPERTY: String =
    """
      |{
      |    "accountingPeriod": {
      |      "startDate": "2019-05-01",
      |      "endDate": "2020-04-30"
      |    },
      |    "typeOfBusiness": "uk-property-fhl",
      |    "businessId": "X9IS98470026982"
      |}
    """.stripMargin

  val UK_NON_FHL_PROPERTY: String =
    """
      |{
      |    "accountingPeriod": {
      |      "startDate": "2019-05-01",
      |      "endDate": "2020-04-30"
      |    },
      |    "typeOfBusiness": "uk-property-non-fhl",
      |    "businessId": "X9IS98470026982"
      |}
    """.stripMargin

  val FOREIGN_PROPERTY: String =
    """
      |{
      |    "accountingPeriod": {
      |      "startDate": "2021-05-01",
      |      "endDate": "2022-04-30"
      |    },
      |    "typeOfBusiness": "foreign-property",
      |    "businessId": "X9IS98470026982"
      |}
      |""".stripMargin

  val FOREIGN_PROPERTY_FHL_EEA: String =
    """
      |{
      |    "accountingPeriod": {
      |      "startDate": "2021-05-01",
      |      "endDate": "2022-04-30"
      |    },
      |    "typeOfBusiness": "foreign-property-fhl-eea",
      |    "businessId": "X9IS98470026982"
      |}
      |""".stripMargin

  val RULE_PERIODIC_DATA_INCOMPLETE: String =
    """
      |{
      | "code" : "RULE_PERIODIC_DATA_INCOMPLETE",
      | "message" : "One or more periodic updates missing for this accounting period"
      |}
    """.stripMargin

  val BSAS_TRIGGER_RULE_NO_ACCOUNTING_PERIOD: String =
    """
      |{
      | "code": "RULE_NO_ACCOUNTING_PERIOD",
      | "message": "The supplied accounting period does not exist"
      |}
    """.stripMargin

  val RULE_ACCOUNTING_PERIOD_NOT_ENDED: String =
    """
      |{
      | "code": "RULE_ACCOUNTING_PERIOD_NOT_ENDED",
      | "message": "The supplied accounting period has not ended"
      |}
    """.stripMargin

}
