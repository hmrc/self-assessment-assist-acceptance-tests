/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsReliefsApi

object OtherReliefsJson {

  val AMEND_OTHER_RELIEFS: String =
    """
      |{
      |  "nonDeductibleLoanInterest": {
      |        "customerReference": "myref",
      |        "reliefClaimed": 763.00
      |  },
      |  "payrollGiving": {
      |        "customerReference": "myref",
      |        "reliefClaimed": 154.00
      |  },
      |  "qualifyingDistributionRedemptionOfSharesAndSecurities": {
      |        "customerReference": "myref",
      |        "amount": 222.22
      |  },
      |  "maintenancePayments": [
      |    {
      |        "customerReference": "myref",
      |        "exSpouseName" : "Hilda",
      |        "exSpouseDateOfBirth": "2000-01-01",
      |        "amount": 222.22
      |    }
      |  ],
      |  "postCessationTradeReliefAndCertainOtherLosses": [
      |    {
      |        "customerReference": "myref",
      |        "businessName": "ACME Inc",
      |        "dateBusinessCeased": "2019-08-10",
      |        "natureOfTrade": "Widgets Manufacturer",
      |        "incomeSource": "AB12412/A12",
      |        "amount": 222.22
      |    }
      |  ],
      |  "annualPaymentsMade": {
      |        "customerReference": "myref",
      |        "reliefClaimed": 763.00
      |  },
      |  "qualifyingLoanInterestPayments": [
      |    {
      |        "customerReference": "myref",
      |        "lenderName": "Maurice",
      |        "reliefClaimed": 763.00
      |    }
      |  ]
      |}
    """.stripMargin

  val otherReliefsAmendMinimumFields: String =
    """
      |{
      |  "nonDeductibleLoanInterest": {
      |        "reliefClaimed": 763.00
      |  },
      |  "payrollGiving": {
      |        "reliefClaimed": 154.00
      |  },
      |  "qualifyingDistributionRedemptionOfSharesAndSecurities": {
      |        "amount": 222.22
      |  },
      |  "maintenancePayments": [
      |      {
      |        "amount": 222.22
      |      }
      |  ],
      |  "postCessationTradeReliefAndCertainOtherLosses": [
      |      {
      |        "amount": 222.22
      |      }
      |  ],
      |  "annualPaymentsMade": {
      |        "reliefClaimed": 763.00
      |  },
      |  "qualifyingLoanInterestPayments": [
      |      {
      |        "customerReference": "myref",
      |        "reliefClaimed": 763.00
      |      }
      |  ]
      |}
    """.stripMargin

  val otherReliefsAmendMissingErrorsRequest: String =
    """
      |{
      |  "nonDeductibleLoanInterest": {
      |        "customerReference": "myref"
      |  },
      |  "payrollGiving": {
      |        "customerReference": "myref"
      |  },
      |  "qualifyingDistributionRedemptionOfSharesAndSecurities": {
      |        "customerReference": "myref"
      |  },
      |  "maintenancePayments": [
      |    {
      |        "exSpouseName" : "Hilda",
      |        "exSpouseDateOfBirth": "2000-01-01",
      |        "amount": 222.22
      |    }
      |  ],
      |  "postCessationTradeReliefAndCertainOtherLosses": [
      |    {
      |        "businessName": "ACME Inc",
      |        "dateBusinessCeased": "2019-08-10",
      |        "natureOfTrade": "Widgets Manufacturer",
      |        "incomeSource": "AB12412/A12",
      |        "amount": 222.22
      |    }
      |  ],
      |  "annualPaymentsMade": {
      |        "customerReference": "myref"
      |  },
      |  "qualifyingLoanInterestPayments": [
      |    {
      |        "lenderName": "Maurice"
      |    }
      |  ]
      |}
    """.stripMargin

  val otherReliefsAmendValueErrorsRequest: String =
    """
      |{
      |  "nonDeductibleLoanInterest": {
      |        "customerReference": "myref",
      |        "reliefClaimed": 763.001
      |  },
      |  "payrollGiving": {
      |        "customerReference": "myref",
      |        "reliefClaimed": 154.001
      |  },
      |  "qualifyingDistributionRedemptionOfSharesAndSecurities": {
      |        "customerReference": "myref",
      |        "amount": 222.222
      |  },
      |  "maintenancePayments": [
      |    {
      |        "customerReference": "myref",
      |        "exSpouseName" : "Hilda",
      |        "exSpouseDateOfBirth": "2000-01-01",
      |        "amount": 222.22
      |    }
      |  ],
      |  "postCessationTradeReliefAndCertainOtherLosses": [
      |    {
      |        "customerReference": "myref",
      |        "businessName": "ACME Inc",
      |        "dateBusinessCeased": "2019-08-10",
      |        "natureOfTrade": "Widgets Manufacturer",
      |        "incomeSource": "AB12412/A12",
      |        "amount": 222.22
      |    }
      |  ],
      |  "annualPaymentsMade": {
      |        "customerReference": "myref",
      |        "reliefClaimed": 763.00
      |  },
      |  "qualifyingLoanInterestPayments": [
      |    {
      |        "customerReference": "myref",
      |        "lenderName": "Maurice",
      |        "reliefClaimed": 763.00
      |    }
      |  ]
      |}
    """.stripMargin

  val otherReliefsAmendValueErrorsResponse: String =
    """
      |{
      |  "code": "FORMAT_VALUE",
      |  "message": "The field should be between 0 and 99999999999.99",
      |  "paths": [
      |    "/nonDeductibleLoanInterest/reliefClaimed",
      |    "/payrollGiving/reliefClaimed",
      |    "/qualifyingDistributionRedemptionOfSharesAndSecurities/amount"
      |  ]
      |}
    """.stripMargin

}
