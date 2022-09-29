/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.LossClaims

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListLossClaimsV3(claims: List[LossClaim], links: Seq[HateoasLink])

case class LossClaim(businessId: String,
                     typeOfLoss: String,
                     typeOfClaim: String,
                     taxYearClaimedFor: String,
                     claimId: String,
                     sequence: Option[Int],
                     lastModified: String,
                     links: Seq[HateoasLink])

object LossClaim {
  implicit val format: OFormat[LossClaim] = Json.format[LossClaim]
}

object ListLossClaimsV3 {
  implicit val format: OFormat[ListLossClaimsV3] = Json.format[ListLossClaimsV3]
}
