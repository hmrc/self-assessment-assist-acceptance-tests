/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.selfEmployment

import play.api.libs.json._

case class LossClaimsDetailV2(lossesBroughtForward: Option[Seq[LossBroughtForwardV2]],
                              resultOfClaimsApplied: Option[Seq[ResultOfClaimAppliedV2]],
                              unclaimedLosses: Option[Seq[UnclaimedLossV2]],
                              carriedForwardLosses: Option[Seq[CarriedForwardLossV2]],
                              claimsNotApplied: Option[Seq[ClaimNotAppliedV2]]) {}

object LossClaimsDetailV2 {
  implicit val formats: OFormat[LossClaimsDetailV2] = Json.format[LossClaimsDetailV2]
}
