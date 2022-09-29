/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.ukSavingsAccountIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class AddUkSavingsAccount(savingsAccountId: String, links: Seq[HateoasLink])

object AddUkSavingsAccount {
  implicit val format: OFormat[AddUkSavingsAccount] = Json.format[AddUkSavingsAccount]
}
