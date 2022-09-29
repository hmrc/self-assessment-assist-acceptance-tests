/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.lossesAndClaims

import play.api.libs.json.{Json, OFormat}

case class LossesAndClaims(resultOfClaimsApplied: Option[Seq[ResultOfClaimsApplied]],
                           unclaimedLosses: Option[Seq[UnclaimedLosses]],
                           carriedForwardLosses: Option[Seq[CarriedForwardLosses]],
                           defaultCarriedForwardLosses: Option[Seq[DefaultCarriedForwardLosses]],
                           claimsNotApplied: Option[Seq[ClaimsNotApplied]])

object LossesAndClaims {
  implicit val format: OFormat[LossesAndClaims] = Json.format[LossesAndClaims]
}