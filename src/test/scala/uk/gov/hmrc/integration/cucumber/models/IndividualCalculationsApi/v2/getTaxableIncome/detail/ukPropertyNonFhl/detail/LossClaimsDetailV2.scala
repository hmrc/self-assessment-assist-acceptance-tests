/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyNonFhl.detail

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.utils.json.NestedJsonReads

case class LossClaimsDetailV2(lossesBroughtForward: Option[Seq[LossBroughtForwardV2]],
                              resultOfClaimsApplied: Option[Seq[ResultOfClaimAppliedV2]],
                              defaultCarriedForwardLosses: Option[Seq[DefaultCarriedForwardLossV2]],
                              claimsNotApplied: Option[Seq[ClaimNotAppliedV2]])

object LossClaimsDetailV2 extends NestedJsonReads {
  implicit val formats: OFormat[LossClaimsDetailV2] = Json.format[LossClaimsDetailV2]
}
