/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualDisclosuresApi

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Stateful.StatefulFieldWrapper
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class Disclosures(taxAvoidance: Option[Seq[TaxAvoidance]],
                       class2Nics: Option[Class2Nics],
                       submittedOn: StatefulFieldWrapper[String],
                       links: Option[Seq[HateoasLink]])

object Disclosures {
  implicit val format: OFormat[Disclosures] = Json.format[Disclosures]
}
