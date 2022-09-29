/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.ukSavingsAccountIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveUkSavingsAccount(taxedUkInterest: Option[BigDecimal],
                                    untaxedUkInterest: Option[BigDecimal],
                                    links: Option[Seq[HateoasLink]])

object RetrieveUkSavingsAccount {
  implicit val format: OFormat[RetrieveUkSavingsAccount] = Json.format[RetrieveUkSavingsAccount]
}
