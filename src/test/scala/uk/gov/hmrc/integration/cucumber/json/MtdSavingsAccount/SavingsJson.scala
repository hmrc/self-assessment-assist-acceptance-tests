/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.json.MtdSavingsAccount

object SavingsJson {

  val name32Characters: String = """ { "accountName": "This name is 32 characters long." } """
  val nameValidSymbols: String = """ { "accountName": "&'()*,-./@£" } """
  val nameSpace: String        = """ { "accountName": " " } """

  val name33Characters: String      = """ { "accountName": "This name is 33 characters long.." } """
  val nameInvalidSymbols: String    = """ { "accountName": "*<>[]{}\/:;?#^~$¬" } """
  val nameEmpty: String             = """ { "accountName": "" } """
  val nameEmojis: String            = """ { "accountName": "😀😁😂🤣😃😄😅😆😉😊😋😎😍💩" } """
  val nameForeignCharacters: String = """ { "accountName": "ùú 稅務數字 äæãåāçćčè" } """

  val FORMAT_ACCOUNT_NAME: String =
    """
      |{
      | "code" : "FORMAT_ACCOUNT_NAME",
      | "message" : "The provided account name is invalid"
      |}
    """.stripMargin

  // ---------------------------------------------------------
  val LIST_ALL_DEFAULT: String =
    """
      |{
      | "savingsAccounts": [
      |   {
      | 		"id": "SAVIZE0hQNiB4r1",
      | 		"accountName": "Main account name"
      | 	},
      | 	{
      | 		"id": "SAV38WpAhiodTxW",
      | 		"accountName": "Shares savings account"
      | 	}
      | ]
      |}
    """.stripMargin

  val SAVINGS_ACCOUNTS_LARGE: String =
    """
      |  {
      | 	"savingsAccounts": [
      |    {
      | 			"id": "SAVuV70tq3b3hIj",
      | 			"accountName": "Main account name"
      | 		},
      | 		{
      | 			"id": "SAVbClYxSmS0GtZ",
      | 			"accountName": "Shares savings account 1"
      | 		},
      | 		{
      | 			"id": "SAVafFZEf9lS9W2",
      | 			"accountName": "Shares savings account 2"
      | 		},
      | 		{
      | 			"id": "SAVva7DFI85gRat",
      | 			"accountName": "Shares savings account 3"
      | 		},
      | 		{
      | 			"id": "SAVazPHAe7N7aQq",
      | 			"accountName": "Shares savings account 4"
      | 		},
      | 		{
      | 			"id": "SAVJJVU4ZCnDu7v",
      | 			"accountName": "Shares savings account 5"
      | 		},
      | 		{
      | 			"id": "SAVmEfFGCrj1xl9",
      | 			"accountName": "Shares savings account 6"
      | 		},
      | 		{
      | 			"id": "SAVdlUQyiLRtxLj",
      | 			"accountName": "Shares savings account 7"
      | 		},
      | 		{
      | 			"id": "SAVHyqmskx8cOzs",
      | 			"accountName": "Shares savings account 8"
      | 		},
      | 		{
      | 			"id": "SAVgrptWGu2lFuN",
      | 			"accountName": "Shares savings account 9"
      | 		},
      | 		{
      | 			"id": "SAVVOO1uoUpM94S",
      | 			"accountName": "Shares savings account 10"
      | 		},
      | 		{
      | 			"id": "SAVUZK9id3Elj8p",
      | 			"accountName": "Shares savings account 11"
      | 		},
      | 		{
      | 			"id": "SAVWGKgLdc33qyF",
      | 			"accountName": "Shares savings account 12"
      | 		},
      | 		{
      | 			"id": "SAV1t9jYeh3HHPe",
      | 			"accountName": "Shares savings account 13"
      | 		},
      | 		{
      | 			"id": "SAVPSwA0GHvsXnB",
      | 			"accountName": "Shares savings account 14"
      | 		},
      | 		{
      | 			"id": "SAVj42x4z0CcxtM",
      | 			"accountName": "Shares savings account 15"
      | 		},
      | 		{
      | 			"id": "SAVtYQXEw6cfFZK",
      | 			"accountName": "Shares savings account 16"
      | 		},
      | 		{
      | 			"id": "SAVpYFlmuRz0GEL",
      | 			"accountName": "Shares savings account 17"
      | 		},
      | 		{
      | 			"id": "SAVeQBypwKy51w9",
      | 			"accountName": "Shares savings account 18"
      | 		},
      | 		{
      | 			"id": "SAVrYAy1qaFFocU",
      | 			"accountName": "Shares savings account 19"
      | 		},
      | 		{
      | 			"id": "SAVrlT0AQpkR73e",
      | 			"accountName": "Shares savings account 20"
      | 		},
      | 		{
      | 			"id": "SAV3jFF4ViGr6j9",
      | 			"accountName": "Shares savings account 21"
      | 		},
      | 		{
      | 			"id": "SAV9MA6Ic5o2qmM",
      | 			"accountName": "Shares savings account 22"
      | 		},
      | 		{
      | 			"id": "SAVQMaz0JiIsVGh",
      | 			"accountName": "Shares savings account 23"
      | 		},
      | 		{
      | 			"id": "SAV6qYqYlVCJo9J",
      | 			"accountName": "Shares savings account 24"
      | 		},
      | 		{
      | 			"id": "SAVah4PfBHOpUNF",
      | 			"accountName": "Shares savings account 25"
      | 		},
      | 		{
      | 			"id": "SAVYyidPt4s6Cag",
      | 			"accountName": "Shares savings account 26"
      | 		},
      | 		{
      | 			"id": "SAVNzhfQZ2JxS5U",
      | 			"accountName": "Shares savings account 27"
      | 		},
      | 		{
      | 			"id": "SAVSLeUYXKpCfSD",
      | 			"accountName": "Shares savings account 28"
      | 		},
      | 		{
      | 			"id": "SAVnsa6GYAzJiGw",
      | 			"accountName": "Shares savings account 29"
      | 		},
      | 		{
      | 			"id": "SAV6tMZKEoMAy6J",
      | 			"accountName": "Shares savings account 30"
      | 		},
      | 		{
      | 			"id": "SAV6yF1O61Zl5sC",
      | 			"accountName": "Shares savings account 31"
      | 		},
      | 		{
      | 			"id": "SAV0Yo4MOqCTWR3",
      | 			"accountName": "Shares savings account 32"
      | 		},
      | 		{
      | 			"id": "SAVpaPQoaiqJusU",
      | 			"accountName": "Shares savings account 33"
      | 		},
      | 		{
      | 			"id": "SAVrtgdgFooLhHn",
      | 			"accountName": "Shares savings account 34"
      | 		},
      | 		{
      | 			"id": "SAVQnf8fyit1syC",
      | 			"accountName": "Shares savings account 35"
      | 		},
      | 		{
      | 			"id": "SAVogxTsOpgitb4",
      | 			"accountName": "Shares savings account 36"
      | 		},
      | 		{
      | 			"id": "SAVle9uUncRawqL",
      | 			"accountName": "Shares savings account 37"
      | 		},
      | 		{
      | 			"id": "SAVSPZaeXHW8V3n",
      | 			"accountName": "Shares savings account 38"
      | 		},
      | 		{
      | 			"id": "SAVnYxSbivVek1R",
      | 			"accountName": "Shares savings account 39"
      | 		},
      | 		{
      | 			"id": "SAVDuPOlOMXF1te",
      | 			"accountName": "Shares savings account 40"
      | 		},
      | 		{
      | 			"id": "SAVceoQoreG8iuy",
      | 			"accountName": "Shares savings account 41"
      | 		},
      | 		{
      | 			"id": "SAVIbRp2g2U7HRA",
      | 			"accountName": "Shares savings account 42"
      | 		},
      | 		{
      | 			"id": "SAVTl2HxnO8Kqlx",
      | 			"accountName": "Shares savings account 43"
      | 		},
      | 		{
      | 			"id": "SAVvkVvRkgCymqG",
      | 			"accountName": "Shares savings account 44"
      | 		},
      | 		{
      | 			"id": "SAVZDyNheteVeoL",
      | 			"accountName": "Shares savings account 45"
      | 		},
      | 		{
      | 			"id": "SAVePOd9rPe3H3O",
      | 			"accountName": "Shares savings account 46"
      | 		},
      | 		{
      | 			"id": "SAV4eKeJXuhWY9k",
      | 			"accountName": "Shares savings account 47"
      | 		},
      | 		{
      | 			"id": "SAVZV138BPTMDU9",
      | 			"accountName": "Shares savings account 48"
      | 		},
      | 		{
      | 			"id": "SAVzbmfuS4Unoj9",
      | 			"accountName": "Shares savings account 49"
      | 		},
      | 		{
      | 			"id": "SAVjt3jB7SV8ZMJ",
      | 			"accountName": "Shares savings account 50"
      | 		}
      | 	]
      | }
    """.stripMargin

  val RETRIEVE_DEFAULT: String =
    """
      |{
      |  "accountName": "Main account name"
      |}
    """.stripMargin

  val RETRIEVE_ANNUAL_DEFAULT: String =
    """
      |{
      |  "taxedUkInterest": 1230.55,
      |  "untaxedUkInterest": 500.5
      |}
    """.stripMargin

  val RETRIEVE_ANNUAL_ONLY_TAXED_UK_INTEREST: String =
    """
      |{
      |  "taxedUkInterest": 1230.55
      |}
    """.stripMargin

  val RETRIEVE_ANNUAL_ONLY_UNTAXED_UK_INTEREST: String =
    """
      |{
      |  "untaxedUkInterest": 500.5
      |}
    """.stripMargin

  val RETRIEVE_ANNUAL_REMOVED_VALUES_EXAMPLE_2: String =
    """
      |{
      |  "taxedUkInterest": 0.00
      |}
    """.stripMargin

  val RETRIEVE_ANNUAL_REMOVED_VALUES_EXAMPLE_1: String =
    """
      |{
      |  "taxedUkInterest": 0.00,
      |  "untaxedUkInterest": 0.00
      |}
    """.stripMargin

  val RETRIEVE_ENGLISH: String =
    """
      |{
      |  "accountName": "Shares savings account"
      |}
    """.stripMargin

  val RETRIEVE_GREEK: String =
    """
      |{
      |  "accountName": "Greek αποταμιευτικός λογαριασμός"
      |}
    """.stripMargin

  val RETRIEVE_CHINESE: String =
    """
      |{
      |  "accountName": "Chinese 儲蓄賬戶"
      |}
    """.stripMargin

  val savingsAccountAnnualSummary: String =
    """
      |{
      |  "taxedUkInterest": 2000.99,
      |  "untaxedUkInterest": 5000.50
      |}
    """.stripMargin

}
