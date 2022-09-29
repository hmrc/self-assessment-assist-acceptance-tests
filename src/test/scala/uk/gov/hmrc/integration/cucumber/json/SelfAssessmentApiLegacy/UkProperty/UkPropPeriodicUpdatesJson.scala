/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.SelfAssessmentApiLegacy.UkProperty

object UkPropPeriodicUpdatesJson {

  val fhlPeriod: String =
    """
      |  {
      |    "from": "2017-04-06",
      |    "to": "2017-07-05",
      |    "incomes": {
      |      "rentIncome": {
      |      "amount": 100.25,
      |      "taxDeducted": 100.25
      |    },
      |      "rarRentReceived" : { "amount" : 100.44 }
      |    },
      |    "expenses": {
      |      "premisesRunningCosts": { "amount": 100.25 },
      |      "repairsAndMaintenance": { "amount": 100.25 },
      |      "financialCosts": { "amount": 100.25 },
      |      "professionalFees": { "amount": 100.25 },
      |      "costOfServices": { "amount": 100.25 },
      |      "travelCosts": { "amount": 100.25 },
      |      "other": { "amount": 100.25 },
      |      "rarReliefClaimed" : { "amount" : 100.44 }
      |    }
      |  }
    """.stripMargin

  val amendFhlPeriod: String =
    """
       |  {
       |    "incomes": {
       |      "rentIncome": {
       |      "amount": 100.25,
       |      "taxDeducted": 100.25
       |    },
       |      "rarRentReceived" : { "amount" : 100.44 }
       |    },
       |    "expenses": {
       |      "premisesRunningCosts": { "amount": 100.25 },
       |      "repairsAndMaintenance": { "amount": 100.25 },
       |      "financialCosts": { "amount": 100.25 },
       |      "professionalFees": { "amount": 100.25 },
       |      "costOfServices": { "amount": 100.25 },
       |      "travelCosts": { "amount": 100.25 },
       |      "other": { "amount": 100.25 },
       |      "rarReliefClaimed": { "amount": 100.25 }
       |    }
       |  }
     """.stripMargin

  val nonFhlPeriod: String =
    """
      |{
      |  "from": "2017-04-06",
      |  "to": "2017-07-05",
      |  "incomes": {
      |    "rentIncome": {
      |      "amount": 100.25,
      |      "taxDeducted": 100.25
      |    },
      |    "premiumsOfLeaseGrant": { "amount": 100.25 },
      |    "reversePremiums": { "amount": 100.25 },
      |    "otherPropertyIncome": {"amount": 100.25},
      |    "rarRentReceived": {"amount": 100.25}
      |  },
      |  "expenses": {
      |    "premisesRunningCosts": { "amount": 100.25 },
      |    "repairsAndMaintenance": { "amount": 100.25 },
      |    "financialCosts": { "amount": 200.25 },
      |    "professionalFees": { "amount": 100.25 },
      |    "travelCosts": { "amount": 100.25 },
      |    "costOfServices": { "amount": 100.25 },
      |    "residentialFinancialCost": { "amount": 200.25 },
      |    "broughtFwdResidentialFinancialCost": { "amount": 100.25 },
      |    "other": { "amount": 100.25 },
      |    "rarReliefClaimed": { "amount": 100.25 }
      |  }
      |}
    """.stripMargin

  val amendNonFhlPeriod: String =
    """
      |{
      |  "incomes": {
      |    "rentIncome": {
      |      "amount": 100.25,
      |      "taxDeducted": 100.25
      |    },
      |    "premiumsOfLeaseGrant": { "amount": 100.25 },
      |    "reversePremiums": { "amount": 100.25 },
      |    "otherPropertyIncome": {"amount": 100.25},
      |    "rarRentReceived": {"amount": 100.25}
      |  },
      |  "expenses": {
      |    "premisesRunningCosts": { "amount": 100.25 },
      |    "repairsAndMaintenance": { "amount": 100.25 },
      |    "financialCosts": { "amount": 100.25 },
      |    "professionalFees": { "amount": 100.25 },
      |    "travelCosts": { "amount": 100.25 },
      |    "costOfServices": { "amount": 100.25 },
      |    "residentialFinancialCost": { "amount": 200.25 },
      |    "broughtFwdResidentialFinancialCost": { "amount": 100.25 },
      |    "other": { "amount": 100.25 },
      |    "rarReliefClaimed": { "amount": 100.25 }
      |  }
      |}
    """.stripMargin

  val listPeriods: String =
    """
      | [
      |   {
      |     "id" : "2017-04-06_2017-07-05",
      |      "from" : "2017-04-06",
      |      "to" : "2017-07-05"
      |   }
      | ]
    """.stripMargin

}
