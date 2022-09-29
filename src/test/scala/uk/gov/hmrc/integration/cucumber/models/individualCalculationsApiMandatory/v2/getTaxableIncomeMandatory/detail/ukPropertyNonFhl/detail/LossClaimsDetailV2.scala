/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyNonFhl.detail

import play.api.libs.json._

case class LossClaimsDetailV2(lossesBroughtForward: Seq[LossBroughtForwardV2],
                              resultOfClaimsApplied: Seq[ResultOfClaimAppliedV2],
                              defaultCarriedForwardLosses: Seq[DefaultCarriedForwardLossV2],
                              claimsNotApplied: Seq[ClaimNotAppliedV2])

object LossClaimsDetailV2 {
  implicit val format: OFormat[LossClaimsDetailV2] = Json.format[LossClaimsDetailV2]
}
