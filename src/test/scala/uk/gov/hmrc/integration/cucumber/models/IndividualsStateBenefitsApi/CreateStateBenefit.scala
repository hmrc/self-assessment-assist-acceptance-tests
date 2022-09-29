/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsStateBenefitsApi

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class CreateStateBenefit(benefitId: String, links: Seq[HateoasLink])

object CreateStateBenefit {
  implicit val format: OFormat[CreateStateBenefit] = Json.format[CreateStateBenefit]
}
