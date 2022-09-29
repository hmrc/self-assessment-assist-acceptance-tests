/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.lossesAndClaimsMandatory

import play.api.libs.json.{Json, OFormat}

case class LossesAndClaimsMandatory(resultOfClaimsApplied: Seq[ResultOfClaimsAppliedMandatory],
                                    unclaimedLosses: Seq[UnclaimedLossesMandatory],
                                    carriedForwardLosses: Seq[CarriedForwardLossesMandatory],
                                    defaultCarriedForwardLosses: Seq[DefaultCarriedForwardLossesMandatory],
                                    claimsNotApplied: Seq[ClaimsNotAppliedMandatory])

object LossesAndClaimsMandatory {
  implicit val format: OFormat[LossesAndClaimsMandatory] = Json.format[LossesAndClaimsMandatory]
}