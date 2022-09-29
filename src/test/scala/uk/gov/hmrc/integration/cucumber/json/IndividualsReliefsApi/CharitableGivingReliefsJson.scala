/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.IndividualsReliefsApi

object CharitableGivingReliefsJson {

  val CREATE_OR_AMEND_CHARITABLE_GIVING_RELIEFS: String =
    """
      |{
      |   "giftAidPayments":{
      |      "nonUkCharities":{
      |         "charityNames":[
      |            "non-UK charity 1",
      |            "non-UK charity 2"
      |         ],
      |         "totalAmount":1000.12
      |      },
      |      "totalAmount":1000.12,
      |      "oneOffAmount":1000.12,
      |      "amountTreatedAsPreviousTaxYear":1000.12,
      |      "amountTreatedAsSpecifiedTaxYear":1000.12
      |   },
      |   "gifts":{
      |      "nonUkCharities":{
      |         "charityNames":[
      |            "non-UK charity 1",
      |            "non-UK charity 2"
      |         ],
      |         "totalAmount":1000.12
      |      },
      |      "landAndBuildings":1000.12,
      |      "sharesOrSecurities":1000.12
      |   }
      |}
    """.stripMargin

  val AMEND_CHARITABLE_GIVING_RELIEFS_MINIMUM_FIELDS: String =
    """
      |{
      |   "giftAidPayments":{
      |      "nonUkCharities":{
      |         "charityNames":[
      |            "non-UK charity 1",
      |            "non-UK charity 2"
      |         ],
      |         "totalAmount":1000.12
      |      }
      |    }
      |}
      |""".stripMargin

  val AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_REQUEST: String =
    """
      |{
      |   "giftAidPayments":{
      |      "nonUkCharities":{
      |         "charityNames":[
      |            "non-UK charity 3",
      |            "non-UK charity 4"
      |         ],
      |         "totalAmount":1000.121
      |      },
      |      "totalAmount":1000.12,
      |      "oneOffAmount":1000.121,
      |      "amountTreatedAsPreviousTaxYear":1000.12,
      |      "amountTreatedAsSpecifiedTaxYear":1000.12
      |   },
      |   "gifts":{
      |      "nonUkCharities":{
      |         "charityNames":[
      |            "non-UK charity 1",
      |            "non-UK charity 2"
      |         ],
      |         "totalAmount":1000.121
      |      },
      |      "landAndBuildings":1000.12,
      |      "sharesOrSecurities":1000.121
      |   }
      |}
      |""".stripMargin

  val AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_RESPONSE: String =
    """
      |{
      |     "code": "FORMAT_VALUE",
      |     "message": "The field should be between 0 and 99999999999.99",
      |     "paths": [
      |         "/giftAidPayments/nonUkCharities/totalAmount",
      |         "/giftAidPayments/oneOffAmount",
      |         "/gifts/nonUkCharities/totalAmount",
      |         "/gifts/sharesOrSecurities"
      |     ]
      |}
    """.stripMargin
}