/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class BsasV2(bsasId: String, applied: Boolean, links: Option[Seq[HateoasLink]])

object BsasV2 {
  implicit val format: OFormat[BsasV2] = Json.format[BsasV2]
}
