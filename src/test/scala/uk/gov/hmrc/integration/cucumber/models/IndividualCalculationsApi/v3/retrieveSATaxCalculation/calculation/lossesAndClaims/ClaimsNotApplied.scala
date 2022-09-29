/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.lossesAndClaims

import play.api.libs.json.{Json, OFormat}

case class ClaimsNotApplied(claimId: String,
                            incomeSourceId: String,
                            incomeSourceType: String,
                            taxYearClaimMade: String,
                            claimType: String)

object ClaimsNotApplied {
  implicit val format: OFormat[ClaimsNotApplied] = Json.format[ClaimsNotApplied]
}