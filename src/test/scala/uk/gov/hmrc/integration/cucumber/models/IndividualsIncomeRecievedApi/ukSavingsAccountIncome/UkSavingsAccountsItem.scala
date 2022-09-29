/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.ukSavingsAccountIncome

import play.api.libs.json.{Json, OFormat}

case class UkSavingsAccountsItem(savingsAccountId: String, accountName: String)

object UkSavingsAccountsItem {
  implicit val format: OFormat[UkSavingsAccountsItem] = Json.format[UkSavingsAccountsItem]
}