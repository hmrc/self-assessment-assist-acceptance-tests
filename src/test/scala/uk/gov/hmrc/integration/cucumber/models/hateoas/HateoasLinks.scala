/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.hateoas

import play.api.libs.json.{Json, OFormat}

case class HateoasLinks(links: Seq[HateoasLink])

object HateoasLinks {
  implicit val writes: OFormat[HateoasLinks] = Json.format[HateoasLinks]
}
