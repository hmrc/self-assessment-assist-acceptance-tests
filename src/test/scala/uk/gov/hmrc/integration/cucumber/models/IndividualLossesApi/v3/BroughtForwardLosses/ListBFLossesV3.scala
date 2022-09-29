/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.BroughtForwardLosses

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListBFLossesV3(losses: Seq[LossObject], links: Seq[HateoasLink])

object ListBFLossesV3 {
  implicit val format: OFormat[ListBFLossesV3] = Json.format[ListBFLossesV3]
}
