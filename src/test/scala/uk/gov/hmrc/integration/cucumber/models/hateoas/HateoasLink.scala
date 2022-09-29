/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.hateoas

import play.api.libs.json.{Json, OFormat}

case class HateoasLink(href: String, rel: String, method: String)

object HateoasLink {
  implicit val format: OFormat[HateoasLink] = Json.format[HateoasLink]
}
