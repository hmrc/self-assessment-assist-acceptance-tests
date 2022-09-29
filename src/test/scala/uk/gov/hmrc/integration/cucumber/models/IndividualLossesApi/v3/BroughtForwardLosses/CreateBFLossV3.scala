/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.BroughtForwardLosses

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class CreateBFLossV3(lossId: String, links: Seq[HateoasLink])

object CreateBFLossV3 {
  implicit val writes: OFormat[CreateBFLossV3] = Json.format[CreateBFLossV3]

}
