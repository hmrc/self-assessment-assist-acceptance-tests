/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendOtherEmploymentIncomeJson {

  val iirOtherEmploymentAmendRequest: String =
    """
      |{
      |  "shareOption": [
      |    {
      |      "employerName": "Company Ltd",
      |      "employerRef": "123/AB456",
      |      "schemePlanType": "EMI",
      |      "dateOfOptionGrant": "2019-11-20",
      |      "dateOfEvent": "2019-11-20",
      |      "optionNotExercisedButConsiderationReceived": true,
      |      "amountOfConsiderationReceived": 23122.22,
      |      "noOfSharesAcquired": 1,
      |      "classOfSharesAcquired": "FIRST",
      |      "exercisePrice": 12.22,
      |      "amountPaidForOption": 123.22,
      |      "marketValueOfSharesOnExcise": 1232.22,
      |      "profitOnOptionExercised": 1232.33,
      |      "employersNicPaid": 2312.22,
      |      "taxableAmount": 2132.22
      |    }
      |  ],
      |  "sharesAwardedOrReceived": [
      |    {
      |      "employerName": "Company Ltd",
      |      "employerRef": "123/AB456",
      |      "schemePlanType": "SIP",
      |      "dateSharesCeasedToBeSubjectToPlan": "2019-11-10",
      |      "noOfShareSecuritiesAwarded": 11,
      |      "classOfShareAwarded": "FIRST",
      |      "dateSharesAwarded": "2019-11-20",
      |      "sharesSubjectToRestrictions": true,
      |      "electionEnteredIgnoreRestrictions": false,
      |      "actualMarketValueOfSharesOnAward": 2123.22,
      |      "unrestrictedMarketValueOfSharesOnAward": 123.22,
      |      "amountPaidForSharesOnAward": 123.22,
      |      "marketValueAfterRestrictionsLifted": 1232.22,
      |      "taxableAmount": 12321.22
      |    }
      |  ],
      |  "disability": {
      |    "customerReference": "EMP123A",
      |    "amountDeducted": 1223.22
      |  },
      |  "foreignService": {
      |    "customerReference": "EMP123A",
      |    "amountDeducted": 1223.22
      |  },
      |  "lumpSums": [
      |    {
      |      "employerName": "BPDTS Ltd",
      |      "employerRef": "123/AB456",
      |      "taxableLumpSumsAndCertainIncome":
      |         {
      |           "amount": 5000.99,
      |           "taxPaid": 3333.33,
      |           "taxTakenOffInEmployment": true
      |         },
      |      "benefitFromEmployerFinancedRetirementScheme":
      |         {
      |           "amount": 5000.99,
      |           "exemptAmount": 2345.99,
      |           "taxPaid": 3333.33,
      |           "taxTakenOffInEmployment": true
      |         },
      |      "redundancyCompensationPaymentsOverExemption":
      |         {
      |           "amount": 5000.99,
      |           "taxPaid": 3333.33,
      |           "taxTakenOffInEmployment": true
      |         },
      |      "redundancyCompensationPaymentsUnderExemption":
      |         {
      |           "amount": 5000.99
      |         }
      |      }
      |   ]
      |}
    """.stripMargin

  val iirOtherEmploymentAmendRequestAgain: String =
    """
      |{
      |  "shareOption": [
      |    {
      |      "employerName": "BTDS Ltd",
      |      "employerRef": "146/AB456",
      |      "schemePlanType": "EMI",
      |      "dateOfOptionGrant": "2019-12-21",
      |      "dateOfEvent": "2019-11-27",
      |      "optionNotExercisedButConsiderationReceived": true,
      |      "amountOfConsiderationReceived": 2314.22,
      |      "noOfSharesAcquired": 3,
      |      "classOfSharesAcquired": "FIRST",
      |      "exercisePrice": 123.22,
      |      "amountPaidForOption":124.22,
      |      "marketValueOfSharesOnExcise": 1237.22,
      |      "profitOnOptionExercised": 1239.33,
      |      "employersNicPaid": 2313.22,
      |      "taxableAmount": 2134.22
      |    }
      |  ],
      |  "sharesAwardedOrReceived": [
      |    {
      |      "employerName": "BTDS Ltd",
      |      "employerRef": "146/AB456",
      |      "schemePlanType": "SIP",
      |      "dateSharesCeasedToBeSubjectToPlan": "2019-11-15",
      |      "noOfShareSecuritiesAwarded": 9,
      |      "classOfShareAwarded": "FIRST",
      |      "dateSharesAwarded": "2019-11-20",
      |      "sharesSubjectToRestrictions": true,
      |      "electionEnteredIgnoreRestrictions": false,
      |      "actualMarketValueOfSharesOnAward": 2126.22,
      |      "unrestrictedMarketValueOfSharesOnAward": 124.22,
      |      "amountPaidForSharesOnAward": 125.25,
      |      "marketValueAfterRestrictionsLifted": 1238.75,
      |      "taxableAmount": 12360.55
      |    }
      |  ],
      |  "disability": {
      |    "customerReference": "EMP456A",
      |    "amountDeducted": 1226.35
      |  },
      |  "foreignService": {
      |    "customerReference": "EMP456A",
      |    "amountDeducted": 1226.35
      |  },
      |  "lumpSums": [
      |    {
      |      "employerName": "Company Ltd",
      |      "employerRef": "146/AB456",
      |      "taxableLumpSumsAndCertainIncome": {
      |         "amount": 5000.95,
      |         "taxPaid": 2222.22,
      |         "taxTakenOffInEmployment": true
      |      },
      |      "benefitFromEmployerFinancedRetirementScheme": {
      |         "amount": 3000.95,
      |         "exemptAmount": 4555.99,
      |         "taxPaid": 2500.35,
      |         "taxTakenOffInEmployment": true
      |      },
      |      "redundancyCompensationPaymentsOverExemption": {
      |         "amount": 6500.45,
      |         "taxPaid": 3500.55,
      |         "taxTakenOffInEmployment": true
      |      },
      |      "redundancyCompensationPaymentsUnderExemption": {
      |         "amount": 3000.95
      |      }
      |    }
      |  ]
      |}
    """.stripMargin

  val iirOtherEmploymentAmendMinimumFieldsRequest: String =
    """
      |{
      |  "foreignService": {
      |    "customerReference": "OTHEREmp789C",
      |    "amountDeducted": 4011.11
      |  }
      |}
    """.stripMargin

  val iirOtherEmploymentAmendValueErrorsRequest: String =
    s"""
       |{
       |  "shareOption": [
       |    {
       |      "employerName": "${stringCreator(length = 106)}",
       |      "employerRef" : "${stringCreator(length = 10)}",
       |      "schemePlanType": "INVALID SCHEME PLAN TYPE",
       |      "dateOfOptionGrant": "INVALID DATE FORMAT",
       |      "dateOfEvent": "2019-12-32",
       |      "optionNotExercisedButConsiderationReceived": true,
       |      "amountOfConsiderationReceived": 1001.111,
       |      "noOfSharesAcquired": -1002,
       |      "classOfSharesAcquired": "${stringCreator(length = 91)}",
       |      "exercisePrice": -1003.33,
       |      "amountPaidForOption": 1004.444,
       |      "marketValueOfSharesOnExcise": 100000000055.55,
       |      "profitOnOptionExercised": -1006.66,
       |      "employersNicPaid": 1007.777,
       |      "taxableAmount" : 100000000088.88
       |    }
       |  ],
       |  "sharesAwardedOrReceived": [
       |    {
       |      "employerName": "${stringCreator(length = 106)}",
       |      "employerRef" : "${stringCreator(length = 10)}",
       |      "schemePlanType": "INVALID SCHEME PLAN TYPE",
       |      "dateSharesCeasedToBeSubjectToPlan": "INVALID DATE FORMAT",
       |      "noOfShareSecuritiesAwarded": -22,
       |      "classOfShareAwarded": "${stringCreator(length = 91)}",
       |      "dateSharesAwarded" : "2018-8-111",
       |      "sharesSubjectToRestrictions": true,
       |      "electionEnteredIgnoreRestrictions": false,
       |      "actualMarketValueOfSharesOnAward": 2001.111,
       |      "unrestrictedMarketValueOfSharesOnAward": -2002.22,
       |      "amountPaidForSharesOnAward": 20000000000033.33,
       |      "marketValueAfterRestrictionsLifted": 2004.444,
       |      "taxableAmount": -2005.55
       |     }
       |   ],
       |  "disability": {
       |    "customerReference": "${stringCreator(length = 91)}",
       |    "amountDeducted": -3001.11
       |  },
       |  "foreignService": {
       |    "customerReference": "${stringCreator(length = 91)}",
       |    "amountDeducted": 4001.111
       |  },
       |  "lumpSums": [
       |    {
       |      "employerName": "${stringCreator(length = 106)}",
       |      "employerRef" : "${stringCreator(length = 10)}",
       |      "taxableLumpSumsAndCertainIncome":
       |         {
       |           "amount": -1111.11,
       |           "taxPaid": 3333.333,
       |           "taxTakenOffInEmployment": true
       |         },
       |      "benefitFromEmployerFinancedRetirementScheme":
       |         {
       |           "amount": -1000.999,
       |           "exemptAmount": 2345.999,
       |           "taxPaid": 123.456,
       |           "taxTakenOffInEmployment": false
       |         },
       |      "redundancyCompensationPaymentsOverExemption":
       |         {
       |           "amount": -2000.22,
       |           "taxPaid": 3333.333,
       |           "taxTakenOffInEmployment": true
       |         },
       |      "redundancyCompensationPaymentsUnderExemption":
       |         {
       |           "amount": -5000.99
       |         }
       |      }
       |   ]
       |}
    """.stripMargin

  val iirOtherEmploymentAmendInvalidBodyRequest: String =
    """
      |{
      |  "foreignService": {
      |    "customerReference": false
      |  }
      |}
    """.stripMargin

  val iirOtherEmploymentAmendEmptyBodyRequest: String =
    """
      |{
      |  "shareOption": [
      |  ],
      |  "sharesAwardedOrReceived": [
      |  ]
      |}
    """.stripMargin

  val iirOtherEmploymentAmendValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |      {
      |         "code": "FORMAT_VALUE",
      |         "message": "The value must be between 0 and 99999999999.99",
      |         "paths": [
      |            "/shareOption/0/amountOfConsiderationReceived",
      |            "/shareOption/0/exercisePrice",
      |            "/shareOption/0/amountPaidForOption",
      |            "/shareOption/0/marketValueOfSharesOnExcise",
      |            "/shareOption/0/profitOnOptionExercised",
      |            "/shareOption/0/employersNicPaid",
      |            "/shareOption/0/taxableAmount",
      |
      |            "/sharesAwardedOrReceived/0/actualMarketValueOfSharesOnAward",
      |            "/sharesAwardedOrReceived/0/unrestrictedMarketValueOfSharesOnAward",
      |            "/sharesAwardedOrReceived/0/amountPaidForSharesOnAward",
      |            "/sharesAwardedOrReceived/0/marketValueAfterRestrictionsLifted",
      |            "/sharesAwardedOrReceived/0/taxableAmount",
      |
      |            "/disability/amountDeducted",
      |            "/foreignService/amountDeducted",
      |
      |            "/lumpSums/0/taxableLumpSumsAndCertainIncome/amount",
      |            "/lumpSums/0/taxableLumpSumsAndCertainIncome/taxPaid",
      |            "/lumpSums/0/benefitFromEmployerFinancedRetirementSchemeItem/amount",
      |            "/lumpSums/0/benefitFromEmployerFinancedRetirementSchemeItem/exemptAmount",
      |            "/lumpSums/0/benefitFromEmployerFinancedRetirementSchemeItem/taxPaid",
      |            "/lumpSums/0/redundancyCompensationPaymentsOverExemptionItem/amount",
      |            "/lumpSums/0/redundancyCompensationPaymentsOverExemptionItem/taxPaid",
      |            "/lumpSums/0/redundancyCompensationPaymentsUnderExemptionItem/amount"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_VALUE",
      |         "message": "The value must be 0 or more",
      |         "paths": [
      |            "/shareOption/0/noOfSharesAcquired",
      |            "/sharesAwardedOrReceived/0/noOfShareSecuritiesAwarded"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_EMPLOYER_NAME",
      |         "message": "The provided employer name is invalid",
      |         "paths": [
      |            "/shareOption/0/employerName",
      |            "/sharesAwardedOrReceived/0/employerName",
      |            "/lumpSums/0/employerName"
      |
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_EMPLOYER_REF",
      |         "message": "The provided employer ref is invalid",
      |         "paths": [
      |            "/shareOption/0/employerRef",
      |            "/sharesAwardedOrReceived/0/employerRef",
      |            "/lumpSums/0/employerRef"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_DATE",
      |         "message": "The field should be in the format YYYY-MM-DD",
      |         "paths": [
      |            "/shareOption/0/dateOfOptionGrant",
      |            "/shareOption/0/dateOfEvent",
      |            "/sharesAwardedOrReceived/0/dateSharesCeasedToBeSubjectToPlan",
      |            "/sharesAwardedOrReceived/0/dateSharesAwarded"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_CLASS_OF_SHARES_ACQUIRED",
      |         "message": "The provided class of shares acquired is invalid",
      |         "paths": [
      |            "/shareOption/0/classOfSharesAcquired"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_CLASS_OF_SHARES_AWARDED",
      |         "message": "The provided class of shares awarded is invalid",
      |         "paths": [
      |            "/sharesAwardedOrReceived/0/classOfShareAwarded"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_CUSTOMER_REF",
      |         "message": "The provided customer reference is invalid",
      |         "paths": [
      |            "/disability/customerReference",
      |            "/foreignService/customerReference"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_SCHEME_PLAN_TYPE",
      |         "message": "The provided scheme plan type is invalid",
      |         "paths": [
      |            "/shareOption/0/schemePlanType",
      |            "/sharesAwardedOrReceived/0/schemePlanType"
      |         ]
      |      }
      |   ]
      |}
    """.stripMargin

  val iirOtherEmploymentAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/foreignService/amountDeducted",
      "/foreignService/customerReference"
    )
  )

  def stringCreator(length: Int): String = "-" * length
}
