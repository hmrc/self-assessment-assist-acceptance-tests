/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsIncomeReceived

import uk.gov.hmrc.integration.cucumber.json.CommonErrorsJson

object AmendPensionsIncomeJson {

  val iirPensionsAmendRequest: String =
    """
      |{
      |   "foreignPensions": [
      |      {
      |         "countryCode": "DEU",
      |         "amountBeforeTax": 100.23,
      |         "taxTakenOff": 1.23,
      |         "specialWithholdingTax": 2.23,
      |         "foreignTaxCreditRelief": false,
      |         "taxableAmount": 3.23
      |      }
      |   ],
      |   "overseasPensionContributions": [
      |      {
      |         "customerReference": "PENSIONINCOME245",
      |         "exemptEmployersPensionContribs": 200.23,
      |         "migrantMemReliefQopsRefNo": "QOPS000000",
      |         "dblTaxationRelief": 4.23,
      |         "dblTaxationCountryCode": "FRA",
      |         "dblTaxationArticle": "AB3211-1",
      |         "dblTaxationTreaty": "Treaty",
      |         "sf74reference": "SF74-123456"
      |      }
      |   ]
      |}
    """.stripMargin

  val iirPensionsAmendRequestAgain: String =
    """
      |{
      |   "foreignPensions": [
      |      {
      |         "countryCode": "IND",
      |         "amountBeforeTax": 1000.23,
      |         "taxTakenOff": 10.23,
      |         "specialWithholdingTax": 22.23,
      |         "foreignTaxCreditRelief": true,
      |         "taxableAmount": 3.23
      |      }
      |   ],
      |   "overseasPensionContributions": [
      |      {
      |         "customerReference": "PENSIONINCOME246",
      |         "exemptEmployersPensionContribs": 250.23,
      |         "migrantMemReliefQopsRefNo": "QOPS000000",
      |         "dblTaxationRelief": 4.23,
      |         "dblTaxationCountryCode": "BEL",
      |         "dblTaxationArticle": "AB3211-1",
      |         "dblTaxationTreaty": "Treaty",
      |         "sf74reference": "SF74-123456"
      |      }
      |   ]
      |}
    """.stripMargin

  val iirPensionsAmendMinimumFieldsRequest: String =
    """
      |{
      |   "overseasPensionContributions": [
      |      {
      |         "exemptEmployersPensionContribs": 0.00
      |      }
      |   ]
      |}
    """.stripMargin

  val iirPensionsAmendInvalidBodyRequest: String =
    """
      |{
      |   "foreignPensions": [
      |      {
      |         "amountBeforeTax": "Yes"
      |      }
      |   ]
      |}
    """.stripMargin

  val iirPensionsAmendValueErrorsRequest: String =
    """
      |{
      |   "foreignPensions": [
      |      {
      |         "countryCode": "ABCD",
      |         "amountBeforeTax": 100.23,
      |         "taxTakenOff": 1.23,
      |         "specialWithholdingTax": 2.23,
      |         "foreignTaxCreditRelief": false,
      |         "taxableAmount": 3.23
      |      },
      |      {
      |         "countryCode": "ABC",
      |         "amountBeforeTax": 100.23,
      |         "taxTakenOff": 1.23,
      |         "specialWithholdingTax": 2.23,
      |         "foreignTaxCreditRelief": false,
      |         "taxableAmount": 3.239
      |      }
      |   ],
      |   "overseasPensionContributions": [
      |      {
      |         "customerReference": "PENSIONINCOME245",
      |         "exemptEmployersPensionContribs": 200.23,
      |         "migrantMemReliefQopsRefNo": "QOPS000000",
      |         "dblTaxationRelief": 4.239,
      |         "dblTaxationCountryCode": "ABC",
      |         "dblTaxationArticle": "AB3211-1",
      |         "dblTaxationTreaty": "Treaty",
      |         "sf74reference": "SF74-123456"
      |      },
      |      {
      |         "customerReference": "PENSIONINCOME246#!",
      |         "exemptEmployersPensionContribs": 200.23,
      |         "migrantMemReliefQopsRefNo": "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901",
      |         "dblTaxationRelief": 4.23,
      |         "dblTaxationCountryCode": "ABCD",
      |         "dblTaxationArticle": "AB3211-1#!",
      |         "dblTaxationTreaty": "Treaty#!",
      |         "sf74reference": "SF74-123456#!"
      |      }
      |   ]
      |}
    """.stripMargin

  val iirPensionsAmendEmptyBodyRequest: String =
    """
      |{
      |   "foreignPensions": [
      |   ],
      |   "overseasPensionContributions": [
      |   ]
      |}
    """.stripMargin

  val iirPensionsAmendValueErrorsResponse: String =
    """
      |{
      |   "code": "INVALID_REQUEST",
      |   "message": "Invalid request",
      |   "errors": [
      |      {
      |         "code": "FORMAT_COUNTRY_CODE",
      |         "message": "The format of the country code is invalid",
      |         "paths": [
      |            "/foreignPensions/0/countryCode",
      |            "/overseasPensionContributions/1/dblTaxationCountryCode"
      |         ]
      |      },
      |      {
      |         "code": "RULE_COUNTRY_CODE",
      |         "message": "The country code is not a valid ISO 3166-1 alpha-3 country code",
      |         "paths": [
      |            "/foreignPensions/1/countryCode",
      |            "/overseasPensionContributions/0/dblTaxationCountryCode"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_CUSTOMER_REF",
      |         "message": "The provided customer reference is invalid",
      |         "paths": [
      |            "/overseasPensionContributions/1/customerReference"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_QOPS_REF",
      |         "message": "The provided QOPS reference number is invalid",
      |         "paths": [
      |            "/overseasPensionContributions/1/migrantMemReliefQopsRefNo"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_DOUBLE_TAXATION_ARTICLE",
      |         "message": "The provided double taxation article is invalid",
      |         "paths": [
      |            "/overseasPensionContributions/1/dblTaxationArticle"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_DOUBLE_TAXATION_TREATY",
      |         "message": "The provided double taxation treaty is invalid",
      |         "paths":[
      |            "/overseasPensionContributions/1/dblTaxationTreaty"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_SF74_REF",
      |         "message": "The provided SF74 reference is invalid",
      |         "paths": [
      |            "/overseasPensionContributions/1/sf74reference"
      |         ]
      |      },
      |      {
      |         "code": "FORMAT_VALUE",
      |         "message": "The value must be between 0 and 99999999999.99",
      |         "paths": [
      |            "/foreignPensions/1/taxableAmount",
      |            "/overseasPensionContributions/0/dblTaxationRelief"
      |         ]
      |      }
      |   ]
      |}
    """.stripMargin

  val iirPensionsAmendInvalidBodyResponse: String = CommonErrorsJson.incorrectOrEmptyBodyWithPaths(
    paths = Seq(
      "/foreignPensions/0/amountBeforeTax",
      "/foreignPensions/0/taxableAmount",
      "/foreignPensions/0/foreignTaxCreditRelief",
      "/foreignPensions/0/countryCode"
    )
  )

}
