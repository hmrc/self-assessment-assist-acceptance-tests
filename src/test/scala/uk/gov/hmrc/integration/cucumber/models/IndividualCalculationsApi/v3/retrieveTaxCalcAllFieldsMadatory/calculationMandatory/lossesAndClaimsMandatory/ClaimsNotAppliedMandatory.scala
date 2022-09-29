/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.lossesAndClaimsMandatory

import play.api.libs.json.{Json, OFormat}

case class ClaimsNotAppliedMandatory(claimId: String,
                                     incomeSourceId: String,
                                     incomeSourceType: String,
                                     taxYearClaimMade: String,
                                     claimType: String)

object ClaimsNotAppliedMandatory {
  implicit val format: OFormat[ClaimsNotAppliedMandatory] = Json.format[ClaimsNotAppliedMandatory]
}