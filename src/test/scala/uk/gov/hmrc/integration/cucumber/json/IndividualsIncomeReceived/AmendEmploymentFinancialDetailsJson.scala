/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendEmploymentFinancialDetailsJson {

  val iirFinancialDetailsAmendRequest: String =
    """
      |{
      |    "employment": {
      |        "pay": {
      |            "taxablePayToDate": 1024.99,
      |            "totalTaxToDate": 1024.99
      |        },
      |        "deductions": {
      |            "studentLoans": {
      |                "uglDeductionAmount": 1024.99,
      |                "pglDeductionAmount": 1024.99
      |            }
      |        },
      |        "benefitsInKind": {
      |            "accommodation": 1024.99,
      |            "assets": 1024.99,
      |            "assetTransfer": 1024.99,
      |            "beneficialLoan": 1024.99,
      |            "car": 1024.99,
      |            "carFuel": 1024.99,
      |            "educationalServices": 1024.99,
      |            "entertaining": 1024.99,
      |            "expenses": 1024.99,
      |            "medicalInsurance": 1024.99,
      |            "telephone": 1024.99,
      |            "service": 1024.99,
      |            "taxableExpenses": 1024.99,
      |            "van": 1024.99,
      |            "vanFuel": 1024.99,
      |            "mileage": 1024.99,
      |            "nonQualifyingRelocationExpenses": 1024.99,
      |            "nurseryPlaces": 1024.99,
      |            "otherItems": 1024.99,
      |            "paymentsOnEmployeesBehalf": 1024.99,
      |            "personalIncidentalExpenses": 1024.99,
      |            "qualifyingRelocationExpenses": 1024.99,
      |            "employerProvidedProfessionalSubscriptions": 1024.99,
      |            "employerProvidedServices": 1024.99,
      |            "incomeTaxPaidByDirector": 1024.99,
      |            "travelAndSubsistence": 1024.99,
      |            "vouchersAndCreditCards": 1024.99,
      |            "nonCash": 1024.99
      |        }
      |    }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendMinimumFieldsRequest: String =
    """
      |{
      |    "employment": {
      |        "pay": {
      |            "taxablePayToDate": 1024.99,
      |            "totalTaxToDate": 1024.99
      |            }
      |     }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendMissingErrorsRequest: String =
    """
      |{
      |   "employment":{
      |        "deductions": {
      |            "studentLoans": {
      |                "uglDeductionAmount": 1024.99
      |            }
      |        }
      |   }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendInvalidRequest: String =
    """
      |{
      |    "employment": {
      |        "pay": {
      |            "taxablePayToDate": true,
      |            "totalTaxToDate": "false"
      |            }
      |     }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendValueErrorsRequest: String =
    """
      |{
      |    "employment": {
      |        "pay": {
      |            "taxablePayToDate": 1024.992,
      |            "totalTaxToDate": -999999999999999.99
      |        },
      |        "deductions": {
      |            "studentLoans": {
      |                "uglDeductionAmount": 1024.399,
      |                "pglDeductionAmount": 1024.929
      |            }
      |        },
      |        "benefitsInKind": {
      |            "accommodation": 199.222,
      |            "assets": 199.121,
      |            "assetTransfer": 1024.929,
      |            "beneficialLoan": 1024.929,
      |            "car": 1024.299,
      |            "carFuel": 1024.299,
      |            "educationalServices": -199.999,
      |            "entertaining": -10.123,
      |            "expenses": 1024.929,
      |            "medicalInsurance": -1099,
      |            "telephone": 1024.299,
      |            "service": 1024.199,
      |            "taxableExpenses": 10324.919,
      |            "van": 1024.919,
      |            "vanFuel": 1024.992,
      |            "mileage": 1024.939,
      |            "nonQualifyingRelocationExpenses": 1024.919,
      |            "nurseryPlaces": 1024.991,
      |            "otherItems": 1024.992,
      |            "paymentsOnEmployeesBehalf": 1024.399,
      |            "personalIncidentalExpenses": 1024.949,
      |            "qualifyingRelocationExpenses": 1024.939,
      |            "employerProvidedProfessionalSubscriptions": -1024.299,
      |            "employerProvidedServices": 1024.199,
      |            "incomeTaxPaidByDirector": 1024.979,
      |            "travelAndSubsistence": -1024.939,
      |            "vouchersAndCreditCards": 1022.939,
      |            "nonCash": 1024.929
      |        }
      |    }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendEmptyBenefitsInKindRequest: String =
    """
      |{
      |    "employment": {
      |       "pay": {
      |           "taxablePayToDate": 1024.99,
      |           "totalTaxToDate": 1024.99
      |       },
      |       "benefitsInKind": { }
      |    }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendEmptyDeductionsRequest: String =
    """
      |{
      |    "employment": {
      |       "pay": {
      |           "taxablePayToDate": 1024.99,
      |           "totalTaxToDate": 1024.99
      |       },
      |       "deductions": { }
      |    }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendEmptyStudentLoansRequest: String =
    """
      |{
      |    "employment": {
      |       "pay": {
      |           "taxablePayToDate": 1024.99,
      |           "totalTaxToDate": 1024.99
      |       },
      |       "deductions": {
      |           "studentLoans": { }
      |       }
      |    }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendEmptyObjectsRequest: String =
    """
      |{
      |    "employment": {
      |       "pay": {
      |           "taxablePayToDate": 1024.99,
      |           "totalTaxToDate": 1024.99
      |       },
      |       "deductions": {
      |           "studentLoans": { }
      |       },
      |       "benefitsInKind": { }
      |    }
      |}
    """.stripMargin

  val iirFinancialDetailsAmendValueErrorsResponse: String =
    """
      |{
      |  "code": "INVALID_REQUEST",
      |  "errors": [
      |    {
      |      "code": "FORMAT_VALUE",
      |      "message": "The value must be between 0 and 99999999999.99",
      |      "paths": [
      |          "/employment/pay/taxablePayToDate",
      |          "/employment/deductions/studentLoans/uglDeductionAmount",
      |          "/employment/deductions/studentLoans/pglDeductionAmount",
      |          "/employment/benefitsInKind/accommodation",
      |          "/employment/benefitsInKind/assets",
      |          "/employment/benefitsInKind/assetTransfer",
      |          "/employment/benefitsInKind/beneficialLoan",
      |          "/employment/benefitsInKind/car",
      |          "/employment/benefitsInKind/carFuel",
      |          "/employment/benefitsInKind/educationalServices",
      |          "/employment/benefitsInKind/entertaining",
      |          "/employment/benefitsInKind/expenses",
      |          "/employment/benefitsInKind/medicalInsurance",
      |          "/employment/benefitsInKind/telephone",
      |          "/employment/benefitsInKind/service",
      |          "/employment/benefitsInKind/taxableExpenses",
      |          "/employment/benefitsInKind/van",
      |          "/employment/benefitsInKind/vanFuel",
      |          "/employment/benefitsInKind/mileage",
      |          "/employment/benefitsInKind/nonQualifyingRelocationExpenses",
      |          "/employment/benefitsInKind/nurseryPlaces",
      |          "/employment/benefitsInKind/otherItems",
      |          "/employment/benefitsInKind/paymentsOnEmployeesBehalf",
      |          "/employment/benefitsInKind/personalIncidentalExpenses",
      |          "/employment/benefitsInKind/qualifyingRelocationExpenses",
      |          "/employment/benefitsInKind/employerProvidedProfessionalSubscriptions",
      |          "/employment/benefitsInKind/employerProvidedServices",
      |          "/employment/benefitsInKind/incomeTaxPaidByDirector",
      |          "/employment/benefitsInKind/travelAndSubsistence",
      |          "/employment/benefitsInKind/vouchersAndCreditCards",
      |          "/employment/benefitsInKind/nonCash"
      |      ]
      |    },
      |     {
      |      "code": "FORMAT_VALUE",
      |      "message": "The value must be between -99999999999.99 and 99999999999.99",
      |      "paths": [
      |         "/employment/pay/totalTaxToDate"
      |      ]
      |     }
      |  ],
      |  "message": "Invalid request"
      |}
    """.stripMargin

  val iirFinancialDetailsAmendMissingErrorsResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/employment/pay"
    )
  )

  val iirFinancialDetailsAmendInvalidResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/employment/pay/taxablePayToDate",
      "/employment/pay/totalTaxToDate"
    )
  )

  val iirFinancialDetailsAmendEmptyBenefitsInKindResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/employment/benefitsInKind"
    )
  )

  val iirFinancialDetailsAmendEmptyDeductionsResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/employment/deductions"
    )
  )

  val iirFinancialDetailsAmendEmptyStudentLoansResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/employment/deductions/studentLoans"
    )
  )

  val iirFinancialDetailsAmendEmptyObjectsResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    Seq(
      "/employment/benefitsInKind",
      "/employment/deductions/studentLoans"
    )
  )

}
