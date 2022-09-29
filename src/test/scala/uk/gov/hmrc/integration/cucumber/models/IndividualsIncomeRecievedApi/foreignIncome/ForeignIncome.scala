/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.foreignIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.StatefulFieldWrapper
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ForeignIncome(submittedOn: StatefulFieldWrapper[String],
                         foreignEarnings: Option[ForeignEarnings],
                         unremittableForeignIncome: Option[Seq[UnremittableForeignIncomeItem]],
                         links: Option[Seq[HateoasLink]])

object ForeignIncome {
  implicit val format: OFormat[ForeignIncome] = Json.format[ForeignIncome]
}
