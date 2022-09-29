/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrieveOtherEmploymentIncomeJson {

  def iirOtherEmploymentAmendRetrieval: String =
    s"""
       |{
       |   "submittedOn": "UNCHECKED",
       |   "shareOption": [
       |     {
       |       "employerName": "BTDS Ltd",
       |       "employerRef": "146/AB456",
       |       "schemePlanType": "EMI",
       |       "dateOfOptionGrant": "2019-12-21",
       |       "dateOfEvent": "2019-11-27",
       |       "optionNotExercisedButConsiderationReceived": true,
       |       "amountOfConsiderationReceived": 2314.22,
       |       "noOfSharesAcquired": 3,
       |       "classOfSharesAcquired": "FIRST",
       |       "exercisePrice": 123.22,
       |       "amountPaidForOption":124.22,
       |       "marketValueOfSharesOnExcise": 1237.22,
       |       "profitOnOptionExercised": 1239.33,
       |       "employersNicPaid": 2313.22,
       |       "taxableAmount": 2134.22
       |     }
       |   ],
       |   "sharesAwardedOrReceived": [
       |     {
       |       "employerName": "BTDS Ltd",
       |       "employerRef": "146/AB456",
       |       "schemePlanType": "SIP",
       |       "dateSharesCeasedToBeSubjectToPlan": "2019-11-15",
       |       "noOfShareSecuritiesAwarded": 9,
       |       "classOfShareAwarded": "FIRST",
       |       "dateSharesAwarded": "2019-11-20",
       |       "sharesSubjectToRestrictions": true,
       |       "electionEnteredIgnoreRestrictions": false,
       |       "actualMarketValueOfSharesOnAward": 2126.22,
       |       "unrestrictedMarketValueOfSharesOnAward": 124.22,
       |       "amountPaidForSharesOnAward": 125.25,
       |       "marketValueAfterRestrictionsLifted": 1238.75,
       |       "taxableAmount": 12360.55
       |     }
       |   ],
       |   "disability": {
       |     "customerReference": "EMP456A",
       |     "amountDeducted": 1226.35
       |   },
       |   "foreignService": {
       |     "customerReference": "EMP456A",
       |     "amountDeducted": 1226.35
       |   },
       |   "lumpSums": [
       |     {
       |       "employerName": "Company Ltd",
       |       "employerRef": "146/AB456",
       |       "taxableLumpSumsAndCertainIncome": {
       |          "amount": 5000.95,
       |          "taxPaid": 2222.22,
       |          "taxTakenOffInEmployment": true
       |       },
       |       "benefitFromEmployerFinancedRetirementScheme": {
       |          "amount": 3000.95,
       |          "exemptAmount": 4555.99,
       |          "taxPaid": 2500.35,
       |          "taxTakenOffInEmployment": true
       |       },
       |       "redundancyCompensationPaymentsOverExemption": {
       |          "amount": 6500.45,
       |          "taxPaid": 3500.55,
       |          "taxTakenOffInEmployment": true
       |       },
       |       "redundancyCompensationPaymentsUnderExemption": {
       |          "amount": 3000.95
       |       }
       |     }
       |   ],
       |   "links": [
       |      {
       |         "href": "/individuals/income-received/employments/other/${taxPayer.nino}/2019-20",
       |         "method": "PUT",
       |         "rel": "create-and-amend-employments-other-income"
       |      },
       |      {
       |         "href": "/individuals/income-received/employments/other/${taxPayer.nino}/2019-20",
       |         "method": "GET",
       |         "rel": "self"
       |      },
       |      {
       |         "href": "/individuals/income-received/employments/other/${taxPayer.nino}/2019-20",
       |         "method": "DELETE",
       |         "rel": "delete-employments-other-income"
       |      }
       |   ]
       |}
     """.stripMargin

}
