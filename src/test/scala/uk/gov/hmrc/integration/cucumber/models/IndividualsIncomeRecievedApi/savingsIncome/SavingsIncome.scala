/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.savingsIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Stateful.StatefulFieldWrapper
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class SavingsIncome(submittedOn: StatefulFieldWrapper[String],
                         securities: Option[Securities],
                         foreignInterest: Option[Seq[ForeignInterest]],
                         links: Option[Seq[HateoasLink]])

object SavingsIncome {
  implicit val format: OFormat[SavingsIncome] = Json.format[SavingsIncome]
}
