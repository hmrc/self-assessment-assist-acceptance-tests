/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsStateBenefitsApi

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object RetrieveStateBenefitJson {

  def iStateBenefitsRetrieveStateBenefitResponse: String =
    s"""
       |{
       |  "stateBenefits": [
       |    {
       |      "benefitType": "statePension",
       |      "dateIgnored": "2020-08-11T12:25:14Z",
       |      "submittedOn": "2020-12-01T13:43:12Z",
       |      "benefitId": "05426f54-0fea-3453-9992-34b25adf2390",
       |      "startDate": "2019-09-14",
       |      "endDate": "2019-11-02",
       |      "amount": 72130.93,
       |      "taxPaid": 23456.78,
       |      "links": [
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20?benefitId=05426f54-0fea-3453-9992-34b25adf2390",
       |          "method": "GET",
       |          "rel": "self"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/05426f54-0fea-3453-9992-34b25adf2390/amounts",
       |          "method": "PUT",
       |          "rel": "amend-state-benefit-amounts"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/05426f54-0fea-3453-9992-34b25adf2390/unignore",
       |          "method": "POST",
       |          "rel": "unignore-state-benefit"
       |        }
       |      ]
       |    }
       |  ],
       |  "links": [
       |    {
       |      "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20",
       |      "method": "POST",
       |      "rel": "create-state-benefit"
       |    },
       |    {
       |      "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20",
       |      "method": "GET",
       |      "rel": "self"
       |    }
       |  ]
       |}
     """.stripMargin

  def iStateBenefitsRetrieveCustomerAddedBenefitResponse: String =
    s"""
       |{
       |  "customerAddedStateBenefits": [
       |    {
       |      "benefitType": "bereavementAllowance",
       |      "submittedOn": "2020-09-25T11:12:13Z",
       |      "benefitId": "708921ab-6586-381e-9240-cd5ae4e4abd2",
       |      "startDate": "2019-08-13",
       |      "endDate": "2019-09-23",
       |      "amount": 921.34,
       |      "taxPaid": 835.99,
       |      "links": [
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20?benefitId=708921ab-6586-381e-9240-cd5ae4e4abd2",
       |          "rel": "self",
       |          "method": "GET"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/708921ab-6586-381e-9240-cd5ae4e4abd2/amounts",
       |          "rel": "amend-state-benefit-amounts",
       |          "method": "PUT"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/708921ab-6586-381e-9240-cd5ae4e4abd2/amounts",
       |          "rel": "delete-state-benefit-amounts",
       |          "method": "DELETE"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/708921ab-6586-381e-9240-cd5ae4e4abd2",
       |          "rel": "delete-state-benefit",
       |          "method": "DELETE"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/708921ab-6586-381e-9240-cd5ae4e4abd2",
       |          "rel": "amend-state-benefit",
       |          "method": "PUT"
       |        }
       |      ]
       |    }
       |  ],
       |  "links": [
       |    {
       |      "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20",
       |      "rel": "create-state-benefit",
       |      "method": "POST"
       |    },
       |    {
       |      "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20",
       |      "rel": "self",
       |      "method": "GET"
       |    }
       |  ]
       |}
     """.stripMargin

  def iStateBenefitsRetrieveCustomerAddedBenefitNoAmountsResponse: String =
    s"""
       |{
       |  "customerAddedStateBenefits": [
       |    {
       |      "benefitType": "statePensionLumpSum",
       |      "submittedOn": "2020-01-29T15:44:34Z",
       |      "benefitId": "b5d23a07-33b5-30be-909c-7085588663e5",
       |      "startDate": "2019-09-14",
       |      "endDate": "2019-10-22",
       |      "links": [
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20?benefitId=b5d23a07-33b5-30be-909c-7085588663e5",
       |          "rel": "self",
       |          "method": "GET"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/b5d23a07-33b5-30be-909c-7085588663e5/amounts",
       |          "rel": "amend-state-benefit-amounts",
       |          "method": "PUT"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/b5d23a07-33b5-30be-909c-7085588663e5",
       |          "rel": "delete-state-benefit",
       |          "method": "DELETE"
       |        },
       |        {
       |          "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/b5d23a07-33b5-30be-909c-7085588663e5",
       |          "rel": "amend-state-benefit",
       |          "method": "PUT"
       |        }
       |      ]
       |    }
       |  ],
       |  "links": [
       |    {
       |      "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20",
       |      "rel": "create-state-benefit",
       |      "method": "POST"
       |    },
       |    {
       |      "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20",
       |      "rel": "self",
       |      "method": "GET"
       |    }
       |  ]
       |}
     """.stripMargin

  def iStateBenefitsRetrieveHmrcAmendedAmountsResponse: String =
    s"""
       |{
       |    "stateBenefits": [
       |        {
       |            "benefitType": "jobSeekersAllowance",
       |            "submittedOn": "2019-04-03T01:01:05Z",
       |            "benefitId": "412b6427-0142-500f-828d-d2a44eeffd9e",
       |            "startDate": "2020-02-05",
       |            "endDate": "2020-03-17",
       |            "amount": 284.33,
       |            "taxPaid": 11.23,
       |            "links": [
       |                {
       |                    "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20?benefitId=412b6427-0142-500f-828d-d2a44eeffd9e",
       |                    "method": "GET",
       |                    "rel": "self"
       |                },
       |                {
       |                    "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/412b6427-0142-500f-828d-d2a44eeffd9e/amounts",
       |                    "method": "PUT",
       |                    "rel": "amend-state-benefit-amounts"
       |                },
       |                {
       |                    "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/412b6427-0142-500f-828d-d2a44eeffd9e/ignore",
       |                    "method": "POST",
       |                    "rel": "ignore-state-benefit"
       |                }
       |            ]
       |        }
       |    ],
       |    "customerAddedStateBenefits": [
       |        {
       |            "benefitType": "jobSeekersAllowance",
       |            "submittedOn": "2020-11-23T01:01:05Z",
       |            "benefitId": "412b6427-0142-500f-828d-d2a44eeffd9e",
       |            "startDate": "2020-02-05",
       |            "endDate": "2020-03-17",
       |            "amount": 302.12,
       |            "taxPaid": 16.12,
       |            "links": [
       |                {
       |                    "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20?benefitId=412b6427-0142-500f-828d-d2a44eeffd9e",
       |                    "method": "GET",
       |                    "rel": "self"
       |                },
       |                {
       |                    "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/412b6427-0142-500f-828d-d2a44eeffd9e/amounts",
       |                    "method": "PUT",
       |                    "rel": "amend-state-benefit-amounts"
       |                },
       |                {
       |                    "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20/412b6427-0142-500f-828d-d2a44eeffd9e/amounts",
       |                    "method": "DELETE",
       |                    "rel": "delete-state-benefit-amounts"
       |                }
       |            ]
       |        }
       |    ],
       |    "links": [
       |        {
       |            "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20",
       |            "method": "POST",
       |            "rel": "create-state-benefit"
       |        },
       |        {
       |            "href": "/individuals/state-benefits/${taxPayer.nino}/2019-20",
       |            "method": "GET",
       |            "rel": "self"
       |        }
       |    ]
       |}
     """.stripMargin

}
