/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.PropertyBusinessApi

object AmendHistoricFhlUKPropertyPeriodSummaryJsonV2 {

  val amendHistoricFhlUKPropertyPeriodSummaryDefaultRequest: String =
    """
      |{
      |  "income": {
      |    "periodAmount":  100.25,
      |    "taxDeducted":  100.15,
      |    "rentARoom": {
      |      "rentsReceived": 97.50
      |     }
      | },
      | "expenses": {
      |    "premisesRunningCosts": 123.12,
      |    "repairsAndMaintenance": 17.90,
      |    "financialCosts": 38.19,
      |    "professionalFees": 13.42,
      |    "costOfServices": 29.42,
      |    "other": 751.00,
      |    "travelCosts": 12.00,
      |    "rentARoom": {
      |     "amountClaimed": 12.12
      |    }
      |   }
      | }
      |""".stripMargin

  val amendHistoricFhlUKPropertyPeriodSummaryConsolidatedRequest: String =
    """
      |{
      |  "income":{
      |     "periodAmount":1123.45,
      |     "taxDeducted":2134.53,
      |     "rentARoom":{
      |        "rentsReceived":5167.56
      |      }
      |  },
      |  "expenses":{
      |     "consolidatedExpenses":135.78
      |   }
      |}
      |""".stripMargin
}
