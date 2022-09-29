/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.pensionsIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Stateful.StatefulFieldWrapper
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class PensionsIncome(submittedOn: StatefulFieldWrapper[String],
                          foreignPensions: Option[Seq[ForeignPensions]],
                          overseasPensionContributions: Option[Seq[OverseasPensionContributions]],
                          links: Option[Seq[HateoasLink]])

object PensionsIncome {
  implicit val format: OFormat[PensionsIncome] = Json.format[PensionsIncome]
}
