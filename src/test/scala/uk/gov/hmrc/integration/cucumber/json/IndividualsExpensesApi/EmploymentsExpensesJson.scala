/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsExpensesApi

object EmploymentsExpensesJson {

  val AMEND_EMPLOYMENT_EXPENSES: String =
    """
      |{
      |    "expenses": {
      |        "businessTravelCosts": 123.12,
      |        "jobExpenses": 123.12,
      |        "flatRateJobExpenses": 123.12,
      |        "professionalSubscriptions": 123.12,
      |        "hotelAndMealExpenses": 123.12,
      |        "otherAndCapitalAllowances": 123.12,
      |        "vehicleExpenses": 123.12,
      |        "mileageAllowanceRelief": 123.12
      |    }
      |}
    """.stripMargin

  val AMEND_EMPLOYMENT_EXPENSES_MINIMUM_FIELDS: String =
    """
      |{
      |    "expenses": {
      |        "businessTravelCosts": 123.12
      |    }
      |}
    """.stripMargin

  val AMEND_EMPLOYMENT_EXPENSES_MISSING_ERRORS: String =
    """
      |{
      |    "expenses": {}
      |}
    """.stripMargin

  val AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_REQUEST: String =
    """
      |{
      |    "expenses": {
      |        "businessTravelCosts": 123.121,
      |        "jobExpenses": 123.12,
      |        "flatRateJobExpenses": 123.12,
      |        "professionalSubscriptions": 123.12,
      |        "hotelAndMealExpenses": 123.12,
      |        "otherAndCapitalAllowances": 123.121,
      |        "vehicleExpenses": 123.12,
      |        "mileageAllowanceRelief": 123.12
      |    }
      |}
    """.stripMargin

  val AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_RESPONSE: String =
    """
      |{
      |  "code": "FORMAT_VALUE",
      |  "message": "The field should be between 0 and 99999999999.99",
      |  "paths": [
      |    "/expenses/businessTravelCosts",
      |    "/expenses/otherAndCapitalAllowances"
      |  ]
      |}
    """.stripMargin

}
