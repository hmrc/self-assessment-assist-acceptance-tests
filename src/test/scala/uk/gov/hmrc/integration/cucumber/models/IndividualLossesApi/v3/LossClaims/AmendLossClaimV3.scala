/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.LossClaims

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class AmendLossClaimV3(businessId: String,
                            typeOfLoss: String,
                            typeOfClaim: String,
                            taxYearClaimedFor: String,
                            sequence: Option[BigInt],
                            lastModified: String,
                            links: Seq[HateoasLink])

object AmendLossClaimV3 {
  implicit val writes: OFormat[AmendLossClaimV3] = Json.format[AmendLossClaimV3]
}
