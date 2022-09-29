/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.LossClaims

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class AmendLossClaimOrderV3(links: Seq[HateoasLink])

object AmendLossClaimOrderV3 {
  implicit val format: OFormat[AmendLossClaimOrderV3] = Json.format[AmendLossClaimOrderV3]
}
