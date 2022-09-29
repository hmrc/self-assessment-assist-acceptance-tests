/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.MtdCharitableGiving

object CharitableGivingJson {

  // -- AMEND --------------------------
  val FULL_PAYLOAD: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.00,
      |    "oneOffSpecifiedYear": 1000.00,
      |    "specifiedYearTreatedAsPreviousYear": 300.00,
      |    "followingYearTreatedAsSpecifiedYear": 400.00,
      |    "nonUKCharities": 2000.00,
      |    "nonUKCharityNames": ["International Charity A", "International Charity B"]
      |  },
      |  "gifts": {
      |    "sharesOrSecurities": 600.00,
      |    "landAndBuildings": 700.00,
      |    "investmentsNonUKCharities": 300.00,
      |    "investmentsNonUKCharityNames": ["International Charity C", "International Charity D"]
      |  }
      |}
    """.stripMargin

  val FULL_PAYLOAD_EMOJI_nonUKCharityNames: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.00,
      |    "oneOffSpecifiedYear": 1000.00,
      |    "specifiedYearTreatedAsPreviousYear": 300.00,
      |    "followingYearTreatedAsSpecifiedYear": 400.00,
      |    "nonUKCharities": 2000.00,
      |    "nonUKCharityNames": ["International Charity A 🐟", "International Charity B 🐟"]
      |  },
      |  "gifts": {
      |    "sharesOrSecurities": 600.00,
      |    "landAndBuildings": 700.00,
      |    "investmentsNonUKCharities": 300.00,
      |    "investmentsNonUKCharityNames": ["International Charity C", "International Charity D"]
      |  }
      |}
    """.stripMargin

  val FULL_PAYLOAD_EMOJI_investmentsNonUKCharityNames: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.00,
      |    "oneOffSpecifiedYear": 1000.00,
      |    "specifiedYearTreatedAsPreviousYear": 300.00,
      |    "followingYearTreatedAsSpecifiedYear": 400.00,
      |    "nonUKCharities": 2000.00,
      |    "nonUKCharityNames": ["International Charity A", "International Charity B"]
      |  },
      |  "gifts": {
      |    "sharesOrSecurities": 600.00,
      |    "landAndBuildings": 700.00,
      |    "investmentsNonUKCharities": 300.00,
      |    "investmentsNonUKCharityNames": ["International Charity C 🐟", "International Charity D 🐟"]
      |  }
      |}
    """.stripMargin

  val PARTIAL_PAYLOAD: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.00
      |  },
      |  "gifts": {
      |    "sharesOrSecurities": 600.00
      |  }
      |}
    """.stripMargin

  val GIFTS_ONLY: String =
    """
      |{
      |  "gifts": {
      |    "sharesOrSecurities": 600.00,
      |    "landAndBuildings": 700.00,
      |    "investmentsNonUKCharities": 300.00,
      |    "investmentsNonUKCharityNames": ["International Charity C", "International Charity D"]
      |  }
      |}
    """.stripMargin

  val GIFT_AID_PAYMENTS_ONLY: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.00,
      |    "oneOffSpecifiedYear": 1000.00,
      |    "specifiedYearTreatedAsPreviousYear": 300.00,
      |    "followingYearTreatedAsSpecifiedYear": 400.00,
      |    "nonUKCharities": 2000.00,
      |    "nonUKCharityNames": ["International Charity A", "International Charity B"]
      |  }
      |}
    """.stripMargin

  // -- RETRIEVE --------------------------
  val RETRIEVE_DEFAULT: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.50,
      |    "oneOffSpecifiedYear": 1000.00,
      |    "specifiedYearTreatedAsPreviousYear": 300.00,
      |    "followingYearTreatedAsSpecifiedYear": 400.00,
      |    "nonUKCharities": 2000.00,
      |    "nonUKCharityNames": ["International Charity A","International Charity B"]
      |  },
      |  "gifts": {
      |    "landAndBuildings": 700.00,
      |    "sharesOrSecurities": 600.35,
      |    "investmentsNonUKCharities": 300.00,
      |    "investmentsNonUKCharityNames": ["International Charity C","International Charity D"]
      |  }
      |}
    """.stripMargin

  val RETRIEVE_ONLY_GIFT_AID_PAYMENTS: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.00,
      |    "oneOffSpecifiedYear": 1000.50,
      |    "specifiedYearTreatedAsPreviousYear": 300.00,
      |    "followingYearTreatedAsSpecifiedYear": 400.00,
      |    "nonUKCharities": 2000.35,
      |    "nonUKCharityNames": ["International Charity A","International Charity B"]
      |  }
      |}
    """.stripMargin

  val RETRIEVE_ONLY_GIFTS: String =
    """
      |{
      |  "gifts": {
      |    "landAndBuildings": 700.00,
      |    "sharesOrSecurities": 600.50,
      |    "investmentsNonUKCharities": 300.35,
      |    "investmentsNonUKCharityNames": ["International Charity C","International Charity D"]
      |  }
      |}
    """.stripMargin

  val RETRIEVE_WITHOUT_NON_UK_CHARITIES: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.50,
      |    "oneOffSpecifiedYear": 1000.00,
      |    "specifiedYearTreatedAsPreviousYear": 300.00,
      |    "followingYearTreatedAsSpecifiedYear": 400.00
      |  },
      |  "gifts": {
      |    "landAndBuildings": 700.35,
      |    "sharesOrSecurities": 600.00
      |  }
      |}
    """.stripMargin

  val RETRIEVE_ZERO_NON_UK_CHARITIES: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 10000.50,
      |    "oneOffSpecifiedYear": 1000.00,
      |    "specifiedYearTreatedAsPreviousYear": 300.00,
      |    "followingYearTreatedAsSpecifiedYear": 400.00,
      |    "nonUKCharities": 0.00
      |  },
      |  "gifts": {
      |    "landAndBuildings": 700.35,
      |    "sharesOrSecurities": 600.00,
      |    "investmentsNonUKCharities": 0.00
      |  }
      |}
    """.stripMargin

  val RETRIEVE_REMOVED_VALUES_EXAMPLE_1: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 0.00,
      |    "oneOffSpecifiedYear": 0.00,
      |    "specifiedYearTreatedAsPreviousYear": 0.00,
      |    "followingYearTreatedAsSpecifiedYear": 0.00,
      |    "nonUKCharities": 0.00
      |  },
      |  "gifts": {
      |    "landAndBuildings": 0.00,
      |    "sharesOrSecurities": 0.00,
      |    "investmentsNonUKCharities": 0.00
      |  }
      |}
    """.stripMargin

  val RETRIEVE_REMOVED_VALUES_EXAMPLE_2: String =
    """
      |{
      |  "giftAidPayments": {
      |    "specifiedYear": 0.00
      |  }
      |}
    """.stripMargin

}
