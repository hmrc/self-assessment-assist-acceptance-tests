/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.ukSavingsAccountIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListUkSavingsAccounts(savingsAccounts: Seq[UkSavingsAccountsItem], links: Seq[HateoasLink])

object ListUkSavingsAccounts {
  implicit val format: OFormat[ListUkSavingsAccounts] = Json.format[ListUkSavingsAccounts]
}