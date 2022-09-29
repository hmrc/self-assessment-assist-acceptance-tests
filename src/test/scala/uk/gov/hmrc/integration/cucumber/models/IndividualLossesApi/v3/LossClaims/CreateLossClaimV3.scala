/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.LossClaims

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class CreateLossClaimV3(claimId: String, links: Seq[HateoasLink])

object CreateLossClaimV3 {
  implicit val writes: OFormat[CreateLossClaimV3] = Json.format[CreateLossClaimV3]

}
