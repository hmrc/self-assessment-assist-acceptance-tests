/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.LossClaims

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveLossClaimV3(typeOfLoss: String,
                               businessId: String,
                               typeOfClaim: String,
                               taxYearClaimedFor: String,
                               sequence: Option[BigInt],
                               lastModified: String,
                               links: Seq[HateoasLink])

object RetrieveLossClaimV3 {
  implicit val format: OFormat[RetrieveLossClaimV3] = Json.format[RetrieveLossClaimV3]
}
