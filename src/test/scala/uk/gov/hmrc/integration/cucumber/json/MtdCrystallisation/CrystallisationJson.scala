/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.MtdCrystallisation

object CrystallisationJson {

  val crystallisationBody: String =
    """
      |{
      |  "calculationId": "041f7e4d-87b9-4d4a-a296-3cfbdf92f7e2"
      |}
    """.stripMargin

  val RULE_INCOME_SOURCES_CHANGED: String =
    """
      |{
      | "code": "RULE_INCOME_SOURCES_CHANGED",
      | "message": "Income sources data has changed. Perform intent to crystallise"
      |}
    """.stripMargin

  val RULE_RECENT_SUBMISSIONS_EXIST: String =
    """
      |{
      | "code": "RULE_RECENT_SUBMISSIONS_EXIST",
      | "message": "More recent submissions exist. Perform intent to crystallise"
      |}
    """.stripMargin

  val RULE_RESIDENCY_CHANGED: String =
    """
      |{
      | "code": "RULE_RESIDENCY_CHANGED",
      | "message": "Residency has changed. Perform intent to crystallise"
      |}
    """.stripMargin

  val RULE_INCOME_SOURCES_INVALID: String =
    """
      |{
      | "code": "RULE_INCOME_SOURCES_INVALID",
      | "message": "No valid income sources could be found"
      |}
    """.stripMargin

  val FINAL_DECLARATION_RECEIVED: String =
    """
      |{
      | "code": "RULE_FINAL_DECLARATION_RECEIVED",
      | "message": "Crystallisation declaration has already been received"
      |}
    """.stripMargin

  val NO_SUBMISSIONS_EXIST: String =
    """
      |{
      | "code": "RULE_NO_SUBMISSIONS_EXIST",
      | "message": "No income submissions exist"
      |}
    """.stripMargin

  val RETRIEVE_CRYSTALLISATION_DEFAULT: String =
    """
      |{
      |  "obligations": [
      |    {
      |      "start": "2018-04-06",
      |      "end": "2019-04-05",
      |      "due": "2020-01-31",
      |      "status": "Open"
      |    }
      |  ]
      |}
    """.stripMargin

  val RETRIEVE_CRYSTALLISATION_OBLIGATION_OPEN: String =
    """
      |{
      |  "obligations": [
      |    {
      |      "start": "2018-04-06",
      |      "end": "2019-04-05",
      |      "due": "2020-01-31",
      |      "status": "Open"
      |    }
      |  ]
      |}
    """.stripMargin

  val RETRIEVE_CRYSTALLISATION_OBLIGATION_FULFILLED: String =
    """
      |{
      |  "obligations": [
      |    {
      |      "start": "2018-04-06",
      |      "end": "2019-04-05",
      |      "due": "2020-01-31",
      |      "status": "Fulfilled",
      |      "processed": "2020-01-25"
      |    }
      |  ]
      |}
    """.stripMargin

}
